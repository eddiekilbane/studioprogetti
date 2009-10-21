package com.smartpants.artwork.converter;

import java.io.File;
import java.io.IOException;

import javax.media.jai.InterpolationNearest;
import javax.media.jai.JAI;
import javax.media.jai.ParameterBlockJAI;
import javax.media.jai.PlanarImage;

import org.springframework.util.FileCopyUtils;

/**
*ImageHandler
 *
 *Abstracts the actions needed to open, process and save images. Since the Java Advanced Imaging and
 *Java 2D APIs are frustratingly in flux, this is a pretty basic go-between that performs ulta-simple imaging
 *processes on given images, like a PhotoShop Super LE API
 */

public class ImageHandler {
    public static final String TEMP_DIR = "/tmp/";
    public static final int THUMB_WIDTH = 48;
    public static final int THUMB_HEIGHT = 48;

    public static final int GALLERY_WIDTH = 357;
    public static final int GALLERY_HEIGHT = 312;
    PlanarImage img;
    boolean isRunning;

    public ImageHandler() {

    }


    public static synchronized String getRandomData() {
        return (new Long(System.currentTimeMillis())).toString();
    }


    public byte[] convertToThumb(byte[] data) {
        String randomData = getRandomData();
        String origPath = TEMP_DIR + "artdata_" + randomData;
        String outPath = origPath + "_thumb";
        byte[] outData = null;
        try {
            FileCopyUtils.copy(data, new File(origPath));
            this.process(origPath, THUMB_WIDTH, THUMB_HEIGHT, (outPath));
            outData = FileCopyUtils.copyToByteArray(new File(outPath));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return outData;
    }

    public byte[] convertToGallery(byte[] data) {
        String randomData = (new Long(System.currentTimeMillis())).toString();
        String origPath = TEMP_DIR + "artdata_" + randomData;
        String outPath = origPath + "_gallery";
        byte[] outData = null;
        try {
            FileCopyUtils.copy(data, new File(origPath));
            this.process(origPath, GALLERY_WIDTH, GALLERY_HEIGHT, (outPath));
            outData = FileCopyUtils.copyToByteArray(new File(outPath));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return outData;
    }

    public void process(String curFilePath, int maxWidth, int maxHeight, String outfilePath) {

        try {
            this.loadImage(curFilePath);
            this.scaleToFit(maxWidth, maxHeight);
            this.saveImage(outfilePath);
        } catch (RuntimeException e) {
            System.out.println("Error operating on picture: " + curFilePath);
        }


    }

    public void stopProcessing() {
        this.isRunning = false;
    }

    /**
        *@param amount The amount to scale by (i.e. 2.0F means "twice as big")
     *
     *Scales the image by the given amount
     */
    public void scale(float amount) {
        ParameterBlockJAI pb = new ParameterBlockJAI("scale");
        pb.addSource(this.img);
        pb.setParameter("xScale", amount); //x Scale Factor
        pb.setParameter("yScale", amount); //y Scale Factor
        pb.setParameter("xTrans", 0.0F);      //x Translate amount
        pb.setParameter("yTrans", 0.0F);      //y Translate amount
        pb.setParameter("interpolation", new InterpolationNearest());
        this.img = JAI.create("scale", pb, null);
    }


    /**
        *@param width The width this image should be scaled to as a max
     *
     *Scales the image uniformly by calculating the scale value generated by using the width as a maximum width
     */
    public void scaleX(float width) {
        float scaleFactor;
        scaleFactor = width / (float)img.getWidth();
        scale(scaleFactor);
    }

    /**
        *@param height The height this image should be scaled to as a max
     *
     *Scales the image uniformly by calculating the scale value generated by using the height as a maximum height.
     */
    public void scaleY(float height) {
        float scaleFactor;
        scaleFactor = height / (float)img.getHeight();
        scale(scaleFactor);
    }

    /**
        *Resizes the image to fit inside the width and height given. Not guaranteed to be the exact dimensions
     *given, just fit within them.
     *@param width The maximum width to fit
     *@param height The maximum height to fit
     */
    public void scaleToFit(int width, int height) {
        if(img.getWidth() > img.getHeight()) {
            scaleX((float)width);
        } else {
            scaleY((float)height);
        }
    }

    /**
        *Loads the image from a path and filename
     *
     *@param filepath The oath and filename where the file can be found
     */
    public void loadImage(String filepath) {
        //Loads the image from the given path and filename
        this.img = (PlanarImage)JAI.create("fileload", filepath);
    }

    /**
        *Saves the image to the given path and filename
     *
     *@param filepath the path and filename to save the image to.
     */
    public void saveImage(String filepath) {
        //Saves the image to the given path and filename as a JPEG image
        saveImage(filepath, "JPEG");
    }

    /**
        *Saves the image to the given path and filename using the given codec
     *
     *@param filepath the path and filename to save the image to.
     *@param type The JAI-defined codec type to save as.
     */
    public void saveImage(String filepath, String type) {
        //Saves the image to the given path and filename
        JAI.create("filestore", img, filepath, type, null);
    }

    /**
        *@param radians the amount to rotate by in radians
     *
     *Rotates the image by the given amount. Use degreesToRadians to convert degrees.
     */
    public void rotate(float radians) {

    }

    /**
        *@param degrees the angle to convert
     *
     *Converts degrees into radians.
     */
    public static float degreesToRadians(float degrees) {
        return (float)((degrees*Math.PI)/180.0F);
    }

}
package forms;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;
import org.apache.struts.upload.MultipartRequestHandler;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;

/**
 * <p>Title: HtmlFileForm.java </p>
 * <p>Description: Form Bean for the &lt;html:file&gt; example</p>
 * <p>Copyright: Copyright (c) 2002</p>
 * @author Kevin Bedell & James Turner
 * @version 1.0
 *
 */
public class HtmlFileForm extends ActionForm
{

    // Default bean constructor
    public HtmlFileForm() { }

    /**
     * The file that the user has uploaded
     */
    private FormFile file;
    public FormFile getFile() { return this.file; }
    public void setFile(FormFile file) { this.file = file; }

    /**
     * The name of the file - only for displaying results
     */

    private String fname;
    public String getFname() { return this.fname; }
    public void setFname(String fname) { this.fname = fname; }
    /**
     * The size of the file - only for displaying results
     */
    private String size;
    public String getSize() { return this.size; }
    public void setSize(String size) { this.size = size; }

}

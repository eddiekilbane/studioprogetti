package demo.hibernate.util;

import java.io.*;

public class Console 
{
	public static String leggiStringa()
	{
		String linea = " ";
		try 
		{
			InputStreamReader stream = new InputStreamReader(System.in);
			BufferedReader input= new BufferedReader(stream);

			linea = input.readLine();
	     }
        	
		catch (Exception e)
		{
			System.out.println("errore");
			System.exit(0) ;
		}
		return linea;

	}

    public static int leggiInt()
	{
		String linea = " ";
        int numero;
		try
		{
			InputStreamReader stream = new InputStreamReader(System.in);
			BufferedReader input= new BufferedReader(stream);
			linea = input.readLine();
     	}
     	
        catch (Exception e)
       	{
       		System.out.println("errore");
	       	System.exit(0) ;
       	}
        numero = Integer.parseInt (linea);
		return numero;
	}
    
	public static char leggiChar()
	{
		String linea = " ";
	    int numero;
		try
		{
			InputStreamReader stream = new InputStreamReader(System.in);
			BufferedReader input= new BufferedReader(stream);
			linea = input.readLine();

			if(linea.length() !=1)			
				throw new Exception();
			
			
	 	}
	 	
	    catch (Exception e)
	   	{
	   		System.out.println("errore");
	   		System.exit(0) ;
	   	}
			return linea.charAt(0);	
	}
	
    public static double leggiDouble()
	{
		String linea = " ";
        double numero;
		try
		{
			InputStreamReader stream = new InputStreamReader(System.in);
			BufferedReader input= new BufferedReader(stream);
			
			linea = input.readLine();
			
	    }

   		catch (Exception e)
   		{
   			System.out.println("errore");
   			System.exit(0);
   		}
        numero = Double.parseDouble (linea);
		return numero;
	}

    public static float leggiFloat()
	{
		String linea = " ";
        float numero;
		try
		{
			InputStreamReader stream = new InputStreamReader(System.in);
			BufferedReader input= new BufferedReader(stream);
			
			linea = input.readLine();
			
	    } 	

		catch (Exception e)
		{
			System.out.println("errore");
			System.exit(0);
		}
        numero = Float.parseFloat (linea);
		return numero;
	}
}
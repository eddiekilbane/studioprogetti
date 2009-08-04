

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.transazioni.beans.CD;

/**
 * Servlet implementation class for Servlet: ServletUpdate
 *
 */
 public class ServletUpdate extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ServletUpdate() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String idProdotto = request.getParameter("idProdotto");
		String title = request.getParameter("txtTitle");
		String artist = request.getParameter("txtArtist");
		String company = request.getParameter("txtCompany");
		String country = request.getParameter("txtCountry");
		String txtPrice = request.getParameter("txtPrice");
		String txtYear= request.getParameter("txtYear");
		String txtQuantity = request.getParameter("txtQuantity");
		
		//conversioni:
		double price= Double.parseDouble(txtPrice);
		int year = Integer.parseInt(txtYear);
		int quantity = Integer.parseInt(txtQuantity);
		
		//copia dati in oggetto Bean:
		CD daCercare = new CD();
		daCercare.setArtist(artist);
		daCercare.setTitle(title);
		daCercare.setCompany(company);
		daCercare.setCountry(country);
		daCercare.setPrice(price);
		daCercare.setYear(year);
		daCercare.setQuantity(quantity);
		
		
		
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}   	  	    
}
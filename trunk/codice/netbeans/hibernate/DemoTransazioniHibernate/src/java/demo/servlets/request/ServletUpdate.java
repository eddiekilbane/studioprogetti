package demo.servlets.request;



import demo.hibernate.util.SessionFactoryUtil;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.transazioni.beans.CD;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
        double price=0.0;
		if (!txtPrice.equals("")) {
			price =Double.parseDouble(txtPrice);
		}

		int year=0;
		if (!txtYear.equals("")) {
			year = Integer.parseInt(txtYear);
		}

		int quantity=0;
		if (!txtQuantity.equals("")) {
			quantity = Integer.parseInt(txtQuantity);
		}
		
		
		//copia dati in oggetto Bean:
		CD daCercare = new CD();
		daCercare.setArtist(artist);
		daCercare.setTitle(title);
		daCercare.setCompany(company);
		daCercare.setCountry(country);
		daCercare.setPrice(price);
		daCercare.setYear(year);
		daCercare.setQuantity(quantity);

        SessionFactory factory = SessionFactoryUtil.getSessionFactory();
        Session sessioneCorrente = factory.getCurrentSession();
        System.out.print("In servletUpdate: "+factory.toString());
        sessioneCorrente.beginTransaction();

        //1) salva oggetto nel DB


		System.out.println("In servletUpdate");
		
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}   	  	    
}
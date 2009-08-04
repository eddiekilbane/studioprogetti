package demo.servlets.application;



import java.io.IOException;
import java.util.List;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;


import demo.hibernate.util.SessionFactoryUtil;
import demo.transazioni.beans.CD;
import demo.transazioni.servizio.ServiziCd;

/**
 * Servlet implementation class for Servlet: ServletRicerca
 *
 */
 public class ServletRicerca extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ServletRicerca() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	try{	
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
		
		System.out.println(daCercare);
		// chiamata a Business logic
		
		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session sessioneHibernate = factory.openSession();
        System.out.print("In ServletRicerca: "+factory.toString());
		sessioneHibernate.beginTransaction();
		Criteria cdByExample = sessioneHibernate.createCriteria(CD.class);
		//cdByExample.add(Example.create(daCercare));
		List lista = cdByExample.list();
		
		System.out.println(lista.size());
		//System.out.println(lista.get(1));
		
		// indirizzamento risposta
		HttpSession sessione = request.getSession();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/UpdateCD.jsp");
		sessione.setAttribute("lista", lista);
		dispatcher.forward(request, response);
	}
	catch (Exception e){
		System.out.println(e);
	}
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}   	  	    
}
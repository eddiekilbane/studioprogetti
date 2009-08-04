package demo.servlets.request;



import java.io.IOException;
import java.util.List;

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

/**
 * Servlet implementation class for Servlet: ServletController
 *
 */
 public class ServletControllerAdmin extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ServletControllerAdmin() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("IN ADMIN");
		
		
		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session sessioneHibernate = factory.openSession();
		sessioneHibernate.beginTransaction();
		
		Criteria cdByExample = sessioneHibernate.createCriteria(CD.class);
		List lista = cdByExample.list();
		
		
		// indirizzamento risposta
		HttpSession sessione = request.getSession();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/UpdateCD.jsp");
		sessione.setAttribute("lista", lista);
		dispatcher.forward(request, response);
		
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}   	  	    
}
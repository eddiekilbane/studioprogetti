

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

import demo.hibernate.util.SessionFactoryUtil;
import demo.transazioni.beans.versioned.CD;


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

        // recupero parametri:
         String txtIdProdotto = request.getParameter("txtIdCd");
        Long idProd=0L;

         if (!txtIdProdotto.equals("")){
             idProd= Long.parseLong(txtIdProdotto);
         }

	
        // chiamata a Business logic
      
        

        //implementazione diretta:
        //************************************************************************
		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session sessioneHibernate = factory.openSession();
        System.out.print("*************************");
        System.out.print("In ServletRicerca: factory="+factory.toString());
        System.out.print("In ServletRicerca: session="+sessioneHibernate.hashCode());
        System.out.print("*************************");
		sessioneHibernate.beginTransaction();
        CD trovato = (CD)sessioneHibernate.get(CD.class, idProd);
        sessioneHibernate.close();

        int versioneCdTrovato = trovato.getVersion();
		System.out.println("\nIN SERVLET RICERCA: "+versioneCdTrovato+"\n");
		
		// indirizzamento risposta
		HttpSession sessione = request.getSession();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/UpdateCD.jsp");
		sessione.setAttribute("trovato", trovato);
        sessione.setAttribute("versioneCD",versioneCdTrovato );
       // sessione.setAttribute("hbnSession", sessioneHibernate);
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
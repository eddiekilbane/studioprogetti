

import demo.hibernate.util.SessionFactoryUtil;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;

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
        CD daModificare = createCdFromRequest(request);

        HttpSession sessioneHttp = request.getSession();
        
        int versione= (Integer)sessioneHttp.getAttribute("versione");


        SessionFactory factory = SessionFactoryUtil.getSessionFactory();
        Session sessioneUpdate = factory.getCurrentSession();
        

    
        // Debug:
        System.out.print("\n*************************");
        System.out.print("\nIn servletUpdate: "+factory.toString());
        System.out.print("\n*************************");


        sessioneUpdate.beginTransaction();
        sessioneUpdate.merge(daModificare);
        sessioneUpdate.beginTransaction().commit();

		System.out.println("Commit eseguito");
		
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


    protected CD createCdFromRequest(HttpServletRequest request){

        CD daModificare = new CD();

        //recupero parametri http:
        String txtId = request.getParameter("indice");
        int index = Integer.parseInt(txtId);
        String title = request.getParameter("txtTitle");
		String artist = request.getParameter("txtArtist");
		String company = request.getParameter("txtCompany");
		String country = request.getParameter("txtCountry");
		String txtPrice = request.getParameter("txtPrice");
		String txtYear= request.getParameter("txtYear");
		String txtQuantity = request.getParameter("txtQuantity");

        //verifico se List is dirty
        List lista = (List)request.getSession().getAttribute("lista");
        CD cdRecuperato = (CD)lista.get(index);

        System.out.println("\n\n CD RECUPERATO DA SESSIONE HTTP:\n");
        System.out.println(cdRecuperato.getVersion()+"\n");

		//conversioni:
        Long id = 0L;
        if (!txtId.equals("")) {
			id =Long.parseLong(txtId);
		}

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

        // assegno solo campi non vuoti:
        if(!artist.equals("")){
            daModificare.setArtist(artist);
        }

        if(!title.equals("")){
            daModificare.setTitle(title);
        }

        if(!company.equals("")){
            daModificare.setCompany(company);
        }

        if(!country.equals("")){
            daModificare.setCountry(country);
        }

		daModificare.setPrice(price);
		daModificare.setYear(year);
		daModificare.setQuantity(quantity);

        return daModificare;
    }

    public boolean checkConcurrentUpdate ()throws StaleObjectStateException{


        return true;
    }
}
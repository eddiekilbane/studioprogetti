package avvio;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class PrincipaleList {
	
	private SessionFactory sessionFactory;
	
	public PrincipaleList(){
		
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(tipi.lista.Item.class);
				
		this.sessionFactory = configurazione.configure().buildSessionFactory();
		
	}
	
	public static void main (String [] args){
		
		//System.out.println("Avvio");
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
	
		
		PrincipaleList p= new PrincipaleList();
		
		// COSTRUZIONE DI UN OGGETTO Item:
		tipi.lista.Item articolo = new tipi.lista.Item();
		articolo.setName("ND Envidia");
		articolo.setDescription("Scheda Video");
		articolo.getImages().add("imgid90");
		articolo.getImages().add("imgid92");
		articolo.getImages().add("imgid91");
		
		
		
		//INSERIMENTO
		
		Session sessione =p.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+articolo.getId());
		
		sessione.save(articolo);
		System.out.println("inserito con ID: "+articolo.getId());
		sessione.getTransaction().commit();

		
		
		
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	
	
	
	
	
	
}
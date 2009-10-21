package avvio;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class PrincipaleMap {
	
	private SessionFactory sessionFactory;
	
	public PrincipaleMap(){

		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(tipi.map.Item.class);
				
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//System.out.println("Avvio");
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
	
		
		PrincipaleMap p= new PrincipaleMap();
		
		// COSTRUZIONE DI UN OGGETTO Item:
		tipi.map.Item articolo = new tipi.map.Item();
		articolo.setName("ND Envidia");
		articolo.setDescription("Scheda Video");
		articolo.getImages().put("Nome1","imgid90");
		articolo.getImages().put("Nome2","imgid92");
		articolo.getImages().put("Nome3","imgid91");
		
		
		
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
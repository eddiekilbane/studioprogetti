package avvio;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class PrincipaleSet {
	
	private SessionFactory sessionFactory;
	
	public PrincipaleSet(){
		
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(tipi.set.Item.class);
				
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//System.out.println("Avvio");
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
	
		
		PrincipaleSet p= new PrincipaleSet();
		
		// COSTRUZIONE DI UN OGGETTO Item:
		tipi.set.Item articolo = new tipi.set.Item();
		articolo.setName("ND Envidia");
		articolo.setDescription("Scheda Video");
		articolo.getImages().add("img/id90");
		
		
		
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
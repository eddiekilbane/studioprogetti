package avvio;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class PrincipaleBag {
	
	private SessionFactory sessionFactory;
	
	public PrincipaleBag(){

		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(tipi.bag.Item.class);
				
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//System.out.println("Avvio");
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
	
		
		PrincipaleBag p= new PrincipaleBag();
		
		Session sessione =p.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		// COSTRUZIONE DI UN OGGETTO Item:
		tipi.bag.Item articolo = new tipi.bag.Item();
		articolo.setName("ND Envidia");
		articolo.setDescription("Scheda Video");
		articolo.getImages().add("imgid90");
		articolo.getImages().add("imgid92");
		articolo.getImages().add("imgid91");
		
		
		
		//INSERIMENTO
		
		
		System.out.println("prima inserimento ID: "+articolo.getId());
		
		sessione.save(articolo);
		System.out.println("inserito con ID: "+articolo.getId());
		
		
		sessione.getTransaction().commit();

		
		
		
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	
	
	
	
	
	
}
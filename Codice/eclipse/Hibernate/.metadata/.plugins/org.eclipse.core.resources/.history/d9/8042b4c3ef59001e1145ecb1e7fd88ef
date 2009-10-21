package demo.associations.OneToOne.bidirectional.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import demo.associations.OneToOne.bidirectional.beans.*;

public class TestCrud {

	/**
	 * @param args
	 */
	
	
	
private SessionFactory sessionFactory;
	
	public TestCrud(){
		
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(Address.class);
		configurazione.addClass(User.class);		
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TestCrud p= new TestCrud();
		
		User nuovoUtente = new User();
		nuovoUtente.setFirstname("Stefano");
		nuovoUtente.setLastname("Fiorenza");
		nuovoUtente.setUsername("stefano");
		nuovoUtente.setPassword("stefano");
		nuovoUtente.setRanking(6);
		nuovoUtente.setEmail("stefanofiorenza@portale.it");
		
		
		//2) Costruzione Address
		Address nuovoIndirizzo = new Address();
		nuovoIndirizzo.setCity("Roma");
		nuovoIndirizzo.setStreet("Via Giulia 28");
		nuovoIndirizzo.setZipcode("00126");
		nuovoIndirizzo.setUtente(nuovoUtente);
		
		
		
		//INSERIMENTO
		System.out.println("\n\nRENDO PERSISTENTI GLI OGGETTI CREATI IN MEMORIA");
		//p.inserisciAddress(nuovoIndirizzo);
		p.inserisciAddress(nuovoIndirizzo);
		
		
		
		// MODIFICA
		
		System.out.println("\n\nIN MEMORIA");
		System.out.println("prima modifica:"+nuovoUtente+"\n");
		nuovoUtente.setEmail("nuovaEmail@gmail.com");
		nuovoIndirizzo.setStreet("Via Appia 188");
		System.out.println("dopo modifica:"+nuovoUtente);
		
		System.out.println("\nRENDO PERSISTENTE LA MODIFICA:\n");
		p.modificaAddress(nuovoIndirizzo);
		System.out.println();
		
		
		// CANCELLAZIONE
		System.out.println("\nCANCELLO ENTRAMBI GLI OGGETTI:\n");
		p.cancellaAddress(nuovoIndirizzo);
		
		
		
	}
	
	
public void inserisciUser (User daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaUser (User daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaUser (User daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}
	
	
	public User cercaUser (long id){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		Object utente =sessione.get("unoAuno.User", (java.io.Serializable)id);
		return (User)utente;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
public void inserisciAddress (Address daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaAddress (Address daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaAddress (Address daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}
	
	 
	
	
	
	
	
	
	
	
	

}

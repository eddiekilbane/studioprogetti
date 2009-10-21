package avvio;
import org.hibernate.*;
import org.hibernate.cfg.*;



public class PrincipaleRE1ANUserAddress {
	
	private SessionFactory sessionFactory;
	
	public PrincipaleRE1ANUserAddress(){
		
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(unoAmolti.Address.class);
		configurazione.addClass(unoAmolti.User.class);
			
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//System.out.println("Avvio");
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
	
		
		PrincipaleRE1ANUserAddress p= new PrincipaleRE1ANUserAddress();
		
		//1) Creo l'oggetto User
		//************************************************************
		//E' possibile creare uno User senza avere un Address, ma non il 
		// viceversa perchè Address necessita di una FK verso User
//		************************************************************
		
		unoAmolti.User nuovoUtente = new unoAmolti.User();
		nuovoUtente.setFirstname("Stefano");
		nuovoUtente.setLastname("Fiorenza");
		nuovoUtente.setUsername("stefano");
		nuovoUtente.setPassword("stefano");
		nuovoUtente.setRanking(6);
		nuovoUtente.setEmail("stefanofiorenza@portale.it");
		
		// apro la sessione
		Session sessione =p.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
//		2) RENDO PERSISTENTE L'OGGETTO User
		System.out.println("prima inserimento ID: "+nuovoUtente.getId());
		sessione.save(nuovoUtente);
		System.out.println("inserito con ID: "+nuovoUtente.getId());
		//sessione.getTransaction().commit();
		
		
		//3) A QUESTO PUNTO POSSO CREARE UN OGGETTO Address
		unoAmolti.Address nuovoIndirizzo = new unoAmolti.Address();
		//nuovoIndirizzo.setId(new Long(123));
		nuovoIndirizzo.setCity("Roma");
		nuovoIndirizzo.setStreet("Via Giulia 28");
		nuovoIndirizzo.setZipcode("00126");
		nuovoIndirizzo.setUtente(nuovoUtente);
		
		unoAmolti.Address nuovoIndirizzo2 = new unoAmolti.Address();
		//nuovoIndirizzo.setId(new Long(123));
		nuovoIndirizzo2.setCity("Roma");
		nuovoIndirizzo2.setStreet("Piazza Navona 16");
		nuovoIndirizzo2.setZipcode("00122");
		nuovoIndirizzo2.setUtente(nuovoUtente);
		
		
		
		//4) e posso procedere poi al salvataggio degli Address
		System.out.println("PRIMO INDIRIZZO:\nprima inserimento ID: "+nuovoIndirizzo.getId());
		sessione.save(nuovoIndirizzo);
		System.out.println("PRIMO INDIRIZZO:\nDopo inserimento ID: "+nuovoIndirizzo.getId());
		
		System.out.println("SECONDO INDIRIZZO:\nprima inserimento ID: "+nuovoIndirizzo2.getId());
		sessione.save(nuovoIndirizzo2);
		System.out.println("SECONDO INDIRIZZO:\nDopo inserimento ID: "+nuovoIndirizzo2.getId());
		
		//non chiamare esplicitamente la commit perche' chiuderebbe la sessione
		//sessione.getTransaction().commit();
		
		
		
		
		//5) posso collegare i due oggetti persistenti User e Address:
		//nuovoUtente.getAddresses().add(nuovoIndirizzo);
		//nuovoUtente.getAddresses().add(nuovoIndirizzo2);
		sessione.getTransaction().commit();
		
		
		
	}
	
	
	public void inserisciUser (unoAmolti.User daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaUser (unoAmolti.User daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaUser (unoAmolti.User daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}
	
	
	public unoAmolti.User cercaUser (long id){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		Object utente =sessione.get("unoAuno.User", (java.io.Serializable)id);
		return (unoAmolti.User)utente;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
public void inserisciAddress (unoAmolti.Address daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaAddress (unoAmolti.Address daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaAddress (unoAmolti.Address daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}

	
	
	
	
	
	
}
package avvio;
import java.util.Iterator;
import org.hibernate.*;
import org.hibernate.cfg.*;



public class PrincipaleRENANUserAddressBidirez {
	
	private SessionFactory sessionFactory;
	
	public PrincipaleRENANUserAddressBidirez(){
		
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(moltiAmoltiBidirez.Address.class);
		configurazione.addClass(moltiAmoltiBidirez.User.class);
			
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//System.out.println("Avvio");
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
	
		
		PrincipaleRENANUserAddressBidirez p= new PrincipaleRENANUserAddressBidirez();
		
		//1) Creo l'oggetto User
		//************************************************************
		//E' possibile creare uno User senza avere un Address, ma non il 
		// viceversa perche' Address necessita di una FK verso User
//		************************************************************
		
		moltiAmoltiBidirez.User nuovoUtente = new moltiAmoltiBidirez.User();
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
		
		
		//3) OGGETTi Address
		moltiAmoltiBidirez.Address nuovoIndirizzo = new moltiAmoltiBidirez.Address();
		//nuovoIndirizzo.setId(new Long(123));
		nuovoIndirizzo.setCity("Roma");
		nuovoIndirizzo.setStreet("Via Giulia 28");
		nuovoIndirizzo.setZipcode("00126");

        //1) aggiornamento entrameb le direzioni della relazione
        // necessario inverse="true" per evitare duplicati negli insert
        nuovoUtente.addIndirizzo(nuovoIndirizzo);
		nuovoIndirizzo.addUtente(nuovoUtente);
		


		moltiAmoltiBidirez.Address nuovoIndirizzo2 = new moltiAmoltiBidirez.Address();
		//nuovoIndirizzo.setId(new Long(123));
		nuovoIndirizzo2.setCity("Roma");
		nuovoIndirizzo2.setStreet("Piazza Navona 16");
		nuovoIndirizzo2.setZipcode("00122");

		nuovoIndirizzo2.addUtente(nuovoUtente);
        nuovoUtente.addIndirizzo(nuovoIndirizzo2);


        sessione.save(nuovoUtente);
        
       
       

		//4) e posso procedere poi al salvataggio degli Address
//		System.out.println("PRIMO INDIRIZZO:\nprima inserimento ID: "+nuovoIndirizzo.getId());
//		sessione.save(nuovoIndirizzo);
//		System.out.println("PRIMO INDIRIZZO:\nDopo inserimento ID: "+nuovoIndirizzo.getId());
//
//		System.out.println("SECONDO INDIRIZZO:\nprima inserimento ID: "+nuovoIndirizzo2.getId());
//		sessione.save(nuovoIndirizzo2);
//		System.out.println("SECONDO INDIRIZZO:\nDopo inserimento ID: "+nuovoIndirizzo2.getId());
		
		//non chiamare esplicitamente la commit perche' chiuderebbe la sessione
		//sessione.getTransaction().commit();
		
		
		
		
		//Test navigazione relazione:
		Iterator iteratore = nuovoUtente.getIndirizzi().iterator();

       System.out.println("Indirizzi di "+nuovoUtente.getFirstname()+":\n");
       while(iteratore.hasNext()){

           moltiAmoltiBidirez.Address indirizzo = (moltiAmoltiBidirez.Address)iteratore.next();
           System.out.println(indirizzo.toString());
        }

		sessione.getTransaction().commit();
		
		
		
	}
	
	
	public void inserisciUser (moltiAmoltiBidirez.User daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaUser (moltiAmoltiBidirez.User daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaUser (moltiAmoltiBidirez.User daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}
	
	
	public moltiAmoltiBidirez.User cercaUser (long id){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		Object utente =sessione.get("moltiAmoltiBIdirez.User", (java.io.Serializable)id);
		return (moltiAmoltiBidirez.User)utente;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
public void inserisciAddress (moltiAmoltiBidirez.Address daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaAddress (moltiAmoltiBidirez.Address daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaAddress (moltiAmoltiBidirez.Address daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}

	
	
	
	
	
	
}
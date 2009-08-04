package avvio;
import org.hibernate.*;
import org.hibernate.cfg.*;

import unoAunoBidirez.Address;
import unoAunoBidirez.User;


public class Principale1A1Bidir {
	
	private SessionFactory sessionFactory;
	
	public Principale1A1Bidir(){
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(unoAunoBidirez.Address.class);
		configurazione.addClass(unoAunoBidirez.User.class);
		
		
		
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//System.out.println("Avvio");
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
	
		
		Principale1A1Bidir p= new Principale1A1Bidir();
		
		
		
		
		//1) Costruzione User
		unoAunoBidirez.User nuovoUtente = new unoAunoBidirez.User();
		nuovoUtente.setFirstname("Stefano");
		nuovoUtente.setLastname("Fiorenza");
		nuovoUtente.setUsername("stefano");
		nuovoUtente.setPassword("stefano");
		nuovoUtente.setRanking(6);
		nuovoUtente.setEmail("stefanofiorenza@portale.it");
		//nuovoUtente.setAddress(nuovoIndirizzo);
		
		
		//2) Costruzione Address
		unoAunoBidirez.Address nuovoIndirizzo = new unoAunoBidirez.Address();
		nuovoIndirizzo.setCity("Roma");
		nuovoIndirizzo.setStreet("Via Giulia 28");
		nuovoIndirizzo.setZipcode("00126");
		nuovoIndirizzo.setUtente(nuovoUtente);
		
		
		//INSERIMENTO
		System.out.println("\n\nRENDO PERSISTENTI GLI OGGETTI CREATI IN MEMORIA");
		//p.inserisciUser(nuovoUtente);
		p.inserisciAddress(nuovoIndirizzo);
		
		
		// MODIFICA
		/*
		System.out.println("\n\nIN MEMORIA");
		System.out.println("prima modifica:"+nuovoUtente+"\n");
		nuovoUtente.setEmail("nuovaEmail@gmail.com");
		System.out.println("dopo modifica:"+nuovoUtente);
		
		System.out.println("\nRENDO PERSISTENTE LA MODIFICA:\n");
		p.modificaUser(nuovoUtente);
		System.out.println();
				
		// CANCELLAZIONE
		System.out.println("\nCANCELLO ENTRAMBI GLI OGGETTI:\n");
		p.cancellaAddress(nuovoIndirizzo);
		p.cancellaUser(nuovoUtente);
		*/
		
		
		
		
		
	}
	
	
	public void inserisciUser (unoAunoBidirez.User daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaUser (unoAunoBidirez.User daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaUser (unoAunoBidirez.User daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}
	
	
	public unoAunoBidirez.User cercaUser (long id){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		Object utente =sessione.get("unoAuno.User", (java.io.Serializable)id);
		return (unoAunoBidirez.User)utente;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
public void inserisciAddress (unoAunoBidirez.Address daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaAddress (unoAunoBidirez.Address daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaAddress (unoAunoBidirez.Address daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}

	
	
	
	
	
	
}
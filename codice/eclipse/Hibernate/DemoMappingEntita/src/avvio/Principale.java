package avvio;
import org.hibernate.*;
import org.hibernate.cfg.*;

import unoAuno.Address;
import unoAuno.User;


public class Principale {
	
	private SessionFactory sessionFactory;
	
	public Principale(){
		
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(semplici.User.class);
		configurazione.addClass(semplici.Address.class);
		
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//System.out.println("Avvio");
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
	
		
		Principale p= new Principale();
		
		
		//1) Costruzione Address
		semplici.Address nuovoIndirizzo = new semplici.Address();
		nuovoIndirizzo.setCity("Roma");
		nuovoIndirizzo.setStreet("Via Giulia 28");
		nuovoIndirizzo.setZipcode("00126");
		
		//2) Costruzione User
		semplici.User nuovoUtente = new semplici.User();
		nuovoUtente.setFirstname("Stefano");
		nuovoUtente.setLastname("Fiorenza");
		nuovoUtente.setUsername("stefano");
		nuovoUtente.setPassword("stefano");
		nuovoUtente.setRanking(6);
		nuovoUtente.setEmail("stefanofiorenza@portale.it");
		//nuovoUtente.setAddress(nuovoIndirizzo);
		
		
		//INSERIMENTO
		System.out.println("\n\nRENDO PERSISTENTI GLI OGGETTI CREATI IN MEMORIA");
		p.inserisciUser(nuovoUtente);
		p.inserisciAddress(nuovoIndirizzo);
		
		
		// MODIFICA
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
		
		
		
		// RECUPERO
		
		
	
			
		//2) modifica
		
		
		
		
		//3)Recupero dal Db di un altro oggetto CD
		/*
		beans.CD trovato =p.cerca(2);
		
		System.out.println(trovato);
		*/
		
		
	}
	
	
	public void inserisciUser (semplici.User daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaUser (semplici.User daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaUser (semplici.User daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}
	
	
	public semplici.User cercaUser (long id){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		Object utente =sessione.get("unoAuno.User", (java.io.Serializable)id);
		return (semplici.User)utente;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
public void inserisciAddress (semplici.Address daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getId());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getId());
		sessione.getTransaction().commit();
	    
	
	} 

	public void modificaAddress (unoAuno.Address daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getId());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getId());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancellaAddress (semplici.Address daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getId());
		sessione.getTransaction().commit();
		
		
	}

	
	
	
	
	
	
}
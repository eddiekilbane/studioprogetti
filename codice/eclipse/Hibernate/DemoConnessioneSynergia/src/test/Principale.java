package test;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class Principale {
	
	private SessionFactory sessionFactory;
	
	public Principale(){
		this.sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
		
		
		Principale p= new Principale();
		
		
		//1) inserimento CD
		beans.CD nuovo = new beans.CD();
		nuovo.setArtist("Bob Dylan");
		nuovo.setTitle("Empire Burlesque");
		nuovo.setCompany("RCA");
		nuovo.setPrice(10.90);
		nuovo.setYear(1966);
		nuovo.setCountry("USA");
		nuovo.setQuantity(12);
		
		p.inserisci(nuovo);
		
		
		
		//2) modifica
		System.out.println("IN MEMORIA");
		System.out.println("prima modifica:"+nuovo+"\n");
		nuovo.setPrice(13.20);
		System.out.println("dopo modifica:"+nuovo+"\n");
		
		System.out.println("Rendo persistente la modifica");
		p.modifica(nuovo);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//3)Recupero dal Db di un altro oggetto CD
		
		beans.CD trovato =p.cerca(2);
		
		System.out.println(trovato);
		
		
		
	}
	
	
	public void inserisci (beans.CD daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getPrimaryKey());
		
		sessione.save(daInserire);
		System.out.println("inserito con ID: "+daInserire.getPrimaryKey());
		sessione.getTransaction().commit();
	    
	
	}

	public void modifica (beans.CD daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getPrimaryKey());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getPrimaryKey());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancella (beans.CD daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getPrimaryKey());
		sessione.getTransaction().commit();
		
		
	}
	
	
	public beans.CD cerca (long id){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		Object cd =sessione.get("beans.CD", (java.io.Serializable)id);
		return (beans.CD)cd;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	

	
	
	
	
	
	
}
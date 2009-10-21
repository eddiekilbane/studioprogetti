package demo.identita.composite.test;

import org.hibernate.*;
import org.hibernate.cfg.*;
import demo.identita.composite.*;

public class Principale {
	
	private SessionFactory sessionFactory;
	
	public Principale(){
		Configuration cfg = new Configuration();
		cfg.addClass(demo.identita.composite.CD.class);
		
		this.sessionFactory = cfg.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
		
		
		Principale p= new Principale();
		
		
		//1) inserimento CD
		CD nuovo = new CD();
		nuovo.setArtist("Bob Dylan");
		nuovo.setTitle("Empire Burlesque");
		nuovo.setCompany("RCA");
		nuovo.setPrice(10.90);
		nuovo.setYear(1966);
		nuovo.setCountry("USA");
		nuovo.setQuantity(12);
		
		
		
		CD nuovo2 = new CD();
		nuovo2.setArtist("Bob Dylan");
		nuovo2.setTitle("Empire Burlesque");
		nuovo2.setCompany("RCA");
		nuovo2.setPrice(10.90);
		nuovo2.setYear(1966);
		nuovo2.setCountry("USA");
		nuovo2.setQuantity(12);
		
		p.inserisci(nuovo);
	
		p.inserisci(nuovo2);
		
		
	}
	
	
	public void inserisci (CD daInserire){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("provo ad inserire cd con ID: "+daInserire.getKey().toString());
		sessione.save(daInserire);
		sessione.getTransaction().commit();
	    
	
	}

	
	
	
	
	
	
	public CD cerca (long id){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		Object cd =sessione.get("beans.CD", (java.io.Serializable)id);
		return (CD)cd;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	

	
	
	
	
	
	
}
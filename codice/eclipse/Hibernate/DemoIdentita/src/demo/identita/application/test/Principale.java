package demo.identita.application.test;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.exception.ConstraintViolationException;

import demo.identita.application.*;

public class Principale {
	
	private SessionFactory sessionFactory;
	private final static int BobDylanEmpireBurlesque=994129802;
	
	
	public Principale(){
		Configuration cfg = new Configuration();
		cfg.addClass(demo.identita.application.CD.class);
		
		this.sessionFactory = cfg.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
	try{	
		
		Principale p= new Principale();
		
		// il valore della chiave viene determinato dal programma
		//ed e'conforme al criterio di uguaglianza tra due oggetti CD (artist,title)
		
		//1) inserimento CD
		CD nuovo = new CD();
		nuovo.setPrimaryKey((long)(nuovo.hashCode()));
		nuovo.setArtist("Bob Dylan");
		nuovo.setTitle("Empire Burlesque");
		nuovo.setCompany("RCA");
		nuovo.setPrice(10.90);
		nuovo.setYear(1966);
		nuovo.setCountry("USA");
		nuovo.setQuantity(12);
		
		CD nuovo2 = new CD();
		nuovo2.setPrimaryKey((long)(nuovo2.hashCode()));
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
	
	
	catch (ConstraintViolationException ecc){
		
		System.out.println("Attenzione: Il record  e' gia esistente sul DB");
	}
	catch (Exception e){
		
	}
	finally{
		
		System.out.println("Il processo continua normalmente..");
		
	}
	
		/*
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
		
		CD trovato =p.cerca(2);
		
		System.out.println(trovato);
		
		*/
		
	}
	
	
	public void inserisci (CD daInserire) throws ConstraintViolationException{
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("prima inserimento ID: "+daInserire.getPrimaryKey());
		
		sessione.save(daInserire);
		System.out.println("dopo inserimento ID: "+daInserire.getPrimaryKey());
		sessione.getTransaction().commit();
	    
	
	}

	public void modifica (CD daModificare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		System.out.println("ID oggetto in memoria: "+daModificare.getPrimaryKey());
				
		sessione.update(daModificare);
		sessione.saveOrUpdate(daModificare);
		System.out.println("modifica oggetto con ID: "+daModificare.getPrimaryKey());
		sessione.getTransaction().commit();
		
	}
	
	
	public void cancella (CD daCancellare){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		sessione.delete(daCancellare);
		System.out.println("ID oggetto cancellato: "+daCancellare.getPrimaryKey());
		sessione.getTransaction().commit();
		
		
	}
	
	
	public CD cerca (long id){
		
		Session sessione =this.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		Object cd =sessione.get("demo.identita.application.CD", (java.io.Serializable)id);
		return (CD)cd;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	

	
	
	
	
	
	
}
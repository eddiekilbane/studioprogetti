package demo.associations.ManyToMany.unidirectional.test;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import demo.associations.ManyToMany.unidirectional.beans.*;

public class TestCrud {

		

	
	private SessionFactory sessionFactory;
	
	public TestCrud(){
		
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(Address.class);
		configurazione.addClass(User.class);
			
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	

		
		public static void main (String [] args){
			
			testInserimenti();
	        		
			
		}
		
		/*
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
			
			Object utente =sessione.get("moltiAmolti.User", (java.io.Serializable)id);
			return (User)utente;
		}
		
		*/
		
		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

	/*	
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
*/

	    public static void testInserimenti (){

	    	TestCrud p= new TestCrud();


	        //1) Creo l'oggetto User

			User nuovoUtente = new User();
			nuovoUtente.setFirstname("Stefano");
			nuovoUtente.setLastname("Fiorenza");
			nuovoUtente.setUsername("stefano");
			nuovoUtente.setPassword("stefano");
			nuovoUtente.setRanking(6);
			nuovoUtente.setEmail("stefanofiorenza@portale.it");


	        //...al momento il suo insieme di indirizzi e' vuoto:
	        testRelazioni(nuovoUtente);

			// apro la sessione
			Session sessione =p.getSessionFactory().getCurrentSession();
			sessione.beginTransaction();

//			2) RENDO PERSISTENTE L'OGGETTO User
			sessione.save(nuovoUtente);
			System.out.println("USER inserito con ID: "+nuovoUtente.getId());
			//sessione.getTransaction().commit();


			//3) CREAO DEGLI OGGETTI Address...
			Address nuovoIndirizzo = new Address();
			nuovoIndirizzo.setCity("Roma");
			nuovoIndirizzo.setStreet("Via Giulia 28");
			nuovoIndirizzo.setZipcode("00126");
		
			Address nuovoIndirizzo2 = new Address();
			nuovoIndirizzo2.setCity("Roma");
			nuovoIndirizzo2.setStreet("Piazza Navona 16");
			nuovoIndirizzo2.setZipcode("00122");
			

			//4) e posso procedere poi al salvataggio degli Address
			sessione.save(nuovoIndirizzo);
			System.out.println("PRIMO INDIRIZZO:\nDopo inserimento ID: "+nuovoIndirizzo.getId());

			sessione.save(nuovoIndirizzo2);
			System.out.println("SECONDO INDIRIZZO:\nDopo inserimento ID: "+nuovoIndirizzo2.getId());

	
			//5) posso collegare i due oggetti persistenti User e Address:
			nuovoUtente.addIndirizzo(nuovoIndirizzo);
	        nuovoUtente.addIndirizzo(nuovoIndirizzo2);
			sessione.getTransaction().commit();

			System.out.println("Ora in "+nuovoUtente.getFirstname()+" ci sono questi indirizzi: ");
			testRelazioni(nuovoUtente);
	    }
		

	    public static void testRelazioni(User nuovoUtente){

	    	
	       //Test navigazione relazione:
		   Iterator iteratore = nuovoUtente.getIndirizzi().iterator();
	       System.out.println("Indirizzi di "+nuovoUtente.getFirstname()+":\n");
	       while(iteratore.hasNext()){

	           Address indirizzo = (Address)iteratore.next();
	           System.out.println(indirizzo.toString());
	        }

	    }
		
	
	
	
	
	
	
}
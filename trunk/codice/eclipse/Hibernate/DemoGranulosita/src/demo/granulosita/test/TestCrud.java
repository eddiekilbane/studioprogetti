package demo.granulosita.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.granulosita.beans.Impiegato;
import demo.granulosita.beans.Indirizzo;



public class TestCrud {


	private SessionFactory sessionFactory;
	
	public TestCrud(){
		
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(Impiegato.class);
					
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCrud tester = new TestCrud();
		
		Indirizzo indirizzo = new Indirizzo("Via Margutta 12","00100","Roma");
		Impiegato impiegato= new Impiegato ();
		impiegato.setNome("Luca");
		impiegato.setCognome("Manzoni");
		impiegato.setIndirizzo(indirizzo);
		impiegato.setPaese("Italia");
		impiegato.setQualifica("Project Manager");
		impiegato.setTelefono("0643424235");
		
		
		Session sessione = tester.getSessionFactory().getCurrentSession();
				
		sessione.beginTransaction();
		sessione.save(impiegato);
		impiegato.setCognome("De Matteis");
		impiegato.getIndirizzo().setCitta("Firenze");
		sessione.getTransaction().commit();
		
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}

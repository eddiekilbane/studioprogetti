package avvio;
import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;


import tipi.componenti.Image;


public class PrincipaleComponente {
	
	private SessionFactory sessionFactory;
	
	public PrincipaleComponente(){
		Configuration configurazione = new Configuration();
		
		// aggiunta dinamica di classi persistenti 
		configurazione.addClass(tipi.componenti.Item.class);
				
		this.sessionFactory = configurazione.configure().buildSessionFactory();
	}
	
	public static void main (String [] args){
		
		//System.out.println("Avvio");
		//oggetto che gestisce la creazione di sessioni di lavoro col DB
	
		
		PrincipaleComponente p= new PrincipaleComponente();
		
		//apro la Sessione
		Session sessione =p.getSessionFactory().getCurrentSession();
		sessione.beginTransaction();
		
		
		// COSTRUZIONE DI UN OGGETTO Item:
		
		tipi.componenti.Item articolo = new tipi.componenti.Item();
		articolo.setName("ND Envidia");
		articolo.setDescription("Scheda Video");
		sessione.save(articolo);	
		
		// acquisito lo stato persistent e la chiave, lo aggiungo agli oggetti Image
		
		
		// Costruzione di oggetti Image
		tipi.componenti.Image immagine1 = new tipi.componenti.Image();
		immagine1.setNomeImmagine("Imm19");
		immagine1.setPathImmagine("Immag1199.jpg");
		immagine1.setSizeX(100);
		immagine1.setSizeY(100);
		
		//System.out.println("Image Appena costruito:\n");
		//System.out.println(immagine1);
		//immagine1.setArticolo(articolo);
		
		tipi.componenti.Image immagine2 = new tipi.componenti.Image();
		immagine2.setNomeImmagine("Immagine199");
		immagine2.setPathImmagine("Immagine199.jpg");
		immagine2.setSizeX(160);
		immagine2.setSizeY(160);
		
				
		//AGGIORNAMENTO COLLEGAMENTI CON Item
		articolo.getImages().add(immagine1);
		articolo.getImages().add(immagine2);
		
	
		// ciclo su oggetti Image in articolo in memoria
		Iterator it = articolo.getImages().iterator();
		
		System.out.println("In ARTICOLO: ");
		while(it.hasNext()){
			
			System.out.println( ((Image)it.next()));
			
		}
		
		
		sessione.getTransaction().commit();
		
		

		
		
		
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	
	
	
	
	
	
}
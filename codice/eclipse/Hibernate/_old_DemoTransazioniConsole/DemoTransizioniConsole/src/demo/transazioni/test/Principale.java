package demo.transazioni.test;

import org.hibernate.*;
import org.hibernate.cfg.*;

import demo.hibernate.util.Console;
import demo.transazioni.beans.CD;


public class Principale {
	
	
	
	public static void main (String [] args){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		
		
		
		// 1) oggetto transient
		CD nuovo = new CD();
		nuovo.setArtist("Radiohead");
		nuovo.setTitle("The Bends");
		nuovo.setCompany("RCA");
        nuovo.setPrice(10.90);
		nuovo.setYear(1998);
		nuovo.setCountry("UK");
		nuovo.setQuantity(12);

        // APERTURA SESSIONE (UTENTE)
		Session sessione = sessionFactory.openSession();
        //**************************************************


        //** INIZIO TRANSAZIONE
        Transaction transazione =sessione.beginTransaction();
        //**************************************************
            
        // 1) rendo persistente nuovo
		sessione.persist(nuovo);
        System.out.println(nuovo);
        long id = nuovo.getPrimaryKey();
        System.out.println("Inserito con ID = "+id);
        System.out.println("Premere invio per continuare....");
       Console.leggiStringa();


		//2) modifica (oggetto gestito)
		System.out.println("IN MEMORIA");
		System.out.println("prima modifica:"+nuovo+"\n");
		nuovo.setPrice(13.20);
		System.out.println("dopo modifica:"+nuovo+"\n");

        System.out.println("Rendo persistente la modifica..");
        transazione.commit();

        //CHIUSURA PRIMA TRANSAZIONE
        //*************************************************************
        sessione.clear();
        //ripulisco la Session dagli oggetti persistenti

       

        // modifica in stato detatched
        nuovo.setPrice(200.0);
        System.out.println();
		System.out.println();
        System.out.println("MODIFICA IN MEMORIA (OGGETTO DETATCHED");
        System.out.println(nuovo);
        // non resa persistente
        System.out.println("Premere un tasto per continuare....");
        Console.leggiStringa();


        // APRO NUOVA SESSIONE
        //*************************************************************
        Transaction transazione2 = sessione.beginTransaction();
		CD trovato =(CD)sessione.load("beans.CD", (java.io.Serializable)id);
        System.out.println();
		System.out.println();
		System.out.println();
        System.out.println(trovato);
        System.out.println("Premere un tasto per continuare....");
        Console.leggiStringa();
        System.out.println("Ricollego l'oggetto nuovo..");
        sessione.merge(nuovo);
        System.out.println("Premere un tasto per continuare....");
        Console.leggiStringa();

        System.out.println("Recuperando l'oggetto precedente...");
        CD aggiornato =(CD)sessione.load("beans.CD", (java.io.Serializable)id);
        System.out.println(aggiornato);
        transazione2.commit();

        Transaction transazione3 = sessione.beginTransaction();
        System.out.println();
        System.out.println(trovato);
        System.out.println();
        System.out.println(aggiornato);
        System.out.println("Premere invio per cancellare dal Db l'oggetto\n"  );
        Console.leggiStringa();
        sessione.delete(aggiornato);
        transazione3.commit();
        sessione.close();

        Session altraSessione = sessionFactory.openSession();
        System.out.println("altra istanza che punta alla stessa riga chiede un merge..."  );
        Console.leggiStringa();
        Transaction transazione4 = altraSessione.beginTransaction();
        altraSessione.merge(nuovo);
        transazione4.commit();
        altraSessione.close();
        

      
		//CHIUSURA SESSIONE
        //*************************************************************

     
      
       
		
	}
	
	
	
	
	
}
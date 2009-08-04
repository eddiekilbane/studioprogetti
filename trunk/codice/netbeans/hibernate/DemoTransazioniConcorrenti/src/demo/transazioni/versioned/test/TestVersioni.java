/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.transazioni.versioned.test;

import demo.hibernate.util.Console;
import demo.hibernate.util.SessionFactoryUtil;
import demo.transazioni.versioned.beans.CD;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;

/**
 *
 * @author stefano
 */
public class TestVersioni {

    public static void main(String[] args) {

try{
        Long idProd = new Long(3L);

        SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session sessione1 = factory.openSession();
       	sessione1.beginTransaction();
        CD trovato = (CD)sessione1.get(CD.class, idProd);

        System.out.println("CD TROVATO:");
        System.out.println(trovato);
        System.out.println("Versione: "+trovato.getVersion());
        
        System.out.println("inserisci nuova quantita");
        int nuovaQuantita = Console.leggiInt();
        trovato.setQuantity(nuovaQuantita);
        System.out.println("Premere invio per confermare");
        Console.leggiStringa();
       sessione1.getTransaction().commit();


        sessione1.close();

        System.out.println("CD DOPO MODIFICA");
        System.out.println(trovato);
        System.out.println("Versione: "+ trovato.getVersion());
        System.out.println("Premere invio per chiudere l'applicazione");
        Console.leggiStringa(); 
}
catch (StaleObjectStateException ecc){
    System.out.println("Spiacenti ma l'oggetto e' stato aggiornato da un thread concorrente");
    System.out.println("Il nuovo oggetto ha i seguenti dati: ");
    Session nuovaSessione = SessionFactoryUtil.getSessionFactory().getCurrentSession();
    nuovaSessione.beginTransaction();
    System.out.println(nuovaSessione.get(CD.class, ecc.getIdentifier()));
    nuovaSessione.close();
}

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.northwind.domain.test;

import com.northwind.domain.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author stefano
 */
public class CrudEmployee {

    static SessionFactory factory;

    public static void main(String[] args) {
        Configuration cfg =new Configuration().configure();

        factory= cfg.buildSessionFactory();
    }


    public void inserisci (Employee daInserire){

		

	}

	public void modifica (Employee daModificare){

		
	}


	public void cancella (Employee daCancellare){

//		Session sessione =this.getSessionFactory().getCurrentSession();
//		sessione.beginTransaction();
//		sessione.delete(daCancellare);
//		System.out.println("ID oggetto cancellato: "+daCancellare.getPrimaryKey());
//		sessione.getTransaction().commit();


	}
}

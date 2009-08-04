package ricerca;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import org.hibernate.criterion.*;
import java.util.*;


public class TestRicercaCD {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	try{	
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session sessioneCerca =sessionFactory.openSession();
		
		Criteria criterio1= sessioneCerca.createCriteria(beans.CD.class);
		
		
		//Query ricerca1 = sessioneCerca.createQuery("");
		
		
	
		//********************************************************************
		
			
		
		
		// CRITERIA:
		//*******************************************************************

		//1) LISTA DI RECORD
		/*
		List listaCd =criterio1.list();
		System.out.println(listaCd.size());
		
		Iterator iter = listaCd.iterator();
		while (iter.hasNext()){
			
			beans.CD cd=(beans.CD)iter.next();
			System.out.println(cd);
		}
		*/
		
		
		
		//2) FILTRI
		
		// solo Cd prodotti negli USA
		/*
			criterio1.add(Restrictions.eq("country","USA"));
		 	List listaCd =criterio1.list();
		 	visualizza(listaCd);
		*/	 
		 
		 // FILTRI NOT
		 
		 
		 // FILTRI LIKE
		 
		 
		 // FILTRI NUMERICI (> <)
		 
		 
		 //FILTRI CON OPERATORI BOOLEANI
		 
		 		//1) Default:AND (gli add vengono processati come And)
		 
		 
		 		//2) OR: oggetto LogicalExpression 
		 
		 
		
		
		
		 // QUERY SQL
		 
		 
		 
		 // ORDINAMENTO
		/*
			criterio1.add(Restrictions.gt("price",new Double(9.0)));
			criterio1.addOrder(Order.asc("price"));
			List results = criterio1.list();
			visualizza (results);
		*/
		
		
		 
		// UNICO RISULTATO
			
		// viene sollevata un'eccezione di tipo NonUniqueResultExceptionse 
		// se ci sono piu risultati
		
		/*
			Criterion tupelo = Restrictions.eq("title","Tupelo Honey");
			criterio1.add(tupelo);
			beans.CD cd=(beans.CD)criterio1.uniqueResult();
			System.out.println(cd);
		*/
		
		 
		 
		 // PAGINAZIONE E NAVIGAZIONE DEL ResultSet
			 
		/*
			criterio1.setFirstResult(0); // a partire da quale riga
			criterio1.setMaxResults(4); // recupera le prima n righe
			List listaCd =criterio1.list();
			visualizza(listaCd);
		
		*/
		
		
		//	PROIEZIONI ED AGGREGAZIONI
		/*
			//FUNZIONI DI AGGREGAZIONE
			ProjectionList projList = Projections.projectionList();
			projList.add(Projections.max("price"));
			projList.add(Projections.min("price"));
			projList.add(Projections.avg("price"));
			criterio1.setProjection(projList);
			List results = criterio1.list();
			
			// la chiamata a list produce un array di Object
			// contentente i risultati delle funzioni invocate
			// nell'ordine con cui sono stati eseguiti gli add
			Object [] valori =(Object [])results.get(0);
						
			// mostra i risultati
			System.out.println("Il prezzo massimo: "+valori[0]);
			System.out.println("Il prezzo minimo: "+valori[1]);
			System.out.println("Il prezzo medio: "+valori[2]);
		*/	
		
			// 
		
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("title"));
		projList.add(Projections.property("artist"));
		criterio1.setProjection(projList);
		List results = criterio1.list();
		
		// mostra i risultati
	
		for (int i=0; i<results.size();i++){
			Object [] valori =(Object [])results.get(i);
			System.out.println("TITOLO: "+valori[0]);
			System.out.println("ARTISTA: "+valori[1]+"\n");
			
		}
		
		
		
		
		
		//********************************************************************
		
	}
	
	catch (Exception ecc){
		System.out.println(ecc);
	}
		
	}
	
	
	public static void visualizza (List  x){
				
		Iterator iter = x.iterator();
		while (iter.hasNext()){
			
			Object cd=iter.next();
			System.out.println(cd);
		}
		
	}

}

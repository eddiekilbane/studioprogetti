package demo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set insieme = new HashSet();
		insieme.add("Stefano");
		insieme.add("Matteo");
		insieme.add("Fabrizio");
		insieme.add("Stefano");
		
		System.out.println("Insieme contiene "+insieme.size());
		
		Iterator iteratore = insieme.iterator();
		
		while(iteratore.hasNext()){
			
			String risultato = (String)iteratore.next();
			System.out.println(risultato);
		}
		
	}

	
	public static void visualizzaInsieme (Set insieme){
		
		Iterator iteratore = insieme.iterator();
		
		while(iteratore.hasNext()){
			
			Object obj = iteratore.next();
			System.out.println(obj);
		}
	}
}

package es.ricerche.northwind;

import java.util.Iterator;
import java.util.List;

public class RicercaQueryByExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void displayList(List list){
        
		 Iterator iter = list.iterator();
		 
        while(iter.hasNext()){
            
       	 Object obj = iter.next();
       	 System.out.println(obj);
       	 
            
        }       
       
    }
}

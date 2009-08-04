package demo.associations.OneToMany.bidirectional.ricerca.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import demo.associations.OneToMany.bidirectional.beans.*;

public class TestRicercaAssociazione {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   SessionFactory sessionFactory;
		   Configuration cfg = new Configuration();
		   cfg.addClass(User.class);
		   cfg.addClass(Address.class);
           sessionFactory=cfg.configure().buildSessionFactory();
           
           //prove
           //***********************************************************
           // String userPerNome = "from User u where u.firstname='Marco'";
           // String nomeUserPerAddressZipCode = "select u.firstname from User u inner join u.addresses as a where a.zipcode='00123'";
           // String userPerAddressZipCode= "select u from User u inner join u.addresses as a where a.zipcode='00123'";       
           // 
           String hql="";
           
           
           Session session = sessionFactory.getCurrentSession();
          session.beginTransaction();
          
          Query query = session.createQuery(hql);
          List results = query.list();
          displayList(results);
		
	}
	
	 public static void displayList(List list){
         
		 Iterator iter = list.iterator();
		 
         while(iter.hasNext()){
             
        	 Object obj = iter.next();
        	 System.out.println(obj);
        	 
             
         }       
        
     }

}

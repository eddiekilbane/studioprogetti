package ricerca;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCriterion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   SessionFactory sessionFactory;
           sessionFactory=new Configuration().configure().buildSessionFactory();
           Session session =sessionFactory.getCurrentSession();
   		   session.beginTransaction();
	}
	
	
	public static void visualizza (List  x){
		
		Iterator iter = x.iterator();
		while (iter.hasNext()){
			
			Object obj=iter.next();
			System.out.println(obj);
		}
		
	}

}

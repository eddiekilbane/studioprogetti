package demo.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static SessionFactory factory;
	
	private static void createSessionFactory() {
		
		Configuration config = new Configuration();
		factory = config.configure().buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory(){
		if (factory==null){
			createSessionFactory();
		}
		return factory;
	}
	
}

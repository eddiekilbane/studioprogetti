package demo.transazioni.servizio;

import demo.hibernate.util.SessionFactoryUtil;
import java.util.Vector;

import demo.transazioni.beans.versioned.CD;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;


public class ServiziCdHibernate {

	
	
	
	public List<CD> cercaByExample (CD daCercare){
		
        SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session sessioneHibernate = factory.getCurrentSession();
        System.out.print("*************************");
        System.out.print("In Servizi Hibernate: factory="+factory.toString());
        System.out.print("In Servizi Hibernate: session="+sessioneHibernate.hashCode());
        System.out.print("*************************");
		sessioneHibernate.beginTransaction();
		Criteria cdByExample = sessioneHibernate.createCriteria(CD.class);
        Example esempioCd = Example.create(daCercare);
        esempioCd.excludeZeroes();
		cdByExample.add(esempioCd);
       	List lista = cdByExample.list();
        sessioneHibernate.close();

		return lista;
	}
	
	
//	public void updateCd (CD daModificare){
//		DaoCD daoCD = new DaoCD();
//
//
//	}
//
	
}

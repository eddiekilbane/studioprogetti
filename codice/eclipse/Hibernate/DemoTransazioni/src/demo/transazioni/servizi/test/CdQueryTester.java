package demo.transazioni.servizi.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import demo.hibernate.util.SessionFactoryUtil;
import demo.transazioni.beans.CD;

public class CdQueryTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CD daCercare = new CD();
		daCercare.setArtist("Bonnie Tyler");
		daCercare.setTitle("0");
		daCercare.setCompany("0");
		daCercare.setCountry("0");
		daCercare.setPrice(0.0);
		daCercare.setYear(0);
		daCercare.setQuantity(0);
		
		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session sessioneHibernate = factory.openSession();
		sessioneHibernate.beginTransaction();
		Criteria cdByExample = sessioneHibernate.createCriteria(CD.class);
		Example ex = Example.create(daCercare);
		ex.enableLike();
		//ex.excludeProperty("title");
		//ex.excludeProperty("company");
		//ex.excludeProperty("country");
		ex.excludeZeroes();
		cdByExample.add(ex);
		
		List lista = cdByExample.list();
		
		System.out.println(lista.size());
	}

}

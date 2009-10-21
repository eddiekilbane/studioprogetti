/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.impl.hibernate;

import demo.ristorante.dao.interfaces.AddressDao;
import demo.ristorante.domain.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author stefano
 */
public class HibernateAddressDao implements AddressDao {

    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
       
    public void insertAddress(Address indirizzo){

        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.persist(indirizzo);
        session.getTransaction().commit();
    }

    public void deleteAddress(Address indirizzo){

        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.delete(indirizzo);
        session.getTransaction().commit();
    }

    public void updateAddress (Address indirizzo){

        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.merge(indirizzo);
        session.getTransaction().commit();
    }

}

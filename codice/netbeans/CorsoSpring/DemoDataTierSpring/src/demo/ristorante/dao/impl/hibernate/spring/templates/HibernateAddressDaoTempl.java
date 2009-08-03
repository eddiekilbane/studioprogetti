/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.impl.hibernate.spring.templates;

import demo.ristorante.dao.interfaces.AddressDao;
import demo.ristorante.domain.Address;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author stefano
 */
public class HibernateAddressDaoTempl implements AddressDao{



    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void insertAddress(Address indirizzo) {
        HibernateTemplate template;
        template= new HibernateTemplate(this.sessionFactory);
        template.persist(indirizzo);
    }

    public void deleteAddress(Address indirizzo) {
         HibernateTemplate template;
        template= new HibernateTemplate(this.sessionFactory);
        template.delete(indirizzo);
    }

    public void updateAddress(Address indirizzo) {
       HibernateTemplate template;
        template= new HibernateTemplate(this.sessionFactory);
        template.merge(indirizzo);
    }



}

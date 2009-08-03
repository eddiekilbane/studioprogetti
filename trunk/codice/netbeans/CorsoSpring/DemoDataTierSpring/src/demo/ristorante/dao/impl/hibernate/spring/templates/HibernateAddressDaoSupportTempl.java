/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.impl.hibernate.spring.templates;

import demo.ristorante.dao.interfaces.AddressDao;
import demo.ristorante.domain.Address;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author stefano
 */
public class HibernateAddressDaoSupportTempl extends HibernateDaoSupport implements AddressDao {

    
     public void insertAddress(Address indirizzo) {
//        Session sessione = getSession();
//        sessione.beginTransaction();
//        sessione.persist(indirizzo);
//        sessione.getTransaction().commit();

         getHibernateTemplate().persist(indirizzo);

    }

    public void deleteAddress(Address indirizzo) {
//        Session sessione = getSession();
//        sessione.beginTransaction();
//        sessione.delete(indirizzo);
//        sessione.getTransaction().commit();
         getHibernateTemplate().delete(indirizzo);

    }

    public void updateAddress(Address indirizzo) {
//        Session sessione = getSession();
//        sessione.beginTransaction();
//        sessione.merge(indirizzo);
//        sessione.getTransaction().commit();

          getHibernateTemplate().merge(indirizzo);
    }

}

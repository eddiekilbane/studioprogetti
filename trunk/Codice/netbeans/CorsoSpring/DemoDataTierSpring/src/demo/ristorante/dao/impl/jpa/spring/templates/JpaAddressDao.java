/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.impl.jpa.spring.templates;

import demo.ristorante.dao.interfaces.*;
import demo.ristorante.domain.Address;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import org.springframework.dao.support.DaoSupport;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.support.JpaDaoSupport;

/**
 *
 * @author stefano
 */
public class JpaAddressDao implements AddressDao{
     
  
	protected EntityManagerFactory entityManagerFactory;
   
    public void insertAddress(Address indirizzo) {
       EntityManager em=getEntityManagerFactory().createEntityManager();
       em.persist(indirizzo);
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

   

    public void deleteAddress(Address indirizzo) {
         getEntityManagerFactory().createEntityManager().remove(indirizzo);
                
    }

    public void updateAddress(Address indirizzo) {
         getEntityManagerFactory().createEntityManager().merge(indirizzo);
    }

}

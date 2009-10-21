/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.impl.jpa;

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
     
   @PersistenceContext (unitName="myPersistenceUnit")
	protected EntityManager entityManager;
   
    public void insertAddress(Address indirizzo) {
         this.entityManager.persist(indirizzo);
      // em.flush();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

     
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

   

    public void deleteAddress(Address indirizzo) {
        
         this.entityManager.remove(indirizzo);
              
    }

    public void updateAddress(Address indirizzo) {
         this.entityManager.merge(indirizzo);
    }

}

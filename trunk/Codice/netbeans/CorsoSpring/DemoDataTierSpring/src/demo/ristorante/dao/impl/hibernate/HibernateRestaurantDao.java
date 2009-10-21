/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.impl.hibernate;

import demo.ristorante.domain.Restaurant;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author stefano
 */
public class HibernateRestaurantDao {

    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public void insertRestaurant(Restaurant ristorante){

        hibernateTemplate.persist(ristorante);
        

    }

}

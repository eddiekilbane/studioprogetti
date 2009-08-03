/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blog.jpa.dao.test;

import demo.ristorante.dao.impl.hibernate.HibernateRestaurantDao;
import junit.framework.TestCase;
/**
 *
 * @author stefano
 */
public class HibernateTemplateTest extends TestCase{

    HibernateRestaurantDao hibernateRestDao;


    public void setUp() {

        hibernateRestDao= new HibernateRestaurantDao();

    }


}

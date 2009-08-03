/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blog.jpa.dao.hibernate;

import demo.ristorante.dao.impl.hibernate.HibernateRestaurantDao;
import demo.ristorante.domain.Restaurant;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stefano
 */
public class HibernateRestaurantDaoTest {

    public HibernateRestaurantDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setSessionFactory method, of class HibernateRestaurantDao.
     */
    @Test
    public void testSetSessionFactory() {
        System.out.println("setSessionFactory");
        SessionFactory sessionFactory = null;
        HibernateRestaurantDao instance = new HibernateRestaurantDao();
        instance.setSessionFactory(sessionFactory);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertRestaurant method, of class HibernateRestaurantDao.
     */
    @Test
    public void testInsertRestaurant() {
        System.out.println("insertRestaurant");
        Restaurant ristorante = new Restaurant();
        ristorante.setId(1);
      
        HibernateRestaurantDao instance = new HibernateRestaurantDao();
        instance.insertRestaurant(ristorante);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
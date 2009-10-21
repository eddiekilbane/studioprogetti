/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blog.jpa.dao;

import demo.ristorante.dao.interfaces.AddressDao;
import demo.ristorante.domain.Address;
import javax.persistence.EntityManagerFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import static org.junit.Assert.*;

/**
 *
 * @author stefano
 */
public class JpaAddressDaoTest {

    Address indirizzo;
    AddressDao instance;


    public JpaAddressDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
           indirizzo= new Address ();
        indirizzo.setId(10L);
        indirizzo.setStreetName("Via Magnolia");
        indirizzo.setStreetNumber(32);

        Resource resource = new ClassPathResource("config/JpaContextLocalContainer.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

        instance = (AddressDao)beanFactory.getBean("myAddressDao");
    }

    @After
    public void tearDown() {
    }

   
    /**
     * Test of insertAddress method, of class JpaAddressDao.
     */
    @Test
    public void testInsertAddress() {
        System.out.println("insertAddress");
        instance.insertAddress(indirizzo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAddress method, of class JpaAddressDao.
     */
    @Test
    public void testDeleteAddress() {
        System.out.println("deleteAddress");
       instance.deleteAddress(indirizzo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updateAddress method, of class JpaAddressDao.
     */
    @Test
    public void testUpdateAddress() {
        System.out.println("updateAddress");
        instance.updateAddress(indirizzo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}
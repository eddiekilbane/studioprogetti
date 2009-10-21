/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.impl.hibernate.test;

import demo.ristorante.dao.interfaces.AddressDao;
import demo.ristorante.domain.Address;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author stefano
 */
public class HibernateAddressDaoTest {

    public static void main(String[] args) {
        Address indirizzo;
        AddressDao instance;
        indirizzo = new Address();
        indirizzo.setId(20L);
        indirizzo.setStreetName("Via Magnolia");
        indirizzo.setStreetNumber(32);

        Resource resource = new ClassPathResource("config/hibernate/HibernateContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        instance = (AddressDao) beanFactory.getBean("myHibernateAddressDao");
        System.out.println("insertAddress");
        instance.insertAddress(indirizzo);
         System.out.println("deleteAddress");
        instance.deleteAddress(indirizzo);
        
    }
}

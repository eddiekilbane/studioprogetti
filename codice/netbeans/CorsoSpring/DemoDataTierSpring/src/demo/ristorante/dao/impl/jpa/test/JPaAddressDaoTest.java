/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.impl.jpa.test;

import demo.ristorante.dao.interfaces.*;
import demo.ristorante.dao.interfaces.AddressDao;
import demo.ristorante.dao.*;
import demo.ristorante.domain.Address;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 *
 * @author stefano
 */
public class JPaAddressDaoTest {

    public static void main(String[] args) {

        Address indirizzo;
        AddressDao instance;
        indirizzo = new Address();
        indirizzo.setId(20L);
        indirizzo.setStreetName("Via Magnolia");
        indirizzo.setStreetNumber(32);

//        Resource resource = new ClassPathResource("config/jpa/JpaContextLocalContainer.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
        ApplicationContext contesto = new ClassPathXmlApplicationContext("config/jpa/JpaContextLocalContainer.xml");
       

        instance = (AddressDao) contesto.getBean("myAddressDao");
        System.out.println("insertAddress");
        instance.insertAddress(indirizzo);
         System.out.println("deleteAddress");
        instance.deleteAddress(indirizzo);
    }


}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.myapp.services;

import demo.myapp.domain.CD;
import demo.myapp.services.impl.ServiziCDImpl;
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
public class ServiziCDTest {

    public ServiziCDTest() {
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
     * Test of inserisciCD method, of class ServiziCD.
     */
    @Test
    public void testInserisciCD() {
        System.out.println("inserisciCD");
        CD daInserire = null;
        ServiziCD instance = new ServiziCDImpl();
        instance.inserisciCD(daInserire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrezzoById method, of class ServiziCD.
     */
    @Test
    public void testGetPrezzoById() {
        System.out.println("getPrezzoById");
        Long idCD = null;
        ServiziCD instance = new ServiziCDImpl();
        double expResult = 0.0;
        double result = instance.getPrezzoById(idCD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancellaCD method, of class ServiziCD.
     */
    @Test
    public void testCancellaCD() {
        System.out.println("cancellaCD");
        CD daCancellare = null;
        ServiziCD instance = new ServiziCDImpl();
        instance.cancellaCD(daCancellare);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.myapp.services.impl;

import demo.myapp.domain.CD;
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
public class ServiziCDImplTest {

    public ServiziCDImplTest() {
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
     * Test of inserisciCD method, of class ServiziCDImpl.
     */
    @Test
    public void testInserisciCD() {
        System.out.println("inserisciCD");
        CD daInserire = null;
        ServiziCDImpl instance = new ServiziCDImpl();
        instance.inserisciCD(daInserire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrezzoById method, of class ServiziCDImpl.
     */
    @Test
    public void testGetPrezzoById() {
        System.out.println("getPrezzoById");
        Long idCD = null;
        ServiziCDImpl instance = new ServiziCDImpl();
        double expResult = 0.0;
        double result = instance.getPrezzoById(idCD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancellaCD method, of class ServiziCDImpl.
     */
    @Test
    public void testCancellaCD() {
        System.out.println("cancellaCD");
        CD daCancellare = null;
        ServiziCDImpl instance = new ServiziCDImpl();
        instance.cancellaCD(daCancellare);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
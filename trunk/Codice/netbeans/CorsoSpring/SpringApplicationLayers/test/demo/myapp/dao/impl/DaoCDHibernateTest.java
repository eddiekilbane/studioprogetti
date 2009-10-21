/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.myapp.dao.impl;

import demo.myapp.domain.CD;
import java.util.List;
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
public class DaoCDHibernateTest {

    public DaoCDHibernateTest() {
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
     * Test of insert method, of class DaoCDHibernate.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        CD daInserire = null;
        DaoCDHibernate instance = new DaoCDHibernate();
        Long expResult = null;
        Long result = instance.insert(daInserire);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DaoCDHibernate.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        CD daAggiornare = null;
        DaoCDHibernate instance = new DaoCDHibernate();
        instance.update(daAggiornare);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DaoCDHibernate.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        CD daCancellare = null;
        DaoCDHibernate instance = new DaoCDHibernate();
        instance.delete(daCancellare);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class DaoCDHibernate.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = null;
        DaoCDHibernate instance = new DaoCDHibernate();
        CD expResult = null;
        CD result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class DaoCDHibernate.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        DaoCDHibernate instance = new DaoCDHibernate();
        List<CD> expResult = null;
        List<CD> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
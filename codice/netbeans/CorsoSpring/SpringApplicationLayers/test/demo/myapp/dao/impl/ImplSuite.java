/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.myapp.dao.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author stefano
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({demo.myapp.dao.impl.DaoCDHibernateTest.class})
public class ImplSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
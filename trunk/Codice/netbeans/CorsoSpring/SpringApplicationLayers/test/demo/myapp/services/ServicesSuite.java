/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.myapp.services;

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
@Suite.SuiteClasses({demo.myapp.services.ServiziCDTest.class,demo.myapp.services.impl.ImplSuite.class})
public class ServicesSuite {

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
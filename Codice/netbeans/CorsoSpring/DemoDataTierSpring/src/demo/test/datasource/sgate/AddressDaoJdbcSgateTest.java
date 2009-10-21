/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.test.datasource.sgate;

import java.sql.SQLException;

/**
 *
 * @author stefano
 */
public class AddressDaoJdbcSgateTest {

    public static void main(String[] args) {
     try{
        AddressDaoJdbcImpl prova = new AddressDaoJdbcImpl();
        prova.pingConnection();
    }
     catch (SQLException ecc){
         ecc.printStackTrace();
     }
    }
}

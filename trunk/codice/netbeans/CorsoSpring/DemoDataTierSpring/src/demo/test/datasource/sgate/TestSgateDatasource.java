/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.test.datasource.sgate;

import demo.ristorante.domain.Address;
import java.sql.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author stefano
 */
public class TestSgateDatasource  {

    private static final String JNDI_DATASOURCE_NAME="java:sGate";
    DataSource datasource;

    public TestSgateDatasource(){
         try {
        Context context = new InitialContext();

        if (null == context) {
          throw new Exception("Context is null");
        }

        // Lookup this new dataSource
        datasource = (DataSource) context.lookup(JNDI_DATASOURCE_NAME);
      } catch (Exception e) {
        e.printStackTrace();
      }

    }


    public DataSource getDatasource() {
        return datasource;
    }

    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
    }



     public void pingConnection() throws SQLException {

        Connection conn = this.datasource.getConnection();
        PreparedStatement prepared = conn.prepareStatement("Select * from DOMANDA_AGEV");

        ResultSet tab = prepared.executeQuery();

        while (tab.next()) {

            String campo1 = tab.getString(1);
            String campo2 = tab.getString(2);
            System.out.println("campo1 " + campo1);
            System.out.println("campo2 " + campo2);

        }
        conn.close();

    }

}

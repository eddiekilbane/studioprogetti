/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.ristorante.dao.impl.jdbc.spring.template;

import demo.ristorante.dao.interfaces.*;
import demo.ristorante.domain.Address;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author stefano
 */
public class AddressDaoJdbcImpl extends JdbcDaoSupport {

    public AddressDaoJdbcImpl() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@(description=(address=(host=172.16.7.81)(protocol=tcp)(port=1521))(connect_data=(SERVICE_NAME=SVIL10UTF8)( SERVER=DEDICATED)))");
        dataSource.setUsername("sgate_demo");
        dataSource.setPassword("sgdm21");
        this.setDataSource(dataSource);
    }

    public void pingConnection() throws SQLException {

        Connection conn = this.getConnection();
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

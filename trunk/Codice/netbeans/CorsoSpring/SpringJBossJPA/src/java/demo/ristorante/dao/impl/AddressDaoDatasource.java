/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.impl;

import demo.ristorante.dao.AddressDao;
import demo.ristorante.domain.Address;
import java.sql.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author stefano
 */
public class AddressDaoDatasource implements AddressDao {

    private static final String JNDI_DATASOURCE_NAME="java:MySqlSpringRistorante";
    DataSource datasource;

    public AddressDaoDatasource(){
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

    public void insertAddress(Address indirizzo) {
        try{
            long id = indirizzo.getId();
            String streetName = indirizzo.getStreetName();
            int streetNumber = indirizzo.getStreetNumber();

        Connection conn =this.datasource.getConnection();
        String sql = "Insert into address (id,street_number,street_name) values (?,?,?)";
        PreparedStatement insertAddressPr = conn.prepareStatement(sql);
        insertAddressPr.setLong(1, id);
        insertAddressPr.setInt(2, streetNumber);
        insertAddressPr.setString(3,streetName);

        int ris = insertAddressPr.executeUpdate();
        
        conn.close();
        }
        catch (SQLException sqlEcc){
            sqlEcc.printStackTrace();

        }

    }

    public void deleteAddress(Address indirizzo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateAddress(Address indirizzo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

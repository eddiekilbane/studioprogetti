/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.associations.bidirectional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.hibernate.cfg.Configuration;



/**
 *
 * @author stefano
 */
public class DeployExample {

    public static void main(String[] args) {
       Configuration cfg = new Configuration().configure();

       Properties properties =cfg.getProperties();
        createDataBaseSchema(properties);

    }

    private static void createDataBaseSchema(Properties datasource){

        try{
            String driver =datasource.getProperty("connection.driver_class");
            String url=datasource.getProperty("connection.url");
            String user=datasource.getProperty("connection.username");
            String password=datasource.getProperty("connection.password");
            String dialect =datasource.getProperty("dialect");


            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement createSql =connection.createStatement();

            String dropTablePersonSql="drop table if exists Person;";
            String dropTableAddressSql="drop table if exists Address;";
            String createTablesPersonSql= "create table Person ( personId bigint not null primary key, addressId bigint not null )";
            String createTablesAddressSql="create table Address ( addressId bigint not null primary key )";

            createSql.executeUpdate(dropTablePersonSql);
            createSql.executeUpdate(dropTableAddressSql);
            createSql.executeUpdate(createTablesPersonSql);
            createSql.executeUpdate(createTablesAddressSql);
            createSql.close();
            connection.close();

        }catch (ClassNotFoundException notFound){
            notFound.printStackTrace();
        }catch (SQLException sqlEcc){
            sqlEcc.printStackTrace();
        }

    }
}

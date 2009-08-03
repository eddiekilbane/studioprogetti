/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blog.jpa.dao.test;


import java.util.List;
import junit.framework.TestCase;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/**
 *
 * @author stefano
 */
public class JdbcTemplateTest extends TestCase {

    private DriverManagerDataSource dataSource;
  

    public void setUp() {
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/Ristorante");
        dataSource.setUsername("root");
        dataSource.setPassword("stefano");
   
       
    }

public void testInsert() {
    JdbcTemplate jt = new JdbcTemplate(dataSource);
    jt.execute("insert into address (id, street_name,street_number) values(1, 'Via Tallinn',12)");
    jt.execute("insert into address (id, street_name,street_number) values(2, 'Via Giulia',128)");

    List ris =jt.queryForList("select * from address");
    assertNotNull(ris);
    assertEquals(20, ris.size());
  }

}

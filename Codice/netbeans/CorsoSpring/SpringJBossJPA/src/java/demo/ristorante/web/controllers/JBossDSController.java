
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.web.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.SimpleFormController;

/** 
 *
 * @author stefano
 */
public class JBossDSController extends AbstractController  {

    public JBossDSController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
    }
    
  

   


 

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
         ModelAndView mv = new ModelAndView("TestDsJbossOk");
        
         
        StringBuffer html = new StringBuffer("<b>Record Query con DataSource:</B><br/>");

        String jndi="java:MySqlSpringRistorante";
        DataSource datasource;
        Context context = new InitialContext();
        datasource=(DataSource)context.lookup(jndi);
        Connection conn = datasource.getConnection();
        PreparedStatement prepared = conn.prepareStatement("Select * from Address");
//
        ResultSet tab = prepared.executeQuery();
//
        while (tab.next()) {

            String campo1 = tab.getString(1);
            String campo2 = tab.getString(3);
            html.append("campo1 " + campo1+"<br/>");
           html.append("campo2 " + campo2+"<br/>");

        }
        conn.close();
        datasource = (DataSource) context.lookup(jndi);
        String result=html.toString();




        mv.addObject("risultatoDS",result);


        //Do something...
        return mv;
    }





}
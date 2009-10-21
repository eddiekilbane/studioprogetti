/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.jboss.persistence.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author stefano
 */
public class ServletDataSource extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {


           String output= testDataSource("java:MySqlSpringRistorante");


          //  String lista = listJndiResources();
            // TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JbossTestServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JbossTestServlet at " + request.getContextPath() + "</h1>");
            out.println(output);
            out.println("</body>");
            out.println("</html>");

        } catch (NamingException ecc) {
            ecc.printStackTrace();
        } catch (SQLException sqlEcc) {

            sqlEcc.printStackTrace();
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public String testDataSource(String jndi) throws NamingException, SQLException {

        StringBuffer html = new StringBuffer("<b>Record Query con DataSource:</B><br/>");

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
        return html.toString();
    }

    public String listJndiResources() throws NamingException {

        StringBuffer sf = new StringBuffer("Risorse collegate tramite Jndi: <br>");
        Context context = new InitialContext();
        NamingEnumeration ne = context.list("java:comp/env");

        while (ne.hasMore()) {
            javax.naming.NameClassPair item = (javax.naming.NameClassPair) ne.next();
            String className = item.getClassName();
            String nomeInNameSpace = item.getName();
            sf.append("<b>NomeClasse:</b> " + className + " <b>Nome JNDI:</b> " + nomeInNameSpace + "<BR/>");
        }

        return sf.toString();




    }
}

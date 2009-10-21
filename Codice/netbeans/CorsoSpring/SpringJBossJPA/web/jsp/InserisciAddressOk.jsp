<%-- 
    Document   : InserisciAddressOk
    Created on : 15-lug-2009, 15.41.22
    Author     : stefano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="indirizzo" scope="request" class="demo.ristorante.web.beans.Address" />
            ID:<jsp:getProperty name="indirizzo" property="id" />
            Via:<jsp:getProperty name="indirizzo" property="streetName" />
            N. <jsp:getProperty name="indirizzo" property="streetNumber" />
     </body>
</html>

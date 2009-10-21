<%-- 
    Document   : TestDsJbossOk
    Created on : 20-lug-2009, 16.37.45
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
        <h1>Risultato recuperato da DB:</h1>
        <%
        String tabella =(String)request.getAttribute("risultatoDS");
        out.print(tabella);
        %>

    </body>
</html>

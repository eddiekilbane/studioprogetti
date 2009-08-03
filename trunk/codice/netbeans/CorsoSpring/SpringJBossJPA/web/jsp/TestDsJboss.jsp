<%-- 
    Document   : TestDsJboss
    Created on : 20-lug-2009, 16.37.35
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
        <h1>Test JBoss DataSource JNDI Binding</h1>
        <form action="${pageContext.servletContext.contextPath}/testJBossDs.htm">
            <input type="submit" value="Test" />
        </form>
    </body>
</html>

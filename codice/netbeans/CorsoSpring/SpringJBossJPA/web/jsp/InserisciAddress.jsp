<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form action="${pageContext.servletContext.contextPath}/inserisciAddress.htm" commandName="address">

            ID:<form:input path="id" />
            Via:<form:input path="streetName" />
             N. <form:input path="streetNumber" />
            <input type="submit" value="Conferma" />
        </form:form>
    </body>
</html>

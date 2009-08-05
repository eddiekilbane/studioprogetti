<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="form.FormEuroConvertitore"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
form.FormEuroConvertitore bean= (form.FormEuroConvertitore)request.getAttribute("euroConvertitore");
double risultato = bean.getEuro();
%>

Lire: <input type="text" ><br/>
Euro: <input type="text" value=<%=risultato %> ><br/>

</body>
</html>
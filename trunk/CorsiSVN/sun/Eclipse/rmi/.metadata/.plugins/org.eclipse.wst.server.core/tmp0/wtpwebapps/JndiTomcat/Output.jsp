<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
beans.CD cd = (beans.CD)session.getAttribute("cd");
%>


<table>
<tr>
<td>Artista</td>
<td>Title</td>
<td>Prezzo</td>
<td>Company</td>
<td>Year</td>
</tr>

<tr>
<td><%=cd.getArtist() %></td>
<td><%=cd.getTitle() %></td>
<td><%=cd.getPrice() %></td>
<td><%=cd.getCompany() %></td>
<td><%=cd.getYear() %></td>
</tr>

</table>

</body>
</html>
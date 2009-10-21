<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Calendar" %>

<html:html>
<head>
<title>Bean Bean sample code</title>
</head>
<body bgcolor="white">
<% 

HashMap lines = new HashMap();
lines.put("1", "Line 1");
lines.put("2", "Line 2");
lines.put("3", "Line 3");

// oggetti nello scope request
request.setAttribute("lines", lines);
request.setAttribute("sessione", session);
request.setAttribute("floatval", Float.valueOf("3.14159"));

// salvo data corrente
Calendar gc = GregorianCalendar.getInstance();
gc.setTime(new java.util.Date(session.getCreationTime()));
request.setAttribute("now", gc);

// stringhe
String boldStart = "<B>";
String boldEnd = "</B>";
request.setAttribute("bs", boldStart);
request.setAttribute("be", boldEnd);

%>

Session Started at: <bean:write format="MM-dd-yyyy hh:mm:ss"
                                  name="now" property="time"/><BR>

La mappa inserita:
<bean:size id="length" name="lines"/>
ha <bean:write name="length" format="0" /> righe
</body>
</html:html>

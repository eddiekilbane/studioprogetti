<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Calendar" %>
<html:html>
<head>
<title>Bean Bean sample code</title>
</head>
<body bgcolor="white">

<h3>Bean Bean sample code</h3>

<p>This page provides examples of the following Struts BEAN tags:<br>
<ul>
<li>&lt;bean:define&gt;</li>
<li>&lt;bean:write&gt;</li>
<li>&lt;bean:size&gt;</li>
</ul>

<table border="1" width="100%">

  <%--
  The following section contains code defining variables.
  --%>

  <tr>
    <td align="left" colspan="2">
    <bean:define id="name" value="Tagslibs"/>
    Application Name: <bean:write name="name"/><BR>
     <% request.setAttribute("session", session); %>
     <bean:define id="context" name="session" property="servletContext"/>
     Server Info: <bean:write name="context" property="serverInfo"/><BR>
     <bean:define id="context_copy" name="context"
                  type="javax.servlet.ServletContext"/>
     Server Major Version:
              <bean:write name="context_copy" property="minorVersion"/>
</td>
</tr>
<%--
The following section contains code getting the size of a collection.
--%>
  <tr>
<% HashMap lines = new HashMap();
    lines.put("1", "Line 1");
    lines.put("2", "Line 2");
    lines.put("3", "Line 3");
    request.setAttribute("lines", lines);
    %>
    <td align="left" colspan="2">
    <bean:size id="length" name="lines"/>
    Line Count: <bean:write name="length"/>
</td>
</tr>
<%--
The following section contains code showing how to write bean values.
--%>
  <tr>
<%
  request.setAttribute("floatval", Float.valueOf("3.14159"));
  Calendar gc = GregorianCalendar.getInstance();
  gc.setTime(new java.util.Date(session.getCreationTime()));
  request.setAttribute("now", gc);
  String boldStart = "<B>";
  String boldEnd = "</B>";
  request.setAttribute("bs", boldStart);
  request.setAttribute("be", boldEnd);

  %>
  <td align="left" colspan="2">
  Pi is: <bean:write format="#.####" name="floatval"/><BR>
  Session Started at: <bean:write format="MM-dd-yyyy hh:mm:ss"
                                  name="now" property="time"/><BR>
  This should not be in <bean:write name="bs"/>bold
                        <bean:write name="be"/><BR>
  This should be in <bean:write name="bs" filter="false"/>bold
                    <bean:write name="be" filter="false"/><BR>
</td>
</tr>
</table>
</body>
</html:html>

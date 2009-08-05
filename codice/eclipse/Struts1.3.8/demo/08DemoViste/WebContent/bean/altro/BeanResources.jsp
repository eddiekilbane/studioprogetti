<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@ page import="logica.RandomQuote" %>
<%@ page import="java.util.PropertyResourceBundle" %>
<%@ page import="org.apache.struts.action.Action" %>
<%@ page import="org.apache.struts.util.MessageResources" %>
<html:html>
<head>
<title>Bean Resources sample code</title>
</head>
<body bgcolor="white">

<h3>Bean Resources sample code</h3>
 
<p>This page provides examples of the following Struts BEAN tags:<br>
<ul>
<li>&lt;bean:message&gt;</li>
<li>&lt;bean:resource&gt;</li>
<li>&lt;bean:struts&gt;</li>
</ul>

<table border="1" width="100%">
  <%--
  The following section contains code getting messages.
  --%>
  <tr>
    <td align="left" colspan="2">
     <% RandomQuote rq = new RandomQuote();
     request.setAttribute("rq", rq);
     MessageResources python =
        MessageResources.getMessageResources("logica.pythonquotes");
     MessageResources normal =
        MessageResources.getMessageResources("logica.ApplicationResources");

     session.getServletContext().setAttribute("logica.pythonquotes", python);
     session.getServletContext().setAttribute("", normal);
%>
     <bean:message bundle="logica.pythonquotes" key="ni"/><P>
     <bean:message bundle="logica.pythonquotes" name="rq"
                   property="randomQuoteName"/><P>
     <bean:message key="application.uses.struts" arg0="Joe User" arg1="4"/>
    </td>
  </tr>
  <%--
  The following section shows how to use web resources.
  --%>
  <tr>
    <td align="left" colspan="2">
Here's the struts-config.xml file for this application:<P>
<bean:resource id="resource" name="/testPage1.jsp"/>
<bean:write name="resource"/>
</td>
</tr>
 
  <%--
  The following section shows how to get a Struts configuration object.
  --%>
  <tr>
    <td align="left" colspan="2">
The type of the /HtmlFile mapping is:
<bean:struts id="map" mapping="/HtmlFile"/>
<bean:write name="map" property="type"/>
</td>
  </tr>
  <%--
  The following section shows how to get an application web response.
  --%>
  <tr>
    <td align="left">
testPage1:<BR>
<bean:include id="tp1" page="/testPage1.jsp"/>
<bean:write name="tp1" filter="false"/><P>
</td><td align="left">
testPage2<BR>
<bean:include id="tp2" forward="testpage2"/>
<bean:write name="tp2" filter="false"/><P>
</td>
</tr>
</table>
</body>
</html:html>


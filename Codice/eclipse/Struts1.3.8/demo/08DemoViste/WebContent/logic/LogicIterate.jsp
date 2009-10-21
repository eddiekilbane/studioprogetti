<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.HashMap" %>
<html:html>
<head>
<title>Logic Iterate sample code</title>
</head>
<body bgcolor="white">

<h3>Logic Iterate sample code</h3>

<p>This page provides examples of the following Struts LOGIC tags:<br>

<ul>
<li>&lt;logic:iterate&gt;</li>
</ul>

<%--
Variables used on this page
--%>
<%
HashMap h = new HashMap();
String jameses[] = {"Joyce", "Thurber", "Kirk", "Cameron", "Monroe"};
String kevins[] = {"Spacey", "Bacon"};
String bruces[] = {"Willis", "The Shark", "Cockburn"};
h.put("James", jameses);
h.put("Kevin", kevins);
h.put("Bruce", bruces);
request.setAttribute("givenNames", h);
%>
<%--
The following section shows iterate.
--%>

<logic:iterate id="gname" indexId="ind" name="givenNames">

  <bean:write name="ind"/>. <bean:write name="gname" property="key"/><BR>
  <logic:iterate id="lname" name="gname" property="value" length="4" offset="1">
      -----<bean:write name="lname"/><BR>
  </logic:iterate>
</logic:iterate><P>
<logic:iterate id="header" collection="<%= request.getHeaderNames() %>">
   <bean:write name="header"/><BR>
</logic:iterate>
</body>
</html:html>

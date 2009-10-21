<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.Enumeration" %>
<html:html>
<head>
<title>Logic Match sample code</title>
</head>
<body bgcolor="white">

<h3>Logic Match sample code</h3>

<p>This page provides examples of the following Struts LOGIC tags:<br>
<ul>
<li>&lt;logic:match&gt;</li>
<li>&lt;logic:notMatch&gt;</li>
</ul>

<%--
Variables used on this page
--%>
<%
  request.setAttribute("authorName1", "James M. Turner");
request.setAttribute("authorName2", "Kevin Bedell");
%>
<%--
The following section shows match and notMatch.
--%>

<logic:match name="authorName1" scope="request" value="ames">
   <bean:write name="authorName1"/> has the string 'ames' in it.
</logic:match>
<logic:notMatch name="authorName1" scope="request" value="ames">
   <bean:write name="authorName1"/> doesn't have the string 'ames' in it.
</logic:notMatch>
<BR>
<logic:match name="authorName2" scope="request" value="ames">
   <bean:write name="authorName2"/> has the string 'ames' in it.
</logic:match>

<logic:notMatch name="authorName2" scope="request" value="ames">
   <bean:write name="authorName2"/> doesn't have the string 'ames' in it.
</logic:notMatch>
<BR>
<logic:match name="authorName1" scope="request" value="ames" location="start">
   <bean:write name="authorName1"/> starts with the string 'ames'.
</logic:match>
<logic:notMatch name="authorName1" scope="request" value="ames" location="start">
   <bean:write name="authorName1"/> doesn't start with the string 'ames'.
</logic:notMatch>
<BR>
<logic:match header="user-agent" value="Windows">
   You're running Windows
</logic:match>
<logic:notMatch header="user-agent" value="Windows">
   You're not running Windows
</logic:notMatch>
<BR>
</body>
</html:html>
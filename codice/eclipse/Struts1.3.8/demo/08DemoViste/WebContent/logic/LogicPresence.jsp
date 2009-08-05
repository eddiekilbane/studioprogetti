<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="org.apache.struts.action.Action" %>
<%@ page import="org.apache.struts.action.ActionMessage" %>
<%@ page import="org.apache.struts.action.ActionMessages" %>
<html:html>
<head>
<title>Logic Presence sample code</title>
</head>
<body bgcolor="white">

<h3>Logic Presence sample code</h3>

<p>This page provides examples of the following Struts LOGIC tags:<br>
<ul>
<li>&lt;logic:empty&gt;</li>
<li>&lt;logic:messagesPresent&gt;</li>
<li>&lt;logic:messagesNotPresent&gt;</li>
<li>&lt;logic:notEmpty&gt;</li>
<li>&lt;logic:notPresent&gt;</li>
<li>&lt;logic:present&gt;</li>
</ul>

<%--
Variables used on this page
--%>
<%
request.setAttribute("favoriteTeam", "RedSox");
ActionMessages errors = new ActionMessages();
errors.add("totallylost", new ActionMessage("application.totally.lost"));
request.setAttribute("errori", errors);
request.setAttribute("goodThingsAboutTheYankees", "");
%>
<%--
The following section shows empty and notEmpty.
--%>

<logic:empty name="goodThingsAboutTheYankees">
   You must be a Red Sox fan!<P>
</logic:empty>
<logic:notEmpty name="goodThingsAboutTheYankees">
   New Yorker, eh?
</logic:notEmpty>
<P>
<%--
The following section shows present and notPresent.
--%>
<logic:present name="noSuchAttribute" property="noSuchProperty">
   Wow, someone defined it?
</logic:present>
<logic:notPresent name="noSuchAttribute" property="noSuchProperty">
   Much more likely!
</logic:notPresent>
<P>

<logic:notPresent name="request" property="noSuchProperty">
   Request doesn't have such a property...
</logic:notPresent>
<P>
<logic:present header="user-agent">
   Yep, we got a user-agent header.
</logic:present>
<logic:notPresent header="user-agent">
   Odd, user-agent is a standard header property.
</logic:notPresent>
<P>
<%--
The following section shows messagesPresent and messagesNotPresent.
--%>
<logic:messagesPresent property="noSuchMessage">
   Should never see this.
</logic:messagesPresent>
<logic:messagesNotPresent property="noSuchMessage">
   You should see this instead.
</logic:messagesNotPresent>
<P>
<logic:messagesPresent>
   Yes, there are errors.
</logic:messagesPresent><P>
<logic:messagesPresent property="totallylost">
   We're totally lost, so we should see this.
</logic:messagesPresent>
<logic:messagesNotPresent property="totallylost">
      We're totally lost, so we shouldn't see this.
</logic:messagesNotPresent>

</body>
</html:html>


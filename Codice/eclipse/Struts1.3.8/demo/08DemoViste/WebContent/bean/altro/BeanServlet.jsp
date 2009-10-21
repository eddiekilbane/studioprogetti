<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page import="javax.servlet.http.Cookie" %> 
<html:html>
<head>
<title>Bean Servlet sample code</title>
</head>
<body bgcolor="white">

<h3>Bean Servlet sample code</h3>

<p>This page provides examples of the following Struts BEAN tags:<br>
<ul>
<li>&lt;bean:cookie&gt;</li>
<li>&lt;bean:header&gt;</li>
<li>&lt;bean:parameter&gt;</li>
<li>&lt;bean:page&gt;</li>
</ul>

<table border="1" width="100%">
  <%--
  The following section contains creating and displaying a cookie.
  --%>
  <tr>
    <td align="left">

     <bean:cookie id="cookie" name="/tags/cookiedemo" value="firsttime"/>
     <%
       if (cookie.getValue().equals("firsttime")) {
         Cookie c = new Cookie("/tags/cookiedemo", "Hi Mom!");
         c.setComment("A test cookie");
         c.setMaxAge(3600); //60 seconds times 60 minutes
         response.addCookie(c);
       }
       %>


      The cookie value is: <bean:write name="cookie" property="value" format="0"/><P>

    </td>
  </tr>
  <%--
  The following section gets a value from the request header.
  --%>
  <tr>
     <td align="left">
        <bean:header id="lang" name="Accept-Language"/>

        The preferred language for this browser is: <bean:write name="lang"/><P>

     </td>
  </tr>
  <%--
  The following section looks at some parameters passed in.
  --%>
  <tr>
     <td align="left">
      <bean:parameter id="arg" multiple="yes" name="testarg" value="noarg"/>

     Argument list:<BR>
     <% for (int i = 0; i < arg.length; i++) {
        out.write(arg[i] + "<BR>");
     }
     %>
     <P>
     <html:link page="/BeanServlet.do?testarg=123&testarg=456&testarg=789">
     Click here to submit values to this page.</html:link>
    </td>
  </tr>
  <%--
  The following section finds a value from the session.
  --%>
  <tr>
    <td align="left">
       <bean:page id="this_session" property="session"/>
       Session Created = <bean:write name="this_session"
                          property="creationTime" format=""/>
    </td>
  </tr>
</table>
</body>
</html:html>


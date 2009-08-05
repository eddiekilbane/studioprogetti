<%@ page language="java" %>
<%@ page import="org.apache.struts.action.*" %>
<%@ taglib uri="struts-html" prefix="html" %>
 
<html:html>
<head>
<title>&lt;html:errors&gt; sample code</title>
</head>
<body bgcolor="white">

<h1>&lt;html:errors&gt; sample code</h1>
<b>1. &lt;html:errors property="org.apache.struts.action.GLOBAL_ERROR"/&gt;</b>
<br>This will display page-level errors, if any, right here:<p>
<html:errors property="org.apache.struts.action.GLOBAL_ERROR"/>
<hr>
<b>2. &lt;html:errors bundle="ch12.HtmlErrors" /&gt;</b>
<br>This will display ALL errors, if any, right here with no formatting:<p>
<html:errors bundle="ch12.HtmlErrors" />
<hr><br>
<html:form action="HtmlErrors.do">

<table border="1" width="100%">

  <tr>
    <th align="center" width="35%">
      Checking box will generate error
    </th>
    <th align="left" width="65%">
     &lt;html:errors property="checkbox1" bundle="ch12.HtmlErrors" /&gt;
    </th>
  </tr>

  <tr>
    <td align="center">
      <html:checkbox property="checkbox1"/>
    </td>
    <td align="left">
      &nbsp;<html:errors property="checkbox1" bundle="ch12.HtmlErrors" />
    </td>
  </tr>

  <tr>
    <td align="right">
      <html:submit>submit</html:submit>
    </td>
    <td align="left">
      <html:reset>Reset</html:reset>
      <html:cancel>Cancel</html:cancel>
    </td>
  </tr>

</table>

</html:form>

</body>
</html:html>


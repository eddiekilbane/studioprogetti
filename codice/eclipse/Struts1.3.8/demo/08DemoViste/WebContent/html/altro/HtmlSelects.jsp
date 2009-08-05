<%@ page language="java" import="forms.*, java.util.*" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>
<head>
<title>Select and Option Tags</title>
</head>
<body bgcolor="white">

<h3>Select and Option Tags</h3>
<p>This page provides examples of the following Struts HTML tags:<br>
<ul>
<li>&lt;html:select&gt;</li>
<li>&lt;html:option&gt;</li>
<li>&lt;html:options&gt;</li>
<li>&lt;html:optionsCollection&gt;</li>
</ul>
<html:form action="HtmlSelects.do">

<table border="1" width="100%">

  <tr>

    <%
      Vector colorCollection = new Vector();
      colorCollection.add(
         new org.apache.struts.util.LabelValueBean("Pink", "ch12.pink"));
      colorCollection.add(
         new org.apache.struts.util.LabelValueBean("Brown", "ch12.brown"));
      pageContext.setAttribute("colorCollection", colorCollection);
    %>

    <th align="left" width="25%" >Select a customer: </th>

    <th align="left" width="25%" >Select some colors: </th>

    <th align="left" width="50%" >You last submitted: </th>

  </tr>

  <tr>

    <td align="left" width="25%" >
      <html:select property="custId">
        <html:optionsCollection property="customers"
                                label="name"
                                value="custId" />
      </html:select>
    </td>
    <td align="left" width="25%" >
      <html:select property="colors" size="6" multiple="true" >

        <%-- Specify some options using the basic version of the tag --%>
        <html:option value="ch12.orange">Orange</html:option>
        <html:option value="ch12.purple" value="Purple" />

        <%-- Specify some by referring to a properties file --%>
        <html:option value="ch12.red" bundle="ch12.Colors" key="ch12.red"/>
        <html:option value="ch12.blue" bundle="ch12.Colors" key="ch12.blue"/>

        <%-- Specify some from our collection of LabelValueBean's --%>
        <html:options collection="colorCollection"
                      property="value"
                      labelProperty="label" />

      </html:select>
    </td>

    <td align="left" width="50%" >
        <ul>
          <li>Name: <bean:write name="HtmlSelectsForm" property="cust.name" />
          <logic:iterate id="element" name="HtmlSelectsForm" property="cust.favColors">
          <li>Colors: <bean:write name="element" />
          </logic:iterate>
        </ul>
    </td>

  </tr>

</table>

<table border="1" width="100%">

  Status of all customers:<br>

    <td align="left">
        <ul>
          <logic:iterate id="c" name="HtmlSelectsForm" property="customers">
            <li><bean:write name="c" />
          </logic:iterate>
        </ul>
    </td>

</table>

<table border="0" width="100%">
  <tr>
    <td align="left" width="20%">&nbsp;</td>
    <td align="left">
      <html:submit>Submit</html:submit>
      <html:reset>Reset</html:reset>
      <html:cancel>Cancel</html:cancel>
    </td>
  </tr>

</table>

</html:form>
</html:html>


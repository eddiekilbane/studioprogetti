<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>  
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>      

<%@ page import="personale.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<bean:define id="varImpiegatoLocale" name="impiegatoForm"/>
<bean:define id="dataAssunzione" name="impiegatoForm" property="assunzione" />

I dati dell'Impiegato sono:
<table>
<tr><td>Nome:</td><td><bean:write name="varImpiegatoLocale" property="nome" /></td></tr>
<tr><td>Stipendio</td><td><bean:write name="varImpiegatoLocale" property="stipendio" format="$ ###.##" /></td></tr>
<tr><td>Data Assunzione:</td>
<td>
<bean:write name="varImpiegatoLocale" property="assunzione.giorno" format="" />/
<bean:write name="varImpiegatoLocale" property="assunzione.mese" format="" />/
<bean:write name="varImpiegatoLocale" property="assunzione.anno" format="" />
</td>
</tr>
</table>

</body>
</html:html>
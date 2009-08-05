<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>   
  <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="/caricaBeanImpiegato.do">
Nome: <html:text property="nome" /> <br/>
Stipendio: <html:text property="stipendio" /><br/>
Giorno:<html:text property="giorno" size="2" />
Mese:<html:text property="mese" size="2" />
Anno: <html:text property="anno" size="4" />

<html:submit>Conferma</html:submit>
<html:cancel>Annulla</html:cancel>
</html:form>

</body>
</html>
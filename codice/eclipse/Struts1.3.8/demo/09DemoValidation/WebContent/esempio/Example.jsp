<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="/example">
		<p>
			<i><b>Display all error messages:</b>
			</i>
			<br />
			<html:messages id="errors">
				<bean:write name="errors" />
				<br />
			</html:messages>
		</p>
		
		<p>
			<%-- input field for property name --%>
			Name:
			<html:text property="name" />
			<br />

			<i><b>Only error messages for property name:</b>
			</i>
			<br />
			<html:messages id="err_name" property="name">
				<bean:write name="err_name" />
				<br />
				<br />
			</html:messages>
		</p>
		<p>
			<%-- input field for property age --%>
			Age:
			<html:text property="age" />
			<br />

			<i><b>Only error messages for property age:</b>
			</i>
			<br />
			<html:messages id="err_age" property="age">
				<bean:write name="err_age" />
				<br />
			</html:messages>
		</p>
		<html:submit />
	</html:form>

</body>
</html:html>


<%@ taglib uri="logic" prefix="logic" %>
<%@ taglib uri="bean" prefix="bean" %>

<html>  

<head>
<title> *** action di prova ***</title>
</head>

<body bgcolor="Seashell">
<font face="tahoma" size="4">

-------------  Visualizzazione della Prima Action di prova --------------

<p>
<br>
<jsp:useBean id="vettore" scope="session" class="java.util.Vector" />

<!-- ITERATORE 
- id � il nome dell'i-esimo elemento (del bean dato da name che si trova nello scope)
- name � il nome del bean di tipo COLLECTION 
- indexId � il nome dell'indice che cicla
- offset � l'indice di partenza del ciclo (il default � zero)
- length � la lunghezza del ciclo (il default � la size della collection)
NOTE: non va in errore se offset e length NON sono compatibili
-->
<% if(vettore.size()>0){ %>
inizio iterazione: <br>
<%}%>

<logic:iterate id="numeretto" name="vettore" scope="session" indexId="indice" >
	<li>
	indice --> [<bean:write name="indice"/>] = 
	<bean:write name="numeretto" property="num1"/> &
	<bean:write name="numeretto" property="num2"/>, 
		
	<bean:define id="n1" name="numeretto" property="num1" />
	<bean:define id="n2" name="numeretto" property="num2" />
	la somma � <%= ((Float)n1).intValue() + ((Float)n2).intValue() %>
	</li>
</logic:iterate>
<p>

<b>Con la mia collection: funziona</b>
<!--
Con la mia collection: funziona se risulta
-  An array of Java objects or primitives. 
-  An implementation of java.util.Collection, including ArrayList and Vector. 
-  An implementation of java.util.Enumeration. 
-  An implementation of java.util.Iterator. 
-  An implementation of java.util.Map, including HashMap, Hashtable, and TreeMap. 
-->
<p>

<jsp:useBean id="numbers" scope="session" class="aritmetica.Numeri" />

<!-- mostra il messaggio solo se la size della collection � ZERO -->
<logic:lessThan name="numbers" property="size" value="1">
	la MIA collection ha dimensione Zero<br>
</logic:lessThan>

<!-- mostra la dimensione della collection solo se la size � POSITIVA -->
<logic:greaterThan name="numbers" property="size" value="0">
	dimensione della MIA collection: <bean:write name="numbers" property="size"/><br>
</logic:greaterThan>

<logic:iterate id="numerino" name="numbers" scope="request" indexId="idx">
	<li>
		nuova coppia di  MIEI elementi - indice -->[	<bean:write name="idx"/>	] = 
		<bean:write name="numerino" property="num1"/> &
		<bean:write name="numerino" property="num2"/>		
	</li>
</logic:iterate>
<p>
</font>
<p>
<hr>

<font face="tahoma" size="2">
<a href="index.html"> VAI alla home principale</a>
</font>

</body>
</html>
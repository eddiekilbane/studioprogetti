<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Collaboration
Description: A two-column, fixed-width design suitable for small websites and blogs.
Version    : 1.0
Released   : 20080102

-->

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Collaboration by Free CSS Templates</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<div id="menu">
	<ul>
		<li><a href="#">Homepage</a></li>
		<li class="current_page_item"><a href="#">Gallery</a></li>
		<li><a href="#">About</a></li>
		<li><a href="#">Resources</a></li>
		<li><a href="#">Contact</a></li>
	</ul>
</div>
<div id="logo">
	<h1><a href="#">Collaboration</a></h1>
	<h2>By Free CSS Templates</h2>
</div>
<div id="splash">
	<img src="images/img05.jpg" alt="" />
</div>
<hr />
<div id="page">
	<div id="content">
		<div class="post">
			<h2 class="title"><a href="#">Welcome to Collaboration</a></h2>
			<div class="entry">
				<p>This is <strong>Collaboration</strong>, a free, fully standards-compliant CSS template designed by <a href="http://www.freecsstemplates.org/">Free CSS Templates</a>, released for free under the <a href="http://creativecommons.org/licenses/by/2.5/">Creative Commons Attribution 2.5</a> license. You're free to use this template for anything as long as you link back to <a href="http://www.freecsstemplates.org/">my site</a>. Enjoy :)</p>
				<p>This template is also available as a <a href="http://www.nodethirtythree.com/">WordPress theme</a> at <a href="http://www.freewpthemes.net/">Free WordPress Themes</a>.</p>
			</div>
			<p class="meta"><span class="posted">Posted by <a href="#">Someone</a> on January 2, 2007</span> <a href="#" class="permalink">Read more</a> <a href="#" class="comments">Comments (18)</a> </p>
		</div>
		<div class="post">
			<h2 class="title"><a href="#">DATI INSERITI:</a></h2>
			<div class="entry">
			
				<table width="383" border="0">
				<html:form action="registra.do">
                  <tr>
                    <td width="211"><span class="label">Username</span></td>
                    <td width="156"><html:text maxlength="16" size="25" property="username" /></td>
                  </tr>
                  <tr>
                    <td>Password</td>
                    <td><html:text maxlength="16" size="25" property="password" /></td>
                  </tr>
                  <tr>
                    <td>Nome:</td>
                    <td><html:text maxlength="16" size="25" property="nome" /></td>
                  </tr>
                  <tr>
                    <td>Cognome:</td>
                    <td><html:text maxlength="16" size="25" property="cognome" /></td>
                  </tr>
                  <tr>
                    <td>Cod. Fiscale:</td>
                    <td><html:text maxlength="16" size="25" property="codiceFiscale" /></td>
                  </tr>
                  <tr>
                    <td>Sesso</td>
                    <td><html:text  property="sesso" />
                   </td>
                  </tr>
                  <tr>
                    <td>Data di nascita:</td>
                    <td>
                    <html:text  property="giorno" />
                    <html:text  property="mese" />
                    <html:text  property="anno" />
                    </td>
                  </tr>
                  <tr>
                    <td>Email</td>
                    <td><html:text maxlength="16" size="25" property="email" /></td>
                  </tr>
                  <tr>
                    <td>Telefono</td>
                    <td><html:text maxlength="16" size="25" property="telefono" /></td>
                  </tr>
                  <tr>
                    <td>Fax</td>
                    <td><html:text maxlength="16" size="25" property="fax" /></td>
                  </tr>
                  <tr>
                    <td>Indirizzo</td>
                    <td><html:text maxlength="16" size="25" property="indirizzo" /></td>
                  </tr>
                  <tr>
                    <td>CAP</td>
                    <td><html:text maxlength="16" size="25" property="cap" /> </td>
                  </tr>
                  <tr>
                    <td>Citta</td>
                    <td><html:text maxlength="16" size="25" property="citta" /></td>
                  </tr>
                  <tr>
                    <td>Provincia</td>
                    <td>
                    <html:text property="provincia" />
                   </td>
                  </tr>
                  <tr>
                    <td>Nazione</td>
                    <td><html:text maxlength="16" size="25" property="nazione" /></td>
               </html:form>
                </table>
               
				<p>&nbsp;</p>
		  </div>
			<p class="meta"><span class="posted">Posted by <a href="#">Someone</a> on December 13, 2007</span> <a href="#" class="permalink">Read more</a> <a href="#" class="comments">Comments (18)</a> . </p>
		</div>
	</div>
	<!-- end #content -->
	<div id="sidebar">
		<ul>
			<li id="search">
				<h2>Search</h2>
				<form id="searchform" method="get" action="">
					<div>
						<input type="text" name="s" id="s" size="15" />
						<br />
						<input name="submit" type="submit" value="Search" />
					</div>
				</form>
			</li>
			<li>
				<h2>Veroeros etiam</h2>
				<p><strong>Morbi sit amet</strong> mauris Nam vitae nibh eu sapien dictum pharetra. Vestibulum elementum neque vel lacus. Proin auctor dolor loremmassa. Phasellus sit. <a href="#">More&hellip;</a></p>
			</li>
			<li>
				<h2>Blandit Volutpat</h2>
				<ul>
					<li><a href="#">Morbi sit amet sed magna</a></li>
					<li><a href="#">Lacus dapibus interdum</a></li>
					<li><a href="#">Donec pede nisl dolore sed</a></li>
					<li><a href="#">Lacus dapibus et interdum</a></li>
					<li><a href="#">Morbi sit amet magna  etiam</a></li>
					<li><a href="#">Maecenas sed sem lorem</a></li>
					<li><a href="#">Lacus dapibus interdum</a></li>
					<li><a href="#">Donec pede nisl dolore</a></li>
				</ul>
			</li>
		</ul>
	</div>
	<!-- end #sidebar -->
</div>
<!-- end #page -->
<div id="footer">
	<p>(c) 2007 Website Name. Designed by <a href="http://www.freecsstemplates.org/">Free CSS Templates</a>.</p>
</div>
</body>
</html:html>

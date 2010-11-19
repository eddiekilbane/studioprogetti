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

<html:errors />

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
			<h2 class="title"><a href="#">REGISTRATI</a></h2>
			<div class="entry">
			<html:form action="registra.do">
				<table width="383" border="0">
                  <tr>
                    <td width="211"><span class="label">Username</span></td>
                    <td width="156"><html:text maxlength="16" size="25" property="username" /></td>
                  </tr>
                  <tr>
                    <td>Password</td>
                    <td><html:text maxlength="16" size="25" property="password" /></td>
                  </tr>
                  <tr>
                    <td>Verifica Password:</td>
                    <td><input type="text" maxlength="16" size="25" name="verificaPassword" /></td>
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
                    <td><html:radio  property="sesso" value="maschile" />
                    M
                       <html:radio  property="sesso" value="femminile" />
                    F</td>
                  </tr>
                  <tr>
                    <td>Data di nascita:</td>
                    <td>
					<SELECT name="giorno">
						<OPTION value="1">01</OPTION>
						<OPTION value=2>02</OPTION>
						<OPTION value=3>03</OPTION>
						<OPTION value=4>04</OPTION>
						<OPTION value=5>05</OPTION>
						<OPTION value=6>06</OPTION>
						<OPTION value=7>07</OPTION>
						<OPTION value=8 selected>08</OPTION>
						<OPTION value=9>09</OPTION>
						<OPTION value=10>10</OPTION>
						<OPTION value=11>11</OPTION>
						<OPTION value=12>12</OPTION>
						<OPTION value=13>13</OPTION>
						<OPTION value=14>14</OPTION>
						<OPTION value=15>15</OPTION>
						<OPTION value=16>16</OPTION>
						<OPTION value=17>17</OPTION>
						<OPTION value=18>18</OPTION>
						<OPTION value=19>19</OPTION>
						<OPTION value=20>20</OPTION>
						<OPTION value=21>21</OPTION>
						<OPTION value=22>22</OPTION>
						<OPTION value=23>23</OPTION>
						<OPTION value=24>24</OPTION>
						<OPTION value=25>25</OPTION>
						<OPTION value=26>26</OPTION>
						<OPTION value=27>27</OPTION>
						<OPTION value=28>28</OPTION>
						<OPTION value=29>29</OPTION>
						<OPTION value=30>30</OPTION>
						<OPTION value=31>31</OPTION>
					</SELECT>
					
					
					<SELECT name="mese">
						<OPTION value="1">01</OPTION>
						<OPTION value=2>02</OPTION>
						<OPTION value=3>03</OPTION>
						<OPTION value=4>04</OPTION>
						<OPTION value=5>05</OPTION>
						<OPTION value=6>06</OPTION>
						<OPTION value=7>07</OPTION>
						<OPTION value=8 selected>08</OPTION>
						<OPTION value=9>09</OPTION>
						<OPTION value=10>10</OPTION>
						<OPTION value=11>11</OPTION>
						<OPTION value=12>12</OPTION>
					</SELECT>
					<SELECT name="anno">
						<OPTION value="1971" selected>1971</OPTION>
						<OPTION value="1972">1972</OPTION>
						<OPTION value=1973 >1973</OPTION>
						<OPTION value=1974 >1974</OPTION>
						<OPTION value=1975 >1975</OPTION>
						<OPTION value=1976 >1976</OPTION>
						<OPTION value=1977 >1977</OPTION>
						<OPTION value=1978 >1978</OPTION>
						<OPTION value=1979 >1979</OPTION>
						<OPTION value=1980 >1980</OPTION>
						<OPTION value=1981 >1981</OPTION>
						<OPTION value=1982 >1982</OPTION>
					</SELECT>
				
				
				
				</td>
                  </tr>
                  <tr>
                    <td>Email</td>
                    <td><html:text maxlength="16" size="25" property="email" /></td>
                  </tr>
                  <tr>
                    <td>Conferma Email </td>
                    <td><input type="text" maxlength="16" size="25" name="confermaEmail" /></td>
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
                    <td><select size="1" name="provincia">
                      <option 
                          value="AG">Agrigento</option>
                      <option value="AL">Alessandria</option>
                      <option 
                          value="AN">Ancona</option>
                      <option value="AO">Aosta</option>
                      <option 
                          value="AR">Arezzo</option>
                      <option value="AP">Ascoli Piceno</option>
                      <option 
                          value="AT">Asti</option>
                      <option value="AV">Avellino</option>
                      <option 
                          value="BA">Bari</option>
                      <option value="BL">Belluno</option>
                      <option 
                          value="BN">Benevento</option>
                      <option value="BG">Bergamo</option>
                      <option 
                          value="BI">Biella</option>
                      <option value="BO">Bologna</option>
                      <option 
                          value="BZ">Bolzano</option>
                      <option value="BS">Brescia</option>
                      <option 
                          value="BR">Brindisi</option>
                      <option value="CA">Cagliari</option>
                      <option 
                          value="CL">Caltanissetta</option>
                      <option 
                          value="CB">Campobasso</option>
                      <option value="CE">Caserta</option>
                      <option 
                          value="CT">Catania</option>
                      <option value="CZ">Catanzaro</option>
                      <option 
                          value="CH">Chieti</option>
                      <option value="CO">Como</option>
                      <option 
                          value="CS">Cosenza</option>
                      <option value="CR">Cremona</option>
                      <option 
                          value="KR">Crotone</option>
                      <option value="CN">Cuneo</option>
                      <option 
                          value="EN">Enna</option>
                      <option value="FE">Ferrara</option>
                      <option 
                          value="FI">Firenze</option>
                      <option value="FG">Foggia</option>
                      <option 
                          value="FC">Forlì-Cesena</option>
                      <option value="FR">Frosinone</option>
                      <option 
                          value="GE">Genova</option>
                      <option value="GO">Gorizia</option>
                      <option 
                          value="GR">Grosseto</option>
                      <option value="IM">Imperia</option>
                      <option 
                          value="IS">Isernia</option>
                      <option value="AQ">L'Aquila</option>
                      <option 
                          value="SP">La Spezia</option>
                      <option value="LT">Latina</option>
                      <option 
                          value="LE">Lecce</option>
                      <option value="LC">Lecco</option>
                      <option 
                          value="LI">Livorno</option>
                      <option value="LO">Lodi</option>
                      <option 
                          value="LU">Lucca</option>
                      <option value="MC">Macerata</option>
                      <option 
                          value="MN">Mantova</option>
                      <option value="MS">Massa-Carrara</option>
                      <option 
                          value="MT">Matera</option>
                      <option value="ME">Messina</option>
                      <option 
                          value="MI">Milano</option>
                      <option value="MO">Modena</option>
                      <option 
                          value="NA">Napoli</option>
                      <option value="NO">Novara</option>
                      <option 
                          value="NU">Nuoro</option>
                      <option value="OR">Oristano</option>
                      <option 
                          value="PD">Padova</option>
                      <option value="PA">Palermo</option>
                      <option 
                          value="PR">Parma</option>
                      <option value="PV">Pavia</option>
                      <option 
                          value="PG">Perugia</option>
                      <option value="PS">Pesaro e 
                        Urbino</option>
                      <option value="PE">Pescara</option>
                      <option 
                          value="PC">Piacenza</option>
                      <option value="PI">Pisa</option>
                      <option 
                          value="PT">Pistoia</option>
                      <option value="PN">Pordenone</option>
                      <option 
                          value="PZ">Potenza</option>
                      <option value="PO">Prato</option>
                      <option 
                          value="RG">Ragusa</option>
                      <option value="RA">Ravenna</option>
                      <option 
                          value="RC">Reggio Calabria</option>
                      <option value="RE">Reggio 
                        Emilia</option>
                      <option value="RI">Rieti</option>
                      <option 
                          value="RN">Rimini</option>
                      <option value="RM">Roma</option>
                      <option 
                          value="RO">Rovigo</option>
                      <option value="SA">Salerno</option>
                      <option 
                          value="SS">Sassari</option>
                      <option value="SV">Savona</option>
                      <option 
                          value="SI">Siena</option>
                      <option value="SR">Siracusa</option>
                      <option 
                          value="SO">Sondrio</option>
                      <option value="TA">Taranto</option>
                      <option 
                          value="TE">Teramo</option>
                      <option value="TR">Terni</option>
                      <option value="TO" 
                          selected="selected">Torino</option>
                      <option value="TP">Trapani</option>
                      <option 
                          value="TN">Trento</option>
                      <option value="TV">Treviso</option>
                      <option 
                          value="TS">Trieste</option>
                      <option value="UD">Udine</option>
                      <option 
                          value="VA">Varese</option>
                      <option value="VE">Venezia</option>
                      <option 
                          value="VB">Verbania</option>
                      <option value="VC">Vercelli</option>
                      <option 
                          value="VR">Verona</option>
                      <option value="VV">Vibo Valentia</option>
                      <option 
                          value="VI">Vicenza</option>
                      <option 
                        value="VT">Viterbo</option>
                    </select></td>
                  </tr>
                  <tr>
                    <td>Nazione</td>
                    <td><html:text maxlength="16" size="25" property="nazione" /></td>
                  </tr>
                  <tr>
                    <td><html:submit>Invia</html:submit></td>
                    <td><html:reset>Annulla</html:reset></td>
                  </tr>
                </table>
                </html:form>
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
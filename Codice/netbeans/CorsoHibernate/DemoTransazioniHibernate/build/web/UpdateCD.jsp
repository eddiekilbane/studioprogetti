<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
<title>Music Shop</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

<link rel="stylesheet" href=<%=application.getContextPath()+"/stile/style.css" %> type="text/css" charset="utf-8" />
</head>
<body>
    <h1>
       
    </h1>
<%
demo.transazioni.beans.versioned.CD trovato = (demo.transazioni.beans.versioned.CD)session.getAttribute("trovato");

if (trovato==null){
 trovato.setNull();
}
%>

<div id="wrapper">
  <h1><em>MUSIC</em> SHOP</h1>
  <div id="nav">
    <ul>
      <li><a href="http://www.free-css.com/"><span>01</span> ABOUT SHOP</a></li>
      <li><a href="http://www.free-css.com/"><span>02</span> GALLERY</a></li>
      <li><a href="http://www.free-css.com/"><span>03</span> FREE MUSIC</a></li>
      <li><a href="http://www.free-css.com/"><span>04</span> ARTIST</a></li>
      <li><a href="http://www.free-css.com/"><span>05</span> CONTACTS</a></li>
    </ul>
  </div>
  <div id="topcon">
    <div id="topcon-inner">
      <h2>Welcome to Music Shop</h2>
      <p>Don't forget to check <a href="http://www.free-css.com/">free website templates</a> every day, because we add a new free website template almost daily.</p>
      <p>You can remove any link to our websites from this template you're free to use the template without linking back to us.</p>
    </div>
  </div>
  <div id="content">
    <div id="body">
      <div class="box" id="news">
        <div class="box-t">
          <div class="box-r">
            <div class="box-b">
              <div class="box-l">
                <div class="box-tr">
                  <div class="box-br">
                    <div class="box-bl">
                      <div class="box-tl">
                        <h2>NEWS &amp; EVENTS</h2>
                        <h3>05.03.2007</h3>
                        <p>Even more websites all about website templates on <a href="http://www.justwebtemplates.com">Just Web Templates</a>.</p>
                        <p class="more"><a href="http://www.free-css.com/">more...</a></p>
                        <div class="hr-yellow"> </div>
                        <h3>05.03.2007</h3>
                        <p>If you're looking for beautiful and professionally made templates you can find them at <a href="http://www.templatebeauty.com">Template Beauty</a>.</p>
                        <p>If you're having problems editing the template please don't hesitate to ask for help on <a href="http://www.free-css.com/">the forum</a>.</p>
                        <p class="more"><a href="http://www.free-css.com/">more...</a></p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="box" id="hits">
        <div class="box-t">
          <div class="box-r">
            <div class="box-b">
              <div class="box-l">
                <div class="box-tr">
                  <div class="box-br">
                    <div class="box-bl">
                      <div class="box-tl">
                        <h2>CERCA CD</h2>
                        <h3>movie hits</h3>
                        <form action="ServletUpdate">
                        <%
                        out.println("<input type=\"hidden\" name=\"idProdotto\" value=\""+trovato.getPrimaryKey()+"\" >");

                        out.println("<table border=1 style=\" width : 314px;\"");
                        out.println("<tr>");
						out.println("<td>TITOLO</td> <td><input type=\"text\" name=\"txtTitle\" value=\""+trovato.getTitle()+"\" ></td>");
						out.println("</tr>");

						out.println("<tr>");
						out.println("<td>ARTISTA</td><td><input type=\"text\" name=\"txtArtist\" value=\""+trovato.getArtist()+"\" ></td>");
						out.println("</tr>");

						out.println("<tr>");
						out.println("<td>PREZZO</td><td><input type=\"text\" name=\"txtPrice\" value=\""+trovato.getPrice()+"\" ></td>");
						out.println("</tr>");

						out.println("<tr>");
						out.println("<td>NAZIONE</td><td><input type=\"text\" name=\"txtCountry\" value=\""+trovato.getCountry()+"\" ></td>");
						out.println("</tr>");

						out.println("<tr>");
						out.println("<td>ETICHETTA</td><td><input type=\"text\" name=\"txtCompany\" value=\""+trovato.getCompany()+"\" ></td>");
						out.println("</tr>");

						out.println("<tr>");
						out.println("<td>ANNO</td><td><input type=\"text\" name=\"txtYear\" value=\""+trovato.getYear()+"\" ></td>");
						out.println("</tr>");

						out.println("<tr>");
						out.println("<td>QUANTITA</td><td><input type=\"text\" name=\"txtQuantity\" value=\""+trovato.getQuantity()+"\" /></td>");
						out.println("</tr>");

						out.println("<tr>");
						out.println("<td><input type=\"submit\" value=\"Conferma modifica\"  /></td><td><input type=\"reset\"  /></td>");
						out.println("</tr>");

						out.println("</table>");

                        %>
						</form>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="clear"> </div>
    </div>
    <div id="footer">
      <ul>
        <li><a href="http://www.free-css.com/">PICTURE</a> | </li>
        <li><a href="http://www.free-css.com/">GALLERY</a> | </li>
        <li><a href="http://www.free-css.com/">FREE MUSIC</a> | </li>
        <li><a href="http://www.free-css.com/">FEATURES</a> | </li>
        <li><a href="http://www.free-css.com/">CONTACTS</a> | </li>
      </ul>
      <p>&copy; Business Co <a href="http://www.free-css.com/">Privacy Policy</a> | designed by <a href="http://www.freewebsitetemplates.com">free website templates</a>.</p>
    </div>
  </div>
</div>
</body>
</html>

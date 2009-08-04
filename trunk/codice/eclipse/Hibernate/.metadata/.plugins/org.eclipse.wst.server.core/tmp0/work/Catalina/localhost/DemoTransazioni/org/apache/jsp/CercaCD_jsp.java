package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CercaCD_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Music Shop</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" charset=\"utf-8\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("  <h1><em>MUSIC</em> SHOP</h1>\r\n");
      out.write("  <div id=\"nav\">\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"http://www.free-css.com/\"><span>01</span> ABOUT SHOP</a></li>\r\n");
      out.write("      <li><a href=\"http://www.free-css.com/\"><span>02</span> GALLERY</a></li>\r\n");
      out.write("      <li><a href=\"http://www.free-css.com/\"><span>03</span> FREE MUSIC</a></li>\r\n");
      out.write("      <li><a href=\"http://www.free-css.com/\"><span>04</span> ARTIST</a></li>\r\n");
      out.write("      <li><a href=\"http://www.free-css.com/\"><span>05</span> CONTACTS</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"topcon\">\r\n");
      out.write("    <div id=\"topcon-inner\">\r\n");
      out.write("      <h2>Welcome to Music Shop</h2>\r\n");
      out.write("      <p>Don't forget to check <a href=\"http://www.free-css.com/\">free website templates</a> every day, because we add a new free website template almost daily.</p>\r\n");
      out.write("      <p>You can remove any link to our websites from this template you're free to use the template without linking back to us.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"content\">\r\n");
      out.write("    <div id=\"body\">\r\n");
      out.write("      <div class=\"box\" id=\"news\">\r\n");
      out.write("        <div class=\"box-t\">\r\n");
      out.write("          <div class=\"box-r\">\r\n");
      out.write("            <div class=\"box-b\">\r\n");
      out.write("              <div class=\"box-l\">\r\n");
      out.write("                <div class=\"box-tr\">\r\n");
      out.write("                  <div class=\"box-br\">\r\n");
      out.write("                    <div class=\"box-bl\">\r\n");
      out.write("                      <div class=\"box-tl\">\r\n");
      out.write("                        <h2>NEWS &amp; EVENTS</h2>\r\n");
      out.write("                        <h3>05.03.2007</h3>\r\n");
      out.write("                        <p>Even more websites all about website templates on <a href=\"http://www.justwebtemplates.com\">Just Web Templates</a>.</p>\r\n");
      out.write("                        <p class=\"more\"><a href=\"http://www.free-css.com/\">more...</a></p>\r\n");
      out.write("                        <div class=\"hr-yellow\"> </div>\r\n");
      out.write("                        <h3>05.03.2007</h3>\r\n");
      out.write("                        <p>If you're looking for beautiful and professionally made templates you can find them at <a href=\"http://www.templatebeauty.com\">Template Beauty</a>.</p>\r\n");
      out.write("                        <p>If you're having problems editing the template please don't hesitate to ask for help on <a href=\"http://www.free-css.com/\">the forum</a>.</p>\r\n");
      out.write("                        <p class=\"more\"><a href=\"http://www.free-css.com/\">more...</a></p>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"box\" id=\"hits\">\r\n");
      out.write("        <div class=\"box-t\">\r\n");
      out.write("          <div class=\"box-r\">\r\n");
      out.write("            <div class=\"box-b\">\r\n");
      out.write("              <div class=\"box-l\">\r\n");
      out.write("                <div class=\"box-tr\">\r\n");
      out.write("                  <div class=\"box-br\">\r\n");
      out.write("                    <div class=\"box-bl\">\r\n");
      out.write("                      <div class=\"box-tl\">\r\n");
      out.write("                        <h2>CERCA CD</h2>\r\n");
      out.write("                        <h3>Campi ricerca</h3>\r\n");
      out.write("                        <form action=\"ServletRicerca\">\r\n");
      out.write("\t\t\t\t\t\t<table border=\"1\" style=\" width : 314px;\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>TITOLO</td><td><input type=\"text\" name=\"txtTitle\"  /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>ARTISTA</td><td width=\"162\"><input type=\"text\" name=\"txtArtist\"  /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>PREZZO</td><td><input type=\"text\" name=\"txtPrice\"  /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>NAZIONE</td><td><input type=\"text\" name=\"txtCountry\"  /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>ETICHETTA</td><td><input type=\"text\" name=\"txtCompany\"  /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>ANNO</td><td><input type=\"text\" name=\"txtYear\"  /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>QUANTITA</td><td><input type=\"text\" name=\"txtQuantity\"  /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"submit\" value=\"Ricerca\"  /></td><td><input type=\"reset\"  /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clear\"> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"http://www.free-css.com/\">PICTURE</a> | </li>\r\n");
      out.write("        <li><a href=\"http://www.free-css.com/\">GALLERY</a> | </li>\r\n");
      out.write("        <li><a href=\"http://www.free-css.com/\">FREE MUSIC</a> | </li>\r\n");
      out.write("        <li><a href=\"http://www.free-css.com/\">FEATURES</a> | </li>\r\n");
      out.write("        <li><a href=\"http://www.free-css.com/\">CONTACTS</a> | </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <p>&copy; Business Co <a href=\"http://www.free-css.com/\">Privacy Policy</a> | designed by <a href=\"http://www.freewebsitetemplates.com\">free website templates</a>.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

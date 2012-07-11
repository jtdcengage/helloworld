package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\tbody {\n");
      out.write("\t\t\t\tbackground-color: #eef0f6;\n");
      out.write("\t\t\t\tmargin: 0px;\n");
      out.write("\t\t\t\tfont-size: .9em;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\ta, a:hover, a:visited { color:black; text-decoration:none; }\n");
      out.write("\t\t\ta, a:visited { border-bottom: 1px dotted black; }\n");
      out.write("\t\t\ta:hover { border-bottom: 1px solid black; }\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t#content { \n");
      out.write("\t\t\t\tbackground-color: white; \n");
      out.write("\t\t\t\tmargin: 0px 250px 0px 20px;\n");
      out.write("\t\t\t\tpadding: 20px;\n");
      out.write("\t\t\t\tborder-top: 1px solid #6A829E;\n");
      out.write("\t\t\t\tborder-left: 1px solid #6A829E;\n");
      out.write("\t\t\t\tborder-right: 1px solid #6A829E;\n");
      out.write("\t\t\t\tborder-bottom: 1px solid #6A829E;\n");
      out.write("\t\t\t\theight: 800px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\th2.title { margin: 0px; padding: 20px;}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#sidebar {\n");
      out.write("\t\t\t\tposition: absolute;\n");
      out.write("\t\t\t\tright: 10px; top: 60px;\n");
      out.write("\t\t\t\twidth: 200px;\n");
      out.write("\t\t\t\tpadding: 0 10px 10px 10px;\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#sidebar h3 { margin: 10px 0px 5px 0px; }\n");
      out.write("\t\t\t#sidebar p { margin: 10px 5px 10px 5px;}\n");
      out.write("\t\t\t#sidebar li { list-style: none; margin: 0px; padding: 5px 0px 5px 0px;}\n");
      out.write("\t\t\t#sidebar ul { margin: 5px; padding: 0px;}\t\t\t\n");
      out.write("\t\t\t#sidebar li { padding: 5px 0px 5px 0px;}\t\t\t\n");
      out.write("\t\t\t#sidebar table { width: 160px; margin: 5px;}\t\t\t\n");
      out.write("\t\t\t#sidebar td { border-bottom: 1px solid #6A829E; padding: 2px 5px 2px 5px;}\n");
      out.write("\t\t\t#sidebar .col2 { text-align: right; }\n");
      out.write("\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"sidebar\">\n");
      out.write("\t\t<h3>Getting started</h3>\n");
      out.write("\t\t<p>\n");
      out.write("\t\tFor tips, on how to build and deploy this application, please see the <a href=\"http://wiki.stax.net/w/index.php/GettingStarted/Simple\">tutorial</a>.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<h3>Stax links</h3>\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"http://www.stax.net/appconsole\">Stax Application Console</a></li>\n");
      out.write("\t\t\t<li><a href=\"http://wiki.stax.net/w/index.php/Main_Page\">Stax Developer Wiki</a></li>\n");
      out.write("\t\t</ul>\t\t\n");
      out.write("\t\t<h3>Runtime information</h3>\n");
      out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t\t<tr><td class=\"col1\">Environment:</td><td class=\"col2\">");
      out.print(pageContext.getServletContext().getInitParameter("application.environment") );
      out.write("</td></tr>\n");
      out.write("\t\t\t<tr><td class=\"col1\">Environment2:</td><td class=\"col2\">");
      out.print(pageContext.getServletContext().getInitParameter("application.environment2") );
      out.write("</td></tr>\n");
      out.write("\t\t\t<tr><td class=\"col1\">Server:</td><td class=\"col2\">");
      out.print( java.net.InetAddress.getLocalHost().getHostName() );
      out.write("</td></tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<h2 class=\"title\">This application is still under development</h2>\n");
      out.write("\t<div id=\"content\">\t\n");
      out.write("\t\t<h3>Your Servlet/JSP application is running</h3>\n");
      out.write("\t\t<p><a href=\"/hello\">Click here to see a Servlet</a></p>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

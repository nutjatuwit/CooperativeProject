package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write(" <head><title>Upload page</title></head></p> <p><body>\n");
      out.write(" <form action=\"testUpload.jsp\" method=\"post\" enctype=\"multipart/form-data\" name=\"form1\" id=\"form1\">\n");
      out.write("   <center>\n");
      out.write("   <table border=\"2\">\n");
      out.write("       <tr>\n");
      out.write("\t       <td align=\"center\"><b>Multipale file Uploade</td>\n");
      out.write("\t   </tr>\n");
      out.write("       <tr>\n");
      out.write("\t       <td>\n");
      out.write("\t\t       Specify file: <input name=\"file\" type=\"file\" id=\"file\">\n");
      out.write("\t\t   <td>\n");
      out.write("\t   </tr>\n");
      out.write("\t   <tr>\n");
      out.write("\t      <td>\n");
      out.write("\t\t     Specify file:<input name=\"file\" type=\"file\" id=\"file\">\n");
      out.write("\t\t  </td>\n");
      out.write("        <tr>\n");
      out.write("\t\t   <td>\n");
      out.write("\t\t      Specify file:<input name=\"file\" type=\"file\" id=\"file\">\n");
      out.write("\t\t   </td>\n");
      out.write("\t\t </tr>\n");
      out.write("\t\t <tr>\n");
      out.write("\t\t    <td align=\"center\">\n");
      out.write("               <input type=\"submit\" name=\"Submit\" value=\"Submit files\"/>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t </tr>\n");
      out.write("    </table>\n");
      out.write("\t<center>\n");
      out.write(" </form>\n");
      out.write(" </body>\n");
      out.write(" </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

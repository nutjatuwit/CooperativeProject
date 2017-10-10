package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testPageLoad_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n");
      out.write(" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"canonical\" href=\"http://www.ninenik.com/demo/pre_loading_status.php\"/>\n");
      out.write("\n");
      out.write("<title>preloading page</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("html,body{\n");
      out.write("\theight:100%;\n");
      out.write("\tmargin:0;\n");
      out.write("\tpadding:0;\n");
      out.write("}\n");
      out.write("#loadPage{\n");
      out.write("\tposition:fixed;\n");
      out.write("\tmargin:auto;\n");
      out.write("\tleft:0;\n");
      out.write("\ttop:0;\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("\tcolor:#FFF;\n");
      out.write("\tbackground-color:#000;\t\n");
      out.write("\tz-index:500;\n");
      out.write("\ttext-align:center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"loadPage\">\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("Loding..........\n");
      out.write("</div>\n");
      out.write("<p align=\"center\">\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<a href=\"pre_loading_status.php?1507623102\">Load Again</a></p>\n");
      out.write("\n");
      out.write("<table  id=\"myTable\" width=\"500\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#CCCCCC\">\n");
      out.write("<col />\n");
      out.write("<col />\n");
      out.write("<col />\n");
      out.write("<col />\n");
      out.write("<col />\n");
      out.write("<thead>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">หัวข้อ</td>\n");
      out.write("    <td align=\"center\">หัวข้อ</td>\n");
      out.write("    <td align=\"center\">หัวข้อ</td>\n");
      out.write("    <td align=\"center\">หัวข้อ</td>\n");
      out.write("    <td align=\"center\">หัวข้อ</td>\n");
      out.write("  </tr>\n");
      out.write("</thead>\n");
      out.write(" <tbody>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">1</td>\n");
      out.write("    <td align=\"center\">2</td>\n");
      out.write("    <td align=\"center\">3</td>\n");
      out.write("    <td align=\"center\">4</td>\n");
      out.write("    <td align=\"center\">5</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">6</td>\n");
      out.write("    <td align=\"center\">7</td>\n");
      out.write("    <td align=\"center\">8</td>\n");
      out.write("    <td align=\"center\">9</td>\n");
      out.write("    <td align=\"center\">10</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">11</td>\n");
      out.write("    <td align=\"center\">12</td>\n");
      out.write("    <td align=\"center\">13</td>\n");
      out.write("    <td align=\"center\">14</td>\n");
      out.write("    <td align=\"center\">15</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">16</td>\n");
      out.write("    <td align=\"center\">17</td>\n");
      out.write("    <td align=\"center\">18</td>\n");
      out.write("    <td align=\"center\">19</td>\n");
      out.write("    <td align=\"center\">20</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">21</td>\n");
      out.write("    <td align=\"center\">22</td>\n");
      out.write("    <td align=\"center\">23</td>\n");
      out.write("    <td align=\"center\">24</td>\n");
      out.write("    <td align=\"center\">25</td>\n");
      out.write("  </tr>\n");
      out.write("</tbody>     \n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("\tvar imgLength=$(\"img\").length; // หาจำนวนรูปทั้งหมด\n");
      out.write("\tvar countImg=0; // สำหรับนับจำนวนรูปภาพที่โหลดแล้ว\n");
      out.write("\t$(\"img\").each(function(){\n");
      out.write("\t\t//var IndexID=$(\"img\").index(this); // สำหรับทดสอบ ลบออกได้\n");
      out.write("\t\t$(this).load(function(){\n");
      out.write("\t\t\t//countImg++;\n");
      out.write("\t\t\t//$(\"#loadPage\").append(\"<br>loaded img \"+IndexID); // สำหรับทดสอบ ลบออกได้\n");
      out.write("\t\t//\tconsole.log(\"loaded img \"+IndexID); // สำหรับทดสอบ ลบออกได้\n");
      out.write("\t\t\t//if(countImg==imgLength){ // เมื่อโหลดรูปทั้งหมดแล้วปิดตัว loading\n");
      out.write("\t\t\t//\t$(\"#loadPage\").hide();\n");
      out.write("\t\t\t//}\n");
      out.write("                        alert(\"testtesttesttest\");\n");
      out.write("\t\t});\n");
      out.write("\t\t// เมื่อเกิดข้อผิดพลาดในการโหลดให้ปิด loading เลย\n");
      out.write("\t\t$(this).error(function(){ \n");
      out.write("\t\t\t$(\"#loadPage\").hide();\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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

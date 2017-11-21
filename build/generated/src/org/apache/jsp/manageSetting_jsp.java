package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import path.managePath;

public final class manageSetting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/default.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ตั้งค่า</title>\n");
      out.write("        <style>\n");
      out.write("html{\n");
      out.write("          background-color: #A9D0F5;      \n");
      out.write("            }\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    width: 50%;\n");
      out.write("    background-color: #0040FF;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("div {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: #ffffff;\n");
      out.write("    padding: 0px 150px;\n");
      out.write("    \n");
      out.write("   \n");
      out.write("}\n");
      out.write("#addButton {\n");
      out.write("   background-color: #ffffff; \n");
      out.write("   border-radius:6px;\n");
      out.write("   font-weight: bold;\n");
      out.write("   font-family: TH SarabunPSK;\n");
      out.write("   font-size: 24px;\n");
      out.write("   padding: 0px 11px;\n");
      out.write("   color: black;\n");
      out.write("   height: 40px;\n");
      out.write("   \n");
      out.write("   border:2px solid #74B3DF;\n");
      out.write("   cursor: pointer;\n");
      out.write("}\n");
      out.write("#addButton:hover{\n");
      out.write("    color: white;\n");
      out.write("    background-color: #005ce6;\n");
      out.write("    transition-duration: 0.3s;\n");
      out.write("     \n");
      out.write("}\n");
      out.write("#pagewrap{\n");
      out.write("    background: rgba(256,256,256, 0.6);\n");
      out.write("    border-radius: 6px; \n");
      out.write("    padding: 0px 0px;\n");
      out.write("    margin: 15px 170px;\n");
      out.write("    align-content: center;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("#groupDetail{\n");
      out.write("    background: transparent;\n");
      out.write("    align-content: center;\n");
      out.write("    margin-left: 50px;\n");
      out.write("    margin-top: 20px;\n");
      out.write("} \n");
      out.write("#textInput{\n");
      out.write("    width: 350px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id='pagewrap'>\n");
      out.write("        \n");
      out.write("       ");

                request.setCharacterEncoding("UTF-8");   
                managePath path = new managePath(getServletContext().getRealPath("/")+"setting/setting.txt"); 
       
      out.write("\n");
      out.write("        <form name=\"setPathDB\" action=\"setPathDB\" align=\"left\">\n");
      out.write("            <div id=\"groupDetail\">\n");
      out.write("           เครื่องแม่ข่าย :  <input type=\"text\" id=\"textInput\" name=\"pathDB\" value='");
      out.print(path.getPathDB().split("//").toString());
      out.write("' style='margin-left: 60px;'><br>\n");
      out.write("           ชื่อฐานข้อมูล :  <input type=\"text\" id=\"textInput\" name=\"pathDB\" value='");
      out.print(path.getPathDB());
      out.write("' style='margin-left: 60px;'><br>\n");
      out.write("            พอร์ต :  <input type=\"text\" id=\"textInput\" name=\"pathDB\" value='");
      out.print(path.getPathDB());
      out.write("' style='margin-left: 60px;'><br>\n");
      out.write("           ชื่อผู้ใช้ :  <input type=\"text\" id=\"textInput\" name=\"userDB\" value='");
      out.print(path.getUserDB());
      out.write("' style='margin-left: 19px;'><br>\n");
      out.write("           รหัสผ่าน :  <input type=\"text\" id=\"textInput\" name=\"passDB\" value='");
      out.print(path.getPassDB());
      out.write("' style='margin-left: 8px;'><br>\n");
      out.write("           ชื่อแฟ้มเก็บรายงาน :  <input type=\"text\" id=\"textInput\" name=\"folderReport\" value='");
      out.print(path.getPathReport());
      out.write("' style='margin-left: 5px;'><br>\n");
      out.write("          \n");
      out.write("           <button type=\"submit\" id=\"addButton\" align=\"right\" action=\"\" style='padding: 0px 0px;margin-left: 22%;margin-top: 25px;'>ยืนยัน</button>         \n");
      out.write("        </form>  \n");
      out.write("            </div> \n");
      out.write("          \n");
      out.write("            </div> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/default.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/w3.css\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("    span.psw {\n");
      out.write("       display: block;\n");
      out.write("       float: none;\n");
      out.write("    }\n");
      out.write("    .cancelbtn {\n");
      out.write("       width: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("body{\n");
      out.write("    \n");
      out.write("    background-color: #e6ffff;\n");
      out.write("}\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 6px 10px;\n");
      out.write("    margin: 4px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("    width:90%;\n");
      out.write("    height: 180px;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    margin: 0px 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("    float: right;\n");
      out.write("    padding-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".warning {\n");
      out.write("color: #9F6000;\n");
      out.write("background-color: #FEEFB3;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    padding: 8px;\n");
      out.write("    margin: 4px 0;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-family: TH SarabunPSK;\n");
      out.write("    font-size: 25px;\n");
      out.write("    display: table;\n");
      out.write("    \n");
      out.write("    float:left;\n");
      out.write("    width:20%;\n");
      out.write("    min-width:400px;\n");
      out.write("    margin-top:25px;\n");
      out.write("    margin-left:calc(50% - 200px);\n");
      out.write("    margin-left:-webkit-calc(50% - 200px);\n");
      out.write("    margin-left:-moz-calc(50% - 200px);\n");
      out.write("    background: rgba(256,256,256, 0.6);\n");
      out.write("    border-radius: 6px; \n");
      out.write("  }\n");
      out.write("#fieldData{\n");
      out.write("   display: table-cell;\n");
      out.write("   text-align: center;\n");
      out.write("   vertical-align: middle;\n");
      out.write("    height: 500px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("    background-image: url(\"images/background.jpg\");\n");
      out.write("    background-size: auto;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/Logo.png\">\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("        ");
  
                       request.setCharacterEncoding("UTF-8");  
                       String textUser = "";
                        if(session.getAttribute("userid")!=null){  
                        String userID=(String)session.getAttribute("userid");  
                        String nameUser=(String)session.getAttribute("username");
                        //out.print("Hello, "+userID+" Welcome to Profile");  
                           if(nameUser.equals("null")){
                              textUser = "กำลังเข้าใช้งานโดยไอดี : "+userID;
                           }else{
                              textUser = "กำลังเข้าใช้งานโดยชื่อผู้ใช้ : "+nameUser;
                           }
                           
                            
                        
                         
                        
                
                           out.print("<div class='tab'>");
                           out.print("<form>");
                           out.print("<button type='submit' class='tablinks' name='backButton' style='float: left; font-size: 20px;font-family: TH SarabunPSK;font-weight: bold;' onclick='backtomenu()'>");
                           out.print("<img src='images/Logo Open.jpg' id='img' height='48' width='159'>");
                           out.print("</button>");
                           out.print("</form>");
                           out.print("<form action='authenLogout'>");
                           out.print("<button type='submit' class='tablinks' name='backButton'><img src='images/logout.png' id='img' height='32' width='32'> Logout</button>");
                           out.print("</form>");
                           
                           out.print("<form>");
                           out.print("<button style='font-size: 16px;font-size: 20px;font-family: TH SarabunPSK;font-weight: bold;'>"+textUser+"</button>");
                           out.print("</form>");
                           out.print("</div>");
                        }
        
      out.write("\n");
      out.write("       \n");
      out.write("       <div class=\"container\" id=\"container\">   \n");
      out.write("          <form id=\"fieldData\" action=\"authenLogin\" method=\"post\" align=\"center\" >\n");
      out.write("              <img src='images/Hospital-OS-LOGO1.png' id='img' width=\"304\" height=\"140\" ><br><br>\n");
      out.write("            <input type=\"text\" id=\"textLogin\" placeholder=\"ผู้ใช้\" name=\"uname\" required><br>\n");
      out.write("            <input type=\"password\" id=\"textLogin\" placeholder=\"รหัสผ่าน\" name=\"psw\"><br>   \n");
      out.write("            <button id=\"loginButton\" type=\"submit\" >เข้าสู่ระบบ</button>\n");
      out.write("          </form>\n");
      out.write("\n");
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

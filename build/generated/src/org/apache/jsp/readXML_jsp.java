package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.util.List;
import org.w3c.dom.traversal.NodeIterator;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public final class readXML_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


  public boolean isTextNode(Node n)
  {
    return n.getNodeName().equals("#text");
  }

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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Parsing using the DOM</title>\n");
      out.write("        <style>\n");
      out.write("\thtml { margin:0; padding:0; font-size:62.5%; }\n");
      out.write("\tbody { max-width:800px; min-width:300px; margin:0 auto; padding:20px 10px; font-size:14px; font-size:1.4em; }\n");
      out.write("\th1 { font-size:1.8em; }\n");
      out.write("\t.demo { overflow:auto; border:1px solid silver; min-height:100px; }\n");
      out.write("        \n");
      out.write("        div.tab {\n");
      out.write("    overflow: hidden;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the buttons inside the tab */\n");
      out.write("div.tab button {\n");
      out.write("    background-color: inherit;\n");
      out.write("    float: left;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    transition: 0.6s;\n");
      out.write("    font-size: 22px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change background color of buttons on hover */\n");
      out.write("div.tab button:hover {\n");
      out.write("    background-color: #cceeff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create an active/current tablink class */\n");
      out.write("div.tab button.active {\n");
      out.write("    background-color: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the tab content */\n");
      out.write(".tabcontent {\n");
      out.write("    display: none;\n");
      out.write("    padding: 6px 10px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-top: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"dist/themes/default/style.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css\" />\n");
      out.write("        \n");
      out.write("         <div class=\"tab\">\n");
      out.write("      <button class=\"tablinks\" onclick=\"goBack();\">กลับ</button>\n");
      out.write("      \n");
      out.write("    </div>   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("       ");

          
         request.setCharacterEncoding("UTF-8");
            Class.forName("org.postgresql.Driver").newInstance();
               Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres"); //database connection
               Statement statement = conn.createStatement();
               Statement statement1 = conn.createStatement();
            
              
              String sqlCateCount = "select id_cate,name_cate from a_report_category order by id_cate ASC";
              ResultSet rsCateCount = statement.executeQuery(sqlCateCount);
               

         
         
         
      out.write("\n");
      out.write("       <div id=\"jstree\"> \n");
      out.write("           <!-- in this example the tree is populated from inline HTML -->\n");
      out.write("           ");

             try{ 
            
        out.print("<ul>"); 
         while(rsCateCount.next()){
            out.print("<li>"); 
            out.print(rsCateCount.getString(2)); 
                   out.print("<ul>");
                        String sqlDetailCount = "select id_report,name_report from a_report_detail where id_cate = '"+rsCateCount.getString(1)+"' order by id_report ASC";
                         ResultSet rsDetailCount = statement1.executeQuery(sqlDetailCount);
                              while(rsDetailCount.next()){
                             out.print("<li>");
                             out.print(rsDetailCount.getString(2));
                             out.print("</li>");//staff
                            }
                   out.print("</ul>");//staff
           out.print("</li>");//company
            }
        
        out.print("</ul>");//company
          
             }catch(Exception ex){
                ex.printStackTrace();
             } 
                    
      out.write("\n");
      out.write("               \n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("      \n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js\"></script>\n");
      out.write("        <script> //var img = \"JonSnow.jpg\"; \n");
      out.write("       \n");
      out.write("    \t$(function () {\n");
      out.write("    // 6 create an instance when the DOM is ready\n");
      out.write("    $('#jstree').jstree();\n");
      out.write("    // 7 bind to events triggered on the tree\n");
      out.write("    \n");
      out.write("    $('#jstree').on(\"changed.jstree\", function (e, data) {\n");
      out.write("            //view image by path split\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           var text = (data.instance.get_node(data.selected[0]).text);\n");
      out.write("           //var atSplit = img[1].toString()+\".jpg\";\n");
      out.write("           //alert(data.instance.get_node(data.selected[0]).text); //alert(myVar);use java parameter in javascript\n");
      out.write("           \n");
      out.write("           var linkHref = \"filterReport.jsp?text=\"+text;\n");
      out.write("           window.open(linkHref,'filty');\n");
      out.write(" \n");
      out.write("    });\n");
      out.write("   \n");
      out.write("  });\n");
      out.write("  \n");
      out.write("  function goBack() {\n");
      out.write("    //window.history.back();\n");
      out.write("    window.open(\"manageReport.html\");\n");
      out.write("    }\n");
      out.write("\t</script>\n");
      out.write("        \n");
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

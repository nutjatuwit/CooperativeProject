package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
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
import java.util.List;
import org.w3c.dom.traversal.NodeIterator;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.ArrayList;

public final class reportCateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <style>\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Open+Sans);\n");
      out.write("\n");
      out.write("            body { \n");
      out.write("                font-family: 'Open Sans', sans-serif;\n");
      out.write("                color: #666;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* STRUCTURE */\n");
      out.write("\n");
      out.write("            #pagewrap {\n");
      out.write("                padding: 5px;\n");
      out.write("                width: 1300px;\n");
      out.write("                margin: 20px auto;\n");
      out.write("            }\n");
      out.write("            header {\n");
      out.write("                height: 100px;\n");
      out.write("                padding: 0 15px;\n");
      out.write("            }\n");
      out.write("            #content {\n");
      out.write("                width: 380px;\n");
      out.write("                float: left;\n");
      out.write("                padding: 5px 15px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #middle {\n");
      out.write("                width: 520px; /* Account for margins + border values */\n");
      out.write("                float: left;\n");
      out.write("                padding: 5px 15px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #sidebar {\n");
      out.write("                width: 290px;\n");
      out.write("                padding: 5px 15px;\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            footer {\n");
      out.write("                clear: both;\n");
      out.write("                padding: 0 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /************************************************************************************\n");
      out.write("            MEDIA QUERIES\n");
      out.write("            *************************************************************************************/\n");
      out.write("            /* for 980px or less */\n");
      out.write("            @media screen and (max-width: 980px) {\n");
      out.write("\n");
      out.write("                #pagewrap {\n");
      out.write("                    width: 94%;\n");
      out.write("                }\n");
      out.write("                #content {\n");
      out.write("                    width: 41%;\n");
      out.write("                    padding: 1% 4%;\n");
      out.write("                }\n");
      out.write("                #middle {\n");
      out.write("                    width: 41%;\n");
      out.write("                    padding: 1% 4%;\n");
      out.write("                    margin: 0px 0px 5px 5px;\n");
      out.write("                    float: right;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #sidebar {\n");
      out.write("                    clear: both;\n");
      out.write("                    padding: 1% 4%;\n");
      out.write("                    width: auto;\n");
      out.write("                    float: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                header, footer {\n");
      out.write("                    padding: 1% 4%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* for 700px or less */\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("\n");
      out.write("                #content {\n");
      out.write("                    width: auto;\n");
      out.write("                    float: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #middle {\n");
      out.write("                    width: auto;\n");
      out.write("                    float: none;\n");
      out.write("                    margin-left: 0px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #sidebar {\n");
      out.write("                    width: auto;\n");
      out.write("                    float: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* for 480px or less */\n");
      out.write("            @media screen and (max-width: 480px) {\n");
      out.write("\n");
      out.write("                header {\n");
      out.write("                    height: auto;\n");
      out.write("                }\n");
      out.write("                h1 {\n");
      out.write("                    font-size: 2em;\n");
      out.write("                }\n");
      out.write("                #sidebar {\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            #content {\n");
      out.write("                background: #f8f8f8;\n");
      out.write("            }\n");
      out.write("            #sidebar {\n");
      out.write("                background: #f0efef;\n");
      out.write("            }\n");
      out.write("            header, #content, #middle, #sidebar {\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #pagewrap, header, #content, #middle, #sidebar, footer {\n");
      out.write("                border: solid 1px #ccc;\n");
      out.write("            }  \n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/themes/default/style.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css\" />\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            request.setCharacterEncoding("UTF-8");
            Class.forName("org.postgresql.Driver").newInstance();
               Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres"); //database connection
               Statement statement = conn.createStatement();
              //String sqlCompile = "select * from member";
              //ResultSet rsCompile = statement1.executeQuery(sqlCompile);
              
              String sql = "select id_cate,name_cate from a_report_category order by id_cate ASC";
              int count=0;
              ResultSet rs = null;
            /*String report = request.getParameter("report");
            File inputFile = new File("C:/Users/NUT/Desktop/ex.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         NodeList nList = doc.getElementsByTagName("reportgroup");
             /*try{ 
               //String comparStaff="0";
               //String comparDivision="0";
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
            out.print("<table border='1'>"); 
            
            out.print(eElement.getElementsByTagName("name").item(0).getTextContent());  
              
                   
                   
                          for(int i=1;i<eElement.getElementsByTagName("name").getLength();i++){
                        out.print("<tr>");      
                          out.print("<td>");
                          out.print(eElement.getElementsByTagName("name").item(i).getTextContent());
                          out.print("</td>");
                          out.print("<td>");
                          out.print(eElement.getElementsByTagName("path").item(i-1).getTextContent());
                          out.print("</td>");
                          out.print("<td>");
                          out.print(eElement.getElementsByTagName("jrxml").item(i-1).getTextContent());
                          out.print("</td>");//staff
                        out.print("</tr>");//staff  
                          }
                        
                   
           out.print("</table>");//company
           out.print("<br><br><br>");//staff
            }
        }
        
          
             }catch(Exception ex){
                ex.printStackTrace();
             } */
        
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <div id=\"pagewrap\">\n");
      out.write("\n");
      out.write("\t<header align='center'>\n");
      out.write("\t\t");
 out.print("<h1>ประเภทรายงาน</h1>"); 
      out.write("\n");
      out.write("\t</header>\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("\t\t");

                    rs = statement.executeQuery(sql);
                    
                    out.print("<div class='w3-container'>");
                    out.print("<table class='w3-table-all w3-hoverable'>");
                    
                    while(rs.next()){
                      out.print("<tr class='w3-hover-blue'>");
                          out.print("<td onclick='goLink(this)'>");
                             out.print(rs.getString(2)); 
                          out.print("</td>");
                          
                          out.print("<form action='index.jsp'>");
                           out.print("<td>");
                             out.print("<input type='hidden' name='id_cate' value='"+rs.getString(1)+"'>");
                             out.print("<input type='submit' value='แก้ไข'>");
                          out.print("</td>");
                          out.print("</form>");
                          
                          out.print("<form action='index.jsp'>");
                           out.print("<td>");
                             out.print("<input type='hidden' name='id_cate' value='"+rs.getString(1)+"'>");
                             out.print("<input type='submit' value='ลบ'>"); 
                          out.print("</td>");
                          out.print("</form>");
                          
                      out.print("</tr>");
                       count = count+1;
                    }
                    out.print("</table>");
                    out.print("</div>");
                 out.print("<form action='insertCate'>");
                 out.print("<input type='text' name='nameCate'>");
                 out.print("<input type='submit' value='เพิ่ม'>");
                 out.print("</form>");
                
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("function goEdit(e) {\n");
      out.write("    //window.history.back();\n");
      out.write("    var currentRow = $(e).\n");
      out.write("    alert(currentRow.toString());\n");
      out.write("    //var pkCate = ");
      out.print(count);
      out.write(";\n");
      out.write("     //alert(y);\n");
      out.write("    //var x = document.getElementsByTagName(\"td\")[0].innerText;\n");
      out.write("    //alert(x);\n");
      out.write("    //var linkHref = \"reportCateForm.jsp\";\n");
      out.write("    // window.open(linkHref,\"left\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write(" function goLink(element) {\n");
      out.write("    //window.history.back();\n");
      out.write("    var y = element.innerHTML;\n");
      out.write("    //alert(y);\n");
      out.write("    //var pkCate = ");
      out.print(count);
      out.write(";\n");
      out.write("     //alert(pkCate);\n");
      out.write("    //var x = document.getElementsByTagName(\"td\")[0].innerText;\n");
      out.write("    //alert(x);\n");
      out.write("    var linkHref = \"reportDetailForm.jsp?category=\"+y;\n");
      out.write("    window.open(linkHref,\"mid\");\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("    \n");
      out.write("\n");
      out.write("  function goBack() {\n");
      out.write("    //window.history.back();\n");
      out.write("    window.open(\"manageReport.html\");\n");
      out.write("    }\n");
      out.write("\t</script>\n");
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

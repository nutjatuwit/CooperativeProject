package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import path.managePath;
import java.awt.Desktop;
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
      out.write("        <link rel=\"stylesheet\" href=\"style/default.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"style/w3.css\">\n");
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
      out.write("            \n");
      out.write("             div.tab {\n");
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
      out.write("input[type=text] {\n");
      out.write("    width: 80%;\n");
      out.write("    padding: 6.25px 16px;\n");
      out.write("    margin: 20px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tooltip {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write(".tooltip .tooltiptext {\n");
      out.write("    visibility: hidden;\n");
      out.write("    \n");
      out.write("    background-color: black;\n");
      out.write("    color: #fff;\n");
      out.write("    text-align: center;\n");
      out.write("    border-radius: 6px;\n");
      out.write("    padding: 5px 0;\n");
      out.write("    width: 120px;\n");
      out.write("    bottom: 100%;\n");
      out.write("    left: 50%; \n");
      out.write("    margin-left: -60px;\n");
      out.write("    /* Position the tooltip */\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tooltip:hover .tooltiptext {\n");
      out.write("    visibility: visible;\n");
      out.write("}\n");
      out.write(".warning {\n");
      out.write("color: #9F6000;\n");
      out.write("background-color: #FEEFB3;\n");
      out.write("\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/themes/default/style.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css\" />\n");
      out.write("       \n");
      out.write("    <div class=\"tab\">\n");
      out.write("      <button class=\"tablinks\" onclick=\"goBack();\">กลับ</button>\n");
      out.write("    </div>   \n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            
            request.setCharacterEncoding("UTF-8");
            if(request.getParameterMap().containsKey("messages")){
                
                 String messages = request.getParameter("messages");
                        if(messages.equals("")){
                        }else{
                         //out.print("<script>alert('"+messages+"');</script>");
                         out.print("<div class='warning'>"+messages+"</div>");
                        }     
                }
           
           
            managePath path = new managePath(getServletContext().getRealPath("/")+"setting/setting.txt");
            request.setCharacterEncoding("UTF-8");
            Class.forName("org.postgresql.Driver").newInstance();
               Connection conn = DriverManager.getConnection(path.getPathDB(), path.getUserDB(), path.getPassDB()); //database connection
               Statement statement = conn.createStatement();
              //String sqlCompile = "select * from member";
              //ResultSet rsCompile = statement1.executeQuery(sqlCompile);
              
              String sql = "select id_cate,name_cate,name_folder from a_report_category order by id_cate DESC";
              
              ResultSet rs = null;
              
             
        
      out.write("    \n");
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
                      out.print("<tr class='w3-hover-light-blue'>");
                          out.print("<td style='cursor: pointer;' onclick='goLink(this)'>");
                             out.print(rs.getString(2)); 
                          out.print("</td>");
                          
                          out.print("<form action='reportEditForm.jsp'>");
                           out.print("<td style='text-align: right; width: 10%;'>");
                             out.print("<input type='hidden' name='id_cate' value='"+rs.getString(1)+"'>");
                             out.print("<input type='hidden' name='category' value='"+rs.getString(2)+"'>");
                             out.print("<input type='hidden' name='name_folder' value='"+rs.getString(3)+"'>");
                             out.print("<input type='hidden' name='reportType' value='category'>");
                             out.print("<div class='tooltip'><button type='submit' class='button button2' src=''><img src='images/edit.png' id='img' height='25' width='25'></button><span class='tooltiptext'>แก้ไข</span></div>");
                          out.print("</td>");
                          out.print("</form>");
                          
                          out.print("<form>");
                           out.print("<td style='text-align: right; width: 10%;'>");
                             //out.print("<input type='hidden' name='id_cate' value='"+rs.getString(1)+"'>");
                             out.print("<div class='tooltip'><button type='submit'  class='button button2'  src=''  onClick='onDelete("+rs.getString(1)+")'><img src='images/remove.png' id='img' height='25' width='25'></button><span class='tooltiptext'>ลบ</span></div>"); 
                          out.print("</td>");
                          out.print("</form>");
                          
                          String isFolder = getServletContext().getRealPath("/")+path.getPathReport()+"/"+rs.getString(3);
                          File fileList = new File(isFolder);
                          if(fileList.isDirectory()){
                              out.print("<form action='openFolder'>");
                           out.print("<td style='text-align: right; width: 10%;'>");
                             out.print("<input type='hidden' name='name_folder' value='"+rs.getString(3)+"'>");
                             out.print("<div class='tooltip'><button type='submit' class='button button2' src=''><img src='images/openfolder.png' id='img' height='25' width='25'></button><span class='tooltiptext'>เปิดโฟลเดอร์: "+rs.getString(3)+"</span></div>");  
                          out.print("</td>");
                          out.print("</form>");
                          }else{
                          out.print("<form action='openFolder'>");
                           out.print("<td style='text-align: right; width: 10%;'>");
                             out.print("<input type='hidden' name='name_folder' value='"+rs.getString(3)+"'>");
                             out.print("<button type='submit' class='button button2' disabled><img src='images/openfolder.png' id='img' height='25' width='25'></button>"); 
                             
                          out.print("</td>");
                          out.print("</form>");
                          }
                          
                          
                          
                      out.print("</tr>");
                       
                    }
                    out.print("</table>");
                    out.print("</div>");
                 out.print("<form action='insertCate'>");
                 out.print("<input type='text' class='w3-input w3-border w3-round  w3-light-blue' name='nameCate'>");
                 out.print("<input type='submit' class='w3-button w3-blue w3-medium w3-round' style='width:20% '  value='เพิ่ม'>");
                 out.print("</form>");
                 
                    
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("             \n");
      out.write(" $(document).ready(function() { \n");
      out.write("    \n");
      out.write("  $(document).delegate(\"tr\",\"click\",function(e){\n");
      out.write("  $(\"tr\").css('background-color', 'white');\n");
      out.write("  $(\"tr:nth-child(even)\").css('background-color', '#f2f2f2');\n");
      out.write("  $(this).css('background-color', '#74B3DF');\n");
      out.write("});\n");
      out.write("});\n");
      out.write("\n");
      out.write("function goLink(element) {\n");
      out.write("    //window.history.back();\n");
      out.write("\n");
      out.write("    var cate = element.innerHTML;\n");
      out.write("     //alert(y);\n");
      out.write("    //var x = document.getElementsByTagName(\"td\")[0].innerText;\n");
      out.write("    //alert(x);\n");
      out.write("    var linkHref = \"reportDetailForm.jsp?category=\"+cate;\n");
      out.write("    //alert(linkHref);\n");
      out.write("     window.open(linkHref,'mid');\n");
      out.write("    }\n");
      out.write("\n");
      out.write(" function onDelete(id_cate) {\n");
      out.write("    //window.history.back();\n");
      out.write("    //var y = element.innerHTML;\n");
      out.write("    var confirmDel = confirm('ต้องการลบ'+id_cate);\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    if(confirmDel){\n");
      out.write("    alert(\"จะลบละนะ\"+id_cate);\n");
      out.write("    var linkHref = \"deleteCate?id_cate=\"+id_cate;\n");
      out.write("    //window.location.href = \"deleteCate?id_cate=\"+id_cate;\n");
      out.write("    window.open(linkHref,'left');\n");
      out.write("    }else{\n");
      out.write("        alert(\"ไม่ลบละ\"+id_cate);\n");
      out.write("    var linkHref = \"reportCateForm.jsp\";\n");
      out.write("    window.open(linkHref,'left');  \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("     //alert(pkCate);\n");
      out.write("    //var x = document.getElementsByTagName(\"td\")[0].innerText;\n");
      out.write("    //alert(x);\n");
      out.write("    //var linkHref = \"deleteCate?id_cate=\"+id_cate;\n");
      out.write("    //window.open(linkHref);\n");
      out.write("   \n");
      out.write("    }\n");
      out.write("   function errorShow(mes) {\n");
      out.write("    //window.history.back();\n");
      out.write("    alert(mes);\n");
      out.write("    } \n");
      out.write("  \n");
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

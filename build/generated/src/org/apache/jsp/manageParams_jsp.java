package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class manageParams_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("table {\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 8px;\n");
      out.write("    width:100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even){background-color: #f2f2f2}\n");
      out.write("\n");
      out.write("th {\n");
      out.write("    background-color: #01A9DB;\n");
      out.write("    color: #F2F2F2;\n");
      out.write("}\n");
      out.write("/*search button */\n");
      out.write(".search {\n");
      out.write("    width: 120px;\n");
      out.write("    height: 25px;\n");
      out.write("    -webkit-transition: width 0.6s ease-in-out;\n");
      out.write("    transition: width 0.6s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* When the input field gets focus, change its width to 100% */\n");
      out.write(".search:focus {\n");
      out.write("    width: 20%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("    background-color: #01A9DB; /* Green */\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 8px 16px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 12px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    -webkit-transition-duration: 0.4s; /* Safari */\n");
      out.write("    transition-duration: 0.4s;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 16px;\n");
      out.write("}\n");
      out.write(".searchText {\n");
      out.write("    background-color: #01A9DB; \n");
      out.write("    color: white; \n");
      out.write("    border: 2px solid #008CBA;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".searchText:hover {\n");
      out.write("    background-color: white;\n");
      out.write("    color: black;\n");
      out.write("    border-radius: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1 {\n");
      out.write("    background-color: #01A9DB; \n");
      out.write("    color: white; \n");
      out.write("    border: 2px solid #81DAF5;\n");
      out.write("    font-size: 14px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".button1:hover{\n");
      out.write("     background-color: #81DAF5;\n");
      out.write("     color: black;\n");
      out.write("     padding: 8px 28px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button2 {\n");
      out.write("    background-color: #01A9DB; \n");
      out.write("    color: white; \n");
      out.write("    border: 2px solid #81DAF5;\n");
      out.write("    font-size: 14px;\n");
      out.write("}\n");
      out.write(".button2:hover{\n");
      out.write("     background-color: #81DAF5;\n");
      out.write("     color: black;\n");
      out.write("     padding: 8px 28px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".addButton {\n");
      out.write("    background-color: #01A9DB; \n");
      out.write("    color: white; \n");
      out.write("    border: 2px solid #81DAF5;\n");
      out.write("    font-size: 13px;\n");
      out.write("    padding: 10px 18px;\n");
      out.write("}\n");
      out.write(".addButton:hover{\n");
      out.write("     background-color: #81DAF5;\n");
      out.write("     color: black;\n");
      out.write("     \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("#mySidenav a {\n");
      out.write("    position: absolute;\n");
      out.write("    left: -80px;\n");
      out.write("    transition: 0.3s;\n");
      out.write("    padding: 15px;\n");
      out.write("    width: 90px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: white;\n");
      out.write("    border-radius: 0 5px 5px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#mySidenav a:hover {\n");
      out.write("    left: 0;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#back {\n");
      out.write("    top: 10px;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myBtn {\n");
      out.write("  display: none;\n");
      out.write("  position: fixed;\n");
      out.write("  bottom: 20px;\n");
      out.write("  right: 12px;\n");
      out.write("  z-index: 99;\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  background-color: red;\n");
      out.write("  color: white;\n");
      out.write("  cursor: pointer;\n");
      out.write("  padding: 10px;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  transition-duration: 0.4s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myBtn:hover {\n");
      out.write("  background-color: orangered;\n");
      out.write("  padding: 30px 8px;\n");
      out.write("}\n");
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
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("        <a id=\"back\" onclick=\"goBack()\">กลับ</a>\n");
      out.write("  \n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("        ");

            
           try{
               
               String sql = "select a_add_param.id,a_add_param.name,a_add_param.description,a_add_param.query,a_filter_type.namefil from a_add_param inner join a_filter_type on a_add_param.idfil = a_filter_type.idfil order by a_add_param.id ASC";
               //String sqlFilter = "select filtertype.nameFil from addparam ";
               Connection con =null; 
               
               Class.forName("org.postgresql.Driver").newInstance();
               con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres");
               
               Statement statement = con.createStatement();
               
               ResultSet rs = statement.executeQuery(sql);
               
                  out.println("<h1 align='center'>Manage Parameters</h1>");
               //ResultSet rsFilter = statement.executeQuery(sqlFilter);
 
                      
               out.print("<form action='addParams.jsp' align='right'>"); //add parameter
                   out.print("<input type='submit' class='button addButton'  name='' value='เพิ่มตัวแปร'>");
               out.print("</form>");
                   
                     
                    
               out.print("<form action='filterParams.jsp' align='right'>"); //filter parameter
                   out.print("<input type='text' class='search' name='query' value=''>");
                   out.print("<input type='submit' class='button searchText' name='' value='ค้นหา'>");
               out.print("</form>");
                     
                   
                   out.println("<table border='2' align='center'>");
                        out.print("<thead>");
                         out.println("<tr border='3' align='center'>");
                          out.print("<th>ID</th>");
                          out.print("<th>DETIALS</th>");
                          out.print("<th>PARAMETER</th>");
                          out.print("<th>QUERY</th>");
                          out.print("<th>TYPE FILTER</th>");
                          out.print("<th>EDIT</th>");
                          out.print("<th>DELETE</th>");
                         out.println("</tr>");
                        out.print("</thead>"); 
                         
                     while(rs.next()){
                         out.println("<tr>");
                         out.println("<form action='editParams.jsp'>");
                         
                          out.print("<td>"+rs.getString(1)+"</td>");
                          out.print("<td>"+rs.getString(2)+"</td>");
                          out.print("<td>"+rs.getString(3)+"</td>");
                          out.print("<td>"+rs.getString(4)+"</td>");
                          out.print("<td>"+rs.getString(5)+"</td>");
                          
                          
                          out.print("<input type='hidden' name='id' value="+rs.getString(1)+">");
                          out.print("<input type='hidden' name='name' value="+rs.getString(2)+">");
                          out.print("<input type='hidden' name='description' value="+rs.getString(3)+">");
                          out.print("<input type='hidden' name='query' value='"+rs.getString(4)+"'>");
                          
                          out.print("<input type='hidden' name='filtertype' value="+rs.getString(5)+">");
                          out.print("<td><div class='tooltip'><button type='submit' class='button button2' src=''><img src='images/edit.png' id='img' height='25' width='25'></button><span class='tooltiptext'>แก้ไข</span></div></td>");
                         out.println("</form>"); 
                         
                         out.println("<form action='deleteData'>");
                         out.print("<input type='hidden' name='id' value="+rs.getString(1)+">");
                         out.print("<td align='center'><div class='tooltip'><button type='submit' class='button button2' src=''><img src='images/remove.png' id='img' height='25' width='25'></button><span class='tooltiptext'>ลบ</span></div></td>");
                         out.println("</form>"); 
                         out.println("</tr>");
                     }
                    
                     out.println("</table>");
           
           
              rs.close();
               //out.println("test");
               
               //out.println(statement.executeQuery(sql));
           }catch(Exception ex){
               ex.printStackTrace();
           }
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <button onclick=\"topFunction()\" id=\"myBtn\" title=\"Go to top\">ขึ้นบน</button>\n");
      out.write("        \n");
      out.write("            <script>\n");
      out.write("     function goBack() {\n");
      out.write("    //window.history.back();\n");
      out.write("    window.location.replace(\"manageReport.html\");\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    window.onscroll = function() {scrollFunction()};\n");
      out.write("\n");
      out.write("function scrollFunction() {\n");
      out.write("    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {\n");
      out.write("        document.getElementById(\"myBtn\").style.display = \"block\";\n");
      out.write("    } else {\n");
      out.write("        document.getElementById(\"myBtn\").style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks on the button, scroll to the top of the document\n");
      out.write("function topFunction() {\n");
      out.write("    document.body.scrollTop = 0;\n");
      out.write("    document.documentElement.scrollTop = 0;\n");
      out.write("}\n");
      out.write("    </script>\n");
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

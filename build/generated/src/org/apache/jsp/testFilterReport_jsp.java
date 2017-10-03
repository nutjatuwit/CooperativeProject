package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.design.JasperDesign;
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

public final class testFilterReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("  \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write(".button {\n");
      out.write("    background-color: #4CAF50; /* Green */\n");
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
      out.write("}\n");
      out.write("\n");
      out.write(".button2 {\n");
      out.write("    background-color: white; \n");
      out.write("    color: black; \n");
      out.write("    border: 2px solid #008CBA;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button2:hover {\n");
      out.write("    background-color: #008CBA;\n");
      out.write("    color: white;\n");
      out.write("    border-radius: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div {\n");
      out.write("    font-size: 12pt;\n");
      out.write("    font-family: times new roman;\n");
      out.write("    color: #23238e;\n");
      out.write("}\n");
      out.write("\n");
      out.write("select {\n");
      out.write("        border:2px solid lightblue;\n");
      out.write("\tborder-radius:8px;\n");
      out.write("\theight: 22px;\n");
      out.write("\twidth: 120px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=date] {\n");
      out.write("        border:2px solid lightblue;\n");
      out.write("\tborder-radius:8px;\n");
      out.write("\theight: 22px;\n");
      out.write("\twidth: 130px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text] {\n");
      out.write("        border:2px solid lightblue;\n");
      out.write("\tborder-radius:8px;\n");
      out.write("\theight: 22px;\n");
      out.write("\twidth: 130px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
  
            
          try{
            int cRow = 0;  
              
           //encode from getparameter
           request.setCharacterEncoding("UTF-8");
           String text = "1.รายงานผู้ป่วยที่ค้างชำระเงิน";
           
              //database filter type
              
              String sql = "select a_add_param.id,a_filter_type.namefil,a_add_param.name,a_add_param.description,a_add_param.query from a_add_param inner join a_filter_type on a_add_param.idfil = a_filter_type.idfil order by a_add_param.id ASC";
              Class.forName("org.postgresql.Driver").newInstance();
              Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres");
              Statement statement = conn.createStatement();
              ResultSet rs = statement.executeQuery(sql);
              
    
              Connection con = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres");
              Statement statement1 = con.createStatement();
             
              //for list category
               String sqlCateCount = "select id_cate,id_report,name_report,path_report,jrxml_report from a_report_detail order by id_report ASC";
              ResultSet rsCateCount = statement.executeQuery(sqlCateCount);
   
              //for compile
              String sqlCompile = "";
              ResultSet rsCompile = null;
                
              //ResultSet rsCompile = null;
              
             
               
           
           //out.println(">>>>>>"+text);
           //out.println(text+"<<<<<<");
           //Read XML 
           JasperDesign jasperDesign; //find filter
           
           String textPath=""; //getString(4);
           String textReport=""; //getString(5);
           
           String paramJas="";
           String paramDbDes="";
           String paramDbType="";
           String paramDbName="";
           
           String textGroupFilter="";
           
           
          // while(rsCateCount.next()){
            
           // out.print(rsCateCount.getString(2)); 
                   
                        //String sqlDetailCount = "select id_report,name_report from a_report_detail where id_cate = '"+rsCateCount.getString(1)+"' order by id_report ASC";
                        String sqlDetailCount = "select id_cate,id_report,name_report,path_report,jrxml_report from a_report_detail order by id_report ASC";
                         ResultSet rsDetailCount = statement1.executeQuery(sqlDetailCount);
                              while(rsDetailCount.next()){
                             if(text.equals(rsDetailCount.getString(3))){
                                  textPath = rsDetailCount.getString(4);
                                  textReport = rsDetailCount.getString(5);
                                  
                                  out.println(">>>>>"+text+"<br>");
                                  out.println(">>>>>"+textPath+"<br>");
                                  out.println(">>>>>"+textReport+"<br><br>");
            }
                            }
                  
            //}
         
          
          jasperDesign = JRXmlLoader.load(application.getRealPath(textPath+"/"+textReport));
          out.print("<form action='Show.jsp' target='righty'>");
          while(rs.next()){
          for(int i =20;i<jasperDesign.getParametersList().size();i++){
               paramJas =jasperDesign.getParametersList().get(i).getName();
              //out.println(paramJas+"from report   <br>");
                 paramDbDes = rs.getString(4).toString();
                 paramDbType = rs.getString(2).toString();
                 paramDbName = rs.getString(3).toString();
                 
                 //String sqlCompile = rs.getString(5).toString();
                 
                  
                 //Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo?useUnicode=yes&characterEncoding=UTF-8", "root", "");
                 //Statement statement1 = con.createStatement();
                 //ResultSet rsCompile = statement1.executeQuery(sqlCompile);
                 
                 //rsCompile = statement1.executeQuery(sqlCompile);
                  //out.println("ParamJas : "+paramJas+"    ParamDB : "+paramDbDes+"<br>");
                  if(paramJas.equals(paramDbDes)){
                     out.println("ParamDb : "+paramDbDes+"  ParamJas  : "+paramJas+"<br>");
                      
                     //out.print(paramJas+"<br>");
                     //out.print(paramDbType+"<br>");
                     
                     
                     if(paramDbType.equals("date")){
                     out.print(paramDbName+": <input class='date' type='date' name="+paramJas+" value='2555-01-02'>");
                     cRow++;
                     }
                     if(paramDbType.equals("textfield")){
                     out.print(paramDbName+": <input type='text' name="+paramJas+" value=''>"); 
                     cRow++;
                     }
                     if(paramDbType.equals("textarea")){
                         out.print(paramDbName+":  <textarea name="+paramJas+" value='' rows='10' cols='50'>Write something here</textarea>");
                         cRow++;
                     }
                     if(paramDbType.equals("list")){ //want database for test
                         //out.print(rsCompile);
                         sqlCompile=rs.getString(5);
                         rsCompile = statement1.executeQuery(sqlCompile);
                         //
                         //for(int a=0;a>5;a++){
                             //out.println("Row : "+rsCompile.getString(2));
                         //}
                         //out.print(rsCompile.getCursorName());
                        out.print(paramDbName+": ");
                             out.println("<select name="+paramJas+">");
                             while (rsCompile.next()) {
                                 out.print("<option value=" + rsCompile.getString(1) + ">");
                                 out.print(rsCompile.getString(2));
                                 out.print("</option>");
                             }
                             out.println("</select>");
                             cRow++;
                             
                     }
                     
                    if(cRow>2){
                        cRow = 0;
                       out.print("<br><br>");
                    }
                    // break;
                  } 
                  //out.print(paramJas+"<br>");
                  }
                    
            } 
            out.print("<input type='hidden' name='textPath' value="+textPath+">");
            out.print("<input type='hidden' name='textReport' value="+textReport+">");
            out.print("<br><input type='submit' class='button button2' value='แสดงรายการ'>");
           out.print("</form>");
          
          
         
         }catch(Exception ex){
           ex.printStackTrace();
            }
         
      out.write("\n");
      out.write("         \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("     \n");
      out.write("\n");
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

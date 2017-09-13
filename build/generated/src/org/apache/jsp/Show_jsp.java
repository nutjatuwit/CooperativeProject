package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.sf.jasperreports.engine.design.JRDesignStyle;
import net.sf.jasperreports.engine.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.util.HashMap;
import net.sf.jasperreports.engine.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Show_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" ");
  
                Connection conn = null;
            try {
                Class.forName("org.postgresql.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres"); //database connection
                
               
               //String start_date = request.getParameter("start_date");
               //String end_date = request.getParameter("end_date");
               //String[] fileView=fileGet.split("\\.");
               //String fileOut = fileView[0].toString();
              
               //out.println(path+""+fileGet);
               //out.println(path+""+fileView);
               //out.println(path+""+fileOut);
              
                 //Integer id=Integer.parseInt(request.getParameter("id"));
               //out.println(id); //id parameter
               //out.println(path); // path file
               //out.println(fileView); //.jrxml
            //File reportFile = new File(application.getRealPath(path+""+fileOut+".jasper"));//your report_name.jasper file
            File reportFile = new File(application.getRealPath("//Report/testpharm.jasper"));
           
            //out.print(reportFile.getPath().toString());
            //Map parameters = new HashMap();
           
            //parameters.put("start_date", start_date);
            //parameters.put("end_date", end_date);  
            byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), null, conn);
           
          
            response.setContentType("application/pdf");
            //response.setCharacterEncoding("UTF-8");
            response.setContentLength(bytes.length);
            ServletOutputStream outStream = response.getOutputStream();
            outStream.write(bytes, 0, bytes.length);
            outStream.flush();
            outStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        
      out.write("\n");
      out.write("        ");
/*
          Connection conn = null;
    try{
       Class.forName("org.postgresql.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres");
        String jrxmlFile = session.getServletContext().getRealPath("//Report/testPost.jrxml");
        InputStream input = new FileInputStream(new File(jrxmlFile));
        
        JasperReport jr = JasperCompileManager.compileReport(input);
        JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
        
        JasperExportManager.exportReportToPdfStream(jp,response.getOutputStream());
       
        
        conn.close();
    }catch(Exception e){
        e.printStackTrace();
    }*/
        
      out.write('\n');
      out.write('\n');
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import path.managePath;
import net.sf.jasperreports.engine.design.JRDesignStyle;
import net.sf.jasperreports.engine.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.util.HashMap;
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("  \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.6.3.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/jquery.cycle.all.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        $(window).load(function() {\n");
      out.write("                $(\"#spinner\").fadeOut(\"slow\");\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("       <script>\n");
      out.write("  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n");
      out.write("\n");
      out.write("  ga('create', 'UA-38151043-3', 'bradsknutson.com');\n");
      out.write("  ga('send', 'pageview');\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("       <div id=\"spinner\"></div> \n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write(" ");
  
                
            //try {
               managePath pathDB = new managePath(getServletContext().getRealPath("/")+"setting/setting.txt");
                out.print(getServletContext().getRealPath("/")+"setting/setting.txt");
  
               //for connect HosOS
               Class.forName("org.postgresql.Driver").newInstance();
               Connection conn = DriverManager.getConnection(pathDB.getPathDB(), pathDB.getUserDB(), pathDB.getPassDB()); //database connection

               ArrayList<String> allParams = new ArrayList<String>();
               ArrayList<String> allValues = new ArrayList<String>();
              
              
               String path = request.getParameter("textPath");
               String textReportJasper = request.getParameter("textReportJasper");
              
             
            File reportFile = new File(application.getRealPath(path+"/"+textReportJasper));//your report_name.jasper file
          
            //Split parameters and values
            String[] splits = request.getQueryString().toString().split("&");
            for(int i =0;i<splits.length;i++){
               String[] paramSplit  = splits[i].split("=");
               for(int j=0;j<paramSplit.length;j+=2){
                  //out.print(paramSplit[j]+"<br>");
                   allParams.add(paramSplit[j]);
               }
    
               for(int k=1;k<paramSplit.length;k+=2){
                  //out.print(paramSplit[k]+"<br>");
                    allValues.add(paramSplit[k]);
               }
            }
            
            //for(int i = 0;i<allParams.size();i++){
                //out.print("Parameters : "+allParams.get(i)+"Values : "+allValues.get(i));
           // }
            /*
            Map parameters = new HashMap();
            for(int i = 0;i<allParams.size();i++){
            parameters.put(allParams.get(i), allValues.get(i));   
            }
 
            byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), parameters, conn);
             
           
            //display pdf form 
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            ServletOutputStream outStream = response.getOutputStream();
            outStream.write(bytes, 0, bytes.length);
            outStream.flush();
            outStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }*/
        
      out.write("\n");
      out.write("     <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("        jQuery(document).ready(function () {\n");
      out.write("    alert('page is loaded');\n");
      out.write("\n");
      out.write("   \n");
      out.write("});\n");
      out.write(" jQuery(window).load(function () {\n");
      out.write("    alert('page is loaded');\n");
      out.write("\n");
      out.write("   \n");
      out.write("});\n");
      out.write("        </script>    \n");
      out.write("        \n");
      out.write("     </body>\n");
      out.write("     \n");
      out.write("\n");
      out.write("</html>   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        \n");
      out.write("         \n");
      out.write("\n");
      out.write("     ");
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

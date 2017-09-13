package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

public final class filterReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Show Image</title>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
  
          try{
           //encode from getparameter
           request.setCharacterEncoding("UTF-8");
           String text = request.getParameter("text").toString();
           
           //out.println(">>>>>>"+text);
           //out.println(text+"<<<<<<");
           //Read XML 
           
           //String textPath="";
           //String textReport="";
           
           String textFilterGroup="";
           
           //File inputFileReportForm = new File("C:/Users/NUT/Desktop/ex.xml");//path XML report form
           File inputFileFilterForm = new File("C:/Users/NUT/Desktop/filterForm.xml");//path XML filter form
           
           //process read form
           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
           
           //Document docReportForm = dBuilder.parse(inputFileReportForm); //report form
           Document docFilterForm = dBuilder.parse(inputFileFilterForm); //filter form
           
           //docReportForm.getDocumentElement().normalize();
           docFilterForm.getDocumentElement().normalize();
           
           //report form
           //NodeList nList = docReportForm.getElementsByTagName("reportgroup");
           //NodeList findWord = docReportForm.getElementsByTagName("report");
           
           //filter form
           NodeList nListFilter = docFilterForm.getElementsByTagName("reportgroup");
           NodeList findFilter = docFilterForm.getElementsByTagName("name");
           
         /*
          for(int a=0;a<findWord.getLength();a++){
          Node findNode = findWord.item(a);
          if (findNode.getNodeType() == Node.ELEMENT_NODE) {
            Element ee = (Element) findNode;
            String textCompare = ee.getElementsByTagName("name").item(0).getTextContent().toString();
            if(text.equals(textCompare)){
              textPath = ee.getElementsByTagName("path").item(0).getTextContent().toString();
              textReport = ee.getElementsByTagName("jrxml").item(0).getTextContent().toString();
               out.println(">>>>>"+text+"<br>");
               out.println(">>>>>"+textPath+"<br>");
               out.println(">>>>>"+textReport+"<br>");
            }
             //out.println(textCompare);  
            }
            //out.println(ee.getElementsByTagName("name").item(0).getTextContent());  
         }*/
          
          for(int b=0;b<nListFilter.getLength();b++){
          Node findFilterNode = nListFilter.item(b);
          out.println(b); 
          if (findFilterNode.getNodeType() == Node.ELEMENT_NODE) {
            Element e = (Element) findFilterNode;
            String textCompareFilter = e.getElementsByTagName("reports").item(0).getTextContent().toString();
            /*if(text.equals(textCompareFilter)){
              textFilterGroup = e.getElementsByTagName("name").item(0).getTextContent().toString();

               out.println(">>>>>"+text+"<br>");
               out.println(">>>>>"+textFilterGroup+"<br>");
            }*/
             out.println(textCompareFilter+"<br>");  
            }
            //out.println(ee.getElementsByTagName("name").item(0).getTextContent());  
         }
         
            //out.println(">>>>>"+text);
           
            
         
      out.write("\n");
      out.write("         <form action=\"Show.jsp\" target=\"righty\">\n");
      out.write("            <input type=\"text\" name=\"start_date\" value=\"\">\n");
      out.write("            <input type=\"text\" name=\"end_date\" value=\"\">\n");
      out.write("            <input type=\"text\" name=\"slast\" value=\"\">\n");
      out.write("            \n");
      out.write("            <input type=\"submit\"  value=\"show\" />\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("         ");

         }catch(Exception ex){
           ex.printStackTrace();
            }
         
      out.write("\n");
      out.write("         \n");
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

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

public final class viewImage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
           
           File inputFile = new File("C:/Users/NUT/Desktop/ex.xml");//path XML
           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
           Document doc = dBuilder.parse(inputFile);
           doc.getDocumentElement().normalize();
           NodeList nList = doc.getElementsByTagName("reportgroup");
         
           NodeList findWord = doc.getElementsByTagName("report");
         
          for(int a=0;a<findWord.getLength();a++){
          Node findNode = findWord.item(a);
          if (findNode.getNodeType() == Node.ELEMENT_NODE) {
            Element ee = (Element) findNode;
            String textCompare = ee.getElementsByTagName("name").item(0).getTextContent().toString();
            if(text.equals(textCompare)){
               String textPath = ee.getElementsByTagName("path").item(0).getTextContent().toString();
              String textReport = ee.getElementsByTagName("jrxml").item(0).getTextContent().toString();
               out.println(">>>>>"+text+"<br>");
               out.println(">>>>>"+textPath+"<br>");
               out.println(">>>>>"+textReport+"<br>");
            }
             //out.println(textCompare);  
            }
            //out.println(ee.getElementsByTagName("name").item(0).getTextContent());  
         }
         
            //out.println(">>>>>"+text);
            }catch(Exception ex){
                        
               }
         
      out.write("\n");
      out.write("         <form action=\"Show.jsp\" target=\"righty\">\n");
      out.write("            <input type=\"text\" name=\"sid\" value=\"\">\n");
      out.write("            <input type=\"text\" name=\"sname\" value=\"\">\n");
      out.write("            <input type=\"text\" name=\"slast\" value=\"\">\n");
      out.write("            <input type=\"hidden\" name=\"textPath\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <input type=\"submit\"  value=\"show\" />\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("         \n");
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

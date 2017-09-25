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
import java.util.List;
import org.w3c.dom.traversal.NodeIterator;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.ArrayList;

public final class reportForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Open+Sans);\n");
      out.write("\n");
      out.write("            body { \n");
      out.write("                font-family: 'Open Sans', sans-serif;\n");
      out.write("                color: #666;\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            request.setCharacterEncoding("UTF-8");
             String report = request.getParameter("report");
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
      out.write("\t\t<h1>Manage Report Form</h1>\n");
      out.write("\t</header>\n");
      out.write("\t<h2>ประเภทรายงาน</h2>\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t\n");
      out.write("\t\t");

                    
                  try{ 
               //String comparStaff="0";
               //String comparDivision="0";
        out.print("<ul>"); 
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
            out.print("<li>"); 
            out.print(eElement.getElementsByTagName("name").item(0).getTextContent());  
              
                   out.print("<ul>");
                         /*
                          for(int i=1;i<eElement.getElementsByTagName("name").getLength();i++){
                          out.print("<li>");
                          out.print(eElement.getElementsByTagName("name").item(i).getTextContent());
                          out.print("</li>");//staff
                          }
                        */
                   out.print("</ul>");//staff
           out.print("</li>");//company
            }
        }
        out.print("</ul>");//company
          
             }catch(Exception ex){
                ex.printStackTrace();
             } 
                
                
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<h2>รายงาน</h2>\n");
      out.write("\t<div id=\"middle\">\n");
      out.write("\t\t");

                    //out.print(report);
                     try{ 
               //String comparStaff="0";
               //String comparDivision="0";
        out.print("<ul>"); 
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
            //out.print("<li>"); 
            //out.print(eElement.getElementsByTagName("name").item(0).getTextContent());  
                 if(eElement.getElementsByTagName("name").item(0).getTextContent().toString().equals(report)){
                   //out.print("<ul>");
                   //out.print(report);
                         
                          for(int i=1;i<eElement.getElementsByTagName("name").getLength();i++){
                          out.print("<li>");
                          out.print(eElement.getElementsByTagName("name").item(i).getTextContent());
                          out.print("</li>");//staff
                          }
                        
                   //out.print("</ul>");//staff
                 }
           //out.print("</li>");//company
            }
        }
        out.print("</ul>");//company
          
             }catch(Exception ex){
                ex.printStackTrace();
             } 
                 
                
                
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"sidebar\">\n");
      out.write("\t\t<h2>รายละเอียดของรายงาน</h2><br>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<footer>\n");
      out.write("\t\t<h4>Footer</h4>\n");
      out.write("\t\t<p>Footer text</p>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("    \t$(function () {\n");
      out.write("    // 6 create an instance when the DOM is ready\n");
      out.write("    $('#content').jstree();\n");
      out.write("    $('#middle').jstree();\n");
      out.write("    // 7 bind to events triggered on the tree\n");
      out.write("    \n");
      out.write("    $('#content').on(\"changed.jstree\", function (e, data) {\n");
      out.write("            //view image by path split\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           var text = (data.instance.get_node(data.selected[0]).text); \n");
      out.write("           //alert(text);\n");
      out.write("           //var atSplit = img[1].toString()+\".jpg\";\n");
      out.write("           //alert(data.instance.get_node(data.selected[0]).text); //alert(myVar);use java parameter in javascript\n");
      out.write("           \n");
      out.write("           var linkHref = \"reportForm.jsp?report=\"+text;\n");
      out.write("           window.location.replace(linkHref);\n");
      out.write("           \n");
      out.write("           \n");
      out.write("        \n");
      out.write("       \n");
      out.write("         \n");
      out.write("            \n");
      out.write("    });\n");
      out.write("    // 8 interact with the tree - either way is OK\n");
      out.write("    /*$('button').on('click', function () {\n");
      out.write("      $('#jstree').jstree(true).select_node('child_node_1');\n");
      out.write("      $('#jstree').jstree('select_node', 'child_node_1');\n");
      out.write("      $.jstree.reference('#jstree').select_node('child_node_1');\n");
      out.write("    });*/\n");
      out.write("      \n");
      out.write("        \n");
      out.write("  });\n");
      out.write("  /*\n");
      out.write("  // interaction and events\n");
      out.write("\t$('#evts_button').on(\"click\", function () {\n");
      out.write("\t\tvar instance = $('#evts').jstree(true);\n");
      out.write("\t\tinstance.deselect_all();\n");
      out.write("\t\tinstance.select_node('1');\n");
      out.write("\t});\n");
      out.write("\t$('#evts')\n");
      out.write("\t\t.on(\"changed.jstree\", function (e, data) {\n");
      out.write("\t\t\tif(data.selected.length) {\n");
      out.write("\t\t\t\talert('The selected node is: ' + data.instance.get_node(data.selected[0]).text);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t})\n");
      out.write("\t\t.jstree({\n");
      out.write("\t\t\t'core' : {\n");
      out.write("\t\t\t\t'multiple' : false,\n");
      out.write("\t\t\t\t'data' : [\n");
      out.write("\t\t\t\t\t{ \"text\" : \"Root node\", \"children\" : [\n");
      out.write("\t\t\t\t\t\t\t{ \"text\" : \"Child node 1\", \"id\" : 1 },\n");
      out.write("\t\t\t\t\t\t\t{ \"text\" : \"Child node 2\" }\n");
      out.write("\t\t\t\t\t]}\n");
      out.write("\t\t\t\t]\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("  \n");
      out.write("  */\n");
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

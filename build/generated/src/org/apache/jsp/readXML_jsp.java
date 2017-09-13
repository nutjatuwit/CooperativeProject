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
      out.write("\t</style>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"dist/themes/default/style.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css\" />\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

           //ArrayList findWord = new ArrayList(); 
           
         File inputFile = new File("C:/Users/NUT/Desktop/ex.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         NodeList nList = doc.getElementsByTagName("reportgroup");
         
         
         
         /*
         NodeList findWord = doc.getElementsByTagName("report");
         
         for(int a=0;a<findWord.getLength();a++){
         Node findNode = findWord.item(a);
         if (findNode.getNodeType() == Node.ELEMENT_NODE) {
            Element ee = (Element) findNode;
            out.println(ee.getElementsByTagName("name").item(0).getTextContent());  
         }
         }*///check word from text
         
          
         
         
      out.write("\n");
      out.write("       <div id=\"jstree\"> \n");
      out.write("           <!-- in this example the tree is populated from inline HTML -->\n");
      out.write("           ");

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
                         
                          for(int i=1;i<eElement.getElementsByTagName("name").getLength();i++){
                          out.print("<li>");
                          out.print(eElement.getElementsByTagName("name").item(i).getTextContent());
                          out.print("</li>");//staff
                          }
                        
                   out.print("</ul>");//staff
           out.print("</li>");//company
            }
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
      out.write("        </script>\n");
      out.write("        ");

          //String myVar = "12345";//use java parameter in javascript
        
      out.write(" \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
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
      out.write("  \n");
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

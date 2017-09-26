package org.apache.jsp.WEB_002dINF.TEST;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public final class testXML_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>ThaiCreate.Com JSP Tutorial</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");


	try {
	
		String fileName = application.getRealPath("//myData.xml");
		File strXML = new File(fileName);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbf.newDocumentBuilder();
		Document doc = dBuilder.parse(strXML);
		doc.getDocumentElement().normalize();
	
		NodeList nList = doc.getElementsByTagName("item");
	
		ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map;
	
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
	
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element ele = (Element) nNode;
				map = new HashMap<String, String>();
				map.put("ImageID", ele.getElementsByTagName("ImageID")
						.item(0).getTextContent());
				map.put("ItemID", ele.getElementsByTagName("ItemID")
						.item(0).getTextContent());
				map.put("ImagePath", ele.getElementsByTagName("ImagePath")
						.item(0).getTextContent());
				map.put("Link", ele.getElementsByTagName("Link").item(0)
						.getTextContent());
				myArrList.add(map);
			}
		}
	
		// *** Print Result ***//
		for (int i = 0; i < myArrList.size(); i++) {
	
			String sImageID = myArrList.get(i).get("ImageID").toString();
			String sItemID = myArrList.get(i).get("ItemID").toString();
			String sImagePath = myArrList.get(i).get("ImagePath")
					.toString();
			String sLink = myArrList.get(i).get("Link").toString();
	
			out.println("<br>ImageID = " + sImageID);
			out.println("<br>ItemID = " + sItemID);
			out.println("<br>ImagePath = " + sImagePath);
			out.println("<br>Link = " + sLink);
			out.println("<br>=========================");
	
		}
	
	} catch (Exception e) {
		e.printStackTrace();
	}


      out.write("\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
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

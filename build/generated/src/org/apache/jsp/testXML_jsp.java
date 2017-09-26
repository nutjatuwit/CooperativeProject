package org.apache.jsp;

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
	        response.setCharacterEncoding("UTF-8");
                
                
                Class.forName("org.postgresql.Driver").newInstance();
                //Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres"); //database connection
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres");
                 ArrayList<String> sql = new ArrayList<String>();
                // = statement.executeQuery(sql);
                 Statement statement = conn.createStatement();
                 
		String fileName = "C:/Users/NUT/Desktop/ex.xml";//application.getRealPath("/myData.xml");
		File strXML = new File(fileName);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbf.newDocumentBuilder();
		Document doc = dBuilder.parse(strXML);
		doc.getDocumentElement().normalize();
	
		NodeList nList = doc.getElementsByTagName("reportgroup");
	
                //arrayList identify multiple value 
		ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map;
	
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
	
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element ele = (Element) nNode;
				map = new HashMap<String, String>();
                               
                                //map.put("reportname", ele.getElementsByTagName("name").item(0).getTextContent());
                                //out.println("<br>REPORT NAME = " + ele.getElementsByTagName("name").item(0).getTextContent());
                                
                                for(int i=1;i<ele.getElementsByTagName("name").getLength();i++){
                                 //map.put("name", ele.getElementsByTagName("name").item(i).getTextContent());
				 //map.put("path", ele.getElementsByTagName("path").item(i-1).getTextContent());
				 //map.put("jrxml", ele.getElementsByTagName("jrxml").item(i-1).getTextContent());
                                  //out.println("<br>Primary key = " +i+"   Foreign key = "+(temp+1)+"<br>");
                                  //out.println("<br>NAME = " + ele.getElementsByTagName("name").item(i).getTextContent());
                                 //out.println("<br>NAME = " + ele.getElementsByTagName("name").item(i+1).getTextContent());
			          //out.println("<br>PATH = " + ele.getElementsByTagName("path").item(i-1).getTextContent());
			          //out.println("<br>JRXML = " + ele.getElementsByTagName("jrxml").item(i-1).getTextContent()+"<br>");
                                  String sql1 = "insert into a_report_detail(id_report,id_cate,name_report,path_report,jrxml_report)  values('"+i+"','"+(temp+1)+"','"+ele.getElementsByTagName("name").item(i).getTextContent()+"','"+ele.getElementsByTagName("path").item(i-1).getTextContent()+"','"+ele.getElementsByTagName("jrxml").item(i-1).getTextContent()+"')";
                                  sql.add(sql1);
                                  //Statement statement = conn.createStatement();
                                  //ResultSet rsCompile = statement.executeQuery(sql);
                                  
                                  //statement.executeQuery(sql);
                                   
                                   }
                                out.print("<br><br>");
				//out.print(ele.getElementsByTagName("name").item(0).getTextContent().length()+"  ");
				//map.put("Link", ele.getElementsByTagName("Link").item(0).getTextContent());
				//myArrList.add(map);
			}
		}
                
                
                
                for(int i =0;i<sql.size();i++){
                    out.print(sql.get(i)+"<br>");
                    
                    //statement.execute(sql.get(i));
                }
                
                                  //
	
		// *** Print Result ***//
		//for (int i = 0; i < myArrList.size(); i++) {
	             // String reportName = myArrList.get(i).get("reportname").toString();
                       //for(int j=0;j<myArrList.get(i).get("name").length();j++){
			//String name = myArrList.get(j).get("name").toString();
			//String path = myArrList.get(j).get("path").toString();
			//String jrxml = myArrList.get(j).get("jrxml").toString();
                       
                       //}
			//String sLink = myArrList.get(i).get("Link").toString();
	              //out.println("<br>REPORT NAME = " + reportName);
			//out.println("<br>NAME = " + name);
			//out.println("<br>PATH = " + path);
			//out.println("<br>JRXML = " + jrxml);
			
			//out.println("<br>=========================");
	
		//}
	         //out.print("<br>"+myArrList.size());
                   
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

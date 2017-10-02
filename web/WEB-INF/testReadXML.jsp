<%-- 
    Document   : testReadXML
    Created on : Sep 25, 2017, 10:29:00 AM
    Author     : NUT
--%>
<%@page import="java.util.List"%>
<%@page import="org.w3c.dom.traversal.NodeIterator"%>
<%@page import="javax.swing.tree.DefaultMutableTreeNode"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="org.w3c.dom.Node, org.w3c.dom.Element, org.w3c.dom.Document, org.w3c.dom.NodeList, javax.xml.parsers.DocumentBuilder, javax.xml.parsers.DocumentBuilderFactory" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            File inputFile = new File("C:/Users/NUT/Desktop/ex.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         NodeList nList = doc.getElementsByTagName("reportgroup");
             try{ 
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
             } 
                    %>
               
    </body>
</html>

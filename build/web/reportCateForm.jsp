<%-- 
    Document   : reportForm
    Created on : Sep 25, 2017, 1:34:49 PM
    Author     : NUT
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="org.w3c.dom.traversal.NodeIterator"%>
<%@page import="javax.swing.tree.DefaultMutableTreeNode"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="org.w3c.dom.Node, org.w3c.dom.Element, org.w3c.dom.Document, org.w3c.dom.NodeList, javax.xml.parsers.DocumentBuilder, javax.xml.parsers.DocumentBuilderFactory" %>
<%@page import="java.util.List"%>
<%@page import="org.w3c.dom.traversal.NodeIterator"%>
<%@page import="javax.swing.tree.DefaultMutableTreeNode"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<%!
  public boolean isTextNode(Node n)
  {
    return n.getNodeName().equals("#text");
  }
%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <style>
            @import url(https://fonts.googleapis.com/css?family=Open+Sans);

            body { 
                font-family: 'Open Sans', sans-serif;
                color: #666;
                
            }

            /* STRUCTURE */

            #pagewrap {
                padding: 5px;
                width: 1300px;
                margin: 20px auto;
            }
            header {
                height: 100px;
                padding: 0 15px;
            }
            #content {
                width: 380px;
                float: left;
                padding: 5px 15px;
                
            }

            #middle {
                width: 520px; /* Account for margins + border values */
                float: left;
                padding: 5px 15px;
                
            }

            #sidebar {
                width: 290px;
                padding: 5px 15px;
                float: left;
            }
            footer {
                clear: both;
                padding: 0 15px;
            }

            /************************************************************************************
            MEDIA QUERIES
            *************************************************************************************/
            /* for 980px or less */
            @media screen and (max-width: 980px) {

                #pagewrap {
                    width: 94%;
                }
                #content {
                    width: 41%;
                    padding: 1% 4%;
                }
                #middle {
                    width: 41%;
                    padding: 1% 4%;
                    margin: 0px 0px 5px 5px;
                    float: right;
                }

                #sidebar {
                    clear: both;
                    padding: 1% 4%;
                    width: auto;
                    float: none;
                }

                header, footer {
                    padding: 1% 4%;
                }
            }

            /* for 700px or less */
            @media screen and (max-width: 600px) {

                #content {
                    width: auto;
                    float: none;
                }

                #middle {
                    width: auto;
                    float: none;
                    margin-left: 0px;
                }

                #sidebar {
                    width: auto;
                    float: none;
                }

            }

            /* for 480px or less */
            @media screen and (max-width: 480px) {

                header {
                    height: auto;
                }
                h1 {
                    font-size: 2em;
                }
                #sidebar {
                    display: none;
                }

            }


            #content {
                background: #f8f8f8;
            }
            #sidebar {
                background: #f0efef;
            }
            header, #content, #middle, #sidebar {
                margin-bottom: 5px;
            }

            #pagewrap, header, #content, #middle, #sidebar, footer {
                border: solid 1px #ccc;
            }  
        </style>
        <link rel="stylesheet" href="dist/themes/default/style.min.css" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css" />
       
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            Class.forName("org.postgresql.Driver").newInstance();
               Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres"); //database connection
               Statement statement = conn.createStatement();
              //String sqlCompile = "select * from member";
              //ResultSet rsCompile = statement1.executeQuery(sqlCompile);
              
              String sql = "select id_cate,name_cate from a_report_category order by id_cate ASC";
              int count=0;
              ResultSet rs = null;
            /*String report = request.getParameter("report");
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
        %>
       

        <div id="pagewrap">

	<header align='center'>
		<% out.print("<h1>ประเภทรายงาน</h1>"); %>
	</header>
	
        
		<%
                    rs = statement.executeQuery(sql);
                    
                    out.print("<div class='w3-container'>");
                    out.print("<table class='w3-table-all w3-hoverable'>");
                    
                    while(rs.next()){
                      out.print("<tr class='w3-hover-blue'>");
                          out.print("<td onclick='goLink(this)'>");
                             out.print(rs.getString(2)); 
                          out.print("</td>");
                          
                          out.print("<form action='index.jsp'>");
                           out.print("<td>");
                             out.print("<input type='hidden' name='id_cate' value='"+rs.getString(1)+"'>");
                             out.print("<input type='submit' src='' value='แก้ไข'>");
                          out.print("</td>");
                          out.print("</form>");
                          
                          out.print("<form action='deleteCate'>");
                           out.print("<td>");
                             out.print("<input type='hidden' name='id_cate' value='"+rs.getString(1)+"'>");
                             out.print("<input type='submit' src='' value='ลบ'>"); 
                          out.print("</td>");
                          out.print("</form>");
                          
                      out.print("</tr>");
                       
                    }
                    out.print("</table>");
                    out.print("</div>");
                 out.print("<form action='insertCate'>");
                 out.print("<input type='text' name='nameCate'>");
                 out.print("<input type='submit' value='เพิ่ม'>");
                 out.print("</form>");
                %>
	</div>
	
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>
         <script>
function goEdit(e) {
    //window.history.back();
    var currentRow = $(e).
    alert(currentRow.toString());
    //var pkCate = <%=count%>;
     //alert(y);
    //var x = document.getElementsByTagName("td")[0].innerText;
    //alert(x);
    //var linkHref = "reportCateForm.jsp";
    // window.open(linkHref,"left");
    }


 function goLink(element) {
    //window.history.back();
    var y = element.innerHTML;
    //alert(y);
    //var pkCate = <%=count%>;
     //alert(pkCate);
    //var x = document.getElementsByTagName("td")[0].innerText;
    //alert(x);
    var linkHref = "reportDetailForm.jsp?category="+y;
    window.open(linkHref,"mid");
    }
  
    

  function goBack() {
    //window.history.back();
    window.open("manageReport.html");
    }
	</script>
    </body>
</html>

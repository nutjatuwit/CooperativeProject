<%-- 
    Document   : reportDetailForm
    Created on : Sep 27, 2017, 3:51:13 PM
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
           response.setCharacterEncoding("UTF-8");
           String category=request.getParameter("category");
           
          
           String cateNum=request.getParameter("pkCate");
           int count=0;
           String pkCate="";
           
           Class.forName("org.postgresql.Driver").newInstance();
               Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres"); //database connection
               Statement statement = conn.createStatement();
               Statement statement1 = conn.createStatement();
              //String sqlCompile = "select * from member";
              //ResultSet rsCompile = statement1.executeQuery(sqlCompile);
              
              String sql = "select id_report,name_report,path_report,jrxml_report from a_report_category inner join a_report_detail on (a_report_category.id_cate = a_report_detail.id_cate) where (name_cate = '"+category+"' or a_report_detail.id_cate='"+cateNum+"') order by id_report ASC";
              String sqlCate = "select distinct(a_report_category.id_cate) from a_report_category inner join a_report_detail on (a_report_category.id_cate = a_report_detail.id_cate) where (name_cate = '"+category+"' or a_report_detail.id_cate='"+cateNum+"') limit 1";
              ResultSet rs = null;
              ResultSet rsCate = null;
              
           
        %>
        <div id="pagewrap">

	<header align='center'>
		<% out.print("<h3>"+category+"</h3>"); %>
	</header>
	
        
		<%
                    rsCate = statement1.executeQuery(sqlCate);
                    rs = statement.executeQuery(sql);
                    out.print("<form action='insertDetail'>");
                    out.print("<div class='w3-container'>");
                    out.print("<table class='w3-table-all w3-hoverable'>");
                    
                    while(rsCate.next()){
                        pkCate=rsCate.getString(1);
                    }
                    
                    while(rs.next()){
                      out.print("<tr class='w3-hover-blue'>");
                          out.print("<td onclick='goLink(this)'>");
                             out.print(rs.getString(2)); 
                          out.print("</td>");
                      out.print("</tr>");
                    count = count+1;
                    }
                    out.print("</table>");
                    out.print("</div>");
                 out.print("<input type='text' name='nameDetail'>"); 
                 out.print("<input type='hidden' name='category' value='"+category+"'>");
                 out.print("<input type='hidden' name='pkCate' value='"+pkCate+"'>");
                 out.print("<input type='hidden' name='pkDetail' value='"+(count+1)+"'>");
                 out.print("<input type='submit' value='เพิ่ม'>");
                 out.print("</form>");
                %>
	</div>
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>
         <script>

 function goLink(element) {
    //window.history.back();
    var cate = '<%=category%>';
    var count = '<%=count%>';
    var y = element.innerHTML;
     //alert(y);
    //var x = document.getElementsByTagName("td")[0].innerText;
    //alert(x);
    var linkHref = "reportPathForm.jsp?detail="+y+"&category="+cate+"&pkDetail="+count;
    //alert(linkHref);
     window.open(linkHref,'right');
    }
  
    

  function goBack() {
    //window.history.back();
    window.open("manageReport.html");
    }
	</script>
    </body>
</html>

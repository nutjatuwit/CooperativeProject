<%-- 
    Document   : reportForm
    Created on : Sep 25, 2017, 1:34:49 PM
    Author     : NUT
--%>

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
        %>
       

        <div id="pagewrap">

	<header align='center'>
		<h1>Manage Report Form</h1>
	</header>
	<h2>ประเภทรายงาน</h2>
	<div id="content">
		
		<%
                    
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
                
                %>
	</div>
	<h2>รายงาน</h2>
	<div id="middle">
		<%
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
                 
                
                %>
	</div>

	<div id="sidebar">
		<h2>รายละเอียดของรายงาน</h2><br>
		
	</div>
	
	<footer>
		<h4>Footer</h4>
		<p>Footer text</p>
	</footer>

         </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>
         <script>
            
            
            
    	$(function () {
    // 6 create an instance when the DOM is ready
    $('#content').jstree();
    $('#middle').jstree();
    // 7 bind to events triggered on the tree
    
    $('#content').on("changed.jstree", function (e, data) {
            //view image by path split
           
           
           var text = (data.instance.get_node(data.selected[0]).text); 
           //alert(text);
           //var atSplit = img[1].toString()+".jpg";
           //alert(data.instance.get_node(data.selected[0]).text); //alert(myVar);use java parameter in javascript
           
           var linkHref = "reportForm.jsp?report="+text;
           window.location.replace(linkHref);
           
           
        
       
         
            
    });
    // 8 interact with the tree - either way is OK
    /*$('button').on('click', function () {
      $('#jstree').jstree(true).select_node('child_node_1');
      $('#jstree').jstree('select_node', 'child_node_1');
      $.jstree.reference('#jstree').select_node('child_node_1');
    });*/
      
        
  });
  /*
  // interaction and events
	$('#evts_button').on("click", function () {
		var instance = $('#evts').jstree(true);
		instance.deselect_all();
		instance.select_node('1');
	});
	$('#evts')
		.on("changed.jstree", function (e, data) {
			if(data.selected.length) {
				alert('The selected node is: ' + data.instance.get_node(data.selected[0]).text);
			}
		})
		.jstree({
			'core' : {
				'multiple' : false,
				'data' : [
					{ "text" : "Root node", "children" : [
							{ "text" : "Child node 1", "id" : 1 },
							{ "text" : "Child node 2" }
					]}
				]
			}
		});
  
  */
  
  function goBack() {
    //window.history.back();
    window.open("manageReport.html");
    }
	</script>
    </body>
</html>

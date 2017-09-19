<%-- 
    Document   : viewImage
    Created on : Aug 25, 2017, 11:22:59 AM
    Author     : NUT
--%>



<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="net.sf.jasperreports.engine.xml.JRXmlLoader"%>
<%@page import="net.sf.jasperreports.engine.design.JasperDesign"%>
<%@page import="java.util.List"%>
<%@page import="org.w3c.dom.traversal.NodeIterator"%>
<%@page import="javax.swing.tree.DefaultMutableTreeNode"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.w3c.dom.Node, org.w3c.dom.Element, org.w3c.dom.Document, org.w3c.dom.NodeList, javax.xml.parsers.DocumentBuilder, javax.xml.parsers.DocumentBuilderFactory" %>
<!DOCTYPE html>
<html>
    <head>
  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
        <style>
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 8px 16px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 12px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
}

.button2 {
    background-color: white; 
    color: black; 
    border: 2px solid #008CBA;
}

.button2:hover {
    background-color: #008CBA;
    color: white;
    border-radius: 12px;
}

div {
    font-size: 12pt;
    font-family: times new roman;
    color: #23238e;
}

select {
        border:2px solid lightblue;
	border-radius:8px;
	height: 22px;
	width: 120px;
}

input[type=date] {
        border:2px solid lightblue;
	border-radius:8px;
	height: 22px;
	width: 130px;
}

input[type=text] {
        border:2px solid lightblue;
	border-radius:8px;
	height: 22px;
	width: 130px;
}

</style>
        
      
    </head>
    <body>
        
        
        <%  
            
          try{
            int cRow = 0;  
              
           //encode from getparameter
           request.setCharacterEncoding("UTF-8");
           String text = request.getParameter("text").toString();
           
              //database filter type
              
              String sql = "select id,filtertype.nameFil,name,description,query from addparam,filtertype where addparam.idFil "
                       + "= filtertype.idFil";
              Class.forName("com.mysql.jdbc.Driver");
              Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo?useUnicode=yes&characterEncoding=UTF-8", "root", "");
              Statement statement = conn.createStatement();
              ResultSet rs = statement.executeQuery(sql);
              
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo?useUnicode=yes&characterEncoding=UTF-8", "root", "");
              Statement statement1 = con.createStatement();
              //String sqlCompile = "select * from member";
              //ResultSet rsCompile = statement1.executeQuery(sqlCompile);
              
              String sqlCompile = "";
              ResultSet rsCompile = null;
                
              //ResultSet rsCompile = null;
              
             
               
           
           //out.println(">>>>>>"+text);
           //out.println(text+"<<<<<<");
           //Read XML 
           JasperDesign jasperDesign; //find filter
           
           String textPath="";
           String textReport="";
           
           String paramJas="";
           String paramDbDes="";
           String paramDbType="";
           String paramDbName="";
           
           String textGroupFilter="";
           
           
           
           File inputFileReportForm = new File("C:/Users/NUT/Desktop/ex.xml");//path XML report form
           //File inputFileFilterForm = new File("C:/Users/NUT/Desktop/filterForm.xml");//path XML filter form
           
           //process read form
           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
           
           Document docReportForm = dBuilder.parse(inputFileReportForm); //report form
           //Document docFilterForm = dBuilder.parse(inputFileFilterForm); //filter form
           
           docReportForm.getDocumentElement().normalize();
           //docFilterForm.getDocumentElement().normalize();
           
           //report form
           NodeList nList = docReportForm.getElementsByTagName("reportgroup");
           NodeList findWord = docReportForm.getElementsByTagName("report");
           
           //filter form
           //NodeList nListFilter = docFilterForm.getElementsByTagName("reportgroup");
           //NodeList findFilter = docFilterForm.getElementsByTagName("name");
           
         
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
               out.println(">>>>>"+textReport+"<br><br>");
            }
             //out.println(textCompare);  
            }
            //out.println(ee.getElementsByTagName("name").item(0).getTextContent());  
         }
          jasperDesign = JRXmlLoader.load(application.getRealPath(textPath+"/"+textReport));
          out.print("<form action='Show.jsp' target='righty'>");
          while(rs.next()){
          for(int i =20;i<jasperDesign.getParametersList().size();i++){
               paramJas =jasperDesign.getParametersList().get(i).getName();
              //out.println(paramJas+"from report   <br>");
                 paramDbDes = rs.getString(4).toString();
                 paramDbType = rs.getString(2).toString();
                 paramDbName = rs.getString(3).toString();
                 
                 //String sqlCompile = rs.getString(5).toString();
                 
                  
                 //Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo?useUnicode=yes&characterEncoding=UTF-8", "root", "");
                 //Statement statement1 = con.createStatement();
                 //ResultSet rsCompile = statement1.executeQuery(sqlCompile);
                 
                 //rsCompile = statement1.executeQuery(sqlCompile);
                  //out.println("ParamJas : "+paramJas+"    ParamDB : "+paramDbDes+"<br>");
                  if(paramJas.equals(paramDbDes)){
                     //out.println("ParamDb : "+paramDb+"  ParamJas  : "+paramJas+"<br>");
                      
                     //out.print(paramJas+"<br>");
                     //out.print(paramDbType+"<br>");
                     
                     
                     if(paramDbType.equals("date")){
                     out.print(paramDbName+": <input class='date' type='date' name="+paramJas+" value='2555-01-02'>");
                     cRow++;
                     }
                     if(paramDbType.equals("textfield")){
                     out.print(paramDbName+": <input type='text' name="+paramJas+" value=''>"); 
                     cRow++;
                     }
                     if(paramDbType.equals("textarea")){
                         out.print(paramDbName+":  <textarea name="+paramJas+" value='' rows='10' cols='50'>Write something here</textarea>");
                         cRow++;
                     }
                     if(paramDbType.equals("list")){ //want database for test
                         //out.print(rsCompile);
                         sqlCompile=rs.getString(5);
                         rsCompile = statement1.executeQuery(sqlCompile);
                         //
                         //for(int a=0;a>5;a++){
                             //out.println("Row : "+rsCompile.getString(2));
                         //}
                         //out.print(rsCompile.getCursorName());
                        out.print(paramDbName+": ");
                             out.println("<select name="+paramJas+">");
                             while (rsCompile.next()) {
                                 out.print("<option value=" + rsCompile.getString(1) + ">");
                                 out.print(rsCompile.getString(2));
                                 out.print("</option>");
                             }
                             out.println("</select>");
                             cRow++;
                             
                     }
                     
                    if(cRow>2){
                        cRow = 0;
                       out.print("<br><br>");
                    }
                    // break;
                  } 
                  //out.print(paramJas+"<br>");
                  }
                    
            } 
            out.print("<input type='hidden' name='textPath' value="+textPath+">");
            out.print("<input type='hidden' name='textReport' value="+textReport+">");
            out.print("<br><br><input type='submit' class='button button2' value='แสดงรายการ'>");
           out.print("</form>");
          
          
          //out.println(">>>>>text : "+text+"<br><br>");
          //for(int b=0;b<nListFilter.getLength();b++){
          //Node nListFilterNode = nListFilter.item(b);
          //out.println(b); 
          //if (nListFilterNode.getNodeType() == Node.ELEMENT_NODE) {
            //Element e = (Element) nListFilterNode;
            //String textGroup = e.getElementsByTagName("name").item(0).getTextContent().toString();     
           // for(int c=1;c<e.getElementsByTagName("name").getLength();c++){
                //Node findFilterNode = nListFilter.item(b);
                //out.println(c); 
               // String textListName = e.getElementsByTagName("name").item(c).getTextContent().toString();
                //if(text.equals(textListName)){
                   //out.println(textListName+">>>>>text group : "+textGroup+"<br><br><br>");
                 //  textGroupFilter=textGroup.toString();
               // }
                
        
            //}
          //}
            //out.println(ee.getElementsByTagName("name").item(0).getTextContent());  
         //} 
          
          
          //method for filter
          
          
          //out.println(">>>>>"+text);
            
      
         }catch(Exception ex){
           ex.printStackTrace();
            }
         %>
         
        
    </body>
     

</html>

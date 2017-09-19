<%-- 
    Document   : manageParams
    Created on : Sep 18, 2017, 10:23:49 AM
    Author     : NUT
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
table {
    border-collapse: collapse;
    width: 100%;
}



th, td {
    text-align: left;
    padding: 8px;
    width:100px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: blue;
    color: white;
}
/*search button */
.search {
    width: 120px;
    height: 25px;
    -webkit-transition: width 0.6s ease-in-out;
    transition: width 0.6s ease-in-out;
}

/* When the input field gets focus, change its width to 100% */
.search:focus {
    width: 50%;
}

.button {
    background-color: #01A9DB; /* Green */
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
.searchText {
    background-color: #01A9DB; 
    color: white; 
    border: 2px solid #008CBA;
    
}
.searchText:hover {
    background-color: white;
    color: black;
    border-radius: 12px;
}

.button1 {
    background-color: #01A9DB; 
    color: white; 
    border: 2px solid #81DAF5;
    font-size: 14px;
}
.button1:hover{
     background-color: #81DAF5;
     color: black;
     
}

.button2 {
    background-color: #01A9DB; 
    color: white; 
    border: 2px solid #81DAF5;
    font-size: 14px;
}
.button2:hover{
     background-color: #81DAF5;
     color: black;
     
}

.buttonBack span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.buttonBack span:after {
  content: 'ย้อน';
  position: absolute;
  opacity: 0;
  top: 0;
  left: -40px;
  transition: 0.5s;
}

.buttonBack:hover span {
  padding-left: 25px;
}

.buttonBack:hover span:after {
  opacity: 1;
  left: 0;
}

.addButton {
    background-color: #01A9DB; 
    color: white; 
    border: 2px solid #81DAF5;
    font-size: 13px;
    padding: 10px 18px;
}
.addButton:hover{
     background-color: #81DAF5;
     color: black;
     
}


</style>
    </head>
    <body>
        <%
            
           try{
               
               String sql = "select id,name,description,query,filtertype.nameFil from addparam,filtertype where addparam.idFil "
                       + "= filtertype.idFil";
               //String sqlFilter = "select filtertype.nameFil from addparam ";
               Connection con =null; 
               
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo?useUnicode=yes&characterEncoding=UTF-8","root","");
               
               Statement statement = con.createStatement();
               
               ResultSet rs = statement.executeQuery(sql);
               
                  out.println("<h1 align='center'>Manage Parameters</h1>");
               //ResultSet rsFilter = statement.executeQuery(sqlFilter);
               out.print("<table border='0' align='center'>");
               
                   
                   out.print("<tr>");
                     out.print("<td>");
                out.print("<form action='manageReport.html'>"); //back page
                   out.print("<button class ='button buttonBack'  style='vertical-align:middle'><span>กลับ</span></button>");
               out.print("</form>");
                     out.print("</td>");
               
                    
                     
                     out.print("<td>");
                         out.print("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
                     out.print("</td>");
                     
                      out.print("<td align='right'>");
               out.print("<form action='addParams.jsp' align='right'>"); //add parameter
                   out.print("<input type='submit' class='button addButton'  name='' value='เพิ่มตัวแปร'>");
               out.print("</form>");
                     out.print("</td>");
                     
                     out.print("<td>");
               out.print("<form action='filterParams.jsp' align='right'>"); //filter parameter
                   out.print("<input type='text' class='search' name='query' value=''>");
                   out.print("<input type='submit' class='button searchText' name='' value='ค้นหา'>");
               out.print("</form>");
                     out.print("</td>");
               
               out.print("</tr>");
               out.print("</table><br>");
               
                   out.println("<table border='2' align='center'>");
                        out.print("<thead>");
                         out.println("<tr border='3' align='center'>");
                          out.print("<th>ID</th>");
                          out.print("<th>DETIALS</th>");
                          out.print("<th>PARAMETER</th>");
                          out.print("<th>QUERY</th>");
                          out.print("<th>TYPE FILTER</th>");
                          out.print("<th>EDIT</th>");
                          out.print("<th>DELETE</th>");
                         out.println("</tr>");
                        out.print("</thead>"); 
                         
                     while(rs.next()){
                         out.println("<tr align='center'>");
                         out.println("<form action='editParams.jsp'>");
                         
                          out.print("<td>"+rs.getString(1)+"</td>");
                          out.print("<td>"+rs.getString(2)+"</td>");
                          out.print("<td>"+rs.getString(3)+"</td>");
                          out.print("<td>"+rs.getString(4)+"</td>");
                          out.print("<td>"+rs.getString(5)+"</td>");
                          
                          
                          out.print("<input type='hidden' name='id' value="+rs.getString(1)+">");
                          out.print("<input type='hidden' name='name' value="+rs.getString(2)+">");
                          out.print("<input type='hidden' name='description' value="+rs.getString(3)+">");
                          out.print("<input type='hidden' name='query' value='"+rs.getString(4)+"'>");
                          
                          out.print("<input type='hidden' name='filtertype' value="+rs.getString(5)+">");
                          
                          out.print("<td><input type='submit' class='button button1' name='' value='แก้ไข'></td>");
                         out.println("</form>"); 
                         
                         out.println("<form action='deleteData'>");
                         out.print("<input type='hidden' name='id' value="+rs.getString(1)+">");
                         out.print("<td align='center'><input type='submit' class='button button2'  value='ลบ'></td>");
                         out.println("</form>"); 
                         out.println("</tr>");
                     }
                    
                     out.println("</table>");
           
           
              rs.close();
               //out.println("test");
               
               //out.println(statement.executeQuery(sql));
           }catch(Exception ex){
               ex.printStackTrace();
           }
        
        %>
        
    </body>
</html>

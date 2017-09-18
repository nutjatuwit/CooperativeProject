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
                   out.print("<input type='submit' name='' value='กลับ'>");
               out.print("</form>");
                     out.print("</td>");
               
                     out.print("<td>");
               out.print("<form action='addParameters.html'>"); //add parameter
                   out.print("<input type='submit' name='' value='เพิ่มตัวแปร'>");
               out.print("</form>");
                     out.print("</td>");
                     
                     out.print("<td>");
                         out.print("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
                     out.print("</td>");
                     
                     out.print("<td>");
               out.print("<form action='filterParams.jsp' align='right'>"); //filter parameter
                   out.print("<input type='text' name='query' value=''>");
                   out.print("<input type='submit' name='' value='ค้นหา'>");
               out.print("</form>");
                     out.print("</td>");
               
               out.print("</tr>");
               out.print("</table><br>");
               
                   out.println("<table border='2' align='center'>");
                         out.println("<tr border='3' align='center'>");
                          out.print("<td>ID</td>");
                          out.print("<td>DETIALS</td>");
                          out.print("<td>PARAMETER</td>");
                          out.print("<td>QUERY</td>");
                          out.print("<td>TYPE FILTER</td>");
                          out.print("<td>EDIT</td>");
                          out.print("<td>DELETE</td>");
                         out.println("</tr>");
                     while(rs.next()){
                         out.println("<tr>");
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
                          
                          out.print("<td><input type='submit' name='' value='แก้ไข'></td>");
                         out.println("</form>"); 
                         
                         out.println("<form action='deleteData'>");
                         out.print("<input type='hidden' name='id' value="+rs.getString(1)+">");
                         out.print("<td align='center'><input type='submit' value='ลบ'></td>");
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

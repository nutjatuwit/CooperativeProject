<%-- 
    Document   : resultCompile
    Created on : Sep 15, 2017, 11:17:36 AM
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
               String s = request.getParameter("query");
               
               //String sqlFilter = "select filtertype.nameFil from addparam ";
               Connection con =null; 
               
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo","root","");
               
               Statement statement = con.createStatement();
               
               ResultSet rs = statement.executeQuery(s);
               
               //ResultSet rsFilter = statement.executeQuery(sqlFilter);
                   out.println("<table border='2'>");
                         out.println("<tr>");
                          out.print("<td>ID</td>"); 
                          out.print("<td>NAME</td>");
                         out.println("</tr>");
                     while(rs.next()){
                         out.println("<tr>");
                          out.print("<td>"+rs.getString(1)+"</td>");
                          out.print("<td>"+rs.getString(2)+"</td>");
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

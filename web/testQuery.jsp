<%-- 
    Document   : testQuery
    Created on : Sep 11, 2017, 3:02:45 PM
    Author     : NUT
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="net.sf.jasperreports.engine.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.File"%>
<%@ page import="java.io.FileInputStream"%>
<%@ page import="java.io.FileNotFoundException"%>
<%@ page import="java.io.InputStream"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.SQLException"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
           try{
               
               String sql = "select id,filtertype.nameFil,name,description,query from addparam,filtertype where addparam.idFil "
                       + "= filtertype.idFil";
               //String sqlFilter = "select filtertype.nameFil from addparam ";
               Connection con =null; 
               
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo","root","");
               
               Statement statement = con.createStatement();
               
               ResultSet rs = statement.executeQuery(sql);
               //ResultSet rsFilter = statement.executeQuery(sqlFilter);
                   out.println("<table border='2'>");
                         out.println("<tr>");
                          out.print("<td>ID</td>");
                          out.print("<td>FilterType</td>");
                          out.print("<td>NAME</td>");
                          out.print("<td>DESCRIPTION</td>");
                          out.print("<td>QUERY</td>");
                         out.println("</tr>");
                     while(rs.next()){
                         out.println("<tr>");
                          out.print("<td>"+rs.getString(1)+"</td>");
                          out.print("<td>"+rs.getString(2)+"</td>");
                          out.print("<td>"+rs.getString(3)+"</td>");
                          out.print("<td>"+rs.getString(4)+"</td>");
                          out.print("<td>"+rs.getString(5)+"</td>");
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

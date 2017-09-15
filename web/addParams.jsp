<%-- 
    Document   : addParams
    Created on : Sep 11, 2017, 4:33:35 PM
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
        <h1 align="center">Add Parameters</h1>
       
        <form action="insertData">
           ชื่อตัวแปร :  <input type="text" name="name"><br><br>
           ตัวแปร :  <input type="text" name="description"><br><br>
           <%
               try{
               String sql = "SELECT * FROM filtertype";
            
              Class.forName("com.mysql.jdbc.Driver");
              Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo?useUnicode=yes&characterEncoding=UTF-8", "root", "");
              Statement statement = conn.createStatement();
              ResultSet rs = statement.executeQuery(sql);
              
              out.print("FilterType : ");
               out.println("<select name='idfil'>");
               while(rs.next()){
                   out.print(rs.getString(2));
                out.print("<option value="+rs.getString(1)+">");
                   out.print(rs.getString(2));
                out.print("</option>");
                out.println("");
               }
               out.println("</select><br><br>");
               
               
               
               
                     
              
               }catch(Exception ex){
                  ex.printStackTrace();
               }
               
           %>
   
           SQL Query :  <textarea row="50" cols="50" name="query"></textarea><br><br><br>
           <input type="submit" action="" value="ยืนยัน">
        </form>    
    </body>
</html>

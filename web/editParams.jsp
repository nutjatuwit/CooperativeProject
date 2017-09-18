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
        <h1 align="center">Edit Parameters</h1>
       <%
                response.setContentType("text/html;charset=UTF-8");
                request.setCharacterEncoding("UTF-8");
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String description = request.getParameter("description");
                String query = request.getParameter("query");
                String filtertype = request.getParameter("filtertype");
       %>
        <form action="updateData">
           ชื่อตัวแปร :  <input type="text" name="name" value=<%=name%>><br><br>
           ตัวแปร :  <input type="text" name="description" value=<%=description%>><br><br>
           <%
               try{
                   
                   
                   /*out.print("<input type='hidden' name='id' value="+rs.getString(1)+">");
                          out.print("<input type='hidden' name='name' value="+rs.getString(2)+">");
                          out.print("<input type='hidden' name='description' value="+rs.getString(3)+">");
                          out.print("<input type='hidden' name='query' value="+rs.getString(4)+">");
                          out.print("<input type='hidden' name='filtertype' value="+rs.getString(5)+">");*/
                   
                
                
               String sql = "SELECT * FROM filtertype";
            
              Class.forName("com.mysql.jdbc.Driver");
              Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo?useUnicode=yes&characterEncoding=UTF-8", "root", "");
              Statement statement = conn.createStatement();
              ResultSet rs = statement.executeQuery(sql);
              
              out.print("FilterType : ");
               out.println("<select name='idfil' >");
               while(rs.next()){
                   out.print(rs.getString(2));
                   if(rs.getString(2).equals(filtertype)){
                   out.print("<option value="+rs.getString(1)+" selected>");
                   out.print(rs.getString(2));
                   out.print("</option>");
                   }else{
                out.print("<option value="+rs.getString(1)+">");
                   out.print(rs.getString(2));
                out.print("</option>");
                   }
               
               }
               out.println("</select><br><br>");
               
               
               
               
                     
              
               }catch(Exception ex){
                  ex.printStackTrace();
               }
               
           %>
    
           SQL Query :  <textarea row="50" cols="50" name="query" ><%=query%></textarea><br><br><br>
           <input type="hidden" name='id' value='<%=id%>'>
           <input type="submit" action="" value="ยืนยัน">
        </form>    
    </body>
</html>

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
        <style>
input[type=text], select,button {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit]{
    width: 49%;
    background-color: #0040FF;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

button {
    width: 49%;
    background-color: #0040FF;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit],button:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
textarea {
    width: 100%;
    height: 150px;
    padding: 12px 20px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    background-color: #f8f8f8;
    resize: none;
}
</style>
    </head>
    <body>
        <h1 align="center">Add Parameters</h1>
       
        <form name="insertData" action="insertData" align="left">
            
           ชื่อตัวแปร :  <br><input type="text" name="name" placeholder='ทดสอบ1'><br><br>
           ตัวแปร :  <br><input type="text" name="description" placeholder='test_1'><br><br>
           <%
               try{
               String sql = "SELECT * FROM filtertype";
               
            
              Class.forName("com.mysql.jdbc.Driver");
              Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo?useUnicode=yes&characterEncoding=UTF-8", "root", "");
              Statement statement = conn.createStatement();
              ResultSet rs = statement.executeQuery(sql);
              
              out.print("FilterType : <br>");
               out.println("<select name='idfil' onchange='showData()'>");
               while(rs.next()){
                  
                   out.print(rs.getString(2));
                out.print("<option value="+rs.getString(1)+">");
                   out.print(rs.getString(2));
                out.print("</option>");
                   
               
               }
               out.println("</select><br><br>");
               
               
               
               
                     
              
               }catch(Exception ex){
                  ex.printStackTrace();
               }
               
           %>
           
           <div id="textArea">
           SQL Query :  <br><textarea row="60" cols="50" name="query" placeholder='select * from membertest //for list data in list filter '></textarea><br><br><br>
           </div>
           <button onclick="goBack()">กลับ</button>
           <input type="submit" action="" value="ยืนยัน">
        </form>  
          
           
           
           
           <script>
     function goBack() {
    window.history.back();
    }
    function showData() {
        var theSelect = insertData.idfil;
        //alert(theSelect[theSelect.selectedIndex].text);
        if(theSelect[theSelect.selectedIndex].text==='list'){
            document.getElementById('textArea').style.display = 'block';  
        }else{
            document.getElementById('textArea').style.display = 'none';     
        }
        //hideElement(theSelect[theSelect.selectedIndex].text);
       }
    
       
     </script>
    </body>
</html>

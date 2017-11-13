<%-- 
    Document   : addParams
    Created on : Sep 11, 2017, 4:33:35 PM
    Author     : NUT
--%>

<%@page import="path.managePath"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="shortcut icon" href="images/Logo.png">
        <title>Add Parameters</title>
        <style>
input[type=text], select,button {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    font-size: 16px;
}

input[type=submit]{
    width: 100%;
    background-color: #0040FF;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    align-content: center;
    font-size: 16px;
}

button {
    width: 100%;
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
    background-color: #ffffff;
    padding: 0px 150px;
    
   
}
.buttonBack {
    background-color: #ffffff;
    
}
.buttonAccept {
    background-color: #ffffff;
    font-size: 20px;
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
#pagewrap{
                border: solid 1px #e6ffff;
                background-color: #e6ffff;
                font-family: TH SarabunPSK;
                font-size: 23px;
                font-weight: bold;
            }  
</style>
    </head>
    <body>
<div id='pagewrap'>
        <h1 align="center">Add Parameters</h1>
       
        <form name="insertData" action="insertData" align="left">
            
           ชื่อตัวแปร :  <br><input type="text" name="name" placeholder='ทดสอบ1(คำอธิบายตัวแปร)'><br><br>
           ตัวแปร :  <br><input type="text" name="description" placeholder='test_1(ชื่อตัวแปรใช้ส่งไปยังreport)'><br><br>
           <%
               try{
                   managePath path = new managePath(getServletContext().getRealPath("/")+"setting/setting.txt");
               String sql = "SELECT * FROM a_filter_type order by idfil";
            
             Class.forName("org.postgresql.Driver").newInstance();
               Connection conn = (Connection)DriverManager.getConnection(path.getPathDB(), path.getUserDB(), path.getPassDB()); 
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
           SQL Query :  <br><textarea row="60" cols="50" name="query" placeholder='select id,name from membertest //ใช้2คอลัมน์ คือid(ส่งไปยัง report) ,name(แสดงในlist) ใช้ "" ในการระบุString เช่น where b_service_point_id = "1"'></textarea>
           </div>
           
           <div id="buttonAccept">
           <input type="submit" align="right" action="" value="ยืนยัน">
           </div>
        </form>  
           <div id="buttonBack">
          <button onclick="goBack()">กลับ</button>
           </div>
</div>
        
           
           <script>
     function goBack() {
    //window.history.back();
    window.location.replace("manageParams.jsp");
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

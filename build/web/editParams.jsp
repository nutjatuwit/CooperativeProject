<%-- 
    Document   : addParams
    Created on : Sep 11, 2017, 4:33:35 PM
    Author     : NUT
--%>

<%@page import="path.managePath"%>
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
        <link rel="stylesheet" href="style/default.css">
        <link rel="stylesheet" href="style/w3.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
html{
          background-color: #A9D0F5;      
            }

button {
    width: 50%;
    background-color: #0040FF;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    
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

#textArea {
   height: 150px;
    border-radius: 6px;
    background-color: transparent;
    resize: none;
}
#addButton {
   background-color: #ffffff; 
   border-radius:6px;
   font-weight: bold;
   font-family: TH SarabunPSK;
   font-size: 24px;
   padding: 0px 11px;
   color: black;
   height: 40px;
   
   border:2px solid #74B3DF;
   cursor: pointer;
}
#addButton:hover{
    color: white;
    background-color: #005ce6;
    transition-duration: 0.3s;
     
}
#pagewrap{
    background: rgba(256,256,256, 0.6);
    border-radius: 6px; 
    padding: 10px 10px;
    margin: 40px 150px;
    align-content: center;
    
}
#groupDetail{
    background: transparent;
    align-content: center;
    margin-left: 148px;
} 
</style>
    </head>
    <body>
        <div id='pagewrap'>
        <h1 align="center" style="font-family: TH SarabunPSK;font-size:45px;margin-left: 33px;font-weight: bold;">แก้ไขตัวแปร</h1>
       <%
                response.setContentType("text/html;charset=UTF-8");
                request.setCharacterEncoding("UTF-8");
                Integer id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                String description = request.getParameter("description");
                String query = request.getParameter("query");
                String filtertype = request.getParameter("filtertype");
       %>
        <form name="updateData" action="updateData" align="left">
            <div id="groupDetail">
           ชื่อตัวแปร :  <input type="text" id="textInput" name="name" value='<%=name%>' style='margin-left: 15px;'><br><br>
           ตัวแปร :  <input type="text" id="textInput" name="description" value='<%=description%>' style='margin-left: 33px;'><br><br>
           <%
               try{
                  managePath path = new managePath(getServletContext().getRealPath("/")+"setting/setting.txt"); 
                   
                   /*out.print("<input type='hidden' name='id' value="+rs.getString(1)+">");
                          out.print("<input type='hidden' name='name' value="+rs.getString(2)+">");
                          out.print("<input type='hidden' name='description' value="+rs.getString(3)+">");
                          out.print("<input type='hidden' name='query' value="+rs.getString(4)+">");
                          out.print("<input type='hidden' name='filtertype' value="+rs.getString(5)+">");*/
                   
                
                
               String sql = "SELECT * FROM a_filter_type";
            
             Class.forName("org.postgresql.Driver").newInstance();
               Connection conn = (Connection)DriverManager.getConnection(path.getPathDB(), path.getUserDB(), path.getPassDB());
               
               Statement statement = conn.createStatement();
               
               ResultSet rs = statement.executeQuery(sql);
              
              
               out.println("การรับข้อมูล : <select name='idfil' onchange='showData()' style='height: 40px;border:2px solid #74B3DF;'>");
               while(rs.next()){
                   //out.print(rs.getString(2));
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
               
               out.print("<input type='hidden' name='id' value='"+id+"'>");
               
              
                     
              
               }catch(Exception ex){
                  ex.printStackTrace();
               }
             if(query.equals(null)){
                query = " ";
             }  
           out.print("<div id='textArea' style='padding: 0px 0px;margin-right: 35px;'>");
           out.print("คำสั่งSQL :  <textarea row='60' cols='80' name='query' style='width: 400px;'>"+query+"</textarea><br>");
           out.print("</div>");
              
           if(filtertype.equals("list")){
              out.print("<script>document.getElementById('textArea').style.display = 'block';</script>");
           }else{
              out.print("<script>document.getElementById('textArea').style.display = 'none';</script>");
           }
           %>
           
           <button type="submit" id="addButton" align="right" action="" style='padding: 0px 0px;margin-left: 45px;'>ยืนยัน</button>
           
        </form>  
           
          <button id="addButton" onclick="goBack()" style='padding: 0px 0px;margin-left: 45px;'>กลับ</button>
          
             </div> 
            </div> 
           <script>
     function goBack() {
    //window.history.back();
    window.location.replace("manageParams.jsp");
    }
    function showData() {
        var theSelect = updateData.idfil;
        //alert(theSelect[theSelect.selectedIndex].text);
        if(theSelect[theSelect.selectedIndex].text==='list'){
            document.getElementById('textArea').style.display = 'block';  
        }else{
            document.getElementById('textArea').style.display = 'none';     
        }
        //hideElement(theSelect[theSelect.selectedIndex].text);
       }
     function hideData() {
        
        alert();
        
            //document.getElementById('textArea').style.display = 'none';  
        
              
       
        //hideElement(theSelect[theSelect.selectedIndex].text);
       }
    
       
     </script>
    </body>
</html>

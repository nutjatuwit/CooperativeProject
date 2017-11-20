<%-- 
    Document   : manageSetting
    Created on : Nov 20, 2017, 7:29:43 PM
    Author     : NUT
--%>

<%@page import="path.managePath"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style/w3.css">
        <link rel="stylesheet" href="style/default.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ตั้งค่า</title>
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
    padding: 0px 0px;
    margin: 15px 170px;
    align-content: center;
    
}
#groupDetail{
    background: transparent;
    align-content: center;
    margin-left: 50px;
    margin-top: 20px;
} 
#textInput{
    width: 350px;
}
</style>
    </head>
    <body>
        <div id='pagewrap'>
        
       <%
                request.setCharacterEncoding("UTF-8");   
                managePath path = new managePath(getServletContext().getRealPath("/")+"setting/setting.txt"); 
       %>
        <form name="setPathDB" action="setPathDB" align="left">
            <div id="groupDetail">
                ฐานข้อมูล :  <input type="text" id="textInput" name="pathDB" value='<%=path.getPathDB()%>' style='margin-left: 60px;'><br>
           ชื่อผู้ใช้ฐานข้อมูล :  <input type="text" id="textInput" name="userDB" value='<%=path.getUserDB()%>' style='margin-left: 19px;'><br>
           รหัสผ่านฐานข้อมูล :  <input type="text" id="textInput" name="passDB" value='<%=path.getPassDB()%>' style='margin-left: 8px;'><br>
           ชื่อแฟ้มเก็บรายงาน :  <input type="text" id="textInput" name="folderReport" value='<%=path.getPathReport()%>' style='margin-left: 5px;'><br>
          
           <button type="submit" id="addButton" align="right" action="" style='padding: 0px 0px;margin-left: 22%;margin-top: 25px;'>ยืนยัน</button>         
        </form>  
            </div> 
          
            </div> 
    </body>
</html>

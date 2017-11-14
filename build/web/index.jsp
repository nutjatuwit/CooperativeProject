<%-- 
    Document   : index
    Created on : Sep 1, 2017, 9:28:24 AM
    Author     : NUT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/default.css">
        <link rel="stylesheet" href="style/w3.css">
        <title>Login</title>
        
       
    </head>
    <style>
#fieldData {
    border: 3px solid #A9F5F2;
    margin: 10px 450px;
    background-color: #ccfff5;
}
body{
    
    background-color: #e6ffff;
}
input[type=text], input[type=password] {
    width: 100%;
    padding: 6px 10px;
    margin: 4px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}



.imgcontainer {
    text-align: center;
    
    
}

img.avatar {
    width:90%;
    height: 180px;
    border-radius: 8px;
    margin: 0px 6px;
}

.container {
    padding: 8px;
    margin: 4px 0;
    font-weight: bold;
    font-family: TH SarabunPSK;
    font-size: 25px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}

.warning {
color: #9F6000;
background-color: #FEEFB3;

}
#loginButton{
   background-color: #2E2EFE; 
   font-weight: bold;
   font-family: TH SarabunPSK;
   font-size: 25px;
   color: white;
}

</style>
<link rel="shortcut icon" href="images/Logo.png">
    <body>
        
        
      
        <%  
                       request.setCharacterEncoding("UTF-8");  
                       String textUser = "";
                        if(session.getAttribute("userid")!=null){  
                        String userID=(String)session.getAttribute("userid");  
                        String nameUser=(String)session.getAttribute("username");
                        //out.print("Hello, "+userID+" Welcome to Profile");  
                           if(nameUser.equals("null")){
                              textUser = "กำลังเข้าใช้งานโดยไอดี : "+userID;
                           }else{
                              textUser = "กำลังเข้าใช้งานโดยชื่อผู้ใช้ : "+nameUser;
                           }
                           
                            
                        
                         
                        
                
                           out.print("<div class='tab'>");
                           out.print("<form action='authenLogout'>");
                           out.print("<button type='submit' class='tablinks' name='backButton'><img src='images/logout.png' id='img' height='32' width='32'> Logout</button>");
                           out.print("</form>");
                           
                           out.print("<form>");
                           out.print("<button style='font-size: 16px;font-size: 20px;font-family: TH SarabunPSK;font-weight: bold;'>"+textUser+"</button>");
                           out.print("</form>");
                           out.print("</div>");
                        }
        %>
       
        
       <form id="fieldData" action="authenLogin" method="post">
  <div class="imgcontainer">
    <img src="images/HosOSlogo.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label><b>ชื่อผู้ใช้</b></label>
    <input type="text" placeholder="ใส่ชื่อผู้ใช้..." name="uname" required>

    <label><b>รหัสผ่าน</b></label>
    <input type="password" placeholder="ใส่รหัสผ่าน..." name="psw">
        
    <button id="loginButton" type="submit" >เข้าสู่ระบบ</button>
    
  </div>

 
    </body>
</html>

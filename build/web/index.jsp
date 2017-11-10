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
    border: 3px solid #4da6ff;
    margin: 10px 450px;
    background-color: #ccfff5;
}
body{
    
    background-color: #e6ffff;
}
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}



.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
    
}

img.avatar {
    width:50%;
   
}

.container {
    padding: 16px;
    margin: 8px 0;
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


</style>
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
                        }
        %>
       
        <div class="tab">
            
            <form action="authenLogout"> 
            <button type="submit" class="tablinks" name="backButton"><img src='images/logout.png' id='img' height='32' width='32'> Logout</button>
            </form>
            
            <form> 
            <button style="font-size: 16px;font-size: 20px;font-family: TH SarabunPSK;font-weight: bold;"><%=textUser%></button>
            </form>
        </div>
        
    
        
       <form id="fieldData" action="authenLogin" method="post">
  <div class="imgcontainer">
    <img src="images/HosOSlogo.jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw">
        
    <button id="loginButton" type="submit">Login</button>
    
  </div>

 
    </body>
</html>

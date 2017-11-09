<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        
        <link rel="stylesheet" href="style/default.css">
        <link rel="stylesheet" href="style/w3.css">
        
        <title>Report Center</title>
        <link rel="shortcut icon" href="images/Logo.png">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>

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


input[type=submit]:hover {
    background-color: #45a049;
}

body {
    margin: 0;
    padding: 0;
}
.banner {
    width: 35%;
    height: 150px;
}


</style>
<%
                       request.setCharacterEncoding("UTF-8");  
                        if(session.getAttribute("userid")!=null){  
                        String userID=(String)session.getAttribute("userid");  

                        //out.print("Hello, "+userID+" Welcome to Profile");  
                        }  
                        else{  
                            RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
                            rq.forward(request, response);
                            
                        }  
%>

<div class="w3-container w3-center w3-animate-opacity">
     <div id="mySidenav" class="sidenav">
        <form action="authenLogout">
        <button id="about">Logout</button>
        </form>
    </div>
<div class="w3-container w3-center">
       <img class="banner" src="images/HosOSlogo.jpg" alt="" /><br><br>
    </head>
    <body align='center'>
        <form action = "manageReport.jsp">
            <input type="submit"  name='reportButton' value="Manage" action=""><br><br>
        </form>
        
        <form action = "showPage.jsp">
            <input type="submit"  name='paramsButton' value="Preview"><br><br>
        </form>
        
    </body>
</div>    
</html>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <link rel="stylesheet" href="style/default.css">
        <link rel="stylesheet" href="style/w3.css">
        
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <link rel="shortcut icon" href="images/Logo.png">
        <title>Report Center</title>
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


div.tab {
    overflow: hidden;
    border: 1px solid #ccc;
    background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
div.tab button {
    background-color: inherit;
    float: left;
    border: none;
    outline: none;
    cursor: pointer;
    padding: 12px 14px;
    transition: 0.6s;
}

/* Change background color of buttons on hover */
div.tab button:hover {
    background-color: #1ac6ff;
    padding: 12px 25px;
    
}

/* Create an active/current tablink class */
div.tab button.active {
    background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
    display: none;
    padding: 6px 10px;
    border: 1px solid #ccc;
    border-top: none;
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
    </head>
    <div class="w3-container w3-center w3-animate-opacity">
    <div id="mySidenav" class="sidenav">
        <form action="authenLogout">
        <button id="about">Logout</button>
        </form>
    </div>
    
    <img class="banner" src="images/HosOSlogo.jpg" alt="" /><br><br>
    <body align='center'>
        
        <form action = "reportForm.jsp">
            <input type="submit"  value="Manage Report Form" action=""><br><br>
        </form>
        
        <form action = "manageParams.jsp">
            <input type="submit"  value="Manage Parameters"><br><br>
        </form>
        
        <script>
     function goBack() {
    //window.history.back();
    window.history.back();
    }
    </script>
    </div>
    </body>
</html>

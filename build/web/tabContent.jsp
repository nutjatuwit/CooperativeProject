<%-- 
    Document   : tabContent
    Created on : Nov 10, 2017, 11:22:43 AM
    Author     : NUT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" href="style/default.css">
        <link rel="stylesheet" href="style/w3.css">
         <% 
                         request.setCharacterEncoding("UTF-8");  
                       String textUser = null;
                       String userType = null;
                        if(session.getAttribute("userid")!=null){  
                        String userID=(String)session.getAttribute("userid");  
                        String nameUser=(String)session.getAttribute("username");
                        userType=(String)session.getAttribute("usertype");
                        //out.print("Hello, "+userID+" Welcome to Profile");  
                           if(nameUser.equals("null")){
                              textUser = "กำลังเข้าใช้งานโดยไอดี : "+userID;
                           }else{
                              textUser = "กำลังเข้าใช้งานโดยชื่อผู้ใช้ : "+nameUser;
                           }
                        }
                 if(userType.equals("manager")){
                       
    %>
    </head>
   
     <div class="tab">
           <form>
            <button type="submit" class="tablinks" name="backButton" style="float: left; font-size: 20px;font-family: TH SarabunPSK;font-weight: bold;" onclick="backtomenu()"><img src='images/back.png' id='img' height='32' width='32'> กลับสู่หน้าหลัก</button>
           </form>
            
            <form> 
            <button style="font-size: 16px;font-size: 20px;font-family: TH SarabunPSK;font-weight: bold;"><%=textUser%></button>
            </form>
        </div>
        
            <%}else{%>
              <div class="tab">
            
            <form action="authenLogout"> 
            <button type="submit" class="tablinks" name="backButton"  onclick="logout()"><img src='images/logout.png' id='img' height='32' width='32'> Logout</button>
            </form>
            
            <form> 
            <button style="font-size: 16px;font-size: 20px;font-family: TH SarabunPSK;font-weight: bold;"><%=textUser%></button>
               
           
            </form>
        </div>
            
            <%}%>
    </head>
    <body>
      
    </body>
    <script>
        function backtomenu() {
    //window.history.back();
    //var y = element.innerHTML;
    var linkHref = "managePage.jsp";  
    window.open(linkHref);
    
    }
       function logout() {
    //window.history.back();
    //var y = element.innerHTML;
    var linkHref = "index.jsp";  
    window.open(linkHref);
    window.open('blankPage.jsp','lefty');
    window.open('blankPage.jsp','top');
    window.open('blankPage.jsp','filty');
    window.open('blankPage.jsp','righty');
    window.open('blankPage.jsp','allSet');
    window.open('blankPage.jsp','_self');
    window.open('blankPage.jsp','_blank'); 
    }  
                           
        
    </script>
</html>

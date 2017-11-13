 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<meta http-="content-type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="style/default.css">
<link rel="stylesheet" href="style/w3.css">
        

<style>
    frame[name=lefty]{
        background-color: #EFFBFB;
    }
    frame[name=filty]{
        background-color: #EFFBFB;
    }
</style>
<link rel="shortcut icon" href="images/Logo.png">
<title>Preview Report</title>



</head>
<% 
                         request.setCharacterEncoding("UTF-8");  
                       String textUser = null;
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
                        else{  
                            RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
                            rq.forward(request, response);
                            
                        }  
    %>
    
<frameset name="allSet" rows="8.7%,91.3%">   
    <frame name="top" src="tabContent.jsp" noresize="noresize" scrolling="no">
        
        
    
    <frameset cols="25%,75%">

            <frame name="lefty" src="readXML.jsp">


            <frameset rows="23%,77%">

                   <frame name="filty" src="filterReport.jsp">
                   <frame name="righty" src="blankPage.jsp">

            </frameset>
    </frameset>
</frameset>        

</html>

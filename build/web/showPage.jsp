 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<meta http-="content-type" content="text/html; charset=utf-8">


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
  
                        if(session.getAttribute("userid")!=null){  
                        String userID=(String)session.getAttribute("userid");  

                        //out.print("Hello, "+userID+" Welcome to Profile");  
                        }  
                        else{  
                            RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
                            rq.forward(request, response);
                            
                        }  

    %>
    
<frameset cols="25%,75%">
    
    <frame name="lefty" src="readXML.jsp">
 

 <frameset rows="23%,77%">
  
  <frame name="filty" src="filterReport.jsp">
  <frame name="righty" src="blankPage.jsp">
  
 </frameset>
 
</frameset>

</html>

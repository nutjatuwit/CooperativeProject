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
        <title>JSP Page</title>
    </head>
    <body>
        <%
           request.setCharacterEncoding("UTF-8");
           String category=request.getParameter("category");
           out.print(category);
        %>
    </body>
</html>

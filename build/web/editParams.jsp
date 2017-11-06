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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
input[type=text], select,button {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    font-size: 16px;
}

input[type=submit]{
    width: 100%;
    background-color: #0040FF;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    align-content: center;
    font-size: 16px;
}

button {
    width: 100%;
    background-color: #0040FF;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    
}


input[type=submit],button:hover {
    background-color: #45a049;
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

textarea {
    width: 100%;
    height: 150px;
    padding: 12px 20px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    background-color: #f8f8f8;
    resize: none;
}
#pagewrap{
                border: solid 1px #e6ffff;
                background-color: #e6ffff;
                font-family: TH SarabunPSK;
                font-size: 23px;
                font-weight: bold;
            }  
</style>
    </head>
    <body>
        <div id='pagewrap'>
        <h1 align="center">Edit Parameters</h1>
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
           ชื่อตัวแปร :  <br><input type="text" name="name" value=<%=name%>><br><br>
           ตัวแปร :  <br><input type="text" name="description" value=<%=description%>><br><br>
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
              
              out.print("FilterType : <br>");
               out.println("<select name='idfil' onchange='showData()'>");
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
           out.print("<div id='textArea'>");
           out.print("SQL Query :  <br><textarea row='50' cols='50' name='query' >"+query+"</textarea><br><br><br>");
           out.print("</div>");
              
           if(filtertype.equals("list")){
              out.print("<script>document.getElementById('textArea').style.display = 'block';</script>");
           }else{
              out.print("<script>document.getElementById('textArea').style.display = 'none';</script>");
           }
           %>
           <div id="buttonAccept">
           <input type="submit" align="right" action="" value="ยืนยัน">
           </div>
        </form>  
           <div id="buttonBack">
          <button onclick="goBack()">กลับ</button>
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

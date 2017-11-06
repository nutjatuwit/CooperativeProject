<%-- 
    Document   : manageParams
    Created on : Sep 18, 2017, 10:23:49 AM
    Author     : NUT
--%>

<%@page import="path.managePath"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <style>
table {
    border-collapse: collapse;
    width: 100%;
}



th, td {
    text-align: center;
    padding: 8px;
    width:100px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #01A9DB;  
    color: #F2F2F2;
}
/*search button */
.search {
    width: 180px;
    height: 25px;
    -webkit-transition: width 0.6s ease-in-out;
    transition: width 0.6s ease-in-out;
    margin: 1px 2px;
}

/* When the input field gets focus, change its width to 100% */


.button {
    background-color: #01A9DB; /* Green */
    border: none;
    color: white;
    padding: 8px 16px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 12px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
    border-radius: 16px;
}
.searchText {
    background-color: #01A9DB; 
    color: white; 
    border: 2px solid #008CBA;
    
}
.searchText:hover {
    background-color: white;
    color: black;
    border-radius: 12px;
}

.button1 {
    background-color: #01A9DB; 
    color: white; 
    border: 2px solid #81DAF5;
    font-size: 14px;
    
}
.button1:hover{
     background-color: #81DAF5;
     color: black;
     padding: 8px 28px;
}

.button2 {
    background-color: #01A9DB; 
    color: white; 
    border: 2px solid #81DAF5;
    font-size: 14px;
}
.button2:hover{
     background-color: #81DAF5;
     color: black;
     padding: 8px 28px;
}



.addButton {
    background-color: #01A9DB; 
    color: white; 
    border: 2px solid #81DAF5;
    font-size: 13px;
    padding: 10px 18px;
}
.addButton:hover{
     background-color: #81DAF5;
     color: black;
     
}



#mySidenav a {
    position: absolute;
    left: -80px;
    transition: 0.3s;
    padding: 15px;
    width: 90px;
    text-decoration: none;
    font-size: 20px;
    color: white;
    border-radius: 0 5px 5px 0;
}

#mySidenav a:hover {
    left: 0;
    cursor: pointer;
}

#back {
    top: 10px;
    background-color: #4CAF50;
}

#myBtn {
  display: none;
  position: fixed;
  bottom: 20px;
  right: 12px;
  z-index: 99;
  border: none;
  outline: none;
  background-color: red;
  color: white;
  cursor: pointer;
  padding: 10px;
  border-radius: 10px;
  transition-duration: 0.4s;
}

#myBtn:hover {
  background-color: orangered;
  padding: 30px 8px;
}
.tooltip {
    position: relative;
    display: inline-block;
   
}

.tooltip .tooltiptext {
    visibility: hidden;
    
    background-color: black;
    color: #fff;
    text-align: center;
    border-radius: 6px;
    padding: 5px 0;
    width: 120px;
    bottom: 100%;
    left: 50%; 
    margin-left: -60px;
    /* Position the tooltip */
    position: absolute;
    z-index: 1;
    
}

.tooltip:hover .tooltiptext {
    visibility: visible;
}
#pageForm{
                border: solid 1px #ccc;
                font-family: TH SarabunPSK;
                font-size: 23px;
                font-weight: bold;
    
}

</style>

<link rel="shortcut icon" href="images/Logo.png">
  <title>Parameters Management</title>
    </head>
    <body>
        <div id="mySidenav" class="sidenav">
        <a id="back" onclick="goBack()">กลับ</a>
  
         </div>
        
        <%
              out.print("<div id='pageForm'>");
           try{
               managePath path = new managePath(getServletContext().getRealPath("/")+"setting/setting.txt");
               int i = 1;
               String sql = "select a_add_param.id,a_add_param.name,a_add_param.description,a_add_param.query,a_filter_type.namefil from a_add_param inner join a_filter_type on a_add_param.idfil = a_filter_type.idfil order by a_add_param.id ASC";
               //String sqlFilter = "select filtertype.nameFil from addparam ";
               Connection con =null; 
               
               Class.forName("org.postgresql.Driver").newInstance();
               con = DriverManager.getConnection(path.getPathDB(), path.getUserDB(), path.getPassDB());
               
               Statement statement = con.createStatement();
               
               ResultSet rs = statement.executeQuery(sql);
               
                  out.println("<h1 align='center'>Manage Parameters</h1>");
               //ResultSet rsFilter = statement.executeQuery(sqlFilter);
 
                      
               out.print("<form action='addParams.jsp' align='right'>"); //add parameter
                   out.print("<input type='submit' class='button addButton'  name='' value='เพิ่มตัวแปร'>");
               out.print("</form>");
                   
                     
                    
               out.print("<form action='filterParams.jsp' align='right'>"); //filter parameter
                   out.print("<input type='text' class='search' name='query' value=''>");
                   out.print("<div class='tooltip'><button type='submit' style='background-color:transparent; border-color:transparent; padding: 0 ; margin-left: 1px; margin-bottom: 2px; cursor: pointer;'><img src='images/search.png' style=' padding: 0 ; margin-left: 1px; margin-bottom: -11px;'id='img' height='32' width='32'></button><span class='tooltiptext'>ค้นหา</span></div>");
               out.print("</form>");
                     
                   
                   out.println("<table border='2' align='center'>");
                        out.print("<thead>");
                         out.println("<tr border='3' align='center'>");
                          out.print("<th>ID</th>");
                          out.print("<th>DETIALS</th>");
                          out.print("<th>PARAMETER</th>");
                          out.print("<th>QUERY</th>");
                          out.print("<th>TYPE FILTER</th>");
                          out.print("<th></th>");
                          out.print("<th></th>");
                         out.println("</tr>");
                        out.print("</thead>"); 
                         
                     while(rs.next()){
                         out.println("<tr>");
                         out.println("<form action='editParams.jsp'>");
                         
                         out.print("<td style='text-align: center; width: 3%;'>"+(i++)+"</td>");
                          out.print("<td style='text-align: center; width: 7%;'>"+rs.getString(2)+"</td>");
                          out.print("<td style='text-align: center; width: 7%;'>"+rs.getString(3)+"</td>");
                          out.print("<td style='text-align: center; width: 20%;'>"+rs.getString(4)+"</td>");
                          out.print("<td style='text-align: center; width: 5%;'>"+rs.getString(5)+"</td>");
                          
                          
                          out.print("<input type='hidden' name='id' value="+rs.getString(1)+">");
                          out.print("<input type='hidden' name='name' value="+rs.getString(2)+">");
                          out.print("<input type='hidden' name='description' value="+rs.getString(3)+">");
                          out.print("<input type='hidden' name='query' value='"+rs.getString(4)+"'>");
                          out.print("<input type='hidden' name='filtertype' value="+rs.getString(5)+">");
                          out.print("<td style='text-align: center; width: 2%;'><div class='tooltip'><button type='submit'  style='background-color:transparent; border-color:transparent; padding: 0 ; margin-left: 1px; margin-bottom: 2px; cursor: pointer; src=''><img src='images/edit.png' id='img' height='40' width='40'></button><span class='tooltiptext'>แก้ไข</span></div></td>");
                         out.println("</form>"); 
                         
                         out.println("<form>");
                         out.print("<td style='text-align: center; width: 2%;'><div class='tooltip'><button type='submit' style='background-color:transparent; border-color:transparent; padding: 0 ; margin-left: 1px; margin-bottom: 2px; cursor: pointer;  src='' onClick='onDelete("+rs.getString(1)+")'><img src='images/remove.png' id='img' height='40' width=''></button><span class='tooltiptext'>ลบ</span></div></td>");
                         out.println("</form>"); 
                         out.println("</tr>");
                     }
                    
                     out.println("</table>");
           out.print("</div>");
           
              rs.close();
               //out.println("test");
                
               
               //to top
               //out.print("<button onclick='topFunction()' id='myBtn' title='Go to top'>ขึ้นบน</button>");
               
               
               //out.println(statement.executeQuery(sql));
           }catch(Exception ex){
               ex.printStackTrace();
           }
        
        %>
        
       
        
            <script>
     function goBack() {
    //window.history.back();
    window.location.replace("manageReport.html");
    }
    
    window.onscroll = function() {scrollFunction()};

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("myBtn").style.display = "block";
    } else {
        document.getElementById("myBtn").style.display = "none";
    }
}

function onDelete(id) {
    //window.history.back();
    //var y = element.innerHTML;
    var confirmDel = confirm('ยืนยันการลบตัวแปร');
    //alert(id);
   
    if(confirmDel){
    var linkHref = "deleteData?id="+id;  
    window.open(linkHref);
    window.close();

    }else{
   
    }
     //alert(pkCate);
    //var x = document.getElementsByTagName("td")[0].innerText;
    //alert(x);
    //var linkHref = "deleteCate?id_cate="+id_cate;
    //window.open(linkHref);
   
    }

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}
    </script>
    </body>
</html>

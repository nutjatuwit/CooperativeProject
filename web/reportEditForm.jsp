<%-- 
    Document   : reportEditForm
    Created on : Oct 2, 2017, 2:52:07 PM
    Author     : NUT
--%>

<!DOCTYPE html>
<%@page contentType="text/html; charset=UTF-8" %>

<html>
<title>EDIT</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style/w3.css">
<body>

<div class="w3-card-4">
  <div class="w3-container w3-blue">
    <h2>แก้ไขชื่อ</h2>
  </div>
    <%
       request.setCharacterEncoding("UTF-8");
       String reportType = request.getParameter("reportType");
       String text = "";
       String id_cate = ""; //id_cate=1&category=1.รายงานการเงิน&reportType=category
       String category = "";
       String id_report = "";
       String detail = "";  //category=4.รายงานการนัดหมาย&reportType=detail&pkCate=4&id_report=18&detail=1.รายการนัดหมายแยกตามวัน+เวลา+คลินิก+และแพทย์      
       String sql,sqlCate;
       
             if(reportType.equals("category")){
                 category = request.getParameter("category");
                 text = category;
                 
                 id_cate = request.getParameter("id_cate");
             }else{
                 detail = request.getParameter("detail");
                 text = detail;
                 
                 category = request.getParameter("category");
                 id_cate = request.getParameter("id_cate");
                 id_report = request.getParameter("id_report");    
             }
        
    %>
  <form class="w3-container" action="updateReport">
    <p>      
    <label class="w3-text-blue"><b></b></label>
    <input class="w3-input w3-sand" name="edited" type="text" value="<%=text%>"></p>
    <p>
    
    <button class="w3-btn w3-green" >ยืนยัน</button></p>
    <input type="hidden" name="reportType" value="<%=reportType%>">
    <input type="hidden" name="id_cate" value="<%=id_cate%>">
    <input type="hidden" name="category" value="<%=category%>">
    <input type="hidden" name="id_report" value="<%=id_report%>">
    <input type="hidden" name="reportType" value="<%=reportType%>">
  </form>
</div>
  <script>
    function goBack(){
       window.history.back();  
        
    }
    
  </script>
</body>
</html> 
<%-- 
    Document   : menuAdmin
    Created on : Nov 17, 2017, 4:37:27 PM
    Author     : NUT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="style/default.css">
  <link rel="stylesheet" href="style/w3.css">
  <style>
      button{
          font-family: TH SarabunPSK;
          text-align: center;  
          font-weight: bold;
      }
      
  </style>  
</head>
<body>


  <div class="btn-group-vertical" style="width: 100%;">
    <button type="button" id="menuButton"  class="btn btn-primary" onclick="test1();"  style="width: 100%;font-size: 19px;font-weight: bold;">จัดการรายงาน</button>
    <button type="button" class="btn btn-primary" onclick="test2();"  style="width: 100%;font-size: 19px;font-weight: bold;">จัดการตัวแปร</button>
    <button type="button" class="btn btn-primary" style="width: 100%;font-size: 19px;font-weight: bold;">ดดดด</button>
  </div>


</body>
</html>
<script>
       function test1(){
           window.open('reportForm.jsp','righter');
       }
       function test2(){
           window.open('manageParams.jsp','righter');
       }
       
       $(document).ready(function() { 
    
  $(document).delegate("button","click",function(e){
  $("button").css('background-color', '#3385ff');
  $(this).css('background-color', 'blue');
});
});
    
</script>

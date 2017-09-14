<%-- 
    Document   : Show
    Created on : Mar 12, 2017, 4:41:03 PM
    Author     : Admin
--%>




<%@page import="net.sf.jasperreports.engine.design.JRDesignStyle"%>
<%@ page import="net.sf.jasperreports.engine.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.File"%>
<%@ page import="java.io.FileInputStream"%>
<%@ page import="java.io.FileNotFoundException"%>
<%@ page import="java.io.InputStream"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.SQLException"%>













 
 <%  
                
            try {
               
               //for connect HosOS
               Class.forName("org.postgresql.Driver").newInstance();
               Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres"); //database connection
              
               String b_visit_clinic_id="";
               String visit_service_staff_doctor="";
               String item_id ="";
               String b_service_point_id="";
               String start_date="";
               String end_date="";
               
               
              
               ArrayList<String> allParams = new ArrayList<String>();
               ArrayList<String> allValues = new ArrayList<String>();
              
               //Integer fiscal_year = Integer.parseInt(request.getParameter("fiscal_year"));
               b_visit_clinic_id = request.getParameter("b_visit_clinic_id"); 
               visit_service_staff_doctor = request.getParameter("visit_service_staff_doctor"); 
               item_id = request.getParameter("item_id");
               b_service_point_id = request.getParameter("b_service_point_id"); 
               start_date = request.getParameter("start_date");
               end_date = request.getParameter("end_date");
               String path = request.getParameter("textPath");
               String fileGet = request.getParameter("textReport");
               String[] fileView=fileGet.split("\\.");
               String fileOut = fileView[0].toString();
              
               //out.println(path+""+fileGet);
               //out.println(path+""+fileView);
              //out.println(path+""+fileOut);
              //out.println(start_date);
              //out.println(end_date);
               
               
                 //Integer id=Integer.parseInt(request.getParameter("id"));
               //out.println(id); //id parameter
               //out.println(path); // path file
               //out.println(fileOut); //.jrxml
               //out.println(path+""+fileOut+".jasper");
              
            File reportFile = new File(application.getRealPath(path+"/"+fileOut+".jasper"));//your report_name.jasper file
            //File reportFile = new File(application.getRealPath("//Report/testpharm.jasper"));
           
            //out.print(reportFile.getPath().toString());
           
           
            
            //String url = request.getQueryString();
            //out.print(url);
           
            //Split parameters and values
            String[] splits = request.getQueryString().toString().split("&");
            for(int i =0;i<splits.length;i++){
               String[] paramSplit  = splits[i].split("=");
               for(int j=0;j<paramSplit.length;j+=2){
                  //out.print(paramSplit[j]+"<br>");
                   allParams.add(paramSplit[j]);
               }
    
               for(int k=1;k<paramSplit.length;k+=2){
                  //out.print(paramSplit[k]+"<br>");
                    allValues.add(paramSplit[k]);
               }
            }
            
            //for(int i = 0;i<allParams.size();i++){
                //out.print("Test : "+allValues.get(i)+"<br>");
           // }
            
            Map parameters = new HashMap();
            
            //parameters.put("fiscal_year", fiscal_year);
           // parameters.put("b_visit_clinic_id", b_visit_clinic_id);
            //parameters.put("visit_service_staff_doctor", visit_service_staff_doctor);
            //parameters.put("item_id", item_id);
            //parameters.put("b_service_point_id", b_service_point_id);
            for(int i = 0;i<allParams.size();i++){
             //out.print("Params : "+allParams.get(i)+" Values : "+allValues.get(i));
            parameters.put(""+allParams.get(i), allValues.get(i));   
            }
            
            
            byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), parameters, conn);
             
           
            
            response.setContentType("application/pdf");
            
            response.setContentLength(bytes.length);
            ServletOutputStream outStream = response.getOutputStream();
            outStream.write(bytes, 0, bytes.length);
            outStream.flush();
            outStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        %>
        <%/*
          Connection conn = null;
    try{
       Class.forName("org.postgresql.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/dbHos", "postgres", "postgres");
        String jrxmlFile = session.getServletContext().getRealPath("//Report/testPost.jrxml");
        InputStream input = new FileInputStream(new File(jrxmlFile));
        
        JasperReport jr = JasperCompileManager.compileReport(input);
        JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
        
        JasperExportManager.exportReportToPdfStream(jp,response.getOutputStream());
       
        
        conn.close();
    }catch(Exception e){
        e.printStackTrace();
    }*/
        %>
        
        
    
    
    
        
         

     
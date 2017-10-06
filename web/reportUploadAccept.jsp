    <%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@page pageEncoding="utf8" %>
   <%@page import="java.util.Enumeration"%>
   <%@ page import="java.util.List" %>
   <%@ page import="java.util.Iterator" %>
   <%@ page import="java.io.File" %>
   <%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
   <%@ page import="java.io.*,java.util.*, javax.servlet.*"%>
   <%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
   <%@ page import="org.apache.commons.fileupload.*"%>
   <%@ page language="java" contentType="text/html;charset=UTF-8" %>
   
     <meta contentType="text/html; charset=UTF-8"/>
   
   
   <%
        /*List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
    for (FileItem item : multiparts) {
        if (!item.isFormField()) {
            //your operations on file
        } else {
            String name = item.getFieldName();
            String value = item.getString();
            out.println(name+"---"+value);
            //you operations on paramters
        }*/
        
       request.setCharacterEncoding("UTF-8");
       //response.setContentType("text/html;charset=UTF-8;pageEncoding=UTF-8");
       //response.setCharacterEncoding("UTF-8");
       //out.println(request.getRequestURL());
       ArrayList reportList = new ArrayList();
       ArrayList detailList = new ArrayList();
  
       
 boolean isMultipart = ServletFileUpload.isMultipartContent(request);
 if (!isMultipart) {
 } else {
           
	   FileItemFactory factory = new DiskFileItemFactory();
	   ServletFileUpload upload = new ServletFileUpload(factory);
           
	   List items = null;
	   try {
                  
		   items = upload.parseRequest(request);
                   
	   } catch (FileUploadException e) {
		   e.printStackTrace();
	   }
           
           //set parameter to folder
           Iterator itrFolder = items.iterator();
           String name_folder = "";
           int i =1;
	   while (itrFolder.hasNext()) {
	   FileItem itemFolder = (FileItem) itrFolder.next();
           
	   if (itemFolder.isFormField()) {
               String name = itemFolder.getFieldName();
               String value = itemFolder.getString();
               //value = URLDecoder.decode( value, "UTF-8" );
               String valueDecoded = new String (value.getBytes ("iso-8859-1"), "UTF-8");
              
               if(i==3){ 
                   name_folder = valueDecoded;
                   //out.print("isFormField : "+name_folder+""+i+"<br>");
                     }
                i=i+1;
               //out.print("isFormField : "+valueDecoded+"<br>");
	   } 
           }
           
           
           
           
	   Iterator itr = items.iterator();
           
	   while (itr.hasNext()) {
	   FileItem item = (FileItem) itr.next();
           
	   if (item.isFormField()) {
               String name = item.getFieldName();
               String value = item.getString();
               //value = URLDecoder.decode( value, "UTF-8" );
               String valueDecoded = new String (value.getBytes ("iso-8859-1"), "UTF-8");
               detailList.add(valueDecoded);
               //out.print("isFormField : "+valueDecoded+"<br>");
	   } else {
		   try {
                        String name = items.get(2).toString();
                        String value = item.getName();
                        
                        reportList.add(value);
                        out.print("!isFormField : "+value+"<br>");
                        //out.print(item.getOutputStream());
                        out.print("isFormField : "+name_folder+"<br>");
                        
                        
                        String strProjectDir = ""; 
                        strProjectDir = getServletContext().getRealPath("/")+"upload"+"\\"+name_folder+"\\"; //create directory if exist
                        File ProjectDir = new File(strProjectDir);
                        out.print(getServletContext().getRealPath("/")+"upload"+"\\"+name_folder+"\\<br>");
                        if(! ProjectDir.exists())
                        {
                            ProjectDir.mkdir();
                            out.print("make dir");
                        }
			    String itemName = item.getName();
			    File savedFile = new File(getServletContext().getRealPath("/")+"upload"+"\\"+name_folder+"\\"+itemName); //set follow category folder
                            item.write(savedFile);
                            
		           out.println("Your file has been saved at the loaction: "+getServletContext().getRealPath("/")+"upload"+"\\"+name_folder+"\\"+itemName+"<br><br>");
                           //out.println(itemName+" "+request.getParameter("category"));
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	   }
	   }
   }
             

         for(int i=0;i<reportList.size();i++){
              //out.print(reportList.get(i)+"<br>");
         }
         for(int i=0;i<detailList.size();i++){
              //out.print(detailList.get(i)+"<br>");
         }
        out.print("<form action='UploadServlet'>");
        out.print("<input type='hidden' name='category' value='"+detailList.get(0).toString()+"'>");
        out.print("<input type='hidden' name='detail' value='"+detailList.get(1).toString()+"'>");
        out.print("<input type='hidden' name='name_folder' value='"+detailList.get(2).toString()+"'>");
        out.print("<input type='hidden' name='jrxml' value='"+reportList.get(0).toString()+"'>");
        out.print("<input type='hidden' name='jasper' value='"+reportList.get(1).toString()+"'>");
        out.print("<input type='submit' value='ตกลง'>");
        out.print("<form>");
       //response.sendRedirect("/WebApplication3/index.jsp?detail="+URLEncoder.encode(reportList.get(2).toString(), "UTF-8")+"&category="+ URLEncoder.encode(reportList.get(1).toString(), "UTF-8"));
      
   %>
   
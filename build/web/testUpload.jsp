<%@ page import="java.util.List" %>
   <%@ page import="java.util.Iterator" %>
   <%@ page import="java.io.File" %>
   <%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
   <%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
   <%@ page import="org.apache.commons.fileupload.*"%>
   <%@ page contentType="text/html;charset=UTF-8" language="java" %>
   

   <%
       request.setCharacterEncoding("UTF-8");
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
	   Iterator itr = items.iterator();
	   while (itr.hasNext()) {
	   FileItem item = (FileItem) itr.next();
	   if (item.isFormField()) {
	   } else {
		   try {
                       String strProjectDir = ""; 
                        strProjectDir = getServletContext().getRealPath("/")+"upload/g2/"; //create directory if exist
                        File ProjectDir = new File(strProjectDir);
                        if(! ProjectDir.exists())
                        {
                            ProjectDir.mkdir();
                        }
			   String itemName = item.getName();
			   File savedFile = new File(getServletContext().getRealPath("/")+"upload/g2/"+itemName); //set follow category folder
                            item.write(savedFile);
                            
		           out.println("Your file has been saved at the loaction: "+strProjectDir+itemName+"<br><br>");
                           out.println(itemName+" "+request.getParameter("category"));
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	   }
	   }
   }
   %>
   
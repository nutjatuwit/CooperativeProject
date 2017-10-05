
/**
 * UploadServlet.java
 * Copyright (C) 2012 by www.codejava.net
 */

import java.io.File;  
import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.Iterator;   
import java.util.List;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.apache.commons.fileupload.FileItem;  
import org.apache.commons.fileupload.FileItemFactory;  
import org.apache.commons.fileupload.FileUploadException;  
import org.apache.commons.fileupload.disk.DiskFileItemFactory;  
import org.apache.commons.fileupload.servlet.ServletFileUpload;  

public class UploadServlet extends HttpServlet 
{  

private static final long serialVersionUID = 1L;

    @Override  
      protected void doPost(HttpServletRequest request, HttpServletResponse response)  
          throws ServletException, IOException 
          {  
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);  
            response.setContentType("text/html");  
            PrintWriter out = response.getWriter();  
            if (isMultipart) 
            {  
                // Create a factory for disk-based file items  
                FileItemFactory factory = new DiskFileItemFactory();  
                // Create a new file upload handler  
                ServletFileUpload upload = new ServletFileUpload(factory);  
                try 
                {  
                    // Parse the request  
                    List items = upload.parseRequest(request);  
                    Iterator iterator = items.iterator();  
                    while (iterator.hasNext()) 
                    {  
                        FileItem item = (FileItem) iterator.next();  
                        if (!item.isFormField())  
                        {  
                            String fileName = item.getName();      
                            String root = getServletContext().getRealPath("/");  
                            File path = new File(root + "/uploads");  
                            if (!path.exists())  
                            {  
                                boolean status = path.mkdirs();  
                            }  
                            File uploadedFile = new File(path + "/" + fileName);  
                            System.out.println(uploadedFile.getAbsolutePath());  
                        if(fileName!="")  
                            item.write(uploadedFile);  
                        else  
                        out.println("file not found");  
                        out.println("<h1>File Uploaded Successfully....:-)</h1>");  
                    }  
                    else  
                    {  
                        String abc = item.getString();  
                        out.println("<br><br><h1>"+abc+"</h1><br><br>");  
                    }  
                }  
            } 
            catch (FileUploadException e) 
            {  
            out.println(e);  
            } 
            catch (Exception e) 
            {  
            out.println(e);  
            }  
        }  
        else  
        {  
            out.println("Not Multipart");  
        }  
      }  
}
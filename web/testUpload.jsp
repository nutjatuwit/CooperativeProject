<%-- 
    Document   : testUpload
    Created on : Oct 4, 2017, 10:25:05 AM
    Author     : NUT
--%>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<html>
<head>
	<title>ThaiCreate.Com JSP Tutorial</title>
</head>
<body>
<%
        request.setCharacterEncoding("UTF-8");
        
    //to get the content type information from JSP Request Header
	String contentType = request.getContentType();
	//here we are checking the content type is not equal to Null and
        //out.print(contentType);
	if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {
		DataInputStream in = new DataInputStream(request.getInputStream());
		//we are taking the length of Content type data
		int formDataLength = request.getContentLength();
                //out.print(formDataLength);
		byte dataBytes[] = new byte[formDataLength];
		int byteRead = 0;
		int totalBytesRead = 0;
		//this loop converting the uploaded file into byte code
		while (totalBytesRead < formDataLength) {
			byteRead = in.read(dataBytes, totalBytesRead,formDataLength);
			totalBytesRead += byteRead;
		}
		String file = new String(dataBytes);
                //out.print(file);
		//for saving the file name
		String saveFile = file.substring(file.indexOf("filename=\"") + 10);
                 //out.print(file.substring(file.indexOf("filename=\"")));
		saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
                //out.print(saveFile+"<br>");
		saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\""));
                //out.print(saveFile+"<br>");
		int lastIndex = contentType.lastIndexOf("=");
		String boundary = contentType.substring(lastIndex + 1,contentType.length());
		int pos;
		//extracting the index of file 
		pos = file.indexOf("filename=\"");
                //out.print(pos+"<br>");
		pos = file.indexOf("\n", pos) + 1;
                //out.print(pos+"<br>");
		pos = file.indexOf("\n", pos) + 1;
                //out.print(pos+"<br>");
		pos = file.indexOf("\n", pos) + 1;
               // out.print(pos+"<br>");
		int boundaryLocation = file.indexOf(boundary, pos) - 4;
                //out.print(boundaryLocation+"<br>");
		int startPos = ((file.substring(0, pos)).getBytes()).length;
                //out.print(startPos+"<br>");
		int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
                //out.print(endPos+"<br>");
		// creating a new file with the same name and writing the content in new file

		String savePath = application.getRealPath("//upload/"+saveFile);
                //String savePathJasper = application.getRealPath("//upload/"+saveFile.split("\\.")[0]+".jasper");
                //out.print(saveFile.split("\\.")[1]);
		//out.print(savePath+"<br>");
		//out.println("Upload file Successfully.<br>");
		//out.println(savePath);
		//out.println("Save to : " + savePath);
		
		FileOutputStream fileOut = new FileOutputStream(savePath);
                //FileOutputStream fileOutJasper = new FileOutputStream(savePathJasper);
                //fileOutJasper.write(dataBytes);
		fileOut.write(dataBytes, startPos, (endPos - startPos));
		fileOut.flush();
                //fileOutJasper.flush();
                //out.println("Upload file Successfully.<br>");
		fileOut.close();
                //fileOutJasper.close();
	}
%>	
</body>
</html>
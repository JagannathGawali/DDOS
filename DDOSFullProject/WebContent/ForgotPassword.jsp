<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
 if(request.getSession(false).getAttribute("uid")==null)
 {
 	response.sendRedirect("Login.jsp");
 }
    %>
<div>
<br>
<h3>Account Help</h3>
Get a verification code on my phone:<br>
Enter Mobile Number:<input type="text" id="contact" name="contact" ><br><br>
&nbsp;&nbsp;<input type="button" value="Continue">
</div>
</body>
</html>
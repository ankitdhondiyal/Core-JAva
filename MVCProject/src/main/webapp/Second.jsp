<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String name=(String)request.getParameter("fname"); //scriptlet tag%>
<%= name %><br><!-- expression tag -->
<%String lname =(String)request.getParameter("lname"); %>
<%=lname %><br>
<%String email =(String)request.getParameter("email"); %>
<%String psw =(String)request.getParameter("psw"); %>
<%String Dob =(String)request.getParameter("dob"); %>
<%String html =(String)request.getParameter("Lang1"); %>
<%String css =(String)request.getParameter("Lang2"); %>
<%String javascript =(String)request.getParameter("Lang3"); %>
<%String gender =(String)request.getParameter("Gender"); %>
<%= email %><br>
<%= psw %><br>
<%= Dob %><br>
<%= html %><br>
<%= css %><br>
<%= javascript %><br>
<%= gender %>





</body>
</html>
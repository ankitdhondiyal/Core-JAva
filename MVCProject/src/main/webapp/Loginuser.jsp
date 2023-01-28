<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="userctl" method="post">
<center>
<h1 style="color: darkred;">Login Page</h1>
<%
String msg = (String) request.getAttribute("errr");
            if(msg!=null){
            
%>
<h1 align = "center"> <font style ="color:red"><%=msg %></font></h1>
<%} %>

 <table>
<tr><th> Email</th><td><input type="email" name="email" placeholder="Enter your email" ></td> </tr>
<tr><th>Password</th><td><input type="password" name= "password" placeholder="Enter your password"> </td> </tr>

</table><br>
	<input type="submit" value="SignUp"></td></tr>

</center>
</form>
</body>
</html>
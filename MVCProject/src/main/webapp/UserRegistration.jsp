<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body bgcolor="lightpink">
<%@ include file = "Header.jsp" %>

<center>
<h1 style="color: darkred;">Registration Form</h1>
<table>
<form action="userctl" method="get">
<tr><th>FirstName</th><td> <input type="text" name="fname" placeholder ="enter your Fname" required ></tr>
<tr><th>LastName</th><td> <input type="text" name="lname" placeholder="Enter your Lname" > </tr>
<tr><th>Email </th><td><input type="email" name ="email"placeholder="Enter your Email"></tr>
<tr><th> Password </th><td><input type="password" name="psw" placeholder="Enter your password"></tr>
<!--  <tr><th> DateOfBirth </th><td><input type="date" name="Date" placeholder="Enter date"></tr>-->


</table><br>
	
	
<td><input type="submit" value="Insert" name="Operation"></td>
<td><input type="submit" value="Update" name="Operation"></td>
<td><input type="submit" value="Delete" name="Operation"></td>

</center>
 </form>
 
</body>
  <%@include file="Footer.jsp" %>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Registration Form</h1>
<table>
<form action="Second.jsp" method="get">

<tr><th>FirstName</th><td> <input type="text" name="fname" placeholder ="enter your Fname" required ></tr>
<tr><th>LastName</th><td> <input type="text" name="lname" placeholder="Enter your Lname" > </tr>
<tr><th>Email </th><td><input type="email" name ="email"placeholder="Enter your Email"></tr>
<tr><th> Password </th><td><input type="password" name="psw" placeholder="Enter your password"></tr>
<tr><th>DateOfBirth</th><td> <input type="date" name="dob"> </tr> 

</table>

<input type ="checkbox" name="Lang1" value="html">HTML <!-- Check box for select multiple thing -->
<input type ="checkbox" name="Lang2" value="css">CSS
<input type ="checkbox" name="Lang3" value="javascript">JAVASCRIPT<br>
<b>Gender<input type="radio" value="male" name="Gender">Male
<input type ="radio" value="female" name ="Gender">Female<br> <br>

	<input type="submit" value="SignUp">

</form>
</center>
</body>
</html>

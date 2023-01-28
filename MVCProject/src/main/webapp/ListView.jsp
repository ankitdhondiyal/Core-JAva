<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@page import="in.co.rays.userbean.UserBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <form action="Listview" method="get">
 -->
 
<jsp:useBean id="bean" class="in.co.rays.userbean.UserBean"
		scope="request"></jsp:useBean>
	
		<%
			List list = (List) request.getAttribute("list");
		%>

		<center>
			<div align="center">
				<h1>User List</h1>
				
			</div>
			<%

				Iterator<UserBean> it = list.iterator();
			if(list!=null){

				%>
			
			<br>

			<table border="1" width="100%" align="center" cellpadding=6px
				cellspacing=".2">
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Login Id</th>
					<th>Password</th>
					
					
				</tr>




				<%
					while (it.hasNext()) {
							UserBean usb = (UserBean)it.next();
				%>
				
				<tr align="center">
					
					<td><%=usb.getId()%></td>
					<td><%=usb.getName()%></td>
					<td><%=usb.getLname()%></td>
					<td><%=usb.getEmail()%></td>
						<td><%=usb.getPassword()%></td>
						<%} %>
					
					<%
						}
					%>


			

				</tr>
				</table>
					
</body>
</html>
<%@page import="com.ty.StudentDTO.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>


	<%
	List<Student> list = (List)request.getAttribute("students");
	%>


	<table border="2px">
		<tr>
			<th>id</th>
			<th>email</th>
			<th>name</th>
			<th>phone</th>
			<th>password</th>
			<th>view</th>
		</tr>
		<%
		for (Student student : list){
		%>
		<tr>
			<td><%= student.getId() %></td>
			<td><%= student.getName() %></td>
			<td><%= student.getEmail() %></td>
			<td><%= student.getPhone() %></td>
			<td><%= student.getPassword() %></td>
			<td><a href="view?id=<%= student.getId() %>">view</a></td>
			<td><a href="delete?id=<%= student.getId() %>">Delete</a></td>
			
		</tr>
		
		<%} %>

	</table>
</body>
</html>
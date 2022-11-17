<%@page import="com.ty.StudentDTO.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Student student =(Student) request.getAttribute("student");%> 

<h2>NAME:<%= student.getName() %> </h2>
<h2>email:<%= student.getEmail()  %> </h2>
<h2>PASSWORD:<%= student.getPassword()%> </h2>

</body>
</html>
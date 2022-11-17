<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGNIN PAGE</title>
</head>
<body>

<% String message =(String) request.getAttribute("message"); %>
<h1>
<% if(message !=null){ %>
    <%= message %>

<%} %>
</h1>

<form action="signin" method="post">
<table>
<tr>
<td><label for="name">NAME</label></td>
<td><input type="text" placeholder="enter ur name" name="name"></input>
</td>
<td></td>
</tr>
<tr>
<td><label for="name">PHONE</label></td>
<td><input type="tel" placeholder="enter ur phonenumber" name="phone"></input>
</td>
<td></td>
</tr>
<tr>
<td><label for="email">EMAIL</label></td>
<td><input type="text" placeholder="enter ur email" name="email"></input>
</td>
<td></td>
</tr>

<tr>
<td><label for="password">PASSWORD</label></td>
<td><input type="password" placeholder="enter ur password" name="password"></input>
</td>
<td></td>
</tr>

<tr>
<td><input type="submit"></input></td>
</tr>

</table>

</form>
</body>
</html>
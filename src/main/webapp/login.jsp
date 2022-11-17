<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% String invalid = (String)request.getAttribute("invalid"); %>

<% if(invalid !=null){ %>
    <%= invalid %>

<%} %>

<form action="login" method="post">
<table>
<tr>
<td><label for="email">EMAIL</label></td>
<td><input type="text" placeholder="enter ur email" name="email"></input>
</td>
<td></td>
</tr>

<tr>
<td><label for="password">PASSWORD</label></td>
<td><input type="text" placeholder="enter ur name" name="password"></input>
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
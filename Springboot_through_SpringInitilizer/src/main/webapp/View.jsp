<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:orange;">
<h1 align="center" style="color:purple;">STUDENT LIST</h1>
<table border="3px" align="center">
<tr>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>EMAIL</th>
<th>ACTION</th>
</tr>
<c:forEach items="${ad}" var="s">
<tr>
<td>${s.id }</td>
<td>${s.name }</td>
<td>${s.addr }</td>
<td>${s.email}</td>
<td><a href="edit?id=${s.id}"><button style="background-color:blue;">EDIT</button></a> &nbsp; &nbsp;<a href="delete?id=${s.id}"><button style="background-color:red;" >DELETE</button></a></td>
</tr>
</c:forEach>
</table>
<h2 align="center">
<a href="home">HOME</a>

</h2>
</body>
</html>
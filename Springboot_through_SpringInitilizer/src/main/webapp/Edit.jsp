<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:orange;">
<h1 align="center" style="color:purple;">STUDENT DATA UPDATE</h1>
<per >
<form action="update" method="post" align="center">
<input type="hidden" name="id" value="${stu.id }"><br><br>
NAME : <input type="text" name="name" value="${stu.name }"><br><br>
ADDRESS :<input type="text" name="addr" value="${stu.addr }"><br><br>
EMAIL :<input type="text" name="email" value="${stu.email }"><br><br>
<input type="submit" value="UPDATE">

</form>
</per>
</body>
</html>
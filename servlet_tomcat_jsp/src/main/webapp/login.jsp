<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
	<form action = "login" method = "post">
	
	<label for ="login">login :</label><input name="login">
	<label for ="password">Password :</label><input name="password">
	<input type ="submit" value = "submit">
	</form>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
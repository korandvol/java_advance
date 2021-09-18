<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
</head>

<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<form action = "registration" method = "post">
	<label for ="firstName">First name :</label><input name="firstName">
	<label for ="lastName">Last name :</label><input name="lastName">
	<label for ="email">Email :</label><input name="email">
	<label for ="password">Password :</label><input name="password">
	<input type ="submit" value = "submit">
	</form>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
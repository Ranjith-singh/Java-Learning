<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>error</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="container p-3 text-center">
		<img src="img/error.jpeg" class="img-fluid" style="width: 400px"/>
		<h1 class="display-3">Sorry! Something went wrong</h1>
		<h3><%=exception %></h3>
		<a class="btn btn-outline-primary" href="exception_handling.html">home</a>
	</div>
</body>
</html>
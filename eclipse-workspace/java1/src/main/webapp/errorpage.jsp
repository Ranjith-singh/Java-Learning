<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>error</title>
<style>
	*{
	padding: 0px;
	margin: 0px;	
	}
</style>
</head>
<body>
	<div style="background-color: gray; padding: 20px">
		<h2>
		Something went wrong....
		<br>
		<%= exception %>
		</h2>
	</div>
</body>
</html>
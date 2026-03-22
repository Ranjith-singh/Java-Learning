<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="t" uri="/WEB-INF/mylib.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<t:mytag></t:mytag>
		<hr>
		<t:print_table num="10" color="blue">hello bro</t:print_table>
		<hr>
		<t:print_table num="20" color="red"></t:print_table>
		<hr>
		<t:print_table color="green" num="30"></t:print_table>
	</h1>
</body>
</html>
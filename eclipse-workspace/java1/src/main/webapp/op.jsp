<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="/excep.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		int a=Integer.parseInt(s1),b=Integer.parseInt(s2);
	%>
	<h1>Result is : <%= a/b %></h1>
</body>
</html>
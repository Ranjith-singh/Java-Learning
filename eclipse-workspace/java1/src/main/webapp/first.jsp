<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page import="java.util.*,java.io.*" errorPage="/errorpage.jsp" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	*{
		margin: 0px;
		padding: 0px;
	}
</style>
</head>
<body style="background-color: grey;">

	<%@include file="header.jsp" %>
	<h1>this is a jsp page</h1>
	
	<%!
		// decalration of variables and methods
		public int a=10,b=20,c=0;
		String s="vector";
		String s1=null;
		public static int add(int a,int b)
		{
			return a+b;
		}
		public static String reverse(String s)
		{
			StringBuffer sb=new StringBuffer(s);
			return sb.reverse().toString();
		}
		public static int div(int a,int b)
		{
			return a/b;
		}
	%>
	
	<%
		//scriplet tag for scripting elements
		Random r=new Random();
		out.println("the sum of "+a+" + "+b+" is "+add(a,b));
		out.println("<br>");
		out.println("reverse of "+s+" is "+reverse(s));
	%>
	
	<h1 style="color : red;">
	sum is : <%=add(a,b)%>
	<br>
	reverse is :<%= reverse(s)%>
	<br>
	random number between 1 and 10 : <%= r.nextInt(1,10) %> 
	<br>
	division is :<%= div(a,c)%>
	<br>
	String length :<%= s1.length() %>
	</h1>
	<hr>
	<c:set var="name" value="rahul"></c:set>
	<c:out value="${name}"></c:out>
	<c:if test="${3>2}">
		<h1>this is a true block</h1>
	</c:if>
	<c:out value="${34+56}"></c:out>
</body>
</html>
<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"--%>
                <%--pageEncoding="ISO-8859-1" %>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>Home page</title>
</head>
<body>
<%@include file="utils/topNavBig.jsp"%>
<h1>Home page</h1>

<p>
    Welcome to "The mutherfucking Shop application".<br/>
    <i>${message}</i><br/>
    <a href="${pageContext.request.contextPath}/shop/create.html">Create a new shop</a><br/>
    <a href="${pageContext.request.contextPath}/shop/list.html">View all shops</a><br/>
    <a href="${pageContext.request.contextPath}/runner/create">Add a new user</a><br/>
    <a href="${pageContext.request.contextPath}/runner/list">View all User</a><br/>
    <a href="${pageContext.request.contextPath}/websocket/SockJsExample">View all User</a><br/>
</p>
</body>
</html>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Customer</title>
	</head> 
	<body>
		<h2>Customer</h2>
		<ol style="list-style-type: none;">
		<li><c:out value="${customer.name}"/></li>
		<li><c:out value="${customer.age}"/></li>
		<li><c:out value="${customer.address}"/></li>
		</ol>
	</body>
</html>


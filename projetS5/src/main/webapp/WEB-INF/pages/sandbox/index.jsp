<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head>
	<body>
		<c:url value="/showMessage" var="messageUrl" />
		<c:url value="/showCustomer" var="customerUrl" />
		<c:url value="/form" var="formUrl" />
		<a href="${messageUrl}">Show Message</a>
		<a href="${customerUrl}">Customer</a>
		<a href="${formUrl}">form</a>
	</body>
</html>


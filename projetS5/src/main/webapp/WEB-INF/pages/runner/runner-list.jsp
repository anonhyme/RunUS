<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="../utils/taglib.jsp" %>

<link href="<c:url value="/resources/theme/bootstrap/css/bootstrap.css" />" media="screen" rel="stylesheet">
<link type="text/css" media="screen" href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/resources/theme/bootstrap/js/bootstrap.min.js"/>"></script>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>User List</title>
</head>
<body>
<div class="container-fluid">
    <h1>User List</h1>

    <i>${message}</i><br/>
    <table style="text-align: center;" border="1px" cellpadding="0" cellspacing="0">
        <thead>
        <tr>
            <th>id</th>
            <th width="150px">User name</th>
            <th width="75px">height</th>
            <th>Last Run</th>
            <th width="75px">Statistic</th>
            <th width="60px">actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="runner" items="${runnerList}">
            <tr>
                <td>${runner.id}</td>
                <td>${runner.name}</td>
                <td>${runner.runnerHeight}</td>
                <td>${runner.lastRunStat}</td>
                <td>${runner.runnerAvgSpeed}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/runner/edit/${runner.id}.html">Edit</a><br/>
                    <a href="${pageContext.request.contextPath}/runner/delete/${runner.id}.html">Delete</a><br/>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="${pageContext.request.contextPath}/">Home page</a>
</div>
</body>
</html>
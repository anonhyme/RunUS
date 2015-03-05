<%--
  Created by IntelliJ IDEA.
  User: antoine
  Date: 11/30/2014
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<link href="<c:url value="/resources/theme/bootstrap/css/bootstrap.css" />" media="screen" rel="stylesheet">
<link href="<c:url value="/resources/theme/custom.css" />" media="screen" rel="stylesheet">
<script type="text/javascript" src="<c:out value="/resources/theme/bootstrap/js/bootstrap.min.js"/>"></script>
<link type="text/css" media="screen" href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
      rel="stylesheet">

<html>
<body>

<div class="nav-side-menu">
    <div class="brand">Brand Logo</div>
    <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>

    <div class="menu-list">
        <ul id="menu-content" class="menu-content panel-collapse">
            <li>
                <a href="#">
                    <i class="fa fa-dashboard fa-lg"></i> Dashboard
                </a>
            </li>

            <li data-toggle="collapse" data-target="#products" class="collapse active">
                <a href="#"><i class="fa fa-gift fa-lg"></i> UI Elements <span class="arrow"></span></a>
            </li>


            <%--
                        <li data-toggle="collapse" data-target="#service" class="collapsed">
                            <a href="#"><i class="fa fa-globe fa-lg"></i> Services <span class="arrow"></span></a>
                        </li>
            --%>

            <%--            <ul class="sub-menu collapse" id="service">
                            <li>New Service 1</li>
                            <li>New Service 2</li>
                            <li>New Service 3</li>
                        </ul>--%>

            <%--           <li data-toggle="collapse" data-target="#new" class="collapsed">
                        <a href="#"><i class="fa fa-car fa-lg"></i> New <span class="arrow"></span></a>
                    </li>
                 <ul class="sub-menu collapse" id="new">
                        <li>New New 1</li>
                        <li>New New 2</li>
                        <li>New New 3</li>
                    </ul>--%>


            <li>
                <a href="#">
                    <i class="fa fa-user fa-lg"></i> Profile
                </a>
            </li>

            <li>
                <a href="#">
                    <i class="fa fa-users fa-lg"></i> Users
                </a>
            </li>
        </ul>
    </div>
</div>
</body>
</html>

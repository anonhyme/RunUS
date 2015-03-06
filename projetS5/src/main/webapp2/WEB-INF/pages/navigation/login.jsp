<%--
  Created by IntelliJ IDEA.
  User: antoine
  Date: 3/5/2015
  Time: 12:28 PM
  To change this template use File | Settings | File Templates.
--%>

<%--<html>--%>
<%--<head>--%>
<%--<title></title>--%>
<%--</head>--%>
<%--<body>--%>
<%@include file="/resources/utils/taglib.jsp" %>
<link href="<c:url value="/resources/theme/login.css" />" media="screen" rel="stylesheet">

<div class="container">
    <div class="row" id="pwd-container">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <section class="login-form">
                <form method="post" action="#" role="login">
                    <h1 class="text-center">RunUs</h1>
                    <input type="email" name="email" placeholder="User name" required class="form-control input-lg"/>

                    <input type="password" class="form-control input-lg" id="password" placeholder="Password"
                           required=""/>

                    <div class="pwstrength_viewport_progress"></div>

                    <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">Sign in</button>
                    <div>
                        <a href="#">Create account</a> or <a href="#">reset password</a>
                    </div>

                </form>

                <div class="form-links">
                    <a href="/">www.runUs.io</a>
                </div>
            </section>
        </div>
        <div class="col-md-4"></div>
    </div>

    <p>
        <!-- password validator -->
        <a href="http://validator.w3.org/check?uri=http%3A%2F%2Fbootsnipp.com%2Fiframe%2FW00op" target="_blank">
            <small>HTML</small>
            <sup>5</sup></a>
        <br>
        <br>
    </p>
    <%@include file="/resources/utils/javascript.jsp" %>

</div>

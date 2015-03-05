
<%@ include file="taglib.jsp"%>
<%--http://www.vizio.com/fr-ca/--%>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<link href="<c:url value="/resources/theme/bootstrap/css/bootstrap.css" />" media="screen" rel="stylesheet">
<link href="<c:url value="/resources/theme/custom.css" />" media="screen" rel="stylesheet">
<link href="<c:url value="/resources/theme/customTopNavBig.css" />" media="screen" rel="stylesheet">
<script type="text/javascript" src="<c:out value="/resources/theme/bootstrap/js/bootstrap.min.js"/>"></script>

<header id="master-header" class="master-header">
    <div class="container">
        <div class="row">
            <div class="col-sm-8">
                <nav id="site-nav" class="site-nav">
                    <ul>
                        <li id="nav-logo" class="nav-item-1">
                            <a class="nav-link">
                                <span class="glyphicon glyphicon-home" style="font-size: xx-large"/>
                            </a>
                        </li>
                        <li id="nav-home" class="nav-item-2">
                            <a class="nav-link" href="${Home}">Home</a>
                        </li>
                        <li id="nav-form" class="nav-item-3">
                            <a class="nav-link" href="#">Form</a>
                        </li>
                        <li id="nav-ajax" class="nav-item-4">
                            <a class="nav-link" href="${Ajax}">Ajax</a>
                        </li>
                        <li id="nav-customer" class="nav-item-5">
                            <a class="nav-link" href="#customer">Customer</a>
                        </li>
                        <li id="nav-item-shop" class="nav-item-6">
                            <a class="nav-link" href="${Bootstrap}">Bootstrap</a>
                        </li>

                    </ul>
                </nav>
            </div>
        </div>
    </div>
</header>


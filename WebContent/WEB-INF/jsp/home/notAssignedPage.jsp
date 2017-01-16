<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<link
	href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/css/font-awesome.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/css/animate.css" />"
	rel="stylesheet">
<link id="loadBefore"
	href="<c:url value="/resources/css/style.css" />"
	rel="stylesheet">
<link id="loadBefore"
	href="<c:url value="/resources/css/common.css" />"
	rel="stylesheet">

<title>SHMS</title>
</head>
<body>
<div id="wrapper">
 
 <div class="container col-xs-4 col-xs-offset-4 text-center p-md">
 <span class="text-navy">
<marquee><h3> <label class="label label-danger">Not Configured</label></h3></marquee>
</span>
</div>
</div>
<script src="<c:url value="/resources/js/jquery-2.1.1.js" />"></script>
<script src="<c:url value="/resources/js/home/notAssigned.js" />"></script>

</body>
</html>
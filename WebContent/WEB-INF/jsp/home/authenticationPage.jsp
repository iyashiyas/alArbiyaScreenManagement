
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv='cache-control' content='no-cache'>
<meta http-equiv='expires' content='0'>
<meta http-equiv='pragma' content='no-cache'>
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
<body  >
	 
	<div class="middle-box text-center loginscreen animated fadeInDown">
		<div>
			<div>
				<h3 class="logo-name"> 
					<spring:message code="label.login.shms" />
				 
				</h3>
			</div>    
			<p>
				<spring:message code="label.RoomNumber" />:
				<label id="autheroom" class="label label-primary"></label>
			</p>
			<p>
				<c:forEach items="${error}" var="message">
					<c:if test="${error=='error'}">
						<label class="label label-danger"><spring:message code="label.Login.errorLogin" /></label>
					</c:if>
				</c:forEach>
			</p>
    <form action="checkAuthenticationPassword" method="get">
    <input type="hidden" name="roomId" value="" class="roomId">
				<div class="form-group">
				 <div class="col-lg-12">
				 <div class="col-lg-10">
					<input type="Number" name="password" class="form-control"
						placeholder="<spring:message code="label.Password" />"
						required="required"></div> <div class="col-lg-2">
						<button type="submit" class="btn btn-primary">Login</button>
				</div>
				</div>
				</div> 
				</form>
			<p class="m-t">
				<small> <spring:message
						code="label.AlArabiyaDepthForAdvancedProjectLtd" /> &copy; <spring:message
						code="label.2016" /></small>
			</p>
		</div>
	</div> 
	<!-- end captcha --> 
	<script src="<c:url value="/resources/js/jquery-2.1.1.js"/>"></script>
	<script src="<c:url value="/resources/js/jquery-ui-1.10.4.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	 	<script src="<c:url value="/resources/js/header/header.js" />"></script>
</body>
</html>

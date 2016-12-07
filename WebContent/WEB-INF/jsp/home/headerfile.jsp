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

	
		<div class="row border-bottom">
			<nav class="navbar navbar-static-top" role="navigation"
				style="margin-bottom: 0">
				<div class="navbar-header">Hotel Management Software</div>
				<ul class="nav navbar-top-links navbar-right">
					<li><span class="m-r-sm text-muted welcome-message"><spring:message code="label.Welcome" />
							Mr.Customer Name</span></li>

					<li class="dropdown"><a class="dropdown-toggle count-info"
						data-toggle="dropdown" href="#"> <i class="fa fa-bell"></i> <span
							class="label label-primary">0</span>
					</a>
						<ul class="dropdown-menu dropdown-alerts">
							<li>
							<li class="divider"></li>
							<li><a>
									<div>
										<i class="fa fa-twitter fa-fw"></i><spring:message code="label.YourOrderAccept" /><span
											class="pull-right text-muted small">12 <spring:message code="label.MinutesAgo" /></span>
									</div>
							</a></li>

							<li class="divider"></li>
							<li>
								<div class="text-center link-block">
									<a href="notifications.html"> <strong><spring:message code="label.SeeAllAlerts" /></strong> <i class="fa fa-angle-right"></i>
									</a>
								</div>
							</li>
						</ul></li>


					<li><a> <i class="fa fa-sign-out"></i> <spring:message code="label.CheckOut" />
					</a></li>
				</ul>

			</nav>
		</div>
 
	<script src="<c:url value="/resources/js/jquery-2.1.1.js" />"></script>
	<script src="<c:url value="/resources/js/jquery-ui-1.10.4.min.js" />"></script>

	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/navbar.js" />">
		
	</script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/slimscroll/jquery.slimscroll.min.js" />"></script>
	<!-- Custom and plugin javascript -->
	<script src="<c:url value="/resources/js/inspinia.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/pace/pace.min.js" />"></script>
	<!-- iCheck -->
	<script src="<c:url value="/resources/js/plugins/iCheck/icheck.min.js" />"></script>

	<!-- Date Time Picker -->
	<script src="<c:url value="/resources/js/plugins/dateTimePicker/moment.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/dateTimePicker/bootstrap-datetimepicker.js" />"></script>
<script src="<c:url value="/resources/js/custom.js" />"></script>


</body>
</html>

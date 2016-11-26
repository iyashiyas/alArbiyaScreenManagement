<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/specialStyle/specialStyle.css" /> ">
<title>SHMS</title>
</head>
<body>
	<div id="wrapper">
		<jsp:include page="../home/headerfile.jsp"></jsp:include>
		
  <nav class="navbar-primary   navbar-static-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav metismenu" id="side-menu">
  
  	<li><a><i class="fa fa-th-large"></i> <span
	  class="nav-label">Indian</span> </a></li>
	  <li><a><i class="fa fa-th-large"></i> <span
	  class="nav-label">Chinese</span> </a></li>
	  <li><a><i class="fa fa-th-large"></i> <span
	  class="nav-label">West</span> </a></li>
  	</ul>
  	</div>
  	</nav>
  	
  	<div id="page-wrapper" class="bg-custom">
  
		<div class="wrapper wrapper-content row animated fadeInRight">
			<div class="ibox-tools">
				<a class="btn btn-primary" onclick="goBack()">Back To Home</a>
			</div>
			<div class="col-md-10">

				<div class="row ">

					<div class="col-lg-3 col-lg-offset-1 w3ls-special-img"
						style="background-image: url('../../resources/img/e2.jpg');">
						<div class="wpf-demo-6">
							<div class="w3ls-special-text">
								<p>
									<sub>sar</sub>125
								</p>
							</div>
							<figcaption class="view-caption">
								<h4>Coffee 1</h4>
								<a href="#addToOrder" data-toggle="modal"> Order </a>
							</figcaption>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	</div>

	<div class="modal fade" id="addToOrder" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">Request Form</div>
				<div class="modal-body">
					<jsp:include page="../restaurant/restaurantOrder.jsp"></jsp:include>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
					<button id="submit" type="submit" class="btn btn-success success">Request
						Order</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

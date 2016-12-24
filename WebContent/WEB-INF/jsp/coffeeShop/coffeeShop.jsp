<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/specialStyle/specialStyle.css" />">
<title>SHMS</title>
</head>
<body>
	<div id="wrapper">
		<jsp:include page="../home/headerfile.jsp"></jsp:include>

		<nav class="navbar-primary  navbar-static-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav metismenu" id="side-menu">
					<c:forEach items="${uniqueParentCategories}"
						var="uniqueParentCategories"> 
					<li><a><i class="fa fa-th-large"></i> <span
								class="nav-label">${uniqueParentCategories.serviceGroupName}</span> </a></li>
			 
					</c:forEach>
				</ul>
			</div>
		</nav>
		<div id="page-wrapper" class="bg-custom">
			<div class="wrapper wrapper-content row animated fadeInRight">
				<div class="ibox-tools">
					<a class="btn btn-primary" onclick="goBack()"><spring:message
							code="label.BackToHome" /></a>
				</div>
				<div class="col-md-10">
					<div class="row ">
						<c:forEach items="${getHotelServiceItems}"
							var="getHotelServiceItems">
							<div class="col-lg-3 col-lg-offset-1 w3ls-special-img"
								style="background-image: url('<c:out value="${getHotelServiceItems.imageUrlName}" />');">
								<div class="wpf-demo-6">
									<div class="w3ls-special-text">
										<p>
											<sub>sar</sub>125
										</p>
									</div>
									<figcaption class="view-caption">
										<h4>${getHotelServiceItems.serviceItemName}</h4>
										<a href="#addToOrder" data-toggle="modal"> <spring:message
												code="label.Order" />
										</a>
									</figcaption>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade" id="addToOrder" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">

			<jsp:include page="../coffeeShop/coffeeOrder.jsp"></jsp:include>

			<button type="button" class="btn btn-default" data-dismiss="modal">
				<spring:message code="label.Cancel" />
			</button>
			<button id="submit" type="submit" class="btn btn-success success">
				<spring:message code="label.RequestOrder" />
			</button>
		</div>
	</div>


</body>
</html>

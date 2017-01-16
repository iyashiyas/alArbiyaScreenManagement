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
	href="<c:url value="/resources/css/touchspin/jquery.bootstrap-touchspin.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/dateTimePicker/bootstrap-datetimepicker.css" />"> 
<title>SHMS</title>
</head>
<body> 
		<jsp:include page="../home/headerfile.jsp"></jsp:include>
		<div class="container"> 
			<div class="col-md-10 col-md-offset-1">
				<div class="wrapper wrapper-content animated fadeInRight">
					<div class="row center-block">
						<a href="#language" data-toggle="modal">
							<div class="col-lg-4 col-md-offset-1">
								<div class="widget style1 lazur-bg">
									<div class="row">
										<div class="col-xs-4">
											<i class="fa fa-language fa-3x"></i>
										</div>
										<div class="col-xs-8 text-right">
											<span> <spring:message code="label.Language" />
											</span>
											<h4>
												<spring:message code="label.ChooseLanguage" />
											</h4>
										</div>
									</div>
								</div>
							</div>
						</a> 
						
							<a href="#checkout" data-toggle="modal">
							<div class="col-lg-4 col-md-offset-1">
								<div class="widget style1 lazur-bg">
									<div class="row">
										<div class="col-xs-4">
											<i class="fa fa-sign-out fa-3x"></i>
										</div>
										<div class="col-xs-8 text-right">
											<span> <spring:message code="label.CheckOut" />
											</span>
											<h4>
												<spring:message code="label.CheckOut" />
											</h4>
										</div>
									</div>
								</div>
							</div>
						</a>
						   
						<a href="${pageContext.request.contextPath}/action/showCoffeeShop?ServiceId=1">
							<div class="col-lg-4 col-md-offset-1">
								<div class="widget style1 lazur-bg">
									<div class="row">
										<div class="col-xs-4">
											<i class="fa fa-coffee fa-3x"></i>
										</div>
										<div class="col-xs-8 text-right">
											<span> <spring:message code="label.CoffeeShop" />
											</span>
											<h4>
												<spring:message code="label.TakeMyCoffee" />
											</h4>
										</div>
									</div>
								</div>
							</div>
						</a> <a href="#parking" data-toggle="modal">
							<div class="col-lg-4 col-md-offset-1">
								<div class="widget style1 lazur-bg">
									<div class="row">
										<div class="col-xs-4">
											<i class="fa fa-car fa-3x"></i>
										</div>
										<div class="col-xs-8 text-right">
											<span> <spring:message code="label.Parking" />
											</span>
											<h4>
												<spring:message code="label.GetMyCar" />
											</h4>
										</div>
									</div>
								</div>
							</div>
						</a> <a href="#houseKeeping" data-toggle="modal">
							<div class="col-lg-4 col-md-offset-1">
								<div class="widget style1 lazur-bg">
									<div class="row">
										<div class="col-xs-4">
											<i class="fa fa-archive fa-3x"></i>
										</div>
										<div class="col-xs-8 text-right">
											<span> <spring:message code="label.HouseKeeping" />
											</span>
											<h4>
												<spring:message code="label.CleanMyRoom" />
											</h4>
										</div>
									</div>
								</div>
							</div>
						</a> <a href="${pageContext.request.contextPath}/action/showLaundry?ServiceId=5">
							<div class="col-lg-4 col-md-offset-1">
								<div class="widget style1 lazur-bg">
									<div class="row">
										<div class="col-xs-4">
											<i class="fa fa-shopping-cart fa-3x"></i>
										</div>
										<div class="col-xs-8 text-right">
											<span> <spring:message code="label.Laundry" />
											</span>
											<h4>
												<spring:message code="label.WashMyCloth" />
											</h4>
										</div>
									</div>
								</div>
							</div>
						</a> <a href="${pageContext.request.contextPath}/action/showRestaurant?ServiceId=6">
							<div class="col-lg-4 col-md-offset-1">
								<div class="widget style1 lazur-bg">
									<div class="row">
										<div class="col-xs-4">
											<i class="fa fa-cutlery fa-3x"></i>
										</div>
										<div class="col-xs-8 text-right">
											<span> <spring:message code="label.Restaurant" />
											</span>
											<h4>
												<spring:message code="label.TakeMyFood" />
											</h4>
										</div>
									</div>
								</div>
							</div>
							
						</a> <a href="${pageContext.request.contextPath}/action/showCarRental?ServiceId=7">
							<div class="col-lg-4 col-md-offset-1">
								<div class="widget style1 lazur-bg">
									<div class="row">
										<div class="col-xs-4">
											<i class="fa fa-bus fa-3x"></i>
										</div>
										<div class="col-xs-8 text-right">
											<span><spring:message code="label.CarRental" /></span>
											<h4>
												<spring:message code="label.CarForRental" />
											</h4>
										</div>
									</div>
								</div>
							</div>
						</a>

						<div class="col-lg-4 col-md-offset-1">
							<div class="widget style1 lazur-bg">
								<div class="row">
									<div class="col-xs-4">
										<i class="fa fa-question-circle fa-3x"></i>
									</div>
									<div class="col-xs-8 text-right">
										<span> <spring:message code="label.Ask" />
										</span>
										<h4>
											<spring:message code="label.MayIHelpYou" />
										</h4>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
 
	<div class="modal fade" id="language" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-body">
				<jsp:include page="../language/language.jsp"></jsp:include>
			</div>
		</div>
	</div>
	<div class="modal fade" id="parking" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<jsp:include page="../parking/parking.jsp"></jsp:include>
		
		</div>
	</div>
	
	
	<div class="modal fade" id="checkout" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<jsp:include page="../checkout/checkout.jsp"></jsp:include>
		
		</div>
	</div>
	 
	<div class="modal fade" id="housekeeping" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<jsp:include page="../housekeeping/housekeeping.jsp"></jsp:include>
			<button type="button" class="btn btn-info" data-dismiss="modal">
				<spring:message code="label.Close" />
			</button>
			<button id="submit" type="submit" class="btn btn-info">
				<spring:message code="label.submit" />
			</button>

		</div>
	</div> 
</body>
</html>

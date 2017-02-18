<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
						<li class="parentCategory">
							<a><i class="fa fa-th-large"></i> 
							<span class="nav-label">${uniqueParentCategories.serviceGroupName}</span>
							</a>
						</li>
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
							<c:if test="${fn:length(getHotelServiceItems) == 0}">
							<div style="text-align: center;font-size:14px;float: left;width: 80%;background-color: wheat;margin-left: 10%;margin-right: 10%;">No Items to display</div>
						</c:if>
						<c:forEach items="${getHotelServiceItems}"
							var="getHotelServiceItem">
							<div class="hotelServiceItem ${getHotelServiceItem.hotelServiceParentGroups[0].serviceGroupName }">
								<div class="col-lg-3 col-lg-offset-1 w3ls-special-img"
									style="background-image: url('/alArbiyaHotelManagement/images/coffeeShop/${getHotelServiceItem.imageUrlName}');">
									<div class="wpf-demo-6">
										<div class="w3ls-special-text">
											<c:set var="singleUnitPrice" value="${0 }"></c:set>
											<c:forEach
												items="${getHotelServiceItem.orderItems.unitSupporter}"
												var="unitSupporter">
												<c:set var="singleUnitPrice"
													value="${singleUnitPrice +  unitSupporter.unitPrice}"></c:set>
											</c:forEach>
											<p>
										<sub>sar</sub>${singleUnitPrice}</p>
										</div>
										<figcaption class="view-caption">
											<h4>${getHotelServiceItem.serviceItemName}</h4>
											<a class="showOrderForm"> <spring:message
													code="label.Order" /></a>
										</figcaption>
									</div>
								</div>
								<div class="modal fade orderForm" tabindex="-1" role="dialog"
									aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="panel panel-info">
											<div class="panel-heading">
												<h3 class="panel-title">
													<spring:message code="label.RequestOrder" />
												</h3>
											</div>
											<div class="panel-body">
												<form:form class="form-horizontal" modelAttribute="newOrder"
													method="POST"
													action="${pageContext.request.contextPath}/action/addOrder">
													<input type="hidden" id="roomId" value="2" class="roomId" name="room.id">
													<input type="hidden" value="1" name="hotelServiceCategories.hotelServicesCategoryId">
													 
													<div class="form-group">
													<input type="hidden" name="hotelServicesItem.id" value="${getHotelServiceItem.id}">
														<label for="inputEmail" class="col-lg-2 control-label"><spring:message
																code="label.TotalPrice" /></label>
														<div class="col-lg-10">
															<form:input type="text" class="form-control totalPrice"
																name="totalPrice" id="totalprice" readonly="true"
																path="totalPrice" />
														</div>
													</div>
													<div class="form-group">
														<label class="col-lg-2 control-label"><spring:message
																code="label.Ingredient" /></label>
														<div class="col-lg-10">
															<c:forEach
																items="${getHotelServiceItem.orderItems.ingredientSupporter}"
																var="ingredient" varStatus="loop">

																<div class="checkbox">
																	<input type="checkbox" id="checkbox" class="option"
																		name="ingredients[${loop.index}].id"
																		value="${ingredient.ingredientId }"
																		data-price="${ingredient.ingredientPrice }" />
																	${ingredient.ingredientName } 
																</div>
															</c:forEach>
														</div>
													</div>
													<div class="form-group">
														<label class="col-lg-2 control-label"><spring:message
																code="label.Unit" /></label>
														<div class="col-lg-10">
															<c:forEach
																items="${getHotelServiceItem.orderItems.unitSupporter}"
																var="unit" varStatus="loop">
																<div class="checkbox">

																	<input type="checkbox" id="checkbox"  class="option"
																		name="unit[${loop.index}].id" value="${unit.unitId }"
																		data-price="${unit.unitPrice }" /> ${unit.unitName }
																</div>
															</c:forEach>
														</div>
													</div>
																<div class="form-group">
														<label for="inputEmail" class="col-lg-2 control-label"><spring:message
																code="label.Quantity" /></label>
														<div class="col-lg-10">
															<form:input type="number" value="1" class="form-control quantity"
															name="quantity" id="quantity"  
																path="quantity" />
														</div>
													</div>
													<button type="button" class="btn btn-default"
														data-dismiss="modal">
														<spring:message code="label.Cancel" />
													</button>
													<button id="submit" type="submit"
														class="btn btn-success success">
														<spring:message code="label.RequestOrder" />
													</button>
												</form:form>
											</div>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div> 
	<script type="text/javascript">
	$('.showOrderForm').click(function() {

		var $parent = $(this).parents('.hotelServiceItem')

		$parent.find('.orderForm').modal({
			backdrop : 'static',
			keyboard : true,
			show : true
		});
	});
</script>
<style>
.checkbox label {
	
} /* 		padding-left: 20px;
	}
	.checkbox input {
		margin-left: 0px !important;
	} */
</style>
<script type="text/javascript">
/* $( document).ready(function() {
	$(".totalPrice").val(""); 
var total = 0;
	$('.option').on('change',function() { 
		$('.option:checked').each(function() {
			total += parseFloat($(this).data('price'));
			$(".totalPrice").val(total); 
		});  
	}); }); */
	$(document).ready(function () {
		
		
		$('li.parentCategory > a > .nav-label').click(function(){ 
			var text = this.textContent; 
			$('.hotelServiceItem').hide()
			$('.'+text).show()
		})
		
		$('li.parentCategory:first-child > a > .nav-label').click();
		
	    var $inputs = $('input[type="checkbox"]')
	    $inputs.on('change', function () {
	        var sum = 0;
	        $inputs.each(function() {
	           if(this.checked)
	               sum += parseInt($(this).data('price'), 10);
	        });
	        $(".totalPrice").val(sum);
	    });
	    
	    var $inputquantity = $('.quantity')
	    $inputquantity.on('change',function()
	    {
	    	var sum1= $(".totalPrice").val();
	    	   $inputquantity.each(function() {
	    	 
	    		   sum1*=parseInt(this.value);
	    	   });
	    	   $(".totalPrice").val(sum1);
	    	   }); 
	    });
	    
 
</script>
<script src="<c:url value="/resources/js/custom.js" />"></script>
</body> 
</html>

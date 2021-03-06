<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/touchspin/jquery.bootstrap-touchspin.min.css'/>">
<title>SHMS</title>
</head>
<body>
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
				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label"><spring:message
							code="label.TotalPrice" /></label>
					<div class="col-lg-10">
						<form:input type="text" class="form-control" name="totalPrice"
							id="totalprice" disabled="disabled" path="totalPrice" />
					</div>
				</div>  
				  <div class="form-group">
					<label class="col-lg-2 control-label"><spring:message
							code="label.Ingredient" /></label>
					<div class="col-lg-10">
							<div class="checkbox">
								<label> 
									<c:forEach items="${param.getHotelServiceItem.orderItems.ingredientSupporter}" var="ingredient" varStatus="loop">
										<form:checkbox class="option" label="${ingredient.ingredientName }" name="ingredients[${loop.index}].id" path="ingredients[${loop.index}].id" value="${ingredient.ingredientId }" data-price="${ingredient.ingredientPrice }"/>
									</c:forEach>
										    
								  </label>
							</div> 
					</div>
				</div>  
				 <div class="form-group">
					<label class="col-lg-2 control-label"><spring:message
							code="label.Unit" /></label>
					<div class="col-lg-10">
							<div class="checkbox">
								<label> 
									
									<c:forEach items="${param.getHotelServiceItem.orderItems.unitSupporter}" var="unit" varStatus="loop">
										<form:checkbox class="option" label="${unit.unitName }" name="unit[${loop.index}].id" path="unit[${loop.index}].id" value="${ingredient.unitId }" data-price="${ingredient.unitPrice }"/>
									</c:forEach>
										    
								  </label>
							</div> 
					</div>
				</div>
				 <input type="hidden" id="roomId" name="room.id" value="1">
			 <input type="hidden" value="1" name="hotelServiceCategories.hotelServicesCategoryId"> 
				<div class="form-group">
					<label class="col-lg-2 control-label"><spring:message
							code="label.Quantity" /></label>
					<div class="col-lg-10">
						<form:input class="touchspin1" id="quantity" type="text" value="1"
							name="quantity" path="quantity" />
					</div>
				</div>
				<button type="button" class="btn btn-default" data-dismiss="modal">
					<spring:message code="label.Cancel" />
				</button>
				<button id="submit" type="submit" class="btn btn-success success">
					<spring:message code="label.RequestOrder" />
				</button>
			</form:form>
		</div>
	</div>
	<script
		src="<c:url value="/resources/js/plugins/touchspin/jquery.bootstrap-touchspin.min.js"/>"></script>
	<script type="text/javascript">
		$("input[name='quantity']").TouchSpin({
			min : 1,
			max : 60,
			step : 1,
			boostat : 5,
			maxboostedstep : 10,
		});
	</script>
	<!-- <script type="text/javascript">
	  	$(document).ready(function() {
			$("input[type=checkbox]").change(function() {
				recalculate();
			});
			function recalculate() {
				var sum = 0;
				$("input[type=checkbox]:checked").each(function() {
					sum += parseInt($(this).attr("itemValue"));
				});
				$("#totalprice").val(sum);
			}
			$('#quantity').on('input', function() {
				var totalprice = parseInt($("#totalprice").val());
				alert(totalprice);
				totalprice *= parseInt($(this).val());
				$("#totalprice").val(totalprice);
			});

		});  
		
		
	</script> -->
	<script type="text/javascript">
	$('.option').on("change", function () {
	  /*   var links = []; //array for links */
	    var totalPrice = 0;

	    $('.option:checked').each(function () {
	      /*   links.push($(this).data('link')); //get links */
	        totalPrice += parseInt($(this).data('price'), 10);
	        alert(totalprice);
	    });

	  /*   $('.price').html(totalPrice); */
	    alert(totalprice);
	  /*   $("a").attr("href", links.join(",")); // change link */
	});
	</script>
	
</body>
</html>
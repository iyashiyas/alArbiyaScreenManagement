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
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/touchspin/jquery.bootstrap-touchspin.min.css'/>">
<title>SHMS</title>
</head>
<body>
	<div class="panel panel-info">
		<div class="panel-heading">
			<h3 class="panel-title"><spring:message code="label.RequestOrder" /></h3>
		</div>
		<div class="panel-body">
		<form:form class="form-horizontal" modelAttribute="newOrder"  method="POST" action="${pageContext.request.contextPath}/action/addOrder">
				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label"><spring:message code="label.TotalPrice" /></label>
					<div class="col-lg-10">
						<form:input type="text" class="form-control" name="totalPrice"
							id="totalprice" disabled="disabled" placeholder="0.0" path="totalPrice" />
					</div>
				</div>
			  
			 <div class="form-group">
					<label class="col-lg-2 control-label"><spring:message
							code="label.Ingredient" /></label>
					<div class="col-lg-10">
						<c:forEach items="${getHotelServiceItems}" var="getHotelServiceItems">
						 
							<div class="checkbox">
								<label> 
										<form:checkboxes class="option" name="ingredients[0].id"
											id="ingredientCheckBox" items="${getHotelServiceItems.orderItems.ingredientSupporter}" itemValue="ingredientId" itemLabel="ingredientName"  path="ingredients[0].id" />    
								  </label>
							</div>
 
						</c:forEach>
					</div>
				</div>
				 
				<div class="form-group">
					<label class="col-lg-2 control-label"><spring:message
							code="label.Unit" /></label>
					<div class="col-lg-10">
						<c:forEach items="${getHotelServiceItems}" var="getHotelServiceItems"> 
							<div class="checkbox">
								<label> 
										<form:checkboxes class="option"  name="unit[0].id"
											id="checkboxUnit" items="${getHotelServiceItems.orderItems.unitSupporter}" itemValue="unitId" itemLabel="unitName"  path="unit[0].id" />    
								  </label>
							</div>
 
						</c:forEach>
					</div>
				</div>
				  
				   <input type="hidden" name="room.id">
				   
				<div class="form-group">
					<label class="col-lg-2 control-label"><spring:message code="label.Quantity" /></label>
					<div class="col-lg-10">
						<input class="touchspin1" id="quantity" type="text" value=""
							name="quantity">
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
	<script src="<c:url value="/resources/js/plugins/touchspin/jquery.bootstrap-touchspin.min.js"/>"></script>
	 	<script type="text/javascript">
		$("input[name='quantity']").TouchSpin({
			min : 1,
			max : 60,
			step : 1,
			boostat : 5,
			maxboostedstep : 10,

		});
	</script>
</body>
</html>
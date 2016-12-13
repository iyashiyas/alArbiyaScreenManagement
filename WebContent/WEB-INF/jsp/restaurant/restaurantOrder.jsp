<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
			<form class="form-horizontal" method="POST">
				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label"><spring:message code="label.TotalPrice" /></label>
					<div class="col-lg-10">
						<input type="text" class="form-control" name="totalprice"
							id="totalprice" disabled="disabled" placeholder="0.0">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-2 control-label"><spring:message code="label.Unit" /></label>
					<div class="col-lg-10">
						<div class="radio">
							<label> <input type="radio" class="its"
								name="optionsRadios" id="optionsRadios1" value="5">
								Small
							</label>
						</div>
						<div class="radio">
							<label> <input type="radio" class="its"
								name="optionsRadios" id="optionsRadios2" value="10">
								Normal
							</label>
						</div>
						<div class="radio">
							<label> <input type="radio" class="its"
								name="optionsRadios" id="optionsRadios2" value="15">
								Medium
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-2 control-label"><spring:message code="label.Ingredients" /></label>
					<div class="col-lg-10">
						<div class="checkbox">
							<label> <input type="checkbox" class="its" name="ingrd1"
								id="optionsRadios1" value="1"> sauce
							</label>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox" class="its" name="ingrd12"
								id="optionsRadios2" value="2"> sugar
							</label>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox" class="its" name="ingrd13"
								id="optionsRadios2" value="1"> ketchup
							</label>
						</div>
					</div>
				</div> 
				<div class="form-group">
					<label class="col-lg-2 control-label"><spring:message code="label.Quantity" /></label>
					<div class="col-lg-10">
						<input class="touchspin1" id="quantity" type="text" value=""
							name="quantity">
					</div>
				</div> 
			</form>
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
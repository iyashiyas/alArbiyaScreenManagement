<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/touchspin/jquery.bootstrap-touchspin.min.css" />">
 
<title>SHMS</title>
</head>
<body>

	<div class="panel panel-info">
		<div class="panel-heading">
			<h3 class="panel-title"><spring:message code="label.RequestACarForRent" /></h3>
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


				<div class=" form-group">
					<label><spring:message code="label.From" /></label><div class="col-lg-10">
					<div class='input-group date' id='datetimepicker1'>
						<input type='text' class="form-control " name="startDate" /> <span
							class="input-group-addon"> <span
							class="glyphicon glyphicon-calendar"></span>
						</span>
					</div>
					</div>
				</div>


				<div class=" form-group">
					<label><spring:message code="label.To" /></label>
					<div class="col-lg-10">
					<div class='input-group date' id='datetimepicker2'>
						<input type='text' class="form-control " name="endDate" /> <span
							class="input-group-addon"> <span
							class="glyphicon glyphicon-calendar"></span>
						</span>
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
	<script type="text/javascript" src="<c:url value="/resources/js/plugins/touchspin/jquery.bootstrap-touchspin.min.js" /> "></script>
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
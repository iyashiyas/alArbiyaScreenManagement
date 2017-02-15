<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link
	href="<c:url value="/resources/css/dateTimePicker/bootstrap-datetimepicker.css" />"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/touchspin/jquery.bootstrap-touchspin.min.css" />">
<title>SHMS</title>
</head>
<body>
	<div class="panel panel-info">
		<div class="panel-heading">
			<h3 class="panel-title">
				<spring:message code="label.RequestMyCar" />
			</h3>
		</div>
		<div class="panel-body">
			<form:form class="form-horizontal" modelAttribute="houseKeepingOrder" method="POST" action="${pageContext.request.contextPath}/action/houseKeepingRequest">
				 <input type="hidden" id="roomId" value="2" class="roomId" name="room.id">
				 <div class="form-group">
					<label class="col-lg-2 control-label"><spring:message code="label.Unit" /></label>
					<div class="col-lg-10">
						<div class="radio">
							<label> <input type="radio" class="its"
								name="houseKeepingType" id="optionsRadios1" value="CLEAN">
								Clean My Room
							</label>
						</div>
						<div class="radio">
							<label> <input type="radio" class="its"
								name="houseKeepingType" id="optionsRadios2" value="CLEAN GARBAGE">
								Clean My Garbage
							</label>
						</div>
						<div class="radio">
							<label> <input type="radio" class="its"
								name="houseKeepingType" id="optionsRadios2" value="CHANGE BED">
								Change Bed
							</label>
						</div>
					</div>
				</div> 
				 
		     <button type="button" class="btn btn-info" data-dismiss="modal">
			 <spring:message code="label.Close" />
			</button>
			<button id="submit" type="submit" class="btn btn-info  ">
				<spring:message code="label.submit" />
			</button>
			</form:form>
		</div>
	</div>
	 
</body>
</html>
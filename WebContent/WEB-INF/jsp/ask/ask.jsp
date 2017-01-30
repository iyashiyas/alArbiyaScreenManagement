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
  </head>
<body> 
	 	<div class="panel panel-info">
		 
 
		<div class="panel-heading">
			<h3 class="panel-title"><spring:message code="label.Ask" /></h3>
		</div>
		<div class="panel-body"> 
			<form:form class="form-horizontal" modelAttribute="receptionOrder" method="POST" action="${pageContext.request.contextPath}/action/receptionRequest">
			 <input type="hidden" id="roomId" name="room.id" value="1">
 
			  <div class="form-group">
            <label class="col-lg-2 control-label">
           <spring:message code="label.Ask" /></label>
			 <div class="col-lg-8">
			 <form:input type="text" class="form-control" name="requestType" id="requestType" path="requestType" />
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
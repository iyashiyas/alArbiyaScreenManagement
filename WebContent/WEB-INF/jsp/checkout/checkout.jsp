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
<link href="<c:url value="/resources/css/dateTimePicker/bootstrap-datetimepicker.css" />" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/touchspin/jquery.bootstrap-touchspin.min.css" />">
 
<title>SHMS</title>
</head>
<body>

	<div class="panel panel-info">
		<div class="panel-heading">
			<h3 class="panel-title"><spring:message code="label.CheckOut" /></h3>
		</div>
		<div class="panel-body"> 
			<form:form class="form-horizontal" modelAttribute="receptionOrder"  method="POST" action="${pageContext.request.contextPath}/action/receptionRequest">
			 <input type="hidden" id="roomId" name="room.id" value="1">
			 <input type="hidden" id="requestType" name="requestType" value="CHECKOUT">
			 
			 <%--   <div class="form-group">
					<label class="col-lg-2 control-label"><spring:message code="label.SelectTime" /></label>
					<div class="col-lg-10">
						<div class="radio">
							<label> <input type="radio" class="its"
								name="selectTime" id="now" value="5" checked="checked"> <spring:message code="label.Now" />
							</label>
						</div>
						<div class="radio">
							<label> <input type="radio" class="its"
								name="selectTime" id="later" value="10">
								<spring:message code="label.Later" />
							</label> 
						</div> 
					</div>
				</div> 
				
				 <div class="form-group" id="selectTimer1" style="display: none;">
				 	<label class="col-lg-2 control-label"><spring:message code="label.SelectTime" /></label>
                <div class='input-group date' id='datetimepicker2'>
                    <input type='text' class="form-control" />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
                </div>   --%> 
                
                  <p>Confirm Checkout?</p>
				   	<button type="button" class="btn btn-info" data-dismiss="modal">
				<spring:message code="label.Close" />
			</button>
			<button id="submit" type="submit" class="btn btn-info  ">
				<spring:message code="label.submit" />
			</button>
			</form:form>
		</div>
	</div>
	<script type="text/javascript" src="<c:url value="/resources/js/plugins/dateTimePicker/callDateTimepicker.js" />"></script>

	<script type="text/javascript" src="<c:url value="/resources/js/plugins/touchspin/jquery.bootstrap-touchspin.min.js" />"></script>

	<script type="text/javascript">
		$('#datetimepicker2').datepicker(); 
		 $(function () {
		        $("input[name='selectTime']").click(function () {
		            if ($("#chkYes").is(":checked")) {
		                $("#dvPassport").show();
		            } else {
		                $("#dvPassport").hide();
		            }
		        });
		    });
		
		 
		 $(document).ready(function() {
			   $('input[name="selectTime"]').click(function() {
			       if($(this).attr('id') == 'later') {
			            $('#selectTimer').show();           
			       }

			       else {
			            $('#selectTimer1').hide();   
			       }
			   });
			});
	</script>
</body>
</html>
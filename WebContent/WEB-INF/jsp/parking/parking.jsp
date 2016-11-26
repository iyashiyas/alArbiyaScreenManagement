 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
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
			<h3 class="panel-title">Request My Car</h3>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" method="POST">
			
				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label">Parking ID
						 </label>
					<div class="col-lg-10">
						<input type="text" class="form-control" name="Parking ID"
							id="parkingId" disabled="disabled" placeholder="1EbSTH">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-lg-2 control-label">Select Time</label>
					<div class="col-lg-10">
						<div class="radio">
							<label> <input type="radio" class="its"
								name="selectTime" id="now" value="5" checked="checked"> Now
							</label>
						</div>
						<div class="radio">
							<label> <input type="radio" class="its"
								name="selectTime" id="later" value="10">
								Later
							</label>

						</div>

					</div>
				</div>

				 <div class="form-group" id="selectTimer" style="display: none;">
				 	<label class="col-lg-2 control-label">Select Time</label>
                <div class='input-group date' id='datetimepicker1'>
                    <input type='text' class="form-control" />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
                </div>


			</form>
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
			            $('#selectTimer').hide();   
			       }
			   });
			});
	</script>
</body>
</html>
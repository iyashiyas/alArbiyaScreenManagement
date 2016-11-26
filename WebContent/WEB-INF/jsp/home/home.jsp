<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/touchspin/jquery.bootstrap-touchspin.min.css" />" >
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/dateTimePicker/bootstrap-datetimepicker.css" />">

<title>SHMS</title>
</head>
<body>
<div id="wrapper">
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
                            <span> Language </span>
                            <h4 >Choose Language</h4>
                        </div> 
                    </div>
                </div>
            </div></a>
            
             <a href="#parking" data-toggle="modal">
            <div class="col-lg-4 col-md-offset-1">
                <div class="widget style1 lazur-bg">
                    <div class="row">
                        <div class="col-xs-4">
                            <i class="fa fa-car fa-3x"></i>
                        </div>
                        <div class="col-xs-8 text-right">
                            <span> Parking </span>
                            <h4 >Get My car</h4>
                        </div> 
                    </div>
                </div>
            </div>
            </a>
             
             <a href="${pageContext.request.contextPath}/laundry"> 
            <div class="col-lg-4 col-md-offset-1">
                <div class="widget style1 lazur-bg">
                    <div class="row">
                        <div class="col-xs-4">
                            <i class="fa fa-shopping-cart fa-3x"></i>
                        </div>
                        <div class="col-xs-8 text-right">
                            <span> Laundry </span>
                            <h4 >Wash My Cloth</h4>
                        </div> 
                    </div>
                </div>
            </div>
            </a>
            
            <a href="${pageContext.request.contextPath}/coffeeShop">
            <div class="col-lg-4 col-md-offset-1">
                <div class="widget style1 lazur-bg">
                    <div class="row">
                        <div class="col-xs-4">
                            <i class="fa fa-coffee fa-3x"></i>
                        </div>
                        <div class="col-xs-8 text-right">
                            <span> Coffee Shop </span>
                            <h4>Take My Coffee</h4>
                        </div> 
                    </div>
                </div>
            </div></a>
            
            <a href="${pageContext.request.contextPath}/restaurant"> 
            <div class="col-lg-4 col-md-offset-1">
                <div class="widget style1 lazur-bg">
                    <div class="row">
                        <div class="col-xs-4">
                            <i class="fa fa-cutlery fa-3x"></i>
                        </div>
                        <div class="col-xs-8 text-right">
                            <span> Restaurant </span>
                            <h4  >Take My Food</h4>
                        </div> 
                    </div>
                </div>
            </div>
            </a>
             
             <a href="${pageContext.request.contextPath}/rental"> 
            <div class="col-lg-4 col-md-offset-1">
                <div class="widget style1 lazur-bg">
                    <div class="row">
                        <div class="col-xs-4">
                            <i class="fa fa-bus fa-3x"></i>
                        </div>
                        <div class="col-xs-8 text-right">
                            <span> Car Rental </span>
                            <h4  >Car for Rental</h4>
                        </div> 
                    </div>
                </div>
            </div>
            </a>
            
            <a href="#houseKeeping"> 
            <div class="col-lg-4 col-md-offset-1">
                <div class="widget style1 lazur-bg">
                    <div class="row">
                        <div class="col-xs-4">
                            <i class="fa fa-archive fa-3x"></i>
                        </div>
                        <div class="col-xs-8 text-right">
                            <span> House Keeping </span>
                            <h4>Clean My Room</h4>
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
                            <span> Ask </span>
                            <h4 >May I help You</h4>
                        </div> 
                    </div>
                </div>
            </div>
           
                    </div>
                    </div>
       </div>
       </div>
	 
	 </div>
	 
	 
	 <div class="modal fade" id="language" tabindex="-1"
							role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
							 

										<jsp:include page="../language/language.jsp"></jsp:include>
  
											<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
											<button id="submit" type="submit" class="btn btn-success success">Select My Language</button>
									 
								</div>
							</div>
					  
						
						 <div class="modal fade" id="parking" tabindex="-1"
							role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
							  
										<jsp:include page="../parking/parking.jsp"></jsp:include>
  
											<button type="button" class="btn btn-info" data-dismiss="modal">Close</button>
											<button id="submit" type="submit" class="btn btn-info  ">Get My Car</button>
								 
							</div>
						</div>
						
						
						<div class="modal fade" id="housekeeping" tabindex="-1"
							role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
							  
										<jsp:include page="../housekeeping/housekeeping.jsp"></jsp:include>
  
											<button type="button" class="btn btn-info" data-dismiss="modal">Close</button>
											<button id="submit" type="submit" class="btn btn-info  "> Ok</button>
								 
							</div>
						</div>
						 
</body>
</html>

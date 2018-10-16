<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="setting.jsp"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<!-- Custom styles for this template -->
<link href="https://fonts.googleapis.com/css?family=Work+Sans"
	rel="stylesheet">
<link rel="stylesheet" href="${project}travelers_style.css">

<script src="//code.jquery.com/jquery.js"></script>
<script src="${project}script.js"></script>
</head>

<body>
<!-- Category & Contents Box -->    
	<div class="body-box">
		 <div class="d-flex justify-content-end">
	        <c:if test="${sessionScope.user_id eq null}">
	          <a href="login.go"></a>
	        </c:if>
	        <c:if test="${sessionScope.user_id ne null}">
	          <a href="tripWrite.go">
	          	<img src="${project}img/compose_icon.png" width="120" height="40">
	          </a> 
	        </c:if>
     	</div>
	  	<div class="board-list">
	     	<c:if test="${count ne 0}">
	    		<c:forEach var="i" items="${tripList}">
		    		<div class="row">
			        	<div class="col-md-12">
			          		<div class="card flex-md-row mb-3 shadow-sm h-md-250">
			           			 <div class="card-body d-flex flex-column align-items-start">
					              <strong class="d-inline-block mb-2">
					              	<c:forEach var="j" items="${i.locs}">
					              		${j}
					              	</c:forEach>
					              </strong>
					              <h3 class="mb-0">
					                 <a class="text-dark" href="trip.go?tb_no=${i.tb_no}">${i.tb_title}</a>
					              </h3>
			              		  <div class="mb-1 text-muted text-right"><i><b>With</b></i>&nbsp; ${i.user_id}</div>
				             	      <hr size="1px" color="black" noshade>
				              		  <p class="card-text mb-auto">${i.tb_content}</p>
				              		  	 <hr style="width: 100%"> 
								 		 <div class="d-flex justify-content-center">
						           			<div class="p-2">일정:2019.02.11~2019.02.21</div>&nbsp;
											<div class="p-2">인원:${i.tb_m_num}</div>&nbsp;
											<div class="p-2">조회수:${i.tb_v_count}</div>&nbsp;
											<div class="p-2">
						           			  	<c:forEach var="j" items="${i.tags}">
						           			  		<label class="btn taglist">
						           			  			# ${j}
						           			  		</label>
						           			  	</c:forEach>
					           			  	</div>
				           			  </div><!-- card-footer -->
			           			  </div><!-- card-body -->
			          			  <img class="card-img-right flex-auto d-none d-lg-block" data-src="holder.js/200x250?theme=thumb" alt="Card image cap">
		         			 </div>
			    		 </div><!-- col-md-12 -->
			    	</div><!-- 1 row -->
	    		</c:forEach>
	    		<div class="row" id="board-append-list"></div>	    		
	    	</c:if>
    	<button type="button" class="btn btn-dark col-md-12" onclick="loadMoreList(${last_tb_no})">Load more...</button>
    </div><!-- board list -->
</div><!-- body box -->	
		
<!-- Footer -->   
    <footer class="board-footer">
      <p>
        <a href="">Back to top</a>
      </p>
    </footer>
</body>
</html>

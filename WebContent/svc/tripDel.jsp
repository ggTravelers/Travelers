<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
pageEncoding="UTF-8"%>
<%@ include file="setting.jsp"%>
<script src="${project}script.js"></script>
<h2>TripDel</h2>
<c:if test="${result eq 0}">
	<script type="text/javascript">
		<!--
			erroralert(deleteerror);
		//-->
	</script>
</c:if>
<c:if test="${result eq 1}">
	<script type="text/javascript">
		<!--
			<c:redirect url="tripList.go"/>
		//-->
	</script>
</c:if>
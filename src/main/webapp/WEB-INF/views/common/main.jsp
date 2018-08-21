<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
	<jsp:include page="head.jsp"></jsp:include>
<body>
<div id="wrapper">
	<div id="header">
		<jsp:include page="titleBox.jsp"/>
		<jsp:include page="loginBox.jsp"/>
		<jsp:include page="menuBox.jsp"/>
	</div>
	<div id="content">
		<jsp:include page="contentBox.jsp"/>
	</div>
	<div id="footer">
		<jsp:include page="footer.jsp"/>
	</div>
</div>
<script>
	common.main('${context}');
</script>
</body>
</html>

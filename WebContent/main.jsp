<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
</style>
<title>Insert title here</title>
</head>
<body>
	<c:out value="${sessionScope.user.name}"/>
	<c:out value="${sessionScope.user.surname}"/><br/>
	
	<c:import url="/Controller">
		<c:param name="command" value="allnews"/>
	</c:import>
</body>
</html>
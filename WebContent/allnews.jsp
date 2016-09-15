<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<caption>All news</caption>
		<c:forEach var="news" items="${listNews}"  >
			<tr>
				<td>
					<c:out value="${news.name}"/>
				</td>
			</tr>
			<tr>
				<td>
					<c:out value="${news.text}"/>
				</td>
			</tr>
			<tr>
				<td>
					<c:out value="${news.date}"/>
				</td>
				<td>
					<c:out value="${news.author}"/>
				</td>
			</tr>
		</c:forEach>
	</table>
	<table>
		<tr>
			<td>
				<a href="/">Create news</a>
			</td>
		</tr>
	</table>
</body>
</html>
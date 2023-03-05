<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book DB</title>
</head>
<body>
	<h1>Hello From the book Database</h1>
		
	<ul>
		<c:forEach var="book" items="${allBooks">
			<li><c:out value="${book.title}"/></li>
		</c:forEach>
		
	</ul>
</body>
</html>
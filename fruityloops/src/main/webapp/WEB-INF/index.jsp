<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

	<div>
		<table class="table">
			<tbody>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>
				
					<c:forEach var="fruit" items="${fruits}">
					<tr>
						<td>${fruit.name}</td>
						<td>${fruit.price}</td>
					</tr>
					</c:forEach>
					

			
			</tbody>		
		</table>
	</div>

	
</body>
</html>
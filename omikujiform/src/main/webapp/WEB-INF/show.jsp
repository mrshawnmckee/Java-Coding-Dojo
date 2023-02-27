<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Omikuji1</title>
	<link rel="stylesheet" href="style.css" />
</head>
<body>
	<div style="text-align:center; width:20em">
		<h1 style="text-align:center">Here's Your Omikuji!</h1>
		
		<div style="background-color: #ADD8E6; width:20em;">
			In <span><c:out value="${num}"/></span> years, you will live in
			<span><c:out value="${city}"/></span> with <span><c:out value="${person}"/></span>
			as your roommate selling <span><c:out value="${hobby}"/></span> for a living.
			The next time you see a <span><c:out value="${thing}"/></span>, you will have good luck.
			Also, <span><c:out value="${message}"/></span><br />
		</div>
		<br />
		<a href="/omikuji">Go Back</a>
	
	</div>

</body>
</html>
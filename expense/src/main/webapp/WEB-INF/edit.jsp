<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
	<div style="display:flex; ">
		<h1>Edit Expense</h1>
		<a href="/expenses"style="align-right;">Go Back</a>
	
	</div>


		<form:form action="/expenses/edit/${id}" method="POST" modelAttribute="expense">
		<div>
			<form:label path="name">Expense</form:label>
			<form:input path="name"/>
			<form:errors  path="name"/>
		</div>
		
		<div>
			<form:label path="vendor">Vendor</form:label>
			<form:input path="vendor"/>
			<form:errors path="vendor"/>
		</div>
								
		<div>
			<form:label path="amount">Amount</form:label>
			<form:input path="amount"/>
			<form:errors path="amount"/>
		</div>
		
		<div>
			<form:label path="description">Description</form:label>
			<form:input path="description"/>
			<form:errors path="description"/>
		</div>
		<button class="btn">submit</button>
	
	</form:form>
</body>
</html>
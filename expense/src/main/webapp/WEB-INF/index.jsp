<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
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
	<h1>Save Travels</h1>

	<table class="tbl">
		<thead>
			<tr class="row1">
				<th class="col1">Expense</th>
				<th class="col2">Vendor</th>
				<th class="col3">Amount</th>
				<th class="col4">Actions</th>			
			</tr>		
		</thead>
		<tbody>
			<c:forEach var="expense" items="${expenses}">
				<tr>
					<td class="col1"><a href="/expenses/${expense.id}"><c:out value="${expense.name}"/></a></td>
					<td class="col2"><c:out value="${expense.vendor}"/></td>
					<td class="col3">$<c:out value="${expense.amount}"/></td>
					<td class="col4"><a href="/expenses/edit/${expense.id}">edit</a><a href="/expenses/delete/${expense.id}"><button class="deletebtn">   Delete</button></a></td>	
						
				</tr>
			</c:forEach>		
		</tbody>	
	</table>
	
	<h2>Add an expense</h2>

	
	<form:form action="/expenses" method="POST" modelAttribute="expense">
			<div>
				<form:label path="name">Expense</form:label>
				<form:input path="name"/>
				<form:errors  path="name" class="error"/>
			</div>
			
			<div>
				<form:label path="vendor">Vendor</form:label>
				<form:input path="vendor"/>
				<form:errors path="vendor" class="error"/>
			</div>
									
			<div>
				<form:label path="amount">Amount</form:label>
				<form:input path="amount"/>
				<form:errors path="amount" class="error"/>
			</div>
			
			<div>
				<form:label path="description">Description</form:label>
				<form:input path="description"/>
				<form:errors path="description" class="error"/>
			</div>
			<button class="btn">submit</button>
		
		</form:form>
	 
</body>
</html>
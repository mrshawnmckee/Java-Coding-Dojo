<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Omikuji</title>
	<link rel="stylesheet" href="style.css" />
</head>
<body>
	<h1>Send an Omikuji!</h1>
	
	<div class="formdiv">
		<form action="/omikuji/show" method="POST">
			<div>
				<label>Pick any number from 5 to 25</label><br />
				<input class="num" type="number" min="5" max="25" name="num"/><br /><br />
			
				<label>Enter the name of any city.</label><br />
				<input type="text" name= "city" /><br /><br />
				
				<label>Enter the name of any real person.</label><br />
				<input type="text" name= "person" /><br /><br />
				
				<label>Enter professional endeavor or hobby.</label><br />
				<input type="text" name= "hobby" /><br /><br />
				
				<label>Enter any type of living thing.</label><br />
				<input type="text" name= "thing" /><br /><br />
				
				<label>Say something nice to someone</label><br />
				<input class="textbox" type="text" name="message"/><br /><br />
				
				Send and show a friend
				<br />
			
			</div>
			<div>
			
				<button>Send</button>
			</div>

		</form>
	
	</div>
</body>
</html>
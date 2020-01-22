<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/registrationform.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/registrationform.js"></script>
</head>
<body>
	<form id="registrationform" action="register" method="post">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
	<label for="privilage"><b>Register As</b></label>
	<select id="role" name= "role"></select>
	<br>
	<br>
    <label for="username"><b>Username</b></label>
    <input id="username" type="text" placeholder="Enter Username" name="userName" required>

    <label for="psw"><b>Password</b></label>
    <input id="psw" type="password" placeholder="Enter Password" name="password" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input id="psw-repeat" type="password" placeholder="Repeat Password" name="psw-repeat" required>
    
    <hr>
	
    <!-- <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p> -->
    <button id="submit" type="submit" class="registerbtn">Register</button>
  </div>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/forgotpassword.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/forgotpassword.js"></script>
</head>
<body>
	<form id="registrationform" action="register" method="post">
  <div class="container">
    <h1>Update Password</h1>
    <p>Please fill in this form to update the password.</p>
    <hr>
    <label for="username"><b>Username</b></label>
    <input id="username" type="text" placeholder="Enter Username" name="userName" required>

    <label for="psw"><b>Password</b></label>
    <input id="psw" type="password" placeholder="Enter Password" name="password" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input id="psw-repeat" type="password" placeholder="Repeat Password" name="psw-repeat" required>
    <hr>
    <button id="submit" type="submit" class="registerbtn">Update Password</button>
  </div>
</form>
</body>
</html>
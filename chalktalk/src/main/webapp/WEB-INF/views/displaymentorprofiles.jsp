<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/displaymentorprofiles.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/jquery-3.4.0.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/sweetalert.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/displaymentorprofiles.js"></script>
</head>
<body>
	<div id="nav-bar-section1">
		<div class="imgcontainer">
			<span>The Connecticut Mentoring Team</span> <a
				href="${pageContext.request.contextPath}/"><img
				src="${pageContext.request.contextPath}/resources/images/mentor.jpg"
				alt="Logo" class="logo"></a>
		</div>
		<nav id="menu-items-bar" class="nav-bar-class">
			<ul class="nav-bar-ui">
				<li><a href="#aboutus">About Us</a></li>
				<li><a href="#mentor">Mentor</a></li>
				<li><a href="#mentee">Mentee</a></li>
				<li><a href="#meetups">Meet Ups</a></li>
				<li><a href="#apply">Apply</a></li>
				<li><a href="#contactus">Contact Us</a></li>
				<li><a href="${pageContext.request.contextPath}/login">Login</a></li>
			</ul>
		</nav>
	</div>
	<div class="row">
		<h2>Meet our Mentors</h2>
		<div class="column" id="column">
			<%-- <a href="${pageContext.request.contextPath}/">
			<img class="pics" src="${pageContext.request.contextPath}/resources/images/mentor.jpg" 
			height = "200" width="200"></a> --%>
			<%-- <img src="data:image/jpg;base64,${book.base64Image}" width="240" height="300"/> --%>
		</div>
	</div>
</body>
</html>
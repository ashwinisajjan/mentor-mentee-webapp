<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/menteepagestylesheet.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/menteepage.js"></script>
</head>
<body>
	<div class="imgcontainer">
   <span><img src="${pageContext.request.contextPath}/resources/images/img_avatar2.jpg" alt="Avatar" class="avatar">Admin</span>
</div>
<section class="container">
	  <div class="left-half">
	    <ul>
	      <li><a href="#mentor-section">Mentors</a></li>
	      <li><a href="#applications-section">Applications</a></li>
	    </ul>
	  </div>
	  <div id = "mentor-section" class="right-half">
	    <article>
	      <h1>This is Mentee Section</h1>
	      <p>I'm mentor section</p>
	    </article>
	  </div>
	  <div id = "applications-section" class="right-half">
	    <article>
	      <h1>This is Mentee Section</h1>
	      <p>I'm applications section</p>
	    </article>
	  </div>
</section>
</body>
</html>
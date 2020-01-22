<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mentorpagestylesheet.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/mentorpage.js"></script>
</head>
<body>
 <div class="imgcontainer">
   <a href="${pageContext.request.contextPath}/logoutpage">logout</a>
</div>
<section class="container">
	  <div class="logocontainer">
          <span>The Connecticut Mentoring Team</span>
          <a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/resources/images/mentor.jpg" alt="Logo" class="logo"></a>
	  </div>
	  <div class="left-half">
	    <ul>
	      <li><a href="#mentee-section">Mentees</a></li>
	      <li><a href="#applications-section">Applications</a></li>
	    </ul>
	  </div>
	  <div id = "mentee-section" class="right-half">
	    <article>
	      <h1>This is Mentor Section</h1>
	      <p>I'm mentee section</p>
	    </article>
	  </div>
	  <div id = "applications-section" class="right-half">
	    <article>
	      <h1>This is Mentor Section</h1>
	      <p>I'm applications section</p>
	    </article>
	  </div>
</section>
</body>
</html>
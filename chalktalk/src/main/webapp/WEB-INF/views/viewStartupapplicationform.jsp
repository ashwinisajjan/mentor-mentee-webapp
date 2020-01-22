<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/viewStartupapplicationform.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/viewStartupapplicationform.js"></script>
</head>
<body>
<div class="imgcontainer">
   <span><img src="${pageContext.request.contextPath}/resources/images/img_avatar2.jpg" alt="Avatar" class="avatar">Admin</span>
</div>
<section class="container">
	  <div class="left-half">
	    <ul id="listofapplications">
	    </ul>
	  </div>
	  <div id = "mentor-section" class="right-half">
	    <article>
	      <h1>List Of Mentor Applications</h1>
	    </article>
	  </div>
	  <div id = "mentee-section" class="right-half">
	    <article>
	      <h1>List Of Mentor Applications</h1>
	    </article>
	  </div>
	  <div id = "associations-section" class="right-half">
	    <article>
	      <h1>This is ADMIN Section</h1>
	      <p>i'm associations section</p>
	    </article>
	  </div>
	  <div id = "applications-section" class="right-half">
	    <article>
	      <h1>List Of StartUp Applications</h1>
	    </article>
	    <ol id="myUL">
	    </ol>
	  </div>
</section>
</body>
</html>
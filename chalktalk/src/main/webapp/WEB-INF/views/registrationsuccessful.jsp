<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/registrationsuccessful.css" />
</head>
<body>
	<div id="nav-bar-section1">
      <div class="imgcontainer">
          <span>The Connecticut Mentoring Team</span>
          <a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/resources/images/mentor.jpg" alt="Logo" class="logo"></a>
      </div>
      <nav id="menu-items-bar" class = "nav-bar-class">
      <ul class="nav-bar-ui">
         <!-- <li><a href="#aboutus">About Us</a></li>
         <li><a href="#mentor">Mentor</a></li>
         <li><a href="#mentee">Mentee</a></li>
         <li><a href="#meetups">Meet Ups</a></li>
         <li><a href="#apply">Apply</a></li>
         <li><a href="#contactus">Contact Us</a></li> -->
         <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
      </ul>
      </nav>
   </div>
   <section id="" class="">
   		<div><h3>Registration Successful</h3></div>
   </section>
   
   <section id="footer", class="contactus-section-box" style="background-color:#1e1e1e; padding: 25px 25px">
   	 <div id="wrapper">
	   	 <div class="contactus-col" id="contactus-office">
	   	 	<p style="text-align: center;"><strong>Office</strong></p>
	   	 	<p style="color: #fff; font-size: 18px;">Entrepreneurship Foundation Inc. Fairfield, CT 06824</p>
	   	 </div>
	   	 <div class="contactus-col" id="contactus-contact">
	   	 	<p style="text-align: center;"><strong>Contact Us</strong></p>
	   	 	<ul style="list-style-type: none; text-indent: 0px;padding:0px;">
              <li style="color: #fff; font-size: 18px;">Phone: +1 (203) 256-3155</li>
              <li style="color: #fff; font-size: 18px;">Email: Roer@entrepreneurshipfoundation.org</li>
            </ul>
	   	 </div>
	   	 <div class="contactus-col" id="contactus-socialmedia">
	   	 	<p style="text-align: center;"><strong>Social Media</strong></p>
	   	 	<ul style="list-style-type: none; text-indent: 0px;padding:0px;">
	   	 	<li class="tw-icon"
                style="color: #fff; display: inline-block; float: center; margin-right: 20px; font-size: 24px; text-indent: 0px;">
                <i class="fa fa-twitter"></i></li>
              <li class="gl-icon"
                style="color: #fff; display: inline-block; float: center; margin-right: 20px; font-size: 24px; text-indent: 0px;">
                <i class="fa fa-linkedin"></i></li>
            </ul>
	   	 </div>
   	 </div>
   	 <div id="copyright">
        <p>&copy; 2019 Friend | Design and Development. All Rights Reserved.</p>
    </div>
   </section>
</body>
</html>
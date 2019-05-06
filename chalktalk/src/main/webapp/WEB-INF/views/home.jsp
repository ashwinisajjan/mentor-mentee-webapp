<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>MentorMentee</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css" />
</head>
<body>
   <div id="nav-bar-section1">
      <div class="imgcontainer">
          <span>The Connecticut Mentoring Team</span>
          <a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/resources/images/mentor.jpg" alt="Logo" class="logo"></a>
      </div>
      <nav id="menu-items-bar" class = "nav-bar-class">
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
   
   <section id="aboutus" style="background-color:#CCFFFF">
     <div class = "aboutus-div1" style="padding: 25px 25px">
	   	 <div class = "aboutus-div2" style="text-align: center; color: #008092;">
	   	  <h1><br>ABOUT US</h1>
	   	 	<h3 style="text-align: center; color: #f9a100; font-weight: bold;">Working with startups to refine their business models</h3>
	   	 	<p style="text-align: center;">The Venture Mentoring Team (The VMT) is a nonprofit educational 501(c)(3) dedicated to fostering the startup community by training and credentialing Mentors and then connecting them with the best and brightest entrepreneurs to help startups reach their full potential.</p>
	   	 	<p style="text-align: center;">We are experienced executives and entrepreneurs in corporate, legal, academic, profit and not for profit organizations that donate our time and talent. &nbsp;Our goal is to help the startups gain sustainability and traction.</p>
	   	 	<p style="text-align: left;"><strong>How We Help:</strong></p>
      	   	<ul>
         			<li>We refine your business plan through collective intelligence</li>
         			<li>Help develop your investor or grant pitch for maximum value</li>
         			<li>Prioritize your activities to get to market faster</li>
         			<li>Create access for maximum exposure</li>
      		</ul>
      		<p style="text-align: left;"><strong>Why Start-ups Love the Venture Mentoring Team:</strong></p>
	   	 </div>
	 </div>  	 
   </section>

   <section id="mentor">
    <div style="padding: 25px 25px">
	   	 <div class= "mentor-section-inner-div1" style="text-align: center; color: #008092">
	   	   <h1>MENTORS</h1>
	   	 </div>
	   	 <div>
	   	 	<p style="text-align: center;">All of our mentors are volunteers and offer their time and talent to help foster the growth of startups. They have been fully vetted and trained in our mentoring process.</p>
	   	 </div>
	   	 <div class="mentor-alinks" style="margin: 30px;">
	   	 	<p style="text-align: center;"><a id="mentor-alink-display" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid; padding: 10px;" href="${pageContext.request.contextPath}/displaymentorprofiles">Meet our Mentors</a></p>
	   	 	<br>
	   	 	<p style="text-align: center;"><a id="mentor-alink-apply" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid;padding: 10px;" href="${pageContext.request.contextPath}/mentorapplication">Apply to be a VMT Mentor</a></p>
	   	 </div>
	</div>   	 
   </section>

   <section id="mentee", class="mentee-section-box" style="background-color:#CCFFFF;">
     <div style="padding: 25px 25px">
	   	<div class= "mentee-section-inner-div1" style="text-align: center; color: #008092">
	   	   <h1>MENTEES</h1>
	   	</div>
	   	 <div>
	   	 	<p style="text-align: center;">All of our mentors are volunteers and offer their time and talent to help foster the growth of startups. They have been fully vetted and trained in our mentoring process.</p>
	   	 </div>
	   	 <div class="mentee-alinks" style="margin: 30px;">
	   	 	<p style="text-align: center;"><a id="mentee-application-alink" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid; padding: 10px;" href="${pageContext.request.contextPath}/startupapplication">Apply to be a a Powered StartUp</a></p>
	   	 	<br>
	   	 	<p style="text-align: center;"><a id="mentee-question-alink" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid; padding: 10px;" href="https://www.thevmt.org/mentors/#apply">FAQ's</a></p>
	   	 	<!-- Needs to be deleted after complete developing -->
	   	 	<br>
	   	 	<p style="text-align: center;"><a id="mentee-question-alink" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid; padding: 10px;" 
	   	 	      href="${pageContext.request.contextPath}/adminpage">Admin Page</a></p>
	   	 	<br>
	   	 	<p style="text-align: center;"><a id="mentee-question-alink" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid; padding: 10px;" 
	   	 	      href="${pageContext.request.contextPath}/mentorpage">Mentor Page</a></p>
	   	 	<br>
	   	 	<p style="text-align: center;"><a id="mentee-question-alink" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid; padding: 10px;" 
	   	 	      href="${pageContext.request.contextPath}/menteepage">Mentee Page</a></p> 
	   	 	<!-- delete till here -->     
	   	 </div>
   	 </div>
   </section>

   <section id="meetups", class="meetups-section-box">
   	 <div style="padding: 25px 25px">
	   	<div style="text-align: center; color: #008092;">
	   	   <h1>MEET UPS</h1>
	   	</div>
	   	<div>
	   	 	<p style="text-align: center;">The Mentoring Team has "Meet-up" locations all over Connecticut with new locations added regularly. Mostly the locations are public places like public library, University libraries and schools.</p>
	   	</div>
   	 	<div class="row border-bottom row-container" style="margin-top: 0px !important;">
		 	<div class="col-md-4 border-right" style="margin-bottom: 0px !important;">
				<p class="text-bock-size" style="text-align: center;"><strong>Wyncode Miami</strong></p>
				<div class="resize">
					<p class="text-bock-size" style="text-align: center;">549 NW 28th Street Miami FL 33127</p>
	     		</div>
				<p class="p-no-margin"></p>
		 	</div>
			<div class="col-md-4 border-right" style="margin-bottom: 0px !important;">
				<p class="text-bock-size" style="text-align: center;"><strong>WhiteKnight Solutions, LLC </strong></p>
				<div class="resize">
					<p class="text-bock-size" style="text-align: center;">2401 NW Boca Raton Blvd
					Boca Raton, Florida 33431</p>
				</div>
			<p class="p-no-margin"></p>
			</div>
	    </div>
	  </div>  
   </section>

   <section id="contactus", class="contactus-section-box" style="background-color:#1e1e1e; padding: 25px 25px">
   	 <div id="wrapper">
	   	 <div class="contactus-col" id="contactus-office">
	   	 	<p style="text-align: center;"><strong>Office</strong></p>
	   	 </div>
	   	 <div class="contactus-col" id="contactus-contact">
	   	 	<p style="text-align: center;"><strong>Contact Us</strong></p>
	   	 </div>
	   	 <div class="contactus-col" id="contactus-socialmedia">
	   	 	<p style="text-align: center;"><strong>Social Media</strong></p>
	   	 </div>
   	 </div>
   	 <div id="footer">
        <p>&copy; 2013 Friend | Design and Development. All Rights Reserved.</p>
    </div>
   </section>

</body>
</html>

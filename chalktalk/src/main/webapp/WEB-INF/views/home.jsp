<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>MentorMentee</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/homepage.js"></script>
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
	   	 	<h3 style="text-align: center; color: #f9a100; font-weight: bold;">Working with community people to find the solutions to their problems and also to refine the business models for startups</h3>
	   	 	<p style="text-align: center;">The Connecticut Mentoring Team is a nonprofit organization dedicated to fostering the help community by training and credentialing Mentors and then connecting them with the best and brightest entrepreneurs to help startups and community reach their full potential.</p>
	   	 	<p style="text-align: center;">We are experienced executives and entrepreneurs in corporate, legal, academic, profit and not for profit organizations that donate our time and talent. &nbsp;Our goal is to help the people and startups gain sustainability and traction.</p>
	   	 	<p style="text-align: left;"><strong>How We Help:</strong></p>
      	   	<ul>
         			<li>We refine your business plan through collective intelligence</li>
         			<li>Help develop your investor or grant pitch for maximum value</li>
         			<li>Prioritize your activities to get to market faster</li>
         			<li>Create access for maximum exposure</li>
      		</ul>
      		<!-- <p style="text-align: left;"><strong>Why Start-ups Love the Venture Mentoring Team:</strong></p> -->
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
	   	 	<%-- <!-- Needs to be deleted after complete developing -->
	   	 	<br>
	   	 	<p style="text-align: center;"><a id="mentee-question-alink" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid; padding: 10px;" 
	   	 	      href="${pageContext.request.contextPath}/adminpage">Admin Page</a></p>
	   	 	<br>
	   	 	<p style="text-align: center;"><a id="mentee-question-alink" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid; padding: 10px;" 
	   	 	      href="${pageContext.request.contextPath}/mentorpage">Mentor Page</a></p>
	   	 	<br>
	   	 	<p style="text-align: center;"><a id="mentee-question-alink" class="picture-box-alink" style="color: black; font-weight: bolder; text-transform: uppercase; border-style: solid; padding: 10px;" 
	   	 	      href="${pageContext.request.contextPath}/menteepage">Mentee Page</a></p> 
	   	 	<!-- delete till here --> --%>     
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
				<p id = "addressLine1" class="text-bock-size" style="text-align: center;"><strong>Fairfield University Library</strong></p>
				<div class="resize">
					<p class="text-bock-size" style="text-align: center;">1073 N Benson Rd, Fairfield, CT 06824</p>
	     		</div>
				<p class="p-no-margin"></p>
		 	</div>
			<div class="col-md-4 border-right" style="margin-bottom: 0px !important;">
				<p class="text-bock-size" style="text-align: center;"><strong>Fairfield Public Library</strong></p>
				<div class="resize">
					<p class="text-bock-size" style="text-align: center;"> 1080 Old Post Rd, Fairfield, CT 06824</p>
				</div>
			<p class="p-no-margin"></p>
			<div class="col-md-4 border-right" style="margin-bottom: 0px !important;">
				<p class="text-bock-size" style="text-align: center;"><strong>Entrepreneurship Foundation Inc.</strong></p>
				<div class="resize">
					<p class="text-bock-size" style="text-align: center;"> Fairfield, CT 06824</p>
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
   	 <div id="footer">
        <p>&copy; 2019 Friend | Design and Development. All Rights Reserved.</p>
    </div>
   </section>

</body>
</html>

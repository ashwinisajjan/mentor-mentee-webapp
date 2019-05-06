<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>startup application</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mentorapplicationstylesheet.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/mentorapplication.js"></script>
</head>
<body>
<h1>Apply to Become a Mentor</h1>

<form id = "mentorapplicationform" class="form-inline"  action="applyToBeMentor" method="post" 
					enctype="multipart/form-data">
        <p>
        <label for="mentor-name" class="form-container-row-col1"><b>Your Name</b></label>
		<input class="form-container-row-col1" type="text" name="mentorName" required value = "jfg">
		</p>
	    
	    <p>
	    <label for="email"><b>Email</b></label>
	    <input type="text" name="emailId" required value = "jfg">
	    </p>
    
        <p>
	    <label class="form-container-row-col1" for="phnum"><b>Phone Number</b></label>
	    <input class="form-container-row-col1" type="text" name="phoneNo" required value = "jfg">
	    </p>
	    
	    <p>
	    <label class="form-container-row-col1" for="referredby"><b>Referred By</b></label>
	    <input class="form-container-row-col1" type="text" name="referredBy" required value = "jfg">
        </p>
        
        <p>
	    <label class="form-container-row-col1" for="linkedin"><b>Linkedin</b></label>
	    <input class="form-container-row-col1" type="text" name="linkedInProfile" required value = "jfg">
        </p>
        
	    <p>
	    <label class="form-container-row-col1" for="addressline1"><b>Address Line 1</b></label>
	    <input class="form-container-row-col1" type="text" name="addressline1" value = "jfg">
        </p>
        
        <p>
	    <label class="form-container-row-col1" for="addressline2"><b>Address Line 2</b></label>
	    <input class="form-container-row-col1" type="text" name="addressline2" value = "jfg">
        </p>
        
	    <p>
	    <label class="form-container-row-col1" for="city"><b>City</b></label>
	    <input class="form-container-row-col1" type="text" name="city" required value = "jfg">
        </p>
	    
	    <p>
	    <br><label for="county"><b>County</b></label>
	    <select id="county" name= "county"></select></br>
        </p>
        
        <p>
	    <br><label for="state"><b>State</b></label>
	    <select id="state" name= "state"></select></br>
        </p>
        
        <p>
        <br><label for="primary-service-industry"><b>Primary Service Industry</b></label>
	    <select id="primary-service-industry" name= "primaryserviceindustry"></select></br>
	    </p>
	    
        <p>
        <br><label for="areasOfExpertise"><b>Areas Of Expertise</b></label>
	    <select id="areasOfExpertise" name= "areasOfExpertise" multiple="multiple" ></select></br>
	    </p>
        
	    <p>
	    <label for="Resume"><b>Resume</b></label><br/>
	    <br><input id="resume" type = "file" name = "resumedoc" size = "50" accept=".doc,.docx,.pdf" required/>
	    </p>
	    
	    <p>
	    <label for="certificate"><b>Certificates</b></label><br/>
	    <br><input id="certificate" type = "file" name = "certificate" size = "50" accept=".pdf"/>
	    </p>
	    
	    <p>
	    <label for="profilePic"><b>Profile Pic</b></label><br/>
	    <br><input id="profilePic" type = "file" name = "profilePic" size = "50" accept="image/*" required="required"/>
	    </p>
    
    	<button id ="submit" type="submit" class="submit-btn">SUBMIT</button>
  </form>
</body>
</html>
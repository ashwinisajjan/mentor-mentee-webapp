<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>startup application</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mentorapplicationstylesheet.css" />
</head>
<body>
<h1>Apply to Become a Mentor</h1>
<form action="/action_page.php", method="post">
  <div class="form-container">
    <div class = "form-container-divs">
		    <label for="mentor-name" class="form-container-row-col1"><b>Your Name</b></label>
		    <input class="form-container-row-col1" type="text" name="mentor-name" required>
	    <label for="email"><b>Email</b></label>
	    <input type="text" name="email" required>
    </div>
    
     <div class = "form-container-divs">
	    <label class="form-container-row-col1" for="phnum"><b>Phone Number</b></label>
	    <input class="form-container-row-col1" type="text" name="phnum" required>
	    
	    <label class="form-container-row-col1" for="referredby"><b>Referred By</b></label>
	    <input class="form-container-row-col1" type="text" name="referredby" required>
    </div>
    
    <div class = "form-container-divs">
    <label class="form-container-row-col1" for="linkedin"><b>Linkedin</b></label>
    <input class="form-container-row-col1" type="text" name="linkedin" required>
    </div>
    <br><label for="city"><b>City</b></label>
    <select>
	  <option>Apples</option>
	  <option>Oranges</option>
	  <option>Banannas</option>
    </select></br>

    <br><label for="county"><b>County</b></label>
    <select>
	  <option>Apples</option>
	  <option>Oranges</option>
	  <option>Banannas</option>
    </select></br>
    
    <br>
    <label for="Resume"><b>Resume</b></label></br>
    <br><button type="button">Choose File</button>
    <span>No file Chosen</span> </br>
    
    <button type="submit" class="submit-btn">SUBMIT</button>
  </div>
  </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Startup Application</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/startupapplicationstylesheet.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/startupapplication.js"></script>
</head>
<body>
<h1>Startup Application</h1>
<form id = "startupapplicationform" class="form-inline"  action="savestartupapplication", method="post">
        <p>
        <label for="startupname"><b>Startup Name</b></label>
		<input type="text" name="startUpName" value = "shdgfhhv" maxlength="30" required>
		</p>
	    
	    <p>
	    <label for="referredby"><b>Referred By</b></label>
	    <input type="text" name="referredBy" value = "shdgfhhv" maxlength="30" required>
        </p>
        
        <p>
        <label for="your name"><b>Your Name</b></label>
		<input type="text" name="applicantName" value = "shdgfhhv" maxlength="30" required>
		</p>
		
		<p>
        <label for="role"><b>Your role in your startup:</b></label>
		<input type="text" name="applicantJobRole" value = "shdgfhhv" maxlength="30" required>
		</p>
		
	    <p>
	    <label for="email"><b>Your email address</b></label>
	    <input id="applicantEmailId" type="text" name="applicantEmailId" value = "shdgfhhv" maxlength="30" required>
	    </p>
    
        <p>
	    <label for="phnum"><b>Your phone number</b></label>
	    <input id="applicantPhoneNo" type="text" name="applicantPhoneNo" value = "shdgfhhv" maxlength="15" required>
	    </p>
	    
	    <p>
        <br><label for="location"><b>Startup Location(City)</b></label>
	    <input type="text" name="city" value = "shdgfhhv" maxlength="30" required>
	    </p>
	    
        <p>
	    <label for="linkedin"><b>Linkedin</b></label>
	    <input type="text" name="linkedInProfile" value = "shdgfhhv" maxlength="30" required>
        </p>
        
        <p>
	    <label for="website"><b>Website</b></label>
	    <input type="text" name="website" value = "shdgfhhv" maxlength="30" required>
        </p>
        
        <p>
	    <label for="companyStartDate"><b>When did you start working on your start up?:</b></label>
	    <input type="text" name="companyStartDate" value = "shdgfhhv" maxlength="20" required>
        </p>
     
     	<p>
	    <label for="amountOfWorkPut"><b>How much work do you put into your startup?:</b></label>
		<textarea rows = "5" cols = "50" name = "amountOfWorkPut" required>
			The tag defines a multi-line text input control.
			A text area can hold an unlimited number of characters, and the text renders in a fixed-width font (usually Courier).
			The size of a text area can be specified by the cols and rows attributes, or even better; through CSS' height and width properties.
	    </textarea>
        </p>
        
        <p>
	    <label for="currentCompetitors"><b>Who are your current competitors in the market?:</b></label>
		<textarea rows = "5" cols = "50" name = "currentCompetitors" required>
			The tag defines a multi-line text input control.
			A text area can hold an unlimited number of characters, and the text renders in a fixed-width font (usually Courier).
			The size of a text area can be specified by the cols and rows attributes, or even better; through CSS' height and width properties.
	    </textarea>
        </p>
        
        <p>
	    <label for="primaryGoal"><b>What is the primary goal right now for you in your startup?:</b></label>
		<textarea rows = "5" cols = "50" name = "primaryGoal" required>
			The tag defines a multi-line text input control.
			A text area can hold an unlimited number of characters, and the text renders in a fixed-width font (usually Courier).
			The size of a text area can be specified by the cols and rows attributes, or even better; through CSS' height and width properties.
	    </textarea>
        </p>
        
        <p>
	    <label for="targetCustomers"><b>Who are your target customer?:</b></label>
		<textarea rows = "5" cols = "50" name = "targetCustomers" required>
			The tag defines a multi-line text input control.
			A text area can hold an unlimited number of characters, and the text renders in a fixed-width font (usually Courier).
			The size of a text area can be specified by the cols and rows attributes, or even better; through CSS' height and width properties.
	    </textarea>
        </p>
        
        <p>
	    <br><label for="priorExperience"><b>Do you have prior startup experience?:</b></label>
	    <select id="priorExperience" name= "hadPriorExperience">
		  <option>Yes</option>
		  <option>No</option>
	    </select></br>
        </p>
        
     	<p>
	    <label for="startUpDesc"><b>Startup description</b></label>
	    <textarea rows = "5" cols = "50" name = "startUpDesc" required>
	    	The tag defines a multi-line text input control.
			A text area can hold an unlimited number of characters, and the text renders in a fixed-width font (usually Courier).
			The size of a text area can be specified by the cols and rows attributes, or even better; through CSS' height and width properties.
         </textarea>
        </p>
        
	    <p>
	    <br><label for="companystage"><b>What stage of startup do you think you are at?:</b></label>
	    <select id="companystage" name= "companyStage"></select></br>
        </p>
        
        <p>
	    <label for="teamdetails"><b>Your startup team details:</b></label>
	    <textarea rows = "5" cols = "50" name = "teamDetails" required>
	    	The tag defines a multi-line text input control.
			A text area can hold an unlimited number of characters, and the text renders in a fixed-width font (usually Courier).
			The size of a text area can be specified by the cols and rows attributes, or even better; through CSS' height and width properties.
         </textarea>
        </p>
        
        <p>
	    <br><label for="mentoringsession"><b>Have you had a mentoring session with us?:</b></label>
	    <select id="mentoringsession" name= "hadMentoringSession">
		  <option>Yes</option>
		  <option>No</option>
	    </select></br>
        </p>
        
	    <p>
	    <br><label for="businessPlan"><b>Attach Business Plan:</b></label></br>
	    <br><input id="businessPlan" type = "file" name = "businessPlan" size = "50" accept=".doc,.docx,.pdf"/>
	    </p>
	    
	    <p>
	    <br><label for="pitchDeck"><b>Attach Pitch Deck:</b></label></br>
	    <br><input id="pitchDeck" type = "file" name = "pitchDeck" size = "50" accept=".doc,.docx,.pdf"/>
	    </p>
	    
	    <p>
	    <br><label for="otherDocs"><b>Any Other Information</b></label></br>
	    <br><input id="otherDocs" type = "file" name = "otherDocs" size = "50" accept=".doc,.docx,.pdf"/>
	    </p>
    
    	<button id="submit" type="submit" class="submit-btn">SUBMIT</button>
  </form>
 
</body>
</html>
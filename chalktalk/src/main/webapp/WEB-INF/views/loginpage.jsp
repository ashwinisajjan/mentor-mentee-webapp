<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/loginpagestylesheet.css" />
</head>
<body>

<h2>Login</h2>
<center>
<form action="login", method="POST">
  <div class="login-box">
  <div class="imgcontainer">
    <img src="${pageContext.request.contextPath}/resources/images/img_avatar2.jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
    
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
   
    <p id = "id-psw" class="psw"><a href="${pageContext.request.contextPath}/forgotpassword"> Forgot Password</a></p>
    <p><button type="submit">Login</button></p>
  </div>
  </div>
</form>
</center>

</body>
</html> 

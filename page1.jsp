<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOG IN</title>
<link rel="stylesheet" href="log 1.css">
</head>
<body>
<div class="login-box">
  <h1>Login</h1>
  <form method="post" action="Loginsrv">
  <div class="textbox">
    <i class="fas fa-user"></i>
    <input type="text"  name="Username"placeholder="Username">
  </div>

  <div class="textbox">
    <i class="fas fa-lock"></i>
    <input type="password" name="Password" placeholder="Password">
  </div>

  <input type="submit" name="LOGIN"  class="btn" value="Sign in">
</div>
</form>
</body>
</html>
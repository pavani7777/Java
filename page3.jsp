<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION</title>
<link rel="stylesheet" type="text/css" href="reg.css">
</head>
<body>
 <div class="registrationbox">
    <h2>REGISTER ACCOUNT FORM</h2>
    <form method="post" action="Newproject/pagethreeprocess">
        <p>Full Name</p>
        <input type="text" name="text"  placeholder="Enter Your Name">
        <p>Your Email</p>
        <input type="email" name="usrmail" placeholder="Enter Your Email ID">
        <p>Mobile Number</p>
        <input type="tel" name="usrtel" placeholder="Enter Your Mobile No">
        <p>Password</p>
        <input type="password" name="user_password" placeholder="Enter Your Password">
        <input type="Submit" value="REGISTER">
    </form>
    </div>

</body>
</html>
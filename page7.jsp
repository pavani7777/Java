<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONTACT US</title>
<link rel="stylesheet" href="contact us.css">
</head>
<body>
<div class="contact-section">

  <h1>Contact Us</h1>
  <div class="border"></div>
  <form class="contact-form" action="index.html" method="post">
    <input type="text" class="contact-form-text" name="You_name" placeholder="Your name">
    <input type="email" class="contact-form-text" name="You_email"placeholder="Your email">
    <input type="text" class="contact-form-text" name="You_phone"placeholder="Your phone">
    <textarea class="contact-form-text"name="You_message" placeholder="Your message"></textarea>
    <input type="submit" class="contact-form-btn" value="Send">
  </form>
</div>

</body>
</html>
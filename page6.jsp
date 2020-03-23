<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APPLY JOB</title>
 <link rel="stylesheet" type="text/css" href="apply us.css">
</head>
<body>
 <div class="applicationbox">
            <center><h2>Apply For Job</h2></center>
            <form>
            <p>Full Name</p>
                       <input type="text"  name="Full_name" placeholder="">
                       <p>Email Address</p>
                       <input type="email" name="Email_add" placeholder="">
                       <p>Message</p>
                       <br><br>
                       <table>
                           <tr>
                               <td><textarea rows="10" cols="45" name="mes" placeholder="Type Your Message..."></textarea></td>
                           </tr>
                       </table>
                       <p>Upload CV</p>
                       <input type="file" name="CV">
                       
                       <input type="submit" value="Send Application">
                       </form>

</body>
</html>
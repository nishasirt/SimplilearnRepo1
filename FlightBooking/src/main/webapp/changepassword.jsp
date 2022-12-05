<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center" style="border: 1px solid black">
<p><p><p>
<h2>Change Password</h2>
<p><p>

<form action="ChangePasswordController" method="post">


Username :<input type="text" name="username" required="required"><br><br>



New Password :<input type="password" name="psd" required="required"><br><br>


Confirm Password :<input type="password" name="cpsd" required="required"><br><br>
<input type="submit" value="OK">


</form>
<p>

${message}
 </div>

</body>
</html>
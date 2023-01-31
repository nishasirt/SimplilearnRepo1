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
<h2 style="color: blue;">User Login</h2>
<p><p>

<form action="userlogin" method="post">


Username :<input type="text" name="username" required="required"><br><br>



Password :<input type="password" name="psd"  required="required"><br><br>
<input type="submit" value="Login"><p>
Not  User <a href="signup.jsp">Sign Up</a>

</form>
<p>

<h3 style="color: red;">${wrong}</h3>
 </div>

</body>
</html>
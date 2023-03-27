<%@page import="java.util.Base64"%>
<%@page import="java.io.File"%>
<%@page import="java.nio.file.Files"%>
<%@page import="java.util.Base64.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
	
	<style>  
.footer {  
position: fixed;  
left: 10px;  
bottom: 5px;  
right: 10px;   
width: 95%;  
background-color: gray;  
color: white;  
text-align: center;  
background-color: graytext;
}  
</style>

<title>Medicare</title>

</head>
<body style="background-color:#FAFAFA;">


	<div align="center" border="1">



		<div class="container-fluid" style="background-color: blue;">
			<a class="navbar-brand" href="#"> <%String path="C:\\Users\\HP\\Desktop\\simplileaen\\Capstone\\Medicare\\logo.jpg";
byte[] images=Files.readAllBytes(new File(path).toPath());
byte[] encodeBase64 = Base64.getEncoder().encode(images);
String base64Encoded = new String(encodeBase64, "UTF-8");
%>
				<table >

					<tr>
						<td><h2 style="color: white;">Medicare&nbsp;</h2></td>


						<td><img width="50" height="50"
							src="data:image/jpg;base64,<%=base64Encoded%>"></td>
					</tr>
				</table>
				
		</div>
		</a>



	</div>
	
	<img  width="1360" height="170"
							src="data:image/jpg;base64,<%=base64Encoded%>">
	<div  align="center">
	
	
	<h2>User Login</h2>
	<form action="getloginuser" method="post">
	<table >
	
	     

        <tr><td>User Name :</td><td><input type="text" placeholder="Enter User Name"  name="username" class="form-control" placeholder="" aria-label="" aria-describedby="basic-addon1"></td></tr>
        
        <tr><td>Password :</td><td><input type="password" name="psd" placeholder="Enter Password" class="form-control" placeholder="" aria-label="" aria-describedby="basic-addon1"></td></tr>
       
        <tr><td></td><td colspan="1"><input type="submit" value="Login" class="btn btn-primary"></td></tr>
        
        
       </table>
</form>
<h5 style="color: red;">${wrong}</h5>
Not a User : <a href="usersignup.jsp">Sign Up</a><br>
<a href="adminlogin.jsp">Admin Module</a>
</div>



<div  class="footer"  >@Copyright by Nisha Chouhan <div align="right">Contact : 123456987</div><div align="right">Address : Mumbai &nbsp;&nbsp;&nbsp;&nbsp;</div></div>
</body>
</html>
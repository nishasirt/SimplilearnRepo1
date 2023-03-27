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
	
	<div class="container-fluid"  >
	<ul class="list-group list-group-horizontal" >
        <li class="list-group-item"><form class="d-flex" action="getallview">
        
      
      <input type="submit" value="Home"  class="btn btn-outline-success">
    </form></li></li>
       
        <li class="list-group-item"><a href="categorypage.jsp">  <input type="submit" value="Category"  class="btn btn-outline-success"></a></li>
        <li class="list-group-item"><a href="aboutus.jsp"> <input type="submit" value="About us"  class="btn btn-outline-success"></a></li>
         <li class="list-group-item"><a href="contactus.jsp"> <input type="submit" value="Contact us"  class="btn btn-outline-success"></a></li>
        
       <li class="list-group-item" ><a href="userlogin.jsp"> <input type="submit" value="Logout"  class="btn btn-outline-success"></a></li>
         <li class="list-group-item" ><form class="d-flex" action="getshoeSort">
        
       By Price:&nbsp; <select name="pp"  class="custom-select">
  
  <option value="Low to high">Low to high</option>
  <option value="High to low">High to low</option>
  </select>&nbsp;
      <input type="submit" value="Sort"  class="btn btn-outline-success">
    </form></li>
        <li class="list-group-item" ><form class="d-flex" action="getallbyname">
        
      <input class="form-control me-2"   name="smname" type="search" placeholder="Search" aria-label="Search">
      <input type="submit" value="Search"  class="btn btn-outline-success">
    </form></li>
     <li class="list-group-item" ><form class="d-flex" action="getallview">
        
      
      <input type="submit" value="Refresh"  class="btn btn-outline-success">
    </form></li>
     <li class="list-group-item" ><form class="d-flex" action="getcartdata">
        
      
      <input type="submit" value="Cart"  class="btn btn-outline-success">
    </form></li>
    </ul>
	
  </div>
  
  <br><br>
	<div  align="center">
	
	
	<h2>About Medicare</h2><br>
	
	Medicare is a company that supplies medicines and a couple of other healthcare essentials at an affordable price. 
	It was established in 2012 in Delhi, India. It had been serving fine all these years, however, the business analysts noticed
	 a decline in sales since 2017. They found out that online ordering of medicines with companies, 
	such as 100mg and mfine are gaining more profits by eliminating middlemen from the equation. 
	
</div>



<div  class="footer"  >@Copyright by Nisha Chouhan <div align="right">Contact : 123456987</div><div align="right">Address : Mumbai &nbsp;&nbsp;&nbsp;&nbsp;</div></div>
</body>
</html>
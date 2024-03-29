<%@page import="com.medicare.pojo.Cart"%>
<%@page import="com.medicare.pojo.Medicine"%>
<%@page import="com.medicare.pojo.Category"%>
<%@page import="java.util.List"%>
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
<body  style="background-color:#FAFAFA;">
<div align="center" border="1">



		<div class="container-fluid" style="background-color: blue;">
			 <%String path="C:\\Users\\HP\\Desktop\\simplileaen\\Capstone\\Medicare\\logo.jpg";
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
	<div class="container-fluid"  align="center">
	    
	
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
        
        
      
   
    </ul>
    
	
  </div>
 <div class="container">
      <div class="main-content">
       
      </div>
  
      <div class="centre-content">
      
        Buy Medicine
        <h1 class="price"> Total :  <%=request.getParameter("amt") %>  <span>/-</span></h1>
        <p class="course">
         
           
    
        </p>
      </div>
  
      <div class="last-content"  align="center">
     
        <button type="button" class="pay-now-btn">
           Pay with Netbanking
        </button>
  
        <!-- <button type="button" class="pay-now-btn">
        Netbanking options
        </button> -->
      </div>
  
      <div class="card-details"   align="center">
        <p>Pay using Credit or Debit card</p>
  <form action="deletecartdata">
        <div class="card-number">
          <label> Card Number </label>
          <input
            type="text"
            name="c1"
            class="card-number-field"
            placeholder="###-###-###"/>
        </div>
        <br />
        <div class="date-number">
          <label> Expiry Date </label>
          <input type="text" class="date-number-field" 
          name="c2"
                 placeholder="DD-MM-YY" />
        </div>
        <br>
  
        <div class="cvv-number">
          <label> CVV number </label>
          <input type="text" class="cvv-number-field" 
          name="c3"
                 placeholder="xxx" />
        </div>
        <br>
        <div class="nameholder-number">
          <label> Card Holder name </label>
          <input
            type="text"
            name="c4"
            class="card-name-field"
            placeholder="Enter your Name"/>
        </div>
        <br>
      <input type="submit" 
               class="btn btn-primary"  value="ConfirmOrder"/>
       
        </form>
      </div>
    </div>
	<div  class="footer"  >@Copyright by Nisha Chouhan </div>
</body>
</html>
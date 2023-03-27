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
	     <h3>Cart Items</h3>
	
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
  <% 
List<Category> arr=(List<Category>)request.getAttribute("catlist");
  
  pageContext.setAttribute("cat",arr,PageContext.SESSION_SCOPE);   
  %>
  
  

<% 
List<Cart> arr1=(List<Cart>)request.getAttribute("list"); %>


<table  class="table table-striped table-hover">
<tr><th>&nbsp;Image  &nbsp; </th><th>&nbsp;Medicine id &nbsp; </th><th>&nbsp;Medicine name&nbsp;</th><th>&nbsp;Price&nbsp;</th><th>&nbsp;Category&nbsp;</th><th>&nbsp;Status&nbsp;</th><th>&nbsp;Quantity&nbsp;</th></tr>

<%


double carttotal=0.0;
for(Cart es:arr1){
	carttotal=carttotal+es.getTotalprice();

%>

<%String pat=es.getMedince().getImgapath();
System.out.println(pat);
byte[] images1=Files.readAllBytes(new File(pat).toPath());
byte[] encodeBase641 = Base64.getEncoder().encode(images1);
String base64Encoded1 = new String(encodeBase641, "UTF-8"); %>
<tr><td><img alt="img" width=100 height="75"    style="border: 3px solid #555;" src="data:image/jpg;base64,<%=base64Encoded1%>"/>
</td><td><%=es.getMedince().getMid() %></td><td><%=es.getMedince().getMname() %></td><td><%=es.getMedince().getPrice() %></td><td><%=es.getMedince().getCategory().getCname() %></td>
<%
if(es.getMedince().getStatus().equals("Enable"))
{%>
	<td><h6   style="color: green;">In Stock</h6></td>
	<% }else{
	
		%>
	<td><h6   style="color: red;">Out of Stock</h6></td>
		<% 
		
		
	}
	%>




<td><form action="getallbyid"><%=es.getQuantyity() %></form></td>

<% }%>
</table>
 
  <div align="center" >
   <h4>Total cart price :  <%=carttotal %></h4>
  
 <a href="payment.jsp?amt=<%=carttotal%>"> <input type="submit"  value="Place order"  class="btn btn-primary"> </a>
 
  </div>
	<div  class="footer"  >@Copyright by Nisha Chouhan </div>
</body>
</html>
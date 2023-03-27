<%@page import="com.medicare.pojo.Ordered"%>
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
<title>Insert title here</title>
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
	<div class="container-fluid"  >
	<ul class="list-group list-group-horizontal" >
        <li class="list-group-item"><a href="admindashboard.jsp">Home</a></li>
       
        <li class="list-group-item"><a href="addcategory.jsp">Add Category</a></li>
        <li class="list-group-item"><a href="addmedicine.jsp">Add Medicine</a></li>
        
       <li class="list-group-item" ><a href="adminlogin.jsp">Logout</a></li>
         <li class="list-group-item" ></li>
        <li class="list-group-item" ><form class="d-flex" action="getallbyname">
        
      <input class="form-control me-2"   name="smname" type="search" placeholder="Search" aria-label="Search">
      <input type="submit" value="Search"  class="btn btn-outline-success">
    </form></li>
     <li class="list-group-item" ><form class="d-flex" action="getall">
        
      
      <input type="submit" value="Refresh"  class="btn btn-outline-success">
    </form></li>
     <li class="list-group-item" ><form class="d-flex" action="getallorders">
        
      
      <input type="submit" value="Ordres"  class="btn btn-outline-success">
    </form></li>
    </ul>
	
  </div>
  
  
  <% 
List<Category> arr=(List<Category>)request.getAttribute("catlist");
  
  pageContext.setAttribute("cat",arr,PageContext.SESSION_SCOPE);   
  %>
  
  

<% 
List<Ordered> arr1=(List<Ordered>)request.getAttribute("olist"); %>


<table  class="table table-striped table-hover">
<tr><th>&nbsp;Image  &nbsp; </th><th>&nbsp;Medicine id &nbsp; </th><th>&nbsp;Medicine name&nbsp;</th><th>&nbsp;Price&nbsp;</th><th>&nbsp;Category&nbsp;</th><th>&nbsp;Status&nbsp;</th><th>&nbsp; Edit&nbsp;</th><th>&nbsp;Delete&nbsp;</th></tr>

<%

double totat=0.0;

for(Ordered es:arr1){
	
totat=totat+es.getTotalprice();
%>

<%String pat=es.getC().getImgapath();
System.out.println(pat);
byte[] images1=Files.readAllBytes(new File(pat).toPath());
byte[] encodeBase641 = Base64.getEncoder().encode(images1);
String base64Encoded1 = new String(encodeBase641, "UTF-8"); %>
<tr><td><img alt="img" width=100 height="75" src="data:image/jpg;base64,<%=base64Encoded1%>"/>
</td><td><%=es.getC().getMid() %></td><td><%=es.getC().getMname() %></td><td><%=es.getC().getPrice() %></td><td><%=es.getC().getCategory().getCname() %></td>
<%
if(es.getC().getStatus().equals("Enable"))
{%>
	<td><h6   style="color: green;">In Stock</h6></td>
	<% }else{
	
		%>
	<td><h6   style="color: red;">Out of Stock</h6></td>
		<% 
	}
	%>




<td><form action="updatemedince"><input type="hidden" name="mid"  value="<%=es.getC().getMid() %>"><input type="submit"  value="Edit" class="btn btn-warning"></form></td>
<td><form action="deletemedicine"><input type="hidden" name="mid"  value="<%=es.getC().getMid() %>"><input type="submit"  value="Delete" class="btn btn-danger"></form></tr>
<% }%>

<h3>Total Order price :<%=totat %></h3>
</table>
  
	<div  class="footer"  >@Copyright by Nisha Chouhan </div>
</body>
</html>
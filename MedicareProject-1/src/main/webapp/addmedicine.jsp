
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
	<div class="container-fluid"  >
	<ul class="list-group list-group-horizontal" >
        <li class="list-group-item"><a href="admindashboard.jsp">Home</a></li>
       
        <li class="list-group-item"><a href="addcategory.jsp">Add Category</a></li>
        <li class="list-group-item"><a href="addmedicine.jsp">Add Medicine</a></li>
        
       <li class="list-group-item" ><a href="adminlogin.jsp">Logout</a></li>
         <li class="list-group-item" ></li>
        <li class="list-group-item" ><form class="d-flex">
        
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form></li>
     
    </ul>
	
  </div>
  
  	<div  align="center">
	
	
	<h2>Add Medicine</h2>
	
	<form action="addmedicine" method="post"  enctype="multipart/form-data">
	<table >
	
	     

        <tr><td>Name :</td><td><input type="text" placeholder="Enter Medicine Name"  name="mname" class="form-control" placeholder="" aria-label="" aria-describedby="basic-addon1"></td></tr>
         <tr><td>Price :</td><td><input type="text" placeholder="Enter Medicine price"  name="price" class="form-control" placeholder="" aria-label="" aria-describedby="basic-addon1"></td></tr>
         <tr><td>Description :</td><td><input type="text" placeholder="Enter Medicine Des"  name="des" class="form-control" placeholder="" aria-label="" aria-describedby="basic-addon1"></td></tr>
     
<tr><td>Status</td>

<td><select  name="status" class="custom-select">
<option>Enable</option>
<option>Disable</option>

</select></td>

</tr>  
     
<tr><td>Select Category :</td>

<td><% 

List<Category> arr=(List<Category>)pageContext.getAttribute("cat",PageContext.SESSION_SCOPE);
pageContext.setAttribute("cat",arr,PageContext.SESSION_SCOPE); 
%>
 
<select name="cat"  class="custom-select">

  <% 
  for(Category c:arr){
	  %>
	  <option value="<%=c.getCid()+","+c.getCname()%>"><%=c.getCname() %></option>
  <% }
  
  
  
  %>
  </select>
  </p></td>

</tr> 
 <tr><td>Image :</td><td><input type="file" name="file" accept="image/png, image/jpeg" class="form-control" /></td></tr>


<tr><td></td><td colspan="1"><input type="submit" value="Add" class="btn btn-primary"></td></tr>
       </table>
</form>

<br>

</div>
	<div  class="footer"  >@Copyright by Nisha Chouhan </div>
</body>
</html>
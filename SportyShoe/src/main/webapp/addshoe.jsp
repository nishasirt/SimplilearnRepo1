<%@page import="java.util.List"%>
<%@page import="com.shoe.sporty.pojo.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.shoe.sporty.dao.CategoryDao"%>
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
<h2 style="color: blue">Add Shoe</h2>
<p><p>

<form action="insertshoe" method="post">


Shoe name : <input type="text" name="shoename"><p>
Shoe Color : <input type="text" name="color"><p>
Shoe Price : <input type="number" name="price"><p>
Shoe Brand : <input type="text" name="brand"><p>

<% 
List<Category> arr=(List<Category>)request.getAttribute("list"); %>

Select Category : <select name="cat">

  <% 
  for(Category c:arr){
	  %>
	  <option value="<%=c.getCid()+","+c.getCname()%>"><%=c.getCname() %></option>
  <% }
  
  
  
  %>
  </select>
  </p>
  
<input type="submit" value="Add">


</form>
<p>

 </div>

</body>
</html>
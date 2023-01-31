<%@page import="com.shoe.sporty.pojo.Category"%>
<%@page import="com.shoe.sporty.pojo.Shoe"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2 align="center" style="color: blue;">Sporty Shoes</h2>


<div align="center"  style="border: 1px solid black">
<h2 style="color: blue;font-style: italic;">Shoe List</h2>



<h3>Sort By </h3> <form action="getshoebyCategory" method="post">
<% 
List<Category> arr=(List<Category>)request.getAttribute("list1"); %>

By Category : <select name="cat">

  <% 
  for(Category c:arr){
	  %>
	  <option value="<%=c.getCid()+","+c.getCname()%>"><%=c.getCname() %></option>
  <% }
  
  
  
  %>
  </select>
  <input type="hidden" value="<%=request.getAttribute("username")%>" name="un">
<input type="submit" value="go">


</form>
<br>
<form action="getshoeSort" method="post">
  By Price :<select name="pp">
  
  <option value="Low to high">Low to high</option>
  <option value="High to low">High to low</option>
  </select>
<input type="hidden" value="<%=request.getAttribute("username")%>" name="un">


<input type="submit" value="go">
</form>
<br>

<% 
List<Shoe> arr1=(List<Shoe>)request.getAttribute("list");
String un=(String)request.getAttribute("username");
%>
   

<table border="1" style="border-color: blue">
<tr><th>&nbsp;Shoe id &nbsp; </th><th>&nbsp;Shoe name&nbsp;</th><th>&nbsp;Price&nbsp;</th><th>&nbsp;Color&nbsp;</th><th>&nbsp;Brand&nbsp;</th><th>&nbsp;Category&nbsp;</th><th>&nbsp; Buy Now&nbsp;</th></tr>

<%

for(Shoe es:arr1){
%>
<tr><td><%=es.getId() %></td><td><%=es.getShoeName() %></td><td><%=es.getPrice() %></td><td><%=es.getColor() %></td><td><%=es.getBrand() %></td><td><%=es.getCategory().getCname() %></td><td><form action="getShoeAndUser" method="post"><input type="submit" value="Buy Now"><input type="hidden" name="sid" value="<%=es.getId()%>"><input type="hidden" name="username" value="<%=un%>"></form></td></tr>
<% }%>
</table>

<p>
</div>
</body>
</html>
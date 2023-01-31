<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<%@page import="com.shoe.sporty.pojo.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.shoe.sporty.dao.CategoryDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center" style="border: 1px solid black">
<p><p><p>
<h2  style="color: blue;">Add Shoe Category</h2>
<p><p>

<form action="addcategory" method="post">


Category name : <input type="text" name="catname"><p>
<input type="submit" value="Add">


</form>

<p>

<p>

<% 
List<Category> arr=(List<Category>)request.getAttribute("list"); %>


<table border="1" style="border-color: blue">
<tr><th>Category id</th><th>Category name</th></tr>

<%

for(Category es:arr){
%>
<tr><td><%=es.getCid() %></td><td><%=es.getCname() %></td></tr>
<% }%>
</table>
 </div>

</body>
</html>
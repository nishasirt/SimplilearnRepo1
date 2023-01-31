<%@page import="com.shoe.sporty.pojo.OrderredShoe"%>
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
<h2 align="center"  style="color: blue;font-style: italic;">Admin Module</h2>
<div align="right"><a href="adminlogin.jsp" >Logout</a></div>
<div align="center">
<form action="getcategoryy" method="post"><input type="submit" value="Add Category" name="cat" ></form><p>
<form action="getcategory" method="post"><input type="submit" value="Add Shoe"  name="shoe"></form>

</div><p>
<div align="center"  style="border: 1px solid black">
<h2 style="color: blue;font-style: italic;">Shoe List</h2>
<br>


<% 
List<Shoe> arr=(List<Shoe>)request.getAttribute("list"); %>


<table border="1" style="border-color: blue">
<tr><th>&nbsp;Shoe id &nbsp; </th><th>&nbsp;Shoe name&nbsp;</th><th>&nbsp;Price&nbsp;</th><th>&nbsp;Color&nbsp;</th><th>&nbsp;Brand&nbsp;</th><th>&nbsp;Category&nbsp;</th><th>&nbsp; Edit&nbsp;</th><th>&nbsp;Delete&nbsp;</th></tr>

<%

for(Shoe es:arr){
%>
<tr><td><%=es.getId() %></td><td><%=es.getShoeName() %></td><td><%=es.getPrice() %></td><td><%=es.getColor() %></td><td><%=es.getBrand() %></td><td><%=es.getCategory().getCname() %></td><td><a href="editshoe.jsp?id=<%=es.getId()%>">Edit</a></td><td><a href="deleteshoe.jsp?id=<%=es.getId()%>">Delete</a></td></tr>
<% }%>
</table>

<p>


<h2 style="color: blue;font-style: italic;">Ordered Item List</h2>
<br>


<% 
List<OrderredShoe> arr1=(List<OrderredShoe>)request.getAttribute("orderlist"); %>


<table border="1" style="border-color: blue">
<tr><th>&nbsp;order id &nbsp; </th><th>&nbsp;Order name&nbsp;</th><th>&nbsp;Price&nbsp;</th><th>&nbsp;User&nbsp;</th><th>&nbsp;Phone No&nbsp;</th><th>&nbsp;Trans id&nbsp;</th></tr>

<%

for(OrderredShoe or:arr1){
%>
<tr><td><%=or.getOrdrid() %></td><td><%=or.getShoeName() %></td><td><%=or.getPrice() %></td><td><%=or.getUser() %></td><td><%=or.getPhoneNo() %></td><td><%=or.getTranid() %></td></tr>
<% }%>
</table>

<p>
</div>
</body>
</html>
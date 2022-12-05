<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="com.fly.pojo.Airline"%>
<%@page import="com.fly.dao.AirLineDao"%>
<%@page import="java.util.List"%>
<%@page import="com.fly.pojo.Places"%>
<%@page import="com.fly.dao.PlaceDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="FilterData.jsp" method="post">
<h3>FlyAway (An Airline Booking Portal).</h3>
<h4 align="right"><a href="login.jsp"> Admin login</a></h4>

Select Flight :
<div style="border: 1px solid black">

From :
<%

PlaceDao dao=new PlaceDao();
List<Places> list=dao.getPlaces();
 %>

<select name="source">
<option>Select Source</option>
  <%
  
  for(Places c:list){
	  %>
	  <option value="<%=c.getPlacename()%>"><%=c.getPlacename() %></option>
  <% }
  
  
  
  %>
</select>

&nbsp;&nbsp;&nbsp;

To :
<%


 %>

<select name="destination">
<option>Select Destination</option>
  <%
  
  for(Places c:list){
	  %>
	  <option value="<%=c.getPlacename()%>"><%=c.getPlacename() %></option>
  <% }
  
  
  
  %>
</select>
&nbsp;&nbsp;&nbsp; 
Date Of Journey:
<input type="date" name="date"><br>

No of Person :
<input type="number" name="person">

<input type="submit"  value="Search">
</form>
</div>
<br><br>
</div>
</body>
</html>
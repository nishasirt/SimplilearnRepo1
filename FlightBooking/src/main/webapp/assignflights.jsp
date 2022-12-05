<%@page import="java.util.ArrayList"%>
<%@page import="com.fly.pojo.Airline"%>
<%@page import="com.fly.dao.AirLineDao"%>
<%@page import="java.util.List"%>
<%@page import="com.fly.pojo.Places"%>
<%@page import="com.fly.dao.PlaceDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<p><p>
<div align="center" style="border: 1px solid black">

<%
		
	
		
		
		%>

<h2>Assign Flight</b></h2>


<form action="AssignFlightController"  method="post">

From :<br>
<%

PlaceDao dao=new PlaceDao();
List<Places> list=dao.getPlaces();
 %>

<select name="source">
<option value="Select source">Select source</option>
  <%
  
  for(Places c:list){
	  %>
	  <option value="<%=c.getPlacename()%>"><%=c.getPlacename() %></option>
  <% }
  
  
  
  %>
</select>
<br><br>
To :<br>
<%


 %>

<select name="destination">
<option value="Select Destination ">Select Destination </option>
  <%
  
  for(Places c:list){
	  %>
	  <option value="<%=c.getPlacename()%>"><%=c.getPlacename() %></option>
  <% }
  
  
  
  %>
</select>
<br><br>
 Select Airlines :<br>
 
 <%
 
 AirLineDao dao1=new AirLineDao();
 
 ArrayList<Airline> arr=(ArrayList<Airline>)dao1.getAirlines();%>
 <select name="airline">
 <option name="Select airline">Select airline</option>
 <%
 
 for(Airline s:arr){
	  %>
	  <option value="<%=s.getAirName()%>"><%=s.getAirName() %></option>
 <% }
 
 
 
 %>
</select>
 
 <br><br>
 Flight Name :
 <input type="text" name="flname">
 
 <br><br>
 Flight Price :
 <input type="number" name="flprice">
<br><br>
<input type="submit"  value="Assign">
<br><br>
</form>


</div>

<div align="center">
<%




%>




</div>


%>

</body>
</html>
<%@page import="com.fly.pojo.MapFligts"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.fly.dao.MapFlightDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div  style="border: 1px solid black">

<br>

<a href="addplaces.jsp" >place</a>&nbsp;&nbsp;<a href="addairlines.jsp">Airline</a>&nbsp;&nbsp;<a href="login.jsp" >Logout</a>
<br> <br>
</div><p>
<div align="center"  style="border: 1px solid black">
<A href="assignflights.jsp" >Assign Flights</A>

<br><br><p>
</p>

<h3>Flight List</h3>
<%
MapFlightDao dao1=new MapFlightDao();

ArrayList<MapFligts> arr=(ArrayList<MapFligts>)dao1.getFlights();





%>

<table border="1">
    <tr><th>ID</th><th>Flight Name</th><th>Flight Airline</th><th>Price</th><th>Source</th><th>Destination</th></tr>
     <%for(MapFligts cc:arr)
    {%>
    	<tr><td><%=cc.getId()%></td><td><%=cc.getFlightName()%><td><%=cc.getAirline()%>
    	 <td><%=cc.getPrice()%></td><td><%=cc.getSource()%></td>
	   <td><%=cc.getDestination()%></td>
	    </tr>
   <%  }
    	
    	
    	%>
    
	</table>


</div>


</body>
</html>
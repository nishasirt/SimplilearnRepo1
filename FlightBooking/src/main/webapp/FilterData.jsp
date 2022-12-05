<%@page import="com.fly.dao.MapFlightDao"%>
<%@page import="com.fly.pojo.MapFligts"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="dashborad.jsp" %>


<p>
<%

String src=request.getParameter("source");
String des=request.getParameter("destination");


MapFligts m=new MapFligts();

m.setSource(src);
m.setDestination(des);
MapFlightDao dao1=new MapFlightDao();

List<MapFligts> list1=dao1.getFlightss(m);

if(list1.size()<1){
	out.print("No flight found");
}





%>


<div align="center">
<table border="1">

    <tr><th>ID</th><th>Flight Name</th><th>Flight Airline</th><th>Price</th><th>Source</th><th>Destination</th><th>Action</th></tr>
     <%for(MapFligts cc:list1)
    {%>
    	<tr><td><%=cc.getId()%></td><td><%=cc.getFlightName()%><td><%=cc.getAirline()%>
    	 <td><%=cc.getPrice()%></td><td><%=cc.getSource()%></td>
	   <td><%=cc.getDestination()%></td><td><a href="registerdetail.jsp?id=<%=cc.getId()%>">Book</a></td>
	    </tr>
   <%  }
    	
    	
    	%>
    
	</table>
	
	
	
	</div>
	<%
	session.setAttribute("date", request.getParameter("date"));
	session.setAttribute("person", request.getParameter("person"));
	
	 %>
</body>
</html>
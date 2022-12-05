<%@page import="com.fly.dao.BookFlightDao"%>
<%@page import="com.fly.pojo.BookedFlight"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h4 align="center">Ticket has Confirmed</h4>

PNR is :

<%=request.getParameter("pnr")%>


<%

BookFlightDao dao=new BookFlightDao();
BookedFlight bookedFlight=dao.getFlight(request.getParameter("pnr"));



%>

<table border="1">

<tr>
<th>From </th><td><%=bookedFlight.getFligts().getSource() %></td>

</tr>

<tr>
<th>To </th><td><%=bookedFlight.getFligts().getDestination()%></td>

</tr>

<tr>
<th>Date of Journey </th><td><%=bookedFlight.getDate() %></td>

</tr>
</table>



</body>
</html>
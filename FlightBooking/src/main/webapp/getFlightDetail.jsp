<%@page import="com.fly.dao.MapFlightDao"%>
<%@page import="com.fly.pojo.MapFligts"%>
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

<%String date=(String)session.getAttribute("date");

%>

<%String person=(String)session.getAttribute("person");

%>
<%int i=(int)session.getAttribute("fid");%>
<%
MapFlightDao dao=new MapFlightDao();

MapFligts map=dao.getFlight(i);



%>
<h4 align="center">Varify Detail</h4>
<div align="center">
<form action="payment.jsp" method="post">

<table border="1"  align="center">


<tr>
<th>Flight Name</th><td><%=map.getFlightName() %>
<input type="hidden" name="fid"  value="<%=i %>">
<input type="hidden" name="fname"  value="<%=map.getFlightName() %>">
</td>
</tr>
<tr>
<th>Airline</th><td><%=map.getAirline() %>
<input type="hidden" name="alinname"  value="<%=map.getAirline() %>"></td>
</tr>
<tr>
<th>From</th><td><%=map.getSource() %>
<input type="hidden" name="src"  value="<%=map.getSource() %>"></td>
</tr>
<tr>
<th>To</th><td><%=map.getDestination()%>
<input type="hidden" name="des"  value="<%=map.getDestination()%>"></td>
</tr>
<tr>
<th>Price</th><td><%=map.getPrice() %>
<input type="hidden" name="price"  value="<%=map.getPrice()%>"></td>
</tr>
<tr>
<th>Travel Date</th><td><%=date %>
<input type="hidden" name="date"  value="<%=date%>">
</td>
</tr>
<tr>
<th>Seats</th><td><%=person %>
<input type="hidden" name="person"  value="<%=person%>">
</td>
</tr>
<tr>
<th>Passanger Name</th><td><%=request.getParameter("name") %>
<input type="hidden" name="passname"  value="<%=request.getParameter("name")%>"></td>
</tr>
<tr>
<th>Passanger Mobile No</th><td><%=request.getParameter("mobile")  %>
<input type="hidden" name="passMob"  value="<%=request.getParameter("mobile")%>">
</td>
</tr>
<tr>
<th>Passanger Email</th><td><%=request.getParameter("email")  %>
<input type="hidden" name="passmail"  value="<%=request.getParameter("email")%>"></td>
</tr>
</tr>
<tr>
<th>Final Amount</th><td><%=(map.getPrice()*Integer.parseInt(person))%> 
<input type="hidden" name="famt"  value="<%=(map.getPrice()*Integer.parseInt(person))%>"></td> </td>
</tr>

</table>
<br>
<input type="submit"  value="Pay to Book"  >



</form>

</div>




</body>
</html>
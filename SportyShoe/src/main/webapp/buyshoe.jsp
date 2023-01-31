<%@page import="com.shoe.sporty.pojo.Customerr"%>
<%@page import="com.shoe.sporty.pojo.Shoe"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Shoe  s=(Shoe)request.getAttribute("shoe");
Customerr c=(Customerr)request.getAttribute("customer");
%>
<h4 align="center">Varify Detail</h4>
<div align="center"  style="border: 1">
<form action="payment" method="post">

<table border="1"  align="center">


<tr>
<th>Shoe  Name</th><td><%=s.getShoeName() %>
<input type="hidden" name="sid"  value="<%=s.getId() %>">
<input type="hidden" name="sname"  value="<%=s.getShoeName()%>">
</td>
</tr>
<tr>
<th>Shoe Price</th><td><%=s.getPrice() %>
<input type="hidden" name="price"  value="<%=s.getPrice()%>"></td>
</tr>
<tr>
<th>Shoe Color</th><td><%=s.getColor() %>
<input type="hidden" name="color"  value="<%=s.getColor() %>"></td>
</tr>
<tr>
<th>Buyer</th><td><%=c.getUsername()%>
<input type="hidden" name="user"  value="<%=c.getUsername()%>"></td>
</tr>
<tr>
<th>Phone NO</th><td><%=c.getPhone() %>
<input type="hidden" name="phone"  value="<%=c.getPhone()%>"></td>
</tr>


</table>
<br>
Select bank : 
<select name="bank">
<option value="SBI">SBI</option>
<option value="IDBI">IDBI</option>


</select><br><br>
<input type="submit"  value="Pay to Buy"  >



</form>

</div>

</body>
</html>
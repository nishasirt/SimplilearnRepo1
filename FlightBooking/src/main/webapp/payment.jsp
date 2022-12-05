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

String famt=request.getParameter("famt");

     
%>
<form  method="post"  action="PaymentController">
<input type="hidden" name="fid"  value="<%=request.getParameter("fid") %>">
<input type="hidden" name="fname"  value="<%=request.getParameter("fname") %>">
<input type="hidden" name="alinname"  value="<%=request.getParameter("alinname")  %>">
<input type="hidden" name="src"  value="<%=request.getParameter("src")  %>">
<input type="hidden" name="des"  value="<%=request.getParameter("des")%>">
<input type="hidden" name="price"  value="<%=request.getParameter("price")%>">
<input type="hidden" name="date"  value="<%=request.getParameter("date")%>">
<input type="hidden" name="person"  value="<%=request.getParameter("person")%>">
<input type="hidden" name="passname"  value="<%=request.getParameter("passname")%>">
<input type="hidden" name="passMob"  value="<%=request.getParameter("passMob")%>">
<input type="hidden" name="passmail"  value="<%=request.getParameter("passmail")%>">
<input type="hidden" name="famt"  value="<%=famt%>">

<div align="center">
<h4>Procced to pay <%=famt %></h4>

Enter card no : <input type="text"  name="cardNo"><br><br>
Enter CVV : <input type="text"  name="cvv"><br><br>

OR

<br><br>

Enter UPI ID : <input type="text"  name="upi">

<br><br>
<input type="submit"  value="Pay">
</form>
</div>

</body>
</html>
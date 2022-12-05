<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="border: 1px solid black" align="center">
<h4>Register to Book</h4>
<p>
<form  method="post" action="getFlightDetail.jsp">
<% int c=Integer.parseInt(request.getParameter("id"));
session.setAttribute("fid", c);%>



Enter Name :  <input type="text" name="name"><br><br>
Enter MobileNo :  <input type="number" name="mobile"><br><br>

Enter Email :  <input type="text" name="email"><br><br>


<input type="hidden" value="<%=session.getAttribute("date")%>" name="date">

<input type="hidden" value="<%=session.getAttribute("person")%>" name="person">
<input type="submit"  value="OK">


</form>

</div>

</body>
</html>
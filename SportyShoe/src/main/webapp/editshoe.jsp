<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" style="border: 1px solid black">
<p><p><p>
<h2 style="color: blue">Update Shoe</h2>
<p><p>
<%int sid=Integer.parseInt(request.getParameter("id")); %>

<form action="updateshoe" method="post">


Shoe name : <input type="text" name="shoename"><p>
Shoe Color : <input type="text" name="color"><p>
Shoe Price : <input type="number" name="price"><p>
Shoe Brand : <input type="text" name="brand"><p>

<input type="hidden" name="sid" value="<%=sid%>">

  </p>
<input type="submit" value="Update">


</form>
<p>

 </div>

</body>
</html>
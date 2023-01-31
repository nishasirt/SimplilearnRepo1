<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%int sid=Integer.parseInt(request.getParameter("id")); %>
<form action="deleteshoe"  method="post">

<input type="hidden" name="sid" value="<%=sid%>">
<input type="submit" value="Confirm Delete shoe"  >




</form>
</body>
</html>
<%@page import="com.learn.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%


UserDao dao=new UserDao();
System.out.println("id  " + Integer.parseInt(request.getParameter("id")));
int r=dao.deleteUser(Integer.parseInt(request.getParameter("id")));

if(r>0)
{%>
<%= "deleted sucessfully" %>
	<jsp:include page="RetriveController.jsp" />
	
<% }
else{%>
	
	<%= "deleted not sucessfully done" %>
<% }

%>




</body>
</html>
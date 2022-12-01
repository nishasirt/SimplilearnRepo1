<%@page import="com.learn.dao.ClassesDao"%>
<%@page import="com.learn.bean.Classes"%>
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
out.print(request.getParameter("id"));

Classes c=new Classes();
c.setId(Integer.parseInt(request.getParameter("id")));

ClassesDao dao=new ClassesDao();
 String s=dao.delete(Integer.parseInt(request.getParameter("id")));
   if(s.equalsIgnoreCase("deleted"));
   
   {
	  response.sendRedirect("Dashboard.jsp");
   }

%>
</body>
</html>
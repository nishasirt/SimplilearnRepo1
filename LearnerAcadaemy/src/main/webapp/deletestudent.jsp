<%@page import="com.learn.dao.StudentDao"%>
<%@page import="com.learn.bean.Student"%>
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

Student c=new Student();
c.setId(Integer.parseInt(request.getParameter("id")));

StudentDao dao=new StudentDao();
 String s=dao.delete(Integer.parseInt(request.getParameter("id")));
   if(s.equalsIgnoreCase("deleted"));
   
   {
	  response.sendRedirect("student.jsp");
   }

%>
</body>
</html>
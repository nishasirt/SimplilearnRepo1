<%@page import="com.learn.dao.TeacherDao"%>
<%@page import="com.learn.bean.Teacher"%>
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

Teacher c=new Teacher();
c.setTid(Integer.parseInt(request.getParameter("id")));

TeacherDao dao=new TeacherDao();
 String s=dao.delete(Integer.parseInt(request.getParameter("id")));
   if(s.equalsIgnoreCase("deleted"));
   
   {
	  response.sendRedirect("teacher.jsp");
   }

%>
</body>
</html>
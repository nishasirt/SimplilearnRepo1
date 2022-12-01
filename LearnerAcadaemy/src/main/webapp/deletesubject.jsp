<%@page import="com.learn.dao.SubjectDao"%>
<%@page import="com.learn.bean.Subject"%>
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

Subject c=new Subject();
c.setSubid(Integer.parseInt(request.getParameter("id")));

SubjectDao dao=new SubjectDao();
 String s=dao.deleteSubject(Integer.parseInt(request.getParameter("id")));
   if(s.equalsIgnoreCase("deleted"));
   
   {
	  response.sendRedirect("subject.jsp");
   }

%>

</body>
</html>
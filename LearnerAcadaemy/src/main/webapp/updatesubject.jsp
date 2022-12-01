<%@page import="com.learn.bean.Subject"%>
<%@page import="com.learn.dao.SubjectDao"%>
<%@page import="com.learn.dao.TeacherDao"%>
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
SubjectDao dao=new SubjectDao();

Subject ss=dao.getSubject(Integer.parseInt(request.getParameter("id")));
ss.setSubid(ss.getSubid());
ss.setName(ss.getName());

%>

<div  align="center"  style="border: 1px solid black"><p>
<h2>Update Subject name  <%=ss.getName()%></h2>
<form action="UpdateSubject"   method="post">
 Name   :        <input type="text"  name="subname"><br><br>

<input type="hidden" value="<%=ss.getSubid()%>" name="subid" >
 <br><br>
<input type="submit"  value="update">
</form>
</body>
</html>
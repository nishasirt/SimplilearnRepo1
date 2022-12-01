<%@page import="com.learn.bean.Teacher"%>
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
TeacherDao dao=new TeacherDao();
Teacher t=dao.getTeacher(Integer.parseInt(request.getParameter("id")));
t.setTid(t.getTid());
t.setName(t.getName());
t.setDesiganmetion(t.getDesiganmetion());
%>

<div  align="center"  style="border: 1px solid black"><p>
<h2>Update Teacher name  <%=t.getName()%></h2>
<form action="UpdateTeacher"   method="post">
 Name   :        <input type="text"  name="tname"><br><br>
Designation <input type="text"  name="tdes">
<input type="hidden" value="<%=t.getTid()%>" name="tid" >
 <br><br>
<input type="submit"  value="update">
</form>

</div>
</body>
</html>
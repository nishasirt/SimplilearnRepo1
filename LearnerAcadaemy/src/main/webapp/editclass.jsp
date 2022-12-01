<%@page import="com.learn.bean.Classes"%>
<%@page import="com.learn.dao.ClassesDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="updateclass.jsp" method="post">
<%
ClassesDao dao=new ClassesDao();

System.out.println("id upadte form page"+request.getParameter("id"));

Classes u=dao.getClasse(Integer.parseInt(request.getParameter("id")));%></P>

Class Name : <input type="text" name="name" value="<%=u.getName()%>"></P>

<input type="hidden"  name="id" value="<%=u.getId()%>">

<input type="submit" value="ok">

</form>


</body>
</html>
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



ClassesDao dao=new ClassesDao();
Classes u=dao.getClasse(Integer.parseInt(request.getParameter("id")));

u.setId(u.getId());
u.setName(u.getName());



%>
<div  align="center"  style="border: 1px solid black"><p>
<h2>Update class name  <%=u.getName()%></h2>
<form action="UpdateClassController"   method="post">
<input type="text"  name="cname">
<input type="hidden" value="<%=u.getId()%>" name="cid" >
 <br><br>
<input type="submit"  value="update">
</form>

</div>
</body>
</html>
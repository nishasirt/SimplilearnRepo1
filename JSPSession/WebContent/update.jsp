<%@page import="com.learn.dao.UserDao"%>
<%@page import="com.learn.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateData.jsp" method="post">
<%
UserDao dao=new UserDao();

System.out.println("id upadte form page"+request.getParameter("id"));

User u=dao.getUser(Integer.parseInt(request.getParameter("id")));%></P>

User Name : <input type="text" name="name" value="<%= u.getName()%>"></P>
Email id :<input type="text" name="email" value="<%=u.getEmail()%>"></P>
Mobile No:<input type="text" name="mobile" value="<%=u.getMobileNo()%>"></P>
<input type="hidden"  name="id" value="<%=u.getId()%>">

<input type="submit" value="ok">

</form>
</body>
</html>
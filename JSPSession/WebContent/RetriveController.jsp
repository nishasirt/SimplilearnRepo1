<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@page import="com.learn.bean.*" %>
     <%@page import="com.learn.dao.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

UserDao dao=new UserDao();

 
try {
	ArrayList<User>  arr=dao.getAllUser();
    
	%>
	<a href="">>>previous</a>
	<a href="">next<<</a>
	<table border="1">
    <tr><th>Name</th><th>Email</th><th>MobileNO</th></tr>
	
	<% for(User u:arr)
	{%>
		<tr><td><%=u.getName()%></td><td><%=u.getEmail()%></td>
		<td> <%= u.getMobileNo() %></td>
	  <td><a href="update.jsp?id=<%=u.getId()%>">Edit with  id</a></td>
	   <td><a href="delete.jsp?id=<%=u.getId()%>">Delete </a></td></tr>

		
		
	<% }%>
	
    
	</table>
    </form>
<%  }catch (Exception  e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>



</body>
</html>
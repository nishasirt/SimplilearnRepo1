<%@page import="com.learn.bean.Classes"%>
<%@page import="java.util.ArrayList"%>
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

<div  style="border: 1px solid black">

<br>

<a href="Dashboard.jsp" >Class</a>&nbsp;&nbsp;<a href="student.jsp">Student</a>&nbsp;&nbsp;<a href="subject.jsp">Subject</a>
&nbsp;&nbsp;<a href="teacher.jsp" >Teacher</a>&nbsp;&nbsp;<a href="login.jsp" >Logout</a>
</div>
<p><p><p>
<div align="center"  style="border: 1px solid black">
<p><p>
<form action="AddClass.jsp">

<input type="submit" value="Add Class">

</form>
<p><p>

<%
ClassesDao classesDao=new ClassesDao();
ArrayList<Classes> arr=(ArrayList<Classes>) classesDao.getAllClasses();

%>

<p>
<form >
<table border="1">
    <tr><th>ID</th><th>Class Name</th><th>Assign subject and teacher</th><th>Edit</th><th>Delete</th><th>View subjects,Teachers & Students</th></tr>
    
    <%for(Classes cc:arr)
    {%>
    	<tr><td><%=cc.getId()%></td><td><%=cc.getName()%><td><a href="assigndata.jsp?cid=<%=cc.getId()%>"> subject and teacher</a></td>
    	 <td><a href="updateclass.jsp?id=<%=cc.getId()%>">Edit </a></td>
	   <td><a href="deleteclass.jsp?id=<%=cc.getId()%>">Delete </a></td>
	    <td><a href="ViewAssigned.jsp?id=<%=cc.getId()%>">View </a></td></tr>
   <%  }
    	
    	
    	%>
    
    
	</table>
</form>
</div>


</body>
</html>
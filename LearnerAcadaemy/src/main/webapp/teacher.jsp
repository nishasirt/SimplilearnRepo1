<%@page import="com.learn.bean.Teacher"%>
<%@page import="java.util.List"%>
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
<div  style="border: 1px solid black"><a href="Dashboard.jsp" >Class</a>&nbsp;&nbsp;<a href="student.jsp">Student</a>&nbsp;&nbsp;<a href="subject.jsp">Subject</a>
&nbsp;&nbsp;<a href="teacher.jsp" >Teacher</a>&nbsp;&nbsp;<a href="login.jsp" >Logout</a>
</div>
<p><p><p>
<div align="center"  style="border: 1px solid black">
<p><p>
<form action="Addteacher.jsp">

<input type="submit" value="Add Teacher">

</form>

<%
TeacherDao dao=new TeacherDao();
List<Teacher> tlist=dao.getAllTeachers();

%>
<p><p>

<p>
<table border="1">
    <tr><th>ID</th><th>Teacher Name</th><th>Teacher Designation</th><th>Edit</th><th>Delete</th></tr>
     <%for(Teacher cc:tlist)
    {%>
    	<tr><td><%=cc.getTid()%></td><td><%=cc.getName()%><td><%=cc.getDesiganmetion()%>
    	 <td><a href="updateteacher.jsp?id=<%=cc.getTid()%>">Edit </a></td>
	   <td><a href="deleteteacher.jsp?id=<%=cc.getTid()%>">Delete </a></td>
	    </tr>
   <%  }
    	
    	
    	%>
    
	</table>

</div>

</body>
</html>
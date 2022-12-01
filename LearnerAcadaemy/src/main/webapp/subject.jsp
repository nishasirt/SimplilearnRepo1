<%@page import="com.learn.bean.Subject"%>
<%@page import="java.util.List"%>
<%@page import="com.learn.dao.SubjectDao"%>
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
<form action="Addsubject.jsp">

<input type="submit" value="Add Subject">

</form>
<p><p>

<%
SubjectDao dao=new SubjectDao();
List<Subject> list=dao.getAllSubject();

%>

<p>
<table border="1">
    <tr><th>ID</th><th>Subject Name</th><th>Edit</th><th>Delete</th></tr>
      <%for(Subject cc:list)
    {%>
    	<tr><td><%=cc.getSubid()%></td><td><%=cc.getName()%>
    	 <td><a href="updatesubject.jsp?id=<%=cc.getSubid()%>">Edit </a></td>
	   <td><a href="deletesubject.jsp?id=<%=cc.getSubid()%>">Delete </a></td>
	    </tr>
   <%  }
    	
    	
    	%>
    
	</table>

</div>

</body>
</html>
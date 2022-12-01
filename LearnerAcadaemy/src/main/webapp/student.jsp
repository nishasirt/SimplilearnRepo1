<%@page import="com.learn.bean.Classes"%>
<%@page import="java.util.List"%>
<%@page import="com.learn.bean.Student"%>
<%@page import="com.learn.dao.StudentDao"%>
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
<form action="Addstudent.jsp" method="post">

<input type="submit" value="Add Student">

</form>
<p><p>
<%
StudentDao dao=new StudentDao();
List<Student> list=dao.getAllStudent();

%>
<p>
<table border="1">
    <tr><th>ID</th><th>First Name</th><th>last Name</th><th>Address</th><th>Phone No</th><th>Class</th><th>Edit</th><th>Delete</th></tr>
    
     <%for(Student cc:list)
    	 
    	 
    {
    	
   // Student cc=(Student) liste[1];

    
    %>
    

    
    	<tr><td><%=cc.getId()%></td><td><%=cc.getFname()%></td><td><%=cc.getLname()%></td><td><%=cc.getAddress()%></td><td><%=cc.getMobileNo()%></td>
    	<td><%=cc.getClasses().getName()%></td> <td><a href="updatestudent.jsp?id=<%=cc.getId()%>">Edit </a></td>
	   <td><a href="deletestudent.jsp?id=<%=cc.getId()%>">Delete </a></td>
	    </tr>
   <%  }
    	
    	
    	%>
	</table>

</div>
</body>
</html>
<%@page import="java.util.List"%>
<%@page import="com.learn.dao.StudentDao"%>
<%@page import="com.learn.bean.Student"%>
<%@page import="com.learn.bean.Classes"%>
<%@page import="com.learn.dao.ClassesDao"%>
<%@page import="com.learn.bean.ReportSubjectNTeacher"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.learn.dao.AssignDao"%>
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
	int sc = Integer.parseInt(request.getParameter("id"));

	ClassesDao vf = new ClassesDao();
	Classes ccc = vf.getClasse(sc);
	String name = ccc.getName();
	%>

	
	<%
	int id = Integer.parseInt(request.getParameter("id"));

	AssignDao Dao = new AssignDao();
	ArrayList<ReportSubjectNTeacher> arr = (ArrayList<ReportSubjectNTeacher>) Dao.getAllData(id);
	%>

	<p>

	<div  style="border: 1px solid black"  align="center">
		<h2>
		View Teacher and Subject for <b><%=name%></b>
	</h2><p>
	<form>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Class Name</th>
				<th>Subject Name</th>
				<th>Teacher Name</th>
			</tr>

			<%
			for (ReportSubjectNTeacher cc : arr) {
			%>

			<tr>
				<td><%=cc.getId()%></td>
				<td><%=cc.getClassName()%>
				<td><%=cc.getSuBName()%></td>
				<td><%=cc.gettName()%></td>
			</tr>
			<%
			}
			%>


		</table>

		<p>
		<p>

			<%
			StudentDao dao = new StudentDao();
			List<Student> arr1 = dao.getAllData(id);
			%>
		
		<p>
		<h2>
			View Students for <b><%=name%></b>
		</h2>
		<form>
			<table border="1">
				<tr>
					<th>ID</th>
					<th>Student Name</th>
					<th>Address</th>
					<th>Phone No</th>
					<th>DOB</th>
					<th>Class</th>
				</tr>

				<%
				for (Student cc : arr1) {
				%>

				<tr>
					<td><%=cc.getId()%></td>
					<td><%=cc.getFname() + " " + cc.getLname()%>
					<td><%=cc.getAddress()%></td>
					<td><%=cc.getMobileNo()%></td>
					<td><%=cc.getDob()%></td>
					<td><%=cc.getClasses().getName()%></td>
				</tr>
				<%  }
    	
    	
    	%>


			</table>
			</form>
			</form></div>
</body>
</html>
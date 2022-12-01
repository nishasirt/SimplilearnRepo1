<%@page import="com.learn.dao.AssignDao"%>
<%@page import="com.learn.bean.ReportSubjectNTeacher"%>
<%@page import="com.learn.bean.Teacher"%>
<%@page import="com.learn.dao.TeacherDao"%>
<%@page import="com.learn.bean.Subject"%>
<%@page import="com.learn.dao.SubjectDao"%>
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

<p><p>
<div align="center" style="border: 1px solid black">

<%int  sc=Integer.parseInt(request.getParameter("cid"));
		
		ClassesDao vf=new ClassesDao();
		Classes cc=vf.getClasse(sc);
		String name=cc.getName();
		
		
		%>

<h2>Assign Teacher and Subject for <b><%=name%></b></h2>


<form action="AssinController"  method="post">

Select Teacher :<br>
<%



TeacherDao tDao=new TeacherDao();
ArrayList<Teacher> arr=(ArrayList<Teacher>) tDao.getAllTeachers(); %>
<input type="hidden" name="cid"  value="<%=sc%>"/>
<select name="teacher">
  <%
  
  for(Teacher c:arr){
	  %>
	  <option value="<%=c.getTid()+","+c.getName()%>"><%=c.getName() %></option>
  <% }
  
  
  
  %>
</select>
<br><br>
 Select Subject :<br>
 
 <%SubjectDao dao=new SubjectDao();
 
 ArrayList<Subject> arrsub=(ArrayList<Subject>)dao.getAllSubject();%>
 <select name="subject">
 <%
 
 for(Subject s:arrsub){
	  %>
	  <option value="<%=s.getSubid()+","+s.getName()%>"><%=s.getName() %></option>
 <% }
 
 
 
 %>
</select>
 
 
 

<br><br>
<input type="submit"  value="Assign">
<br><br>
</form>
</div>


<p><p>


	

	
	<%
	//int id = Integer.parseInt(request.getParameter("id"));

	AssignDao Dao = new AssignDao();
	ArrayList<ReportSubjectNTeacher> arr1 = (ArrayList<ReportSubjectNTeacher>) Dao.getAllData(sc);
	%>

	<p>

	<div  style="border: 1px solid black"  align="center">
		
	
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Class Name</th>
				<th>Subject Name</th>
				<th>Teacher Name</th>
				<th>Action</th>
			</tr>

			<%
			for (ReportSubjectNTeacher cc1 : arr1) {
			%>

			<tr>
				<td><%=cc1.getId()%></td>
				<td><%=cc1.getClassName()%>
				<td><%=cc1.getSuBName()%></td>
				<td><%=cc1.gettName()%></td>
				<td><a href="deleteassign.jsp?id=<%=cc1.getId()%>">Delete </a></td><
			</tr>
			<%
			}
			%>


		</table>



</body>
</html>
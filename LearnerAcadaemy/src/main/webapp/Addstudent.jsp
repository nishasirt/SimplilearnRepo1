<%@page import="com.learn.dao.ClassesDao"%>
<%@page import="com.learn.bean.Classes"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<div align="center" style="border: 1px solid black">

<h2>Add Student</h2>
<form action="AddStudentController" method="post">
Student First Name :<br>
<input type="text"  name="fname"><br><br>
Student Last Name :<br>
<input type="text"  name="lname"><br><br>
Student Phone :<br>
<input type="text"  name="phone"><br><br>

Student Address :<br>
<input type="text"  name="address"><br><br>
Student DOB :<br>
<input type="date"  name="dob"><br><br>
Student class :<br>
<% ClassesDao classesDao=new ClassesDao();
ArrayList<Classes> arr=(ArrayList<Classes>) classesDao.getAllClasses(); %>
<select name="class">
  <%
  
  for(Classes c:arr){
	  %>
	  <option value="<%=c.getId()+","+c.getName()%>"><%=c.getName() %></option>
  <% }
  
  
  
  %>
</select>

<p>

<input type="submit" value="OK">

</form>





</div>


</body>
</html>
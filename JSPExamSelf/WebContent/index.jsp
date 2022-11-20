
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>hello from html</h4>
<%="<h2>hello from JSp</h2>" %>

<% int x=10; %>
<input type="text" value="<%= x %>">

<%


for(int i=0;i<5;i++)
{
	out.print("i = "+i+"<br/>");
}
%>

<%-- commentsss --%>

The Current date :  =<%= new Date() %><br/>
<%@include file="footer.html" %>

<form action="">
Enter Name :<input type="text" name=""fname"><br/>

  <input type="submit" name="click" value="click me">
  
  
  <%
  
     if(request.getParameter("click")!=null)
     {
    	 
    	 out.print("Hello "+request.getParameter("fname"));
     }
  
  
  %>
</form>

</body>
</html>
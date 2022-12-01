<%@page import="com.learn.dao.ClassesDao"%>
<%@page import="com.learn.bean.Classes"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.boot.MetadataSources"%>
<%@page import="org.hibernate.boot.Metadata"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistry"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
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

   Classes classes=new Classes();
    classes.setId(1);
        classes.setName(request.getParameter("classname"));
        ClassesDao dd=new ClassesDao();
     String s=   dd.insert(classes);
       if(s.equalsIgnoreCase("data inserted"))
       {%>
    	  <%@ include file="Dashboard.jsp"%>
      <% }
      
       else{%>
    	   <%@ include file="fail.html" %>
      <% }

%>

</body>
</html>
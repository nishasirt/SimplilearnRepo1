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
<%User u =new User();
System.out.println("inside ser");
u.setName(request.getParameter("name"));
u.setEmail(request.getParameter("email"));
u.setMobileNo(Long.parseLong(request.getParameter("mobile")));
u.setPass(request.getParameter("pswd"));

UserDao dao=new UserDao();
try {
	int r=dao.insert(u);
	if(r>0)
	{
		response.sendRedirect("RetriveController.jsp");
		
	}
	else{
		response.sendRedirect("fail.jsp");
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.io.*, com.ajay.service.Student, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "purple">

<%
List <Student> s =(List<Student>) request.getAttribute("student"); 

%>
<table border =1>

	<th><b>stdId</b></th>
	<th><b>stdName</b></th>
	<th><b>stdAge</b></th>	
<% for(Student ss : s) { %>
<tr>
	<td><%= ss.getStdId() %> </td>
	<td> <%= ss.getStdName() %></td>
    <td><%= ss.getStdAge() %> </td>   
</tr>
<% } %>

</table>
<br>

<a href = "index.jsp">Add Another Student</a>
</body>
</html>
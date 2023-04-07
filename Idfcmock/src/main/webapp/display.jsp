<%@page import="Dto.PatientDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="4px">
<tr>
<td>ID</td>
<td>Name</td>
<td>Blood</td>
<td>Age</td>
</tr>
<%PatientDto dto=(PatientDto)request.getAttribute("key2"); %>
<tr>
<td> <%=dto.getId() %></td>
<td> <%=dto.getName() %></td>
<td> <%=dto.getBlood() %></td>
<td> <%=dto.getAge() %></td>
</tr>
</table>
</body>
</html>
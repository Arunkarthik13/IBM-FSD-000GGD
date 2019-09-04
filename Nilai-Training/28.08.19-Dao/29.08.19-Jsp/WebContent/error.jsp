<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<String> err=(List<String>)request.getAttribute("ERROR");
for(String s:err)
{
	out.println(s+"<br/>");
}


%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String name = request.getParameter("username");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
    <h2>Hello, <%= (name != null && !name.trim().isEmpty()) ? name : "Guest" %>!</h2>
</body>
</html>

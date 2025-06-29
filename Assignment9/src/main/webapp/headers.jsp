<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
    <title>Request Headers</title>
</head>
<body>
    <h2>Request Headers Sent by Your Browser:</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>Header Name</th>
            <th>Header Value</th>
        </tr>
        <%
            Enumeration<String> headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String headerName = headerNames.nextElement();
                String headerValue = request.getHeader(headerName);
        %>
        <tr>
            <td><%= headerName %></td>
            <td><%= headerValue %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello, Web.</title>
</head>
<body>
<h1>Hello, Spring!</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>名称</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
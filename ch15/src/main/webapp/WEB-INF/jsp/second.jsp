<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <spring:message code="second"/><br><br>
        <a href="${pageContext.request.contextPath}/my/third">
            <spring:message code="third" arguments="888,999"/>
        </a>
    </body>
</html>

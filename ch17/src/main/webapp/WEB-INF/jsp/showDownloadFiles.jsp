<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>文件下载</title>
    </head>
    <body>
        <table>
            <tr>
                <td>被下载的文件名</td>
            </tr>
            <c:forEach items="${files}" var="filename">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/download?filename=${filename}">${filename}</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

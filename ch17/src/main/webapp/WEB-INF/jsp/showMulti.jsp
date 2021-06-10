<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        ${fileDomain.description}<br>
        ${fileDomain.myFile.originalFilename}
        <table>
            <tr>
                <td>详情</td>
                <td>文件名</td>
            </tr>
            <c:forEach items="${multiFileDomain.description}" var="description" varStatus="loop">
                <tr>
                    <td>${description}</td>
                    <td>${multiFileDomain.myFile[loop.count-1].originalFilename}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
showOne.jsp
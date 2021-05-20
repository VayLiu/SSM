<%--
  Created by IntelliJ IDEA.
  User: Vay
  Date: 2021/5/14
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>用户列表</h1>
        <a href="<c:url value="/user/input"/>">继续添加</a>
        <table>
            <tr>
                <td>用户名</td>
                <td>兴趣爱好</td>
                <td>朋友</td>
                <td>职业</td>
                <td>户籍</td>
                <td>个人描述</td>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.userName}</td>
                    <td>${user.hobby}</td>
                    <td>${user.friends}</td>
                    <td>${user.career}</td>
                    <td>${user.houseRegister}</td>
                    <td>${user.remark}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
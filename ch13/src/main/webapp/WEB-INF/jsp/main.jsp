<%--
  Created by IntelliJ IDEA.
  User: Vay
  Date: 2021/5/20
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>登录成功</title>
    </head>
    <body>
        当前用户：<p>${user.username}</p>
        <a href="${pageContext.request.contextPath}/logout">退出</a>
    </body>
</html>

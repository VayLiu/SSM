<%--
  Created by IntelliJ IDEA.
  User: Vay
  Date: 2021/5/20
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>登录页面</title>
    </head>
    <body>
        ${msg}
        <form action="${pageContext.request.contextPath}/login" method="post">
            用户名：<input type="text" name="username"><br>
            密码：<input type="password" name="password"><br>
            <input type="submit" value="登录">
        </form>
    </body>
</html>

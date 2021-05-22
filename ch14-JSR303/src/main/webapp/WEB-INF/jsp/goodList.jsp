<%--
  Created by IntelliJ IDEA.
  User: Vay
  Date: 2021/5/21
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<html>
    <head>
        <title>商品列表</title>
    </head>
    <body>
        <table>
            <tr>
                <td>商品名</td>
                <td>商品描述</td>
                <td>商品价格</td>
                <td>创建日期</td>
            </tr>
            <c:forEach items="${goodList}" var="good">
                <tr>
                    <td>${good.name}</td>
                    <td>${good.description}</td>
                    <td>${good.price}</td>
                    <td>${good.date}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

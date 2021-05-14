<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>商品提交</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/my/formatter" method="post">
            商品名称：<input type="text" name="name"><br>
            商品价格：<input type="text" name="price"><br>
            商品数量：<input type="text" name="number"><br>
            商品日期：<input type="text" name="date"><br>
            <input type="submit" value="提交">
        </form>
    </body>
</html>

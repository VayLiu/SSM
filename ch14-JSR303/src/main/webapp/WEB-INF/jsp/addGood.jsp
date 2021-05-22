<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>商品添加</title>
    </head>
    <body>
        <form:form modelAttribute="good" action="${pageContext.request.contextPath}/good/save" method="post">
            <fieldset>
                <legend>添加一件商品</legend>
                <p>
                    <label>商品名：</label>
                    <form:input path="name"/>
                </p>
                <p>
                    <label>商品详情：</label>
                    <form:input path="description"/>
                </p>
                <p>
                    <label>商品价格：</label>
                    <form:input path="price"/>
                </p>
                <p>
                    <label>创建日期：</label>
                    <form:input path="date"/>
                </p>
                <p id="buttons">
                    <input type="reset" id="reset">
                    <input type="submit" id="submit" value="提交">
                </p>
            </fieldset>
            <form:errors path="*"/>
        </form:form>
    </body>
</html>

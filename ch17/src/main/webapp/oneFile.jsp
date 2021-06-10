<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>单文件上传</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/oneFile" method="post" enctype="multipart/form-data">
            选择文件：<input type="file" name="myFile"><br>
            文件描述：<input type="text" name="description"><br>
            <input type="submit" value="提交">
        </form>
    </body>
</html>

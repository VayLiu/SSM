<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>多文件上传</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/multiFile" method="post" enctype="multipart/form-data">
            选择文件1：<input type="file" name="myFile"><br>
            文件1描述：<input type="text" name="description"><br>
            选择文件2：<input type="file" name="myFile"><br>
            文件2描述：<input type="text" name="description"><br>
            选择文件3：<input type="file" name="myFile"><br>
            文件3描述：<input type="text" name="description"><br>
            <input type="submit" value="提交">
        </form>
    </body>
</html>

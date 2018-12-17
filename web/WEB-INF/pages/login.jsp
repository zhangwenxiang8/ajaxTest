<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/13
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="dologin" method="get">
    用户名:<input type="text" name="username">
    <hr>
    密码: <input type="password" name="pwd">
    <hr>
    <input type="submit"><a href="register">请先注册,再登录!</a>
    <%--点击按钮,通过a链接 跳转到  register.jsp注册页面--%>
</form>

</body>
</html>

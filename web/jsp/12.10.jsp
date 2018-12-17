<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/11
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%--模板技术
固定模板
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        div{
            width: 100px;
            height: 100px;
            background-color: lightgreen;
        }
    </style>
</head>
<body>
        <div>佩服自己,了不起,总能完成不可能完成的任务.也能犯不可能犯的错误!!!</div>
<%--<% System.out.println(request.getAttribute("key"));%>&lt;%&ndash;java 片段,变量属于局部变量&ndash;%&gt;--%>
        <%= request.getAttribute("session")%><%--java 表达式  作用同上,格式不同--%>
            <%--<%!int a=1;%> &lt;%&ndash; java 声明 ,变量属于整个类的了.&ndash;%&gt;--%>
</body>
</html>

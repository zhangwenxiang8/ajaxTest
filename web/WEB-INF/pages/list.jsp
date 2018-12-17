<%@ page import="work.pojo.Product" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   <%--el表达式的核心包--%>
<%--

  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/12
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border:2px solid black;
            border-collapse: collapse;      /*为表格设置合并边框模型：*/
        }

        table thead tr th, table tbody tr td{  /*纵横两条线,为两次标签选择器*/
            border:2px solid black;
            padding: 5px 10px;

        }
        table tbody tr td:nth-child(odd){              /*传入表个的内容,背景间隔设置*/
            background-color: blanchedalmond;
        }
    </style>
</head>
<body>
<a href="add">添加</a>
    <table>
        <thead>
        <tr>
            <th>商品编号</th>
            <th>商品名称</th>
            <th>商品价格</th>
            <th>商品图片</th>
            <th>商品描述</th>
            <th>操作</th>
        </tr>
        </thead>
        <thbody>
            <%--el表达式--%>
            <%--  ${lists}  是 ListServlet传过来的k,v值, sql查询的结果集--%>


                <c:forEach items="${lists}" var="p">
                    <%--foreach循环提取${lists}里的对象--%>

                    <tr>
                        <td>${p.productId}</td>   <%--这里不是属性或对象,是调取的get方法--%>
                        <td>${p.productName}</td>
                        <td>${p.productDes}</td>
                        <td>${p.url}</td>
                        <td>${p.price}</td>
                        <td><a href="delete?productId=${p.productId}">删除</a>&nbsp;|&nbsp;<a href="update?productId=${p.productId}">修改</a></td>
                     <%--这里注意是el表达式    获取的是 id 的值,删除的也是id值,与其他关键字无直接关系(间接的).  --%>
                    </tr>

                </c:forEach>







            <%--<% List<Product> list=(List<Product>)request.getAttribute("lists");--%>
                <%--for (Product p:list) { %>--%>
            <%--<tr>--%>
                <%--<td><%= p.getProduct_id()%></td>--%>
                <%--<td><%= p.getProduct_name()%></td>--%>
                <%--<td><%= p.getPrice()%></td>--%>
                <%--<td><%= p.getUrl()%></td>--%>
                <%--<td><%= p.getProduct_des()%></td>--%>
            <%--</tr>--%>
           <%--<%--%>
                <%--}--%>
           <%--%>--%>
        </thbody>
    </table>

</body>
</html>

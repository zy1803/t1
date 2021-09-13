<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/9/7
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>查询</title>
    <link rel="stylesheet" href="../../semantic-ui/semantic/dist/semantic.min.css">
    <script type="text/javascript" src="js/jquery3.3.1.js"></script>
    <script type="text/javascript" src="../../semantic-ui/semantic/dist/semantic.min.js"></script>
</head>
<body>
<br>
<br>
<br>
<div class="right menu">
    <div class="item">
         <div class="ui icon input">
            <input type="text" placeholder="搜索...">
            <i class="search link icon"></i>
        </div>
    </div>
</div>
<table class="ui celled table">
    <thead>
    <tr><th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr></thead>
    <tbody>
    <tr>
        <td>1</td>
        <td>zhang</td>
        <td>22</td>
    </tr>
    <tr>
        <td>2</td>
        <td>li</td>
        <td>22</td>
    </tr>
    <tr>
        <td>3</td>
        <td>wang</td>
        <td>22</td>
    </tr>
    <c:forEach items="${students}" var="s">
        <tr>
            <td> ${s.id}</td>
            <td> ${s.name}</td>
            <td> ${s.age}</td>
        </tr>
    </c:forEach>
    </tbody>

</table>
<br>
<br>
<button class="ui button">返回</button>
<div class="ui button">退出</div>
<br>
<br>

</body>
</html>
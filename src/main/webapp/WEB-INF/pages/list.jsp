<%--
  Created by IntelliJ IDEA.
  User: alan
  Date: 2020/4/6
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Insert title here</title>

</head>

<body>
<h3>查询所有</h3>

<c:forEach begin="1" end="10" var="i">

    <c:out value="${i }"></c:out>

</c:forEach>

<c:forEach items="${list}" var="use">

    <c:out value="${use.ages} ${use.user_name}"/>

</c:forEach>
<c:forEach items="${list}" var="user">
    ${user.user_name}
    ${user.ages}


</c:forEach>
</body>
</html>

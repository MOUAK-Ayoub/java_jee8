<%--
  Created by IntelliJ IDEA.
  User: ayoub.mouak
  Date: 13/02/2020
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tlds/functions.tld" prefix="fct" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Recipe 2-5: Invoking a Function in an Expression</title>
</head>
<body>
<form method="get">
    <p>Name one of the primitive Java types:
        <input type="text" id="typename" name="typename" size="40"/>
    </p>
    <br/>
    <input type="submit">
</form>
<jsp:useBean id="conditionalBean" scope="page" class="com.chap02.ConditionalClass"/>
<jsp:setProperty name="conditionalBean" property="typename"/>

<c:if test="${fct:isPrimitive(conditionalBean.typename)}">
    ${ conditionalBean.typename } is a primitive type.
</c:if>
<c:if test="${conditionalBean.typename ne null and !fct:isPrimitive(conditionalBean.typename)}">
    ${ conditionalBean.typename } is not a primitive type.
</c:if>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: ayoub.mouak
  Date: 12/02/2020
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Recipe 2-4: Yielding or Setting Values</title>
</head>
<body>
<jsp:useBean id="easyBean" class="com.chap02.EasyBean"/>
<jsp:setProperty name="easyBean" property="*"/>
<form method="post">
    Use the input text box below to set the value, and then hit submit.
    <br/><br/>
    Set the first and second num values:
    <input id="numA" name="numA" type="number" size="30"/>
    <input id="numB" name="numB" type="number" size="30"/>
    <br/>
    <select id="matheval" name="matheval">
        <option value="add">Add the numbers</option>
        <option value="multiply">Multiply the numbers</option>
    </select>
    The result is currently:
   ${easyBean.result}
    <input type="submit">
</form>
</body>
</html>

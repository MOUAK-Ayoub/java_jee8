<%--
  Created by IntelliJ IDEA.
  User: ayoub.mouak
  Date: 12/02/2020
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="dateBean" scope="session" class="com.chap02.DateBean"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page Example</title></head>
<body>
<h1>Hello World!</h1>
<br/>
<p>
    The current date is: ${dateBean.currentDate}!
</p>
<p>
    Here is a random number ${dateBean.randomNumber}
</p>
</body>
</html>

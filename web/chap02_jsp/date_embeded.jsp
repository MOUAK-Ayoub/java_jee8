<%--
  Created by IntelliJ IDEA.
  User: ayoub.mouak
  Date: 12/02/2020
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--<%! Date currDate = null; %>--%>
<% Date currDate = new Date(); %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Recipe 2-2: Embedding Java into a JSP Page</title>
</head>
<body>
<h1>Hello World!</h1>
<br/>
<br/>
The current date and time is: <%= currDate %>
<p>
    The current date is: ${dateBean.currentDate}!
</p>
</body>
</html>
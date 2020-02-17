<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 15/02/2020
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Error Page</title>
</head>
<body>
<h1>Error Encountered</h1>
<br/>
<br/>
<p>
    The application has encountered the following error:
    <br/>
    <fmt:message key="ServerError"/>: $${pageContext.errorData.servletName}
</p>
</body>
</html>
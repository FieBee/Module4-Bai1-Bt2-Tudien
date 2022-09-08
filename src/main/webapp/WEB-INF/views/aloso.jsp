<%--
  Created by IntelliJ IDEA.
  User: PV
  Date: 08/09/2022
  Time: 4:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/alo">
    <input type="text" name="alo" placeholder="Rate"><br>
    <input type="submit" id="submit" value="Check">
    <p>Result</p>
    <p>${result}</p>
</form>



</body>
</html>

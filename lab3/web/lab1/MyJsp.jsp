<%--
  Created by IntelliJ IDEA.
  User: always
  Date: 2022/5/16
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<form method="post" action="<%=request.getContextPath()%>/parameters">
    i am MyJsp.jsp<br>
    name
    <input type="text" name="cname">
    <br>
    class
    <input type="text" name="clas">
    <br>
    ID
    <input type="text" name="cid">
    <br>

    <button type="submit">Send data to server</button>
</form>

<head>
    <title>MyJsp</title>
</head>
<body>

</body>
</html>

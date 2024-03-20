<%--
  Created by IntelliJ IDEA.
  User: 嗣南
  Date: 2024/3/13
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>d7100</title>
</head>
<body>
New User Registration!
<form method="post" action="register">
    <input type="text" name="username" placeholder="username"><br/>
    <input type="text" name="password" placeholder="password"><br/>
    <input type="text" name="email" placeholder="email"><br/>
    Gender <input type="radio" name="gender" value="Male">Male
    <input type="radio" name="gender" value="female">female<br/>
    Date of Birth <input type="text" name="birthDate" placeholder="Date of Birth(yyy-mm-dd)"><br/>
    <input type="submit" name="Register" value="Register">

</form>
</body>
</html>

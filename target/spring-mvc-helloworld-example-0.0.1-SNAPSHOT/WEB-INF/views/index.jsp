<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login page</title>
</head>
<body>

<form action="/successful" method="POST">
    <label for="login">Enter login</label>
    <br/>
    <input type="text" id="login" name="login">
    <br/>
    <label for="password">Enter password</label>
    <br/>
    <input type="text" id="password" name="password">
    <br/>
    <input type="submit" value="Sign In">
</form>

</body>
</html>
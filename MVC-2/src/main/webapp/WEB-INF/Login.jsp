<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello ${param.name}</h1>
<form action="welcome.jsp" method="post">
UserName<input type="text" name="user"><br>
Password<input type="password" name="pass"><br>
<input type="submit" value="login"><br>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- param,cookies,session,context -->
<!-- param==this -->
<h1>This is welcome Page of ${param.user}!!</h1>
<form action="add" method="get">
<input type="submit" value="Add"><br>
</form>

<form action="delete" method="get">
<input type="submit" value="Delete"><br>
</form>

</body>
</html>
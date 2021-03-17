<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<div>
			Username: <input name="username" value="" />
		</div>
		<div>
			Pass: <input name="passwowrd" value="" />
		</div>
		<div>
			<input type="submit" value="Login" />
		</div>
		${message}
	</form>
</body>
</html>
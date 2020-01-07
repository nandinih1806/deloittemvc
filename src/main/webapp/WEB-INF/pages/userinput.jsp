<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<body>
	<form method="get" action="/logincheck">
		<div>
			<span> id</span> 
			<input name="id" type="number" />
		</div>
		<div>
			<span> password</span> 
			<input name="password" type="text" />
		</div>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<body>
	<h2>
		id is
		<c:out value="${user.getId()}" />
		name is
		<c:out value="${user.getName()}" />
	</h2>
</body>
</html>
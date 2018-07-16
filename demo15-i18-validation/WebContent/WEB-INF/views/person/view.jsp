<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="person.view.title" /></title>
<link rel="stylesheet" type="text/css"
	href="../resources/styles/main.css">
</head>
<body>

	<div id="langsel">
		<a href="?lang=en">en</a> | <a href="?lang=fi">fi</a>
	</div>

	<h1>
		<spring:message code="person.view.heading" />
	</h1>
	<c:out value="${person}" default="-----" />
	<p>
		<c:out value="${person.firstname}" default="-----" />
	</p>
	<p>
		<c:out value="${person.lastname}" default="-----" />
	</p>
	<p>
		<c:out value="${person.email}" default="-----" />
	</p>
	<p>
		<c:out value="${person.address}" default="-----" />
	</p>
	<p>
		<c:out value="${person.postalcode}" default="-----" />
	</p>
	<p>
		<c:out value="${person.postaloffice}" default="-----" />
	</p>
	<p>
		<a href="new"><spring:message code="back" /></a>
</body>
</html>
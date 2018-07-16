<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="person.create.title" /></title>
<link rel="stylesheet" type="text/css"
	href="../resources/styles/main.css">
</head>
<body>

	<div id="langsel">
		<a href="?lang=en">en</a> | <a href="?lang=fi">fi</a>
	</div>

	<h1>
		<spring:message code="person.create.heading" />
	</h1>



	<form:form modelAttribute="person" method="post">
		<fieldset>
			<legend>
				<spring:message code="person.create.legend" />
			</legend>

			<spring:hasBindErrors name="person">
				<p class="error">
					<spring:message code="person.create.errors" />
					:
				</p>
				<div class="error">
					<form:errors path="*" />
				</div>
			</spring:hasBindErrors>

			<p>
				<form:label path="firstname">
					<spring:message code="person.create.firstname" />
				</form:label>
				<br />
				<form:input path="firstname" cssErrorClass="error" />
				<form:errors path="firstname" cssClass="error" />
			</p>
			<p>
				<form:label path="lastname">
					<spring:message code="person.create.lastname" />
				</form:label>
				<br />
				<form:input path="lastname" cssErrorClass="error" />
				<form:errors path="lastname" cssClass="error" />
			</p>
			<p>
				<form:label path="email">
					<spring:message code="person.create.email" />
				</form:label>
				<br />
				<form:input path="email" cssErrorClass="error" />
				<form:errors path="email" cssClass="error" />
			</p>
			<p>
				<form:label path="address">
					<spring:message code="person.create.address" />
				</form:label>
				<br />
				<form:input path="address" cssErrorClass="error" />
				<form:errors path="address" cssClass="error" />
			</p>
			<p>
				<form:label path="postalcode">
					<spring:message code="person.create.postalcode" />
				</form:label>
				<br />
				<form:input path="postalcode" cssErrorClass="error" />
				<form:errors path="postalcode" cssClass="error" />
			</p>
			<p>
				<form:label path="postaloffice">
					<spring:message code="person.create.postaloffice" />
				</form:label>
				<br />
				<form:input path="postaloffice" cssErrorClass="error" />
				<form:errors path="postaloffice" cssClass="error" />
			</p>
			<p>
				<button type="submit">
					<spring:message code="person.create.add" />
				</button>
			</p>
		</fieldset>
	</form:form>
</body>
</html>
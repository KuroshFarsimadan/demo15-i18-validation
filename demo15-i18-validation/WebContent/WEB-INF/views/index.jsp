<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE - Demo 15</title>
<link rel="stylesheet" type="text/css"
	href="resources/styles/common.css">
</head>
<body>
	<h1>Java EE</h1>
	<h2>DEMO 15</h2>

	<div id="contentbox">
		<h3>Content</h3>
		<ul>
			<li>Internationalization (I18n)</li>
			<li>Localization (L10n)</li>
			<li>Bean validation (JSR 303)</li>
			<li>Custom annotation</li>
			<li>Custom validator</li>
		</ul>
		<h3>Functionality</h3>
		<p>
		The user can change the web UI language through a push of an button.
		All language specific configuration mappings have been added to the 
		properties file. User features have also been extended from the 
		previous demo's. For example, if the form data is not valid, the user
		will be redirected back to the form viewpage and the user is instructed
		to fix the errors. </p>
		<h3>link</h3>
		<p>
			<a href="persons/new">persons/new</a>
		</p>
	</div>
</body>
</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

<title>Save Employee</title>
<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>
		<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
		
</head>
<body>


<div id="wrapper">
	<div id="header">
	<h2>KUBER Management System</h2>
	</div>
	<div id="container">
	<h3>Save Employee</h3>
	<form:form action="saveEmployee" modelAttribute="employee" method="POST">
		<form:hidden path="idkuber_employees"/>
	<table>
		<tbody>
		<tr>
		<td><label>First Name</label>
		<td><form:input path="first_name"/></td>
		</tr>
		<tr>
		<td><label>Last Name</label>
		<td><form:input path="last_name"/></td>
		</tr>
		<tr>
		<td><label>Windows Login</label>
		<td><form:input path="windows_login"/></td>
		</tr>
		<tr>
		<td><label>Windows Password</label>
		<td><form:input path="windows_passwrd"/></td>
		</tr>
		<tr>
		<td><label>Email</label>
		<td><form:input path="email"/></td>
		</tr>
		<tr>
		<td><label>Department</label>
		<td><form:input path="department"/></td>
		</tr>
		<tr>
		<td><label>Biometric Door</label>
		<td><form:input path="door"/></td>
		</tr>
		<tr>
		<td><label>Computer ID</label>
		<td><form:input path="kpc"/></td>
		</tr>
		<tr>
		<td><label>Phone</label>
		<td><form:input path="phone"/></td>
		</tr>
		<tr>
		<td><label>Printer Pin</label>
		<td><form:input path="printer_pin"/></td>
		</tr>
		
		<td><label></label>
		<td><input type="submit" value="Save" class="save" /></td>
		</tr>
		
		</tbody>
	</table>
	</form:form>
	<div style="clear;both;"></div>
	<p>
	<a href="${pageContext.request.contextPath}/employees/list">Back to Kuber Employees</a>
	</p>
</div>

</body>

</html>
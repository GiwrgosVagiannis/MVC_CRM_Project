<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
<link type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css" />
<body>


<div id="wrapper">
<div id="header">
<h2>CRM - Phone List</h2>

</div>
</div>
<div id="container">
<div id="content">
<!-- add our html table -->
<table>
<tr>
	<th>ID</th>
	<th>Port</th>
	<th>User </th>
	<th>Interior</th>
	</tr>
	<c:forEach var="tempPhone" items="${phones}">
	<tr>
	<td>${tempPhone.idkuber_phones}</td>
	<td>${tempPhone.port}</td>
	<td>${tempPhone.name_appeared}</td>
	<td>${tempPhone.incoming}</td>
	
	

	</tr>
	</c:forEach>
	
</table>

<a href="${pageContext.request.contextPath}/employees/list">Back to Kuber Employees</a>

</div>

</div>

</body>

</head>


</html>
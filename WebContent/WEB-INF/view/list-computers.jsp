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
<h2>CRM - Computer List</h2>

</div>
</div>
<div id="container">
<div id="content">
<!-- add our html table -->
<table>
<tr>
	<th>Computer ID</th>
	<th>Computer Name</th>
	<th>RAM</th>
	<th>CPU</th>
	<th>SSD</th>
	<th>Date</th>
	<th>IP</th>
	</tr>
	<c:forEach var="tempComputer" items="${computers}">
	<tr>
	<td>${tempComputer.id_pc}</td>
	<td>${tempComputer.pc_name}</td>
	<td>${tempComputer.ram}</td>
	<td>${tempComputer.cpu}</td>
	<td>${tempComputer.ssd}</td>
	<td>${tempComputer.date_acquired}</td>
	<td>${tempComputer.ip}</td>
	

	</tr>
	</c:forEach>
	
</table>

<a href="${pageContext.request.contextPath}/employees/list">Back to Kuber Employees</a>

</div>

</div>

</body>

</head>


</html>
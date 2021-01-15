<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

	<title>List Employees</title>
	
	<link type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css" />
			
</head>

<body>
		<div id="wrapper">
			<div id="header">
		<h2>KUBER MANAGEMENT SYSTEM Employees List</h2>
			</div>
		</div>
	<div id="container">
	
	<div id="content">
		<!--  the button addEmployee -->
		<input type="button" value="Add Employee"
			onclick="window.location.href='showFormForAddEmployee';return false;"
			class=add-button"
			/>
				
	<!-- add out html table here  -->
		<table>
			<tr>
				<th>Employee ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Windows Login</th>
				<th>Windows Password</th>
				<th>Email</th>
				<th>Department</th>
				<th>Door ID</th>
				<th><a href="http://localhost:8080/CRM_KUBER_MVC/computers/list">PC</a></th>
				<th><a href="http://localhost:8080/CRM_KUBER_MVC/phonecenter/list">Phone</th>
				<th>Printer Pin</th>
				<th>Action</th>
			</tr>
			
			<c:forEach var="tempEmployee" items="${employees}">
			<!-- construct an update link with customer id  -->
			<c:url var="updateLink" value="/employees/showFormForUpdate">
			<c:param name="employeeId" value="${tempEmployee.idkuber_employees}"/>
			</c:url>
			<c:url var="deleteLink" value="/employees/delete">
			<c:param name="employeeId" value="${tempEmployee.idkuber_employees}"/>
			</c:url>
			
				<tr>
					<td>${tempEmployee.idkuber_employees}</td>
					<td>${tempEmployee.first_name}</td>
					<td>${tempEmployee.last_name}</td>
					<td>${tempEmployee.windows_login}</td>
					<td>${tempEmployee.windows_passwrd}</td>
					<td>${tempEmployee.email}</td>
					<td>${tempEmployee.department}</td>
					<td>${tempEmployee.door}</td>
					<td>${tempEmployee.kpc}</td>
					<td>${tempEmployee.phone}</td>
					<td>${tempEmployee.printer_pin}</td>
					<td><a href="${updateLink}">Update</a>
					<a href="${deleteLink}"onclick="if (!(confirm('Are you sure you want to delete this Employee?'))) return false">Delete</a>
					</td>
				</tr>	
				
			</c:forEach>
		</table>
	
	
	
		</div>
	</div>	
		


</body>
</html>
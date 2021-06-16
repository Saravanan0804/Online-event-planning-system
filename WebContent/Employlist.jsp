<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<%@include file="header.jsp"%>
	<div class="container" style="margin-left: 20%; padding-top: 5%">
		<h3 class="text-center">List of Employees</h3>
		<hr>
		<div class="container text-left">

			<a href="<%=request.getContextPath()%>/newEmployee"
				class="btn btn-success">Add Employee</a>
		</div>
	
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>

					<th>Employee Name</th>
					<th>Address</th>
					<th>Mobile</th>
					<th>Position</th>
					<th>Salary</th>
					<th>Joined Date</th>
					<th>Image</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="user" items="${listEmployee}">

					<tr>
						<td><c:out value="${user.employeename}" /></td>
						<td><c:out value="${user.address}" /></td>
						<td><c:out value="${user.mobile}" /></td>
						<td><c:out value="${user.position}" /></td>
						<td><c:out value="${user.salary}" /></td>
						<td><c:out value="${user.joineddate}" /></td>
						<td><img src="<c:out value="${user.path}" />" width="200"
							height="200" /></td>
						<td><a href="editEmployee?id=<c:out value='${user.id}' />">Edit</a>
							&nbsp;&nbsp;&nbsp;&nbsp; <a
							href="deleteEmployee?id=<c:out value='${user.id}' />">Delete</a></td>
					</tr>
				</c:forEach>
				<!-- } -->
			</tbody>

		</table>
	</div>
	</div>
</body>
</html>
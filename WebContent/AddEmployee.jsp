<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	crossorigin="anonymous">
</head>
<body>

	<%@include file="header.jsp"%>
	<div class="container" style="margin-left: 20%; padding-top: 5%">
		<div class="card">
			<div class="card-body">
				<c:if test="${user != null}">
					<form action="updateEmployee" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insertEmployee" method="post" enctype="multipart/form-data">
				</c:if>

				<caption>
					<h2>
						<c:if test="${user != null}">
            			Edit Employee
            		</c:if>
						<c:if test="${user == null}">
            			Add New Employee
            		</c:if>
					</h2>
				</caption>

				<c:if test="${user != null}">
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label> Employeename</label> <input type="text"
						value="<c:out value='${user.employeename}' />"
						class="form-control" name="employeename" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label> Address</label> <input type="text"
						value="<c:out value='${user.address}' />" class="form-control"
						name="address">
				</fieldset>

				<fieldset class="form-group">
					<label> Mobile</label> <input type="text"
						value="<c:out value='${user.mobile}' />" class="form-control"
						name="mobile">
				</fieldset>


				<fieldset class="form-group">
					<label> Position</label> <input type="text"
						value="<c:out value='${user.position}' />" class="form-control"
						name="position">
				</fieldset>
				<fieldset class="form-group">
					<label> Salary</label> <input type="text"
						value="<c:out value='${user.salary}' />" class="form-control"
						name="Salary" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label> Joined Date</label> <input type="text"
						value="<c:out value='${user.joineddate}' />" class="form-control"
						name="joineddate">
				</fieldset>
				<fieldset class="form-group">
					<label> Image</label> <input type="file" class="form-control"
						name="file" >
				</fieldset>
				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
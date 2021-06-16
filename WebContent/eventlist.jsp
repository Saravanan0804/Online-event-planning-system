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
<%@include file="header.jsp" %>
		<div class="container" style="margin-left: 20%; padding-top:5%">
			<h3 class="text-center">List of Events</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/newevent" class="btn btn-success">Add Event</a>
			</div>
			
			
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
					
						<th>Event Type</th>
						<th>No Of Hours</th>
						<th>Facilities</th>
						<th>Cost Per Hour</th>
										<th>Image</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="user" items="${listEvents}">

						<tr>
						<td><c:out value="${user.eventtype}" /></td>
							<td><c:out value="${user.nohours}" /></td>
							<td><c:out value="${user.facilities}" /></td>
							<td><c:out value="${user.cost}" /></td>
								<td><img src="<c:out value="${user.path}" />"   width="200" height="200"/></td>

							<td><a href="editevent?id=<c:out value='${user.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="deleteevent?id=<c:out value='${user.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>
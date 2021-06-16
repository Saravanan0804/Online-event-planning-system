<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<body>

	<%@include file="header.jsp"%>
	<div class="container" style="margin-left: 20%; padding-top: 5%"
		>
		<div class="card">
			<div class="card-body">
				<c:if test="${user != null}">
					<form action="updateEvent" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insertEvent" method="post" enctype="multipart/form-data">
				</c:if>

				<caption>
					<h2>
						<c:if test="${user != null}">
            			Edit Event
            		</c:if>
						<c:if test="${user == null}">
            			Add New Event
            		</c:if>
					</h2>
				</caption>

				<c:if test="${user != null}">
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
				</c:if>
			<form>
				<fieldset class="form-group">
					<label> Event Type</label> <input type="text"
						value="<c:out value='${user.eventtype}' />" class="form-control"
						name="eventtype" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label> No Of Hours</label> <input type="text"
						value="<c:out value='${user.nohours}' />" class="form-control"
						name="nohours">
				</fieldset>

				<fieldset class="form-group">
					<label> Facilities</label> <input type="text"
						value="<c:out value='${user.facilities}' />" class="form-control"
						name="facilities">
				</fieldset>
				<fieldset class="form-group">
					<label> Cost Per Hour</label> <input type="text"
						value="<c:out value='${user.cost}' />" class="form-control"
						name="cost" required="required">
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
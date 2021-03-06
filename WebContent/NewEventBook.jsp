<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
<%@include file="header.jsp" %>
		<div class="container" style="margin-left: 20%; padding-top:5%">
		<div class="card">
			<div class="card-body">
				<c:if test="${user != null}">
					<form action="updateEventBook" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insertEventBook" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${user != null}">
            			Edit Booking
            		</c:if>
						<c:if test="${user == null}">
            			Add New Booking
            		</c:if>
					</h2>
				</caption>

				<c:if test="${user != null}">
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label> Full Name</label> <input type="text"
						value="<c:out value='${user.user}' />" class="form-control"
						name="user" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label> NIC</label> <input type="text"
						value="<c:out value='${user.nic}' />" class="form-control"
						name="nic">
				</fieldset>

				<fieldset class="form-group">
					<label> Mobile</label> <input type="text"
						value="<c:out value='${user.mobile}' />" class="form-control"
						name="mobile">
				</fieldset>
				<fieldset class="form-group">
					<label> Email</label> <input type="text"
						value="<c:out value='${user.email}' />" class="form-control"
						name="email" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Event Date</label> <input type="text"
						value="<c:out value='${user.eventdate}' />" class="form-control"
						name="eventdate" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label> Payment Date</label> <input type="text"
						value="<c:out value='${user.paymentdate}' />" class="form-control"
						name="paymentdate">
				</fieldset>

				<fieldset class="form-group">
					<label> No of Hours</label> <input type="text"
						value="<c:out value='${user.noofhours}' />" class="form-control"
						name="noofhours">
				</fieldset>
				<fieldset class="form-group">
					<label> Guest Members</label> <input type="text"
						value="<c:out value='${user.guestMembers}'/>" class="form-control"
						name="guestmembers" required="required">
				</fieldset>
				
					<fieldset class="form-group">
					<label> AdvancedPayment</label> <input type="text"
						value="<c:out value='${user.advancedPayment}'/>" class="form-control"
						name="AdvancedPayment" required="required">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
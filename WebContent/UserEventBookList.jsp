<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
@charset "UTF-8";

@import
	url(https://fonts.googleapis.com/css?family=Open+Sans:300,400,700);

body {
	font-family: 'Open Sans', sans-serif;
	font-weight: 300;
	line-height: 1.42em;
	color: #A7A1AE;
	background-color: #1F2739;
}

h1 {
	font-size: 3em;
	font-weight: 300;
	line-height: 1em;
	text-align: center;
	color: #4DC3FA;
}

h2 {
	font-size: 1em;
	font-weight: 300;
	text-align: center;
	display: block;
	line-height: 1em;
	padding-bottom: 2em;
	color: #FB667A;
}

h2 a {
	font-weight: 700;
	text-transform: uppercase;
	color: #FB667A;
	text-decoration: none;
}

.blue {
	color: #185875;
}

.yellow {
	color: #FFF842;
}

.container th h1 {
	font-weight: bold;
	font-size: 1em;
	text-align: left;
	color: #185875;
}

.container td {
	font-weight: normal;
	font-size: 1em;
	-webkit-box-shadow: 0 2px 2px -2px #0E1119;
	-moz-box-shadow: 0 2px 2px -2px #0E1119;
	box-shadow: 0 2px 2px -2px #0E1119;
}

.container {
	text-align: left;
	overflow: hidden;
	width: 80%;
	margin: 0 auto;
	display: table;
	padding: 0 0 8em 0;
}

.container td, .container th {
	padding-bottom: 2%;
	padding-top: 2%;
	padding-left: 2%;
}

/* Background-color of the odd rows */
.container tr:nth-child(odd) {
	background-color: #323C50;
}

/* Background-color of the even rows */
.container tr:nth-child(even) {
	background-color: #2C3446;
}

.container th {
	background-color: #1F2739;
}

.container td:first-child {
	color: #FB667A;
}

.container tr:hover {
	background-color: #464A52;
	-webkit-box-shadow: 0 6px 6px -6px #0E1119;
	-moz-box-shadow: 0 6px 6px -6px #0E1119;
	box-shadow: 0 6px 6px -6px #0E1119;
}

.container td:hover {
	background-color: #FFF842;
	color: #403E10;
	font-weight: bold;
	box-shadow: #7F7C21 -1px 1px, #7F7C21 -2px 2px, #7F7C21 -3px 3px,
		#7F7C21 -4px 4px, #7F7C21 -5px 5px, #7F7C21 -6px 6px;
	transform: translate3d(6px, -6px, 0);
	transition-delay: 0s;
	transition-duration: 0.4s;
	transition-property: all;
	transition-timing-function: line;
}

@media ( max-width : 800px) {
	.container td:nth-child(4), .container th:nth-child(4) {
		display: none;
	}
}
</style>
<div style="width: 100%;
    float: right;background-color: white;
    padding: 8px;
        text-align: right;
    ">
<button onclick="window.location.href='MemberView.jsp'" style="background-color:blue;color:white;padding:10px 20px;" class="btn-primary">Go to Home
</button>
<button onclick="window.location.href='<%=request.getContextPath()%>/listcardevent'" style="background-color:blue;color:white;padding:10px 20px;" class="btn-primary">Go to Book
</button>
</div>

<h1>
	<span class="blue">Event<span class="blue"> <span
		class="yellow">Bookings</span>
</h1>
<table class="container">
	<thead>
		<tr>
			<th><h1>Full Name</h1></th>
			<th><h1>NIC</h1></th>
			<th><h1>Mobile</h1></th>
			<th><h1>Email</h1></th>
			<th><h1>Event Date</h1></th>
			<th><h1>Payment Date</h1></th>
			<th><h1>NO OF Hours</h1></th>
			<th><h1>Guest Members</h1></th>
			<th><h1>Advanced Payment</h1></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="user" items="${listEventBooking}">

			<tr>
				<td><c:out value="${user.user}" /></td>
				<td><c:out value="${user.nic}" /></td>
				<td><c:out value="${user.mobile}" /></td>
				<td><c:out value="${user.email}" /></td>
				<td><c:out value="${user.eventdate}" /></td>
				<td><c:out value="${user.paymentdate}" /></td>
				<td><c:out value="${user.noofhours}" /></td>
				<td><c:out value="${user.guestMembers}" /></td>
				<td><c:out value="${user.advancedPayment}" /></td>

			</tr>
		</c:forEach>
	</tbody>
</table>
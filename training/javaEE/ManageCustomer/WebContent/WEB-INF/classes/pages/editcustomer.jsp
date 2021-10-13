<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
<style><%@include file="/WEB-INF/css/editcustomer.css"%></style>
</head>
<body>
	<div class="wrap">
		<div class="side-bar">
			<jsp:include page="/ultils/sidebar.jsp"></jsp:include>
		</div>
		<div class="content">
			<div class="header">
				<h3>
					  Edit Customer
				</h3>
			</div>
			<div class="main">
				<c:forEach items="${errors }" var="e">
					<tag:error title="${e }"></tag:error>
				</c:forEach>
				<form method="post" action="/EditCustomerServlet?id=${customer.id }">
					<div class="element black">
						<p>Name</p>
						<input name="newName" type="text" value="${customer.name }" />
					</div>
					<div class="element">
						<p>Gender</p>
						<c:choose>
							<c:when test="${customer.gender.value == 'M' }">
								<select id="gender" name="newGender">
									<option value="F">Female</option>
									<option value="M" selected>Male</option>
								</select>
							</c:when>
							<c:otherwise>
								<select id="gender" name="newGender">
									<option value="F" selected>Female</option>
									<option value="M">Male</option>
								</select>
							</c:otherwise>
						</c:choose>
					</div>
					<div class="element">
						<p>Phone Number</p>
						<input name="newPhoneNumber" type="text"
							value="${customer.phoneNumber }" />
					</div>
					<div class="element">
						<p>Point</p>
						<input name="newPoint" type="text" value="${customer.point }" />
					</div>
					<div class="element">
						<p>Membership Level</p>
						<div class="read-only">${customer.membership.name }</div>
					</div>
					<div class="element">
						<p>Free Ticket</p>
						<div class="read-only">${customer.freeTicket }</div>
					</div>
					<div class="element">
						<p>Address</p>
						<input name="newAddress" type="text" value="${customer.address }" />
					</div>
					<div class="element">
						<p>Email</p>
						<input name="newEmail" type="text" value="${customer.email}" />
					</div>
					<div class="element submit">
						<input type="submit" value="SUBMIT" />
					</div>
				</form>
			</div>
		</div>


	</div>
</body>
</html>
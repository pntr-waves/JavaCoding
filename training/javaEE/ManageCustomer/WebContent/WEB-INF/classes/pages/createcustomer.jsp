<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
<style><%@include file="/WEB-INF/css/createcustomer.css"%></style>
</head>
<body>
	<div class="wrap">
		<div class="side-bar">
			<jsp:include page="/ultils/sidebar.jsp"></jsp:include>
		</div>
		<div class="content">
			<div class="header">
				<h3>Create Customer</h3>
			</div>
			<div class="main">
				<c:forEach items="${errorMessages }" var="e">
					<tag:error title="${e }"></tag:error>
				</c:forEach>
				<form method="post" action="/CreateCustomerServlet">
					<div class="element black">
						<p>Name</p>
						<input class="input" name="name" type="text"
							value="${customer.name }" />
					</div>
					<div class="element">
						<p>Gender</p>
						<select id="gender" name="gender">
							<option value="F">Female</option>
							<option value="M">Male</option>
						</select>
					</div>
					<div class="element">
						<p>Phone Number</p>
						<input class="input" name="phoneNumber" type="text"
							value="${customer.phoneNumber }" />
					</div>
					<div class="element">
						<p>Address</p>
						<input class="input" name="address" type="text"
							value="${customer.address }" />
					</div>
					<div class="element">
						<p>Email</p>
						<input class="input" name="email" type="text"
							value="${customer.email}" />
					</div>
					<div class="element">
						<p>Membership</p>
						<select id="membership" name="membership_id">
							<c:forEach items="${levels }" var="l">
								<c:choose>
									<c:when test="${l.name == 'SILVER' }">
										<option selected value="${l.id }">${l.name }</option>
									</c:when>
									<c:otherwise>
										<option value="${l.id }">${l.name }</option>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</select>
					</div>
					<div class="submit">
						<div>
							<a href="/CustomerListServlet">Cancel</a>
						</div>
						<input type="submit" value="SUBMIT" />
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
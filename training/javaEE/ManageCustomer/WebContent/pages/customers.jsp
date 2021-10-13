<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customers</title>
<style><%@include file="/WEB-INF/css/customers.css"%></style>
</head>
<body>
	<div
		style="height: 100%; width: 100%; display: flex; flex-direction: row;">
		<div class="side-bar">
			<jsp:include page="/ultils/sidebar.jsp"></jsp:include>
		</div>
		<div class="content">
			<div
				style="height: 50px; width: 100%; padding: 10px 10px; display: flex; align-items: center; background-color: white;">
				<h2 style="margin: 0">
					<a style="text-direction: none;" href="CustomerListServlet">
						CUSTOMERS</a>
				</h2>
			</div>
			<div class="main">
				<div class="form">
					<form action="/CustomerListServlet" class="search-form"
						method="post">
						<div class="element">
							<p>Name</p>
							<input class="input" type="text" id="name" name="name" value="" />
						</div>
						<div class="element">
							<p>Phone Number</p>
							<input class="input" value="" type="text" id="phoneNumber"
								name="phoneNumber" />
						</div>
						<div class="element">
							<p>Gender</p>
							<select id="gender" name="gender">
								<option value="">None</option>
								<option value="F">Female</option>
								<option value="M">Male</option>
							</select>
						</div>
						<div class="element">
							<p>Membership level</p>
							<select id="membership" name="membership">
								<option value="">None</option>
								<c:forEach items="${levels }" var="level">
									<option value="${level.name }">${level.name }</option>
								</c:forEach>
							</select>
						</div>
						<div class="element">
							<p>Point</p>
							<div class="group-input">
								<input class="input small" value="" type="text" id="min-point"
									name="minPoint" />
								<div>-</div>
								<input class="input small" value="" type="text" id="max-point"
									name="maxPoint" />
							</div>
						</div>
						<div class="submit">
							<input type="submit" value="SEARCH" />
						</div>
					</form>
				</div>
				<div class="table">
					<h2>List of Customers</h2>
					<div class="element-table border italic">
						<div class="item">
							<p>Name</p>
						</div>
						<div class="item">
							<p>Gender</p>
						</div>
						<div class="item">
							<p>Phone Number</p>
						</div>
						<div class="item">
							<p>Point</p>
						</div>
						<div class="item">
							<p>Membership</p>
						</div>
					</div>
					<c:forEach items="${customers }" var="customer">
						<div class="element-table">
							<div class="item">
								<div class="input-table">
									<a href="ViewCustomerServlet?Id=${customer.id }">${customer.name }</a>
								</div>
							</div>
							<div class="item">
								<div class="input-table">${customer.gender.title }</div>
							</div>
							<div class="item">
								<div class="input-table">${customer.phoneNumber }</div>
							</div>
							<div class="item">
								<div class="input-table">${customer.point }</div>
							</div>
							<div class="item">
								<div class="input-table">${customer.membership.name}</div>
							</div>
							<div class="item">
								<div class="submit-input-table update"><a href="CreateTransactionServlet?id=${customer.id }">+ New Transaction</a></div>
							</div>
							<div class="item">
								<div class="submit-input-table delete"><a href="DeleteCustomerServlet?id=${customer.id }">Delete</a></div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
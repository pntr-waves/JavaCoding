<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
<style><%@include file="/WEB-INF/css/createtransaction.css"%></style>
</head>
<body>
	<div class="wrap">
		<div class="side-bar">
			<jsp:include page="/ultils/sidebar.jsp"></jsp:include>
		</div>
		<div class="content">
			<div class="header">
				<h3>Add Transaction</h3>
			</div>
			<div class="main">
				<c:forEach items="${errorMessages }" var="e">
					<tag:error title="${e }"></tag:error>
				</c:forEach>
				<form method="post" action="/CreateTransactionServlet?id=${customer.id }">
					<div class="element black">
						<p>Name Customer</p>
						<div class="input">${customer.name}</div>
					</div>
					<div class="element">
						<p>Number Ticket</p>
						<input class="input" name="numberTicket" type="text"
							 />
					</div>
					<div class="element">
						<p>Free Ticket</p>
						<input class="input" name="numberFreeTicket" type="text"
							 value="0"  />
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
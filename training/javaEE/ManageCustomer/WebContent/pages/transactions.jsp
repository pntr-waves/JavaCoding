<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>transactions</title>

<style><%@include file="/WEB-INF/css/transactions.css"%></style>
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
						TRANSACTIONS</a>
				</h2>
			</div>
			<div class="main">
				<div class="form">
					<form action="/TransactionListServlet?search=true" class="search-form"
						method="post">
						<div class="element">
							<p>Name Customer</p>
							<input class="input" type="text" id="name" name="nameCustomer"
								value="" placeholder="Customer" />
						</div>
						<div class="element">
                            <p>Day</p>
                            <input class="input" type="text" id="name" name="day"
                                value="" placeholder="YYYY-mm-dd" />
                        </div>
						<div class="element number">
							<p>Number Ticket</p>
							<div class="group-input">
								<input class="input small" value="" type="text" id="min-point"
									name="minNumber" />
								<div>-</div>
								<input class="input small" value="" type="text" id="max-point"
									name="maxNumber" />
							</div>
						</div>
						<div class="submit">
							<input type="submit" value="SEARCH" />
						</div>
					</form>
				</div>
				<div class="table">
				    <c:forEach items="${errors }" var="e">
                        <tag:error title="${e }"></tag:error>
                    </c:forEach>
					<h2>List of Transactions</h2>
					<div class="element-table border italic">
						<div class="item">
							<p>Name Customer</p>
						</div>
						<div class="item">
                            <p>Membership</p>
                        </div>
                        <div class="item">
                            <p>Free Ticket</p>
                        </div>
						<div class="item">
							<p>Date</p>
						</div>
						<div class="item">
							<p>Buy Ticket</p>
						</div>
						<div class="item">
							<p>Buy Free Ticket</p>
						</div>
					</div>
					<c:forEach items="${bills }" var="bill">
						<div class="element-table">
							<form class="form-table"
								action="/TransactionListServlet?update=true&id=${bill.id }"
								method="POST">
								<div class="item">
									<div class="input-table">${bill.customer.name }</div>
								</div>
								<div class="item">
                                    <div class="input-table">${bill.customer.membership.name }</div>
                                </div>
                                <div class="item">
                                    <div class="input-table">${bill.customer.freeTicket }</div>
                                </div>
								<div class="item">
									<div class="input-table">${bill.date }</div>
								</div>
								<div class="item">
									<input class="input-table" type="text"
										value="${bill.numberTicket }" name="newNumberTicket">
								</div>
								<div class="item">
									<input class="input-table" type="text"
										value="${bill.numberFreeTicket }" name="newFreeTicket">
								</div>
								<c:choose>
									<c:when test="${bill.date == nowDate }">
										<div class="item">
											<input class="submit-input-table update" type="submit"
												value="UPDATE">
										</div>
									</c:when>
								</c:choose>
							</form>
							<c:if test="${bill.date == nowDate }">
								<form class="form-table" method="post"
									action="/TransactionListServlet?delete=true&id=${bill.id }">
									<div class="item">
										<input class="submit-input-table delete" type="submit"
											value="DELETE">
									</div>
								</form>
							</c:if>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
<style><%@include file="/WEB-INF/css/membership.css"%></style>
</head>
<body>
	<div class="wrap">
		<div class="side-bar">
			<jsp:include page="/ultils/sidebar.jsp"></jsp:include>
		</div>
		<div class="content">
			<div class="header">
				<h3>Membership</h3>
			</div>
			<div class="main">
				<c:forEach items="${errors }" var="e">
					<tag:error title="${e }"></tag:error>
				</c:forEach>
				<div class="element border italic">
					<div class="item">
						<p>Name</p>
					</div>
					<div class="item">
						<p>Point</p>
					</div>
					<div class="item">
						<p>Free ticket</p>
					</div>
				</div>
				<c:forEach items="${levels }" var="level">
					<div class="element">
						<form action="/MembershipListServlet?update=true&id=${level.id }" method="POST">
							<div class="item">
								<input class="input" type="text" value="${level.name }"
									name="newName">
							</div>
							<div class="item">
								<input class="input" type="text" value="${level.point }"
									name="newPoint">
							</div>
							<div class="item">
								<input class="input" type="text" value="${level.freeTicket }"
									name="newFreeTicket">
							</div>
							<c:choose>
								<c:when test="${level.point == 0 }">
									<div class="item italic">
										<p>(default)</p>
									</div>
								</c:when>
								<c:otherwise>
									<div class="item">
										<input class="submit-input update" type="submit"
											value="UPDATE">
									</div>
								</c:otherwise>
							</c:choose>
						</form>
						<c:if test="${level.point != 0 }">
							<form method="post" action="/MembershipListServlet?delete=true&id=${level.id }">
								<div class="item">
									<input class="submit-input delete" type="submit" value="DELETE">
								</div>
							</form>
						</c:if>
					</div>
				</c:forEach>
			</div>
		</div>


	</div>
</body>
</html>
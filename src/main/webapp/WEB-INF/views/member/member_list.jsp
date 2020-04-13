<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>회원 목록</title>
		<%@ include file="./member_header.jsp" %>
	</head>
	<body>
		<%@ include file="./member_menu.jsp" %>
		
		<h2>회원 목록</h2>
		<table border="1" width="700px">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>이메일</th>
				<th>회원가입일자</th>
			</tr>
			<c:forEach var="row" items="${list}">
			<tr>
				<th>${row.getUserId()}</th>
				<th>${row.getUserName()}</th>
				<th>${row.getUserEmail()}</th>
				<th>${row.getUserRegDate()}</th>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>
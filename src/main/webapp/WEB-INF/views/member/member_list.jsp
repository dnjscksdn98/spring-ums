<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>ȸ�� ���</title>
		<%@ include file="./member_header.jsp" %>
	</head>
	<body>
		<%@ include file="./member_menu.jsp" %>
		
		<h2>ȸ�� ���</h2>
		<table border="1" width="700px">
			<tr>
				<th>���̵�</th>
				<th>�̸�</th>
				<th>�̸���</th>
				<th>ȸ����������</th>
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
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>ȸ�� ���� �� ������</title>
		<%@ include file="./member_header.jsp" %>
		<script>
			$(document).ready(function() {
				$("#btnUpdate").click(function() {
					if(confirm("�����Ͻðڽ��ϱ�?")) {
						document.detail_form.action = "${path}/member/update.do";
						document.detail_form.submit();
					}
				})
			})
			
			$(document).ready(function() {
				$("#btnDelete").click(function() {
					if(confirm("�����Ͻðڽ��ϱ�?")) {
						document.detail_form.action = "${path}/member/delete.do";
						document.detail_form.submit();
					}
				})
			})
		</script>
	</head>
	<body>
		<%@ include file="./member_menu.jsp" %>
		<h2>ȸ�� �� ����</h2>
		<form name="detail_form" method="post">
			<table border="1" width="400px">
				<tr>
					<td>���̵�</td>
					<td><input name="userId" value="${dto.getUserId()}" readonly /></td>
				</tr>
				<tr>
					<td>��й�ȣ</td>
					<td><input name="userPw" type="password" /></td>
				</tr>
				<tr>
					<td>�̸�</td>
					<td><input name="userName" value="${dto.getUserName()}" /></td>
				</tr>
				<tr>
					<td>�̸���</td>
					<td><input name="userEmail" value="${dto.getUserEmail()}" /></td>
				</tr>
				<tr>
					<td>ȸ�� ��������</td>
					<td>
						<fmt:formatDate value="${dto.getUserRegDate()}" pattern="yyyy-MM-dd HH:mm:ss" />
					</td>
				</tr>
				<tr>
					<td>�ֱ� ȸ������ ��������</td>
					<td>
						<fmt:formatDate value="${dto.getUserUpdateDate()}" pattern="yyyy-MM-dd HH:mm:ss" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="����" id="btnUpdate" />
						<input type="button" value="����" id="btnDelete" />
						<div style="color: red;">${msg}</div>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
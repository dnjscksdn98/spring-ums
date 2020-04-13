<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>회원 정보 상세 페이지</title>
		<%@ include file="./member_header.jsp" %>
		<script>
			$(document).ready(function() {
				$("#btnUpdate").click(function() {
					if(confirm("수정하시겠습니까?")) {
						document.detail_form.action = "${path}/member/update.do";
						document.detail_form.submit();
					}
				})
			})
			
			$(document).ready(function() {
				$("#btnDelete").click(function() {
					if(confirm("삭제하시겠습니까?")) {
						document.detail_form.action = "${path}/member/delete.do";
						document.detail_form.submit();
					}
				})
			})
		</script>
	</head>
	<body>
		<%@ include file="./member_menu.jsp" %>
		<h2>회원 상세 정보</h2>
		<form name="detail_form" method="post">
			<table border="1" width="400px">
				<tr>
					<td>아이디</td>
					<td><input name="userId" value="${dto.getUserId()}" readonly /></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input name="userPw" type="password" /></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input name="userName" value="${dto.getUserName()}" /></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input name="userEmail" value="${dto.getUserEmail()}" /></td>
				</tr>
				<tr>
					<td>회원 가입일자</td>
					<td>
						<fmt:formatDate value="${dto.getUserRegDate()}" pattern="yyyy-MM-dd HH:mm:ss" />
					</td>
				</tr>
				<tr>
					<td>최근 회원정보 수정일자</td>
					<td>
						<fmt:formatDate value="${dto.getUserUpdateDate()}" pattern="yyyy-MM-dd HH:mm:ss" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="수정" id="btnUpdate" />
						<input type="button" value="삭제" id="btnDelete" />
						<div style="color: red;">${msg}</div>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
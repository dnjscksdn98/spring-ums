<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>회원 등록</title>
		<%@ include file="./member_header.jsp" %>
	</head>
	<body>
		<%@ include file="./member_menu.jsp" %>
		<h2>회원 등록</h2>
		<form name="write_form" method="post" action="${path}/member/insert.do">
			<table border="1" width="400px">
				<tr>
					<td>아이디</td>
					<td><input name="userId" /></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="userPw" /></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input name="userName" /></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input name="userEmail" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="확인" />
						<input type="reset" value="취소" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
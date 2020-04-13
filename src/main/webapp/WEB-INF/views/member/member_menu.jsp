<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!-- jstl core tag -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- context 경로 -->
<c:set var="path" value="${pageContext.request.contextPath}" />
<div style="text-align: center;">
	<a href="${path}/member/list.do">회원 관리</a>
</div>
<hr />

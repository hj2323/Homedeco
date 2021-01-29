<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<sec:authorize access="isAnonymous()">
<P><a href="customLogin">로그인페이지로 가기</a></P>
<P><a href="/app07/board/insert">글쓰기</a></P>
<P><a href="/app07/member/insert">회원가입</a></P>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
<a href="customLogout">로그아웃</a><br>
<a href="/app07/member/update">회원변경(폼으로 가기)</a><br>
</sec:authorize>
</body>
</html>

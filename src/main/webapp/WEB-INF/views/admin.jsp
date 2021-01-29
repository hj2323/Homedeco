<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
	<title>Admin</title>
</head>
<body>
<h1>Admin</h1>
<p>principal : <sec:authentication property="principal"/></p>
 <p>Member : <sec:authentication property="principal.member"/></p>
 <p>사용자이름 : <sec:authentication property="principal.member.username"/></p>
 <p>사용자ID : <sec:authentication property="principal.member.userid"/></p>
 <p>사용자ID : <sec:authentication property="principal.username"/></p>
  <p>권한 : <sec:authentication property="principal.member.authList"/></p>
<a href="/app07/board/insert">글쓰기</a>
</body>

</html>

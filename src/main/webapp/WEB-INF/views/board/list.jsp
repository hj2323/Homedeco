<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${boards }" var="board">
제목 : ${board.title }<br>
작성자 : ${board.writer }<br>
내용 : ${board.content }<br>
파일 : <img src="/app07/resources/img/${board.bimg }" 
width="100"  height="100"><hr>
</c:forEach>

</body>
</html>
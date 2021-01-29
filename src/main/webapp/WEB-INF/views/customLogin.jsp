<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  method="post" action="/app07/login">
 ID : <input type="text" name="username"><br>
PWD : <input type="password" name="password"><br>
<input type="submit" value="로그인전송">
<%-- <input type="hidden"  
name="${_csrf.parameterName}"  
value="${_csrf.token}" /> --%>

</form>

</body>
</html>
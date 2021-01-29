<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
<div class="container">

  <form action="update" method="post" id="frm">
    <div class="row">
	    <div class="col">
	      <label for="userid">id:</label>
	      <input type="text" class="form-control" id="id"  name="userid"  value="${member.userid }" readonly="readonly">
	    </div>
        </div>
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name"  name="username" value="${member.username }">
    </div>
    <div class="form-group">
      <label for="pass">Password:</label>
      <input type="password" class="form-control" id="pass"  name="userpw" value="${member.userpw }">
    </div>
<br/>
  <select name="auth" required="required">
  <option value="ADMIN">관리자</option>
   <option value="MANAGER">매니저</option>
   <option value="USER">사용자</option>
  </select>
 <button  type="submit"  id="send"  class="btn btn-primary">회원변경</button>
 <a href="delete">회원탈퇴</a>
  </form>
</div>


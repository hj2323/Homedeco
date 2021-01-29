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

  <form action="join" method="post" id="frm">
    <div class="row">
	    <div class="col">
	      <label for="userid">id:</label>
	      <input type="text" class="form-control" id="id" placeholder="Enter id" name="userid" >
	    </div>
      <div class="col align-self-end" >
          <button  type="button"  id="idcheckBtn"  class="btn btn-primary">중복확인</button>
    </div>
    </div>
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter name" name="username">
    </div>
    <div class="form-group">
      <label for="pass">Password:</label>
      <input type="password" class="form-control" id="pass" placeholder="Enter password" name="userpw">
    </div>
<br/>
  <select name="auth">
  <option value="ADMIN">관리자</option>
   <option value="MANAGER">매니저</option>
   <option value="USER">사용자</option>
  </select>
 <button  type="submit"  id="send"  class="btn btn-primary">Submit</button>
  </form>
</div>


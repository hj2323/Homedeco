<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
 <h3>게시판 글쓰기</h3>
 
 <div class="container m-5">
		<div class="card my-5">
			<form action="boardInsert" method="post" id="frm" enctype="multipart/form-data">
				<div class="card-body">
					<div class="form-group">
						<label for="title">제목</label> <input type="text" name="title"
							id="title" class="form-control" placeholder="제목을 입력해 주세요">
					</div>
					<div class="form-group">
						<label for="writer">글쓴이</label> <input type="text" name="writer"
							id="writer" class="form-control" placeholder="작성자를 입력해 주세요">
					</div>
					<div class="form-group">
						<label for="content">내용</label>
						<textarea id="content" name="content" class="form-control"></textarea>
					</div>
					<div class="form-group">
						<label for="file">파일</label>
						 <input type="file" name="uploadFile"
							id="uploadFile" class="form-control">
					</div>
					<div class="form-group text-right">
						<button type="submit" name="writeBtn" id="writeBtn"
							class="btn btn-sm btn-outline-info">글쓰기</button>
						<a href="boardList" class="btn btn-sm btn-outline-secondary">목록으로</a>
					</div>
				</div>
			</form>
		</div>
</body>
</html>
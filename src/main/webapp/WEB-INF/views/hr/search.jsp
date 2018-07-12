<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Search</title>
</head>
<body>

	<h1>검색</h1>

	<form action="./search" method="post">
		이름 : <input type="text" name="name" value="${player.name}" required><br /> 
		<input type="submit" value="검색"> 
		<input type="reset" value="취소">
	
	
	</form>


</body>
</html>
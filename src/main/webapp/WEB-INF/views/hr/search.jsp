<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Search</title>
</head>
<body>

	<h1>�˻�</h1>

	<form action="./search" method="post">
		�̸� : <input type="text" name="name" value="${player.name}" required><br /> 
		<input type="submit" value="�˻�"> 
		<input type="reset" value="���">
	
	
	</form>


</body>
</html>
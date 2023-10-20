<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="param" method="post">
		name : <input type="text" name="name" />
		age : <input type="number" name="age" />
		
		<input type="checkbox" name="inter" value="java"/>자바
		<input type="checkbox" name="inter" value="spring"/>스프링
		<input type="checkbox" name="inter" value="db"/>데이터베이스
		
		<button>submit</button>
	</form>

</body>
</html>
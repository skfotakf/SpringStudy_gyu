<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="delivery-request" method="post" enctype="application/x-www-form-urlencoded">
		이름: <input type="text" name="customer_name"><br>
		주소: <input type="text" name="customer_addr"><br>
		전화번호: <input type="tel" name="customer_phone"><br>
		요구사항: <input type="text" name="customer_etc"><br>
		<button type="submit">전송</button>
	</form>
</body>
</html>
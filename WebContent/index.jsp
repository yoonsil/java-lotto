<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN PAGE</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<form id="consumer" action="<%=request.getContextPath()%>/consumer.do">
	ID: <input type="text" name = "cid"/>
	PW: <input type="password" name = "pass"/>
	<input type="submit" value ="JOIN" />
</form>
<script>
$('#consumer').submit(function(){
	alert('test');
});
</script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<table align="center">
<body background="g.gif">
<div id="hide">
		<form action="./facultyout.jsp" method="get" name="f1">
			USERNAME:<input type="text" name="roll" id="roll"><br><br>
			<input type="submit" value="Sign out" style="visibility:hidden">
		</form>
</div>&nbsp;&nbsp;
<div id="error" style="visibility:hidden">
<h1>Sorry Ur time is out !!!</h1>
</div>
</body>
</table>
</html>
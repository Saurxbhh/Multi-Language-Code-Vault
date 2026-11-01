<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript">
function check()
{
var d=new Date();
var hrs=d.getHours();
var mins=d.getMinutes();
document.getElementById("roll").focus();
if(hrs==16)
{
document.getElementById("error").style.visibility="hidden";
document.getElementById("hide").style.visibility="visible";
}
else
{
document.getElementById("hide").style.visibility="hidden";
document.getElementById("error").style.visibility="visible";
}
}
</script>
</head>
<table align="center">
<body background="12.jpg" onload="check()">
<div id="hide">
		<form action="./out.jsp" method="get" name="f1">
			USERNAME:<input type="text" name="roll" id="roll"><br><br>
			<input type="submit" value="Sign out" style="visibility:hidden">
		</form>
</div>&nbsp;&nbsp;
<div id="error" style="visibility:hidden">
<font color="purple"><h1>Sorry Ur time is out !!!</h1></font>
</div>
</body>
</table>
</html>
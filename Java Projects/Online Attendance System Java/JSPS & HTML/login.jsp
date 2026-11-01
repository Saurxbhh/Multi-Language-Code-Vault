<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript">
function fun()
{
var d=new Date();
var hrs=d.getHours();
var mins=d.getMinutes();
document.getElementById("id").focus();
if(hrs==9)
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
<body  background="g.gif" onload="fun()">
<table align="center">

<form action="./in.jsp" method="get" name="f1">
<div id="hide">

USERNAME:<input type="text" name="id" id="id"><br><br>
<input type="submit" value="Take Attendance"  style="visibility:hidden"></div></form>&nbsp;&nbsp;
<br><br>
<div id="error" style="visibility:hidden">

<font color="purple">
<h1>Sorry Ur time is out !!!</h1></font>
</div>
</table>
</body>
</html>
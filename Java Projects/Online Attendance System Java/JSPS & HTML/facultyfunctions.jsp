<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language>
function report(url)
{
	window.navigate(url);
}
</script>
</head>
<body align="center" >
<form>
<center>
<br/>
<h1>MAIN MENU</h1>

<input type="button" value="view details" onclick="report('./facultydetails.jsp')"><br><br>
<input type="button" value="view Monthly Attendance for a single Student" onclick="report('./facultystudentmonthlyinfo.jsp')"><br><br>
<input type="button" value="view Monthly Attendance for a faculty" onclick="report('./facultymonthlyinfo.jsp')"><br><br>
<input type="button" value="Sign out" onclick="report('./signout.jsp')">
</center>
</form>
</body>
</html>
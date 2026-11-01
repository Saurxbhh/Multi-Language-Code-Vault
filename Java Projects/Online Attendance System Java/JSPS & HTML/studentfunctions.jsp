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
	var roll=document.getElementById("roll").value;
	window.navigate(url+"?roll="+roll);
}
</script>
</head>
<body>
<%String roll=session.getAttribute("roll").toString(); %>
<input type="hidden" value="<%=roll %>" id="roll">
<form>
<center>
<h1>MAIN MENU</h1>
<br/><input type="button" value="view attendance" name="attendance" id="attendance" onclick="report('./monthlyinfo.jsp')">
<br/><br/><input type="button" value="view details" name="details" id="details" onclick="report('./details.jsp')">
<br/><br/><input type="button" value="view reports" name="reports" id="reports" onclick="report('./viewreport.jsp')">
<br/><br/><input type="button" value="Sign out" onclick="report('./signout.jsp')">
</center>
</form>
</body>
</html>
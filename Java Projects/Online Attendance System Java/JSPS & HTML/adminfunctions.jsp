<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript">
function report(url)
{
	window.navigate(url);
}

</script>
</head>
<body align="center" >
<body background="h.gif">
<form>
<center><br/>
<h1>MAIN MENU</h1> <br/>
<table>
<tr>
<td>

<input type="button" value="view Monthly Attendance for a single Student" onclick="report('./monthlyinfo_admin.jsp')" style="visibility:hidden"><br><br>
<input type="button" value="               Student Attendance Log in        " onclick="report('./login.jsp')"><br><br>
<input type="button" value="               Student Attendance Log out       " onclick="report('./logout.jsp')"><br><br>
<input type="button" value="               Faculty Attendance Log in        " onclick="report('./facultylogin.jsp')"><br><br>
<input type="button" value="               Faculty Attendance Log out       " onclick="report('./facultylogout.jsp')"><br><br>
<input type="button" value="               Insert/Update no. of working days" onclick="report('./workingdays.jsp')"><br><br>
<input type="button" value="               view details of a student        " onclick="report('./details_admin.jsp')"><br><br>
<input type="button" value="               Remove Student                   "  onclick="report('./deletestudent.jsp')"><br><br>
<input type="button" value="               View Attendance from date to date" onclick="report('./attinformation_admin.jsp')"><br><br>

<input type="button" value="               Generate Reports for all Students" onclick="report('./report1.jsp')"><br><br>
<input type="button" value="               Log out                                            " onclick="report('./signout.jsp')">
</td>

</table>
</center>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body bgcolor="skyblue">
		<center>
				<form action="./facultyfunctions.jsp">
						<%
						int present=Integer.parseInt(request.getAttribute("presentm").toString());
						int total=Integer.parseInt(request.getAttribute("totaldays").toString());
						int absent=Integer.parseInt(request.getAttribute("absent").toString());
						%>
						<table>
						<tr>
						<th>No. of days present:</th>
						<th><%=present%></th>
						</tr>
						<tr>
						<th>Total No. of Days:</th>
						<th><%=total%></th>
						</tr>
						<tr>
						<th>No. of Days Absent:</th>
						<th><%=absent%></th>
						</tr>
						
							
							</table><br>
			
						
						<input type="submit" value="Main menu">
				</form>
		</center>
</body>
</html>
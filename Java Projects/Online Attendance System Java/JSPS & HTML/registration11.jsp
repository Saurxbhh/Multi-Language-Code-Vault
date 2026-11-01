<%@ page language="java" import="java.sql.*"contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
<form action="./registration.jsp">
<h2  align="center">User Profile</h2>
<hr>
<table align="center">
<tr><td>Id:</td><td><input type="text" name="id" id="id"></td></tr>
<tr><td>Name:</td><td><input type="text" name="name" id="name"></td></tr>
<tr><td>Password:</td><td><input type="password" name="password" id="password"></td></tr>
<tr><td>Date Of Birth:</td><td><input type="text" name="dob"></td></tr>
<tr><td>Emailid:</td><td><input type="text" name="emid"></td></tr>
<tr><td>Address:</td><td><textarea rows=4 cols=32 name="addr"></textarea></td></tr>
<tr><td>Phone No:</td><td><input type="text" name="pho"></td></tr>
<tr><td>DeptId:</td><td><select name="deptid">
<tr><td><img src="" id="img" width="200" height="250"/></td></tr>
<% 
try{ 

	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
PreparedStatement pst=con.prepareStatement("select * from dept12");
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
	%>
		<option value="<%=rs.getInt("dept_id") %>"><%=rs.getInt("dept_id") %></option>
	<%}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}%>



<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="submit"></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="cancel"></td></tr>
</table>
</form> 
</body>
</html>

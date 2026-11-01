<%@ page language="java" import="java.sql.*"contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="feed.jsp" >
<font color="blue">
<table>
<h1 align="center">FEEDBACK</h1>
<tr><td></td><td>RollNo:<input type="text"  name="rollno" id="rollno">
<tr><td></td><td><textarea rows=4 cols=32 name="feedbackform"></textarea></td></tr>

<% 
try{ 

	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
PreparedStatement pst=con.prepareStatement("select * from feedback ");
	ResultSet rs=pst.executeQuery();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}%>




</table>
<input type="submit" value="submit">
<font>
</body>
</html>
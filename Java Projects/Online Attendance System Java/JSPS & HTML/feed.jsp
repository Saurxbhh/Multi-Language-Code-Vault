<%@ page language="java" import="java.sql.*,java.io.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
			String roll=request.getParameter("rollno");
			System.out.println(roll);
			String form=request.getParameter("feedbackform");
			System.out.println(form);
			PreparedStatement ps=con.prepareStatement("insert into feedback values(?,?)");
			ps.setString(1,roll);
			ps.setString(2,form);
			
			int i=ps.executeUpdate();
			System.out.println(i);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		%>
		
</body>
</html>
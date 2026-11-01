<%@ page language="java" import="java.sql.*,java.io.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<% 
String roll=request.getParameter("id");
String psw=request.getParameter("pwd");
try{ 
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
System.out.println("2");
	PreparedStatement pst=con.prepareStatement("select * from details12 where id=? and password=?");
	pst.setString(1,roll);
	pst.setString(2,psw);
	ResultSet rs1=pst.executeQuery();
	if(rs1.next())
	{
		session.setAttribute("roll",roll);
		//redirect to menu
		%>
		
		<jsp:forward page="frame4.html"></jsp:forward>
		<%
	}
	else
	{
		//redirect to login
		%>
		<jsp:forward page="./login1.html"></jsp:forward>
		<%
	}
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	%>
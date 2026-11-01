<%@ page language="java" import="java.sql.*,java.io.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<% 
String roll=request.getParameter("id");
try{ 
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
System.out.println("2");
	PreparedStatement pst=con.prepareStatement("delete from report where id=?");
	pst.setString(1,roll);
	System.out.println(pst.executeQuery());
	PreparedStatement pst1=con.prepareStatement("delete from studentattendance123 where id=?");
	pst1.setString(1,roll);
	System.out.println(pst1.executeQuery());
	PreparedStatement pst2=con.prepareStatement("delete from details12 where id=?");
	pst2.setString(1,roll);
	System.out.println(pst2.executeQuery());
	out.println("<center><h1>"+roll+" Deleted Successfuly</h1><br><a href=\"./adminfunctions.jsp\">Back</a></center>");
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	%>
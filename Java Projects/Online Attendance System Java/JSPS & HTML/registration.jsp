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
String userid="";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
userid=request.getParameter("id");
		System.out.println(userid);
		String username=request.getParameter("name");
		System.out.println(username);
		String password1=request.getParameter("password");
		System.out.println(password1);
		String day=request.getParameter("dob");
		System.out.println(day);
		String mail=request.getParameter("emid");
		System.out.println(mail);
		String addres=request.getParameter("addr");
		System.out.println(addres);
		String phone=request.getParameter("pho");
		//System.out.println(phone);
		int dept=Integer.parseInt(request.getParameter("deptid"));
		System.out.println(dept);
		PreparedStatement pst=con.prepareStatement("insert into details12 values(?,?,?,?,?,?,?,?)");
	    pst.setString(1,userid);
	    pst.setString(2,username);
		pst.setString(3,password1);
		pst.setString(4,day);
		pst.setString(5,mail);
		pst.setString(6,addres);
		pst.setInt(7,dept);
		pst.setString(8,phone);
		int i=pst.executeUpdate();
		//System.out.println(i);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("after catch");
		session.setAttribute("roll",userid);
		%>
		<jsp:forward page="./regsuccess.jsp"></jsp:forward>
		<%
		//RequestDispatcher rd=request.getRequestDispatcher("./details.jsp");
		//System.out.println("after req.disp.");
		//rd.forward(request,response);
		System.out.println("end");
		%>
		
		
</body>
</html>
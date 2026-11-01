<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.sql.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
int year=Integer.parseInt(request.getParameter("year"));
out.println(year);
int month1=Integer.parseInt(request.getParameter("jan"));
out.println(month1);
int month2=Integer.parseInt(request.getParameter("feb"));
out.println(month2);
int month3=Integer.parseInt(request.getParameter("mar"));
out.println(month3);
int month4=Integer.parseInt(request.getParameter("apr"));
out.println(month4);
int month5=Integer.parseInt(request.getParameter("may"));
out.println(month5);
int month6=Integer.parseInt(request.getParameter("jun"));
out.println(month6);
int month7=Integer.parseInt(request.getParameter("jul"));
out.println(month7);
int month8=Integer.parseInt(request.getParameter("aug"));
out.println(month8);
int month9=Integer.parseInt(request.getParameter("sep"));
out.println(month9);
int month10=Integer.parseInt(request.getParameter("oct"));
out.println(month10);
int month11=Integer.parseInt(request.getParameter("nov"));
out.println(month11);
int month12=Integer.parseInt(request.getParameter("dec"));
out.println(month12);
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
PreparedStatement ps=con.prepareStatement("select * from workingdays where year=?");
	ps.setInt(1,year);
	ResultSet r=ps.executeQuery();
	System.out.println("q="+r);	
	if(r.next())
	{
		PreparedStatement pst=con.prepareStatement("update workingdays set year=?,jan=?,feb=?,mar=?,apr=?,may=?,jun=?,july=?,aug=?,sep=?,oct=?,nov=?,dec=? where year=?");
		pst.setInt(1,year);
		pst.setInt(2,month1);
		pst.setInt(3,month2);
		pst.setInt(4,month3);
		pst.setInt(5,month4);
		pst.setInt(6,month5);
		pst.setInt(7,month6);
		pst.setInt(8,month7);
		pst.setInt(9,month8);
		pst.setInt(10,month9);
		pst.setInt(11,month10);
		pst.setInt(12,month11);
		pst.setInt(13,month12);
		pst.setInt(14,year);
		System.out.println("update="+pst.executeUpdate());	
	}
	else
	{
		PreparedStatement pst=con.prepareStatement("insert into workingdays values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		pst.setInt(1,year);
		pst.setInt(2,month1);
		pst.setInt(3,month2);
		pst.setInt(4,month3);
		pst.setInt(5,month4);
		pst.setInt(6,month5);
		pst.setInt(7,month6);
		pst.setInt(8,month7);
		pst.setInt(9,month8);
		pst.setInt(10,month9);
		pst.setInt(11,month10);
		pst.setInt(12,month11);
		pst.setInt(13,month12);
		System.out.println("insert="+pst.executeUpdate());	
	}
	
	
	
}
catch(Exception e)
{
	System.out.println(e);
}

RequestDispatcher rd=request.getRequestDispatcher("./workingdayssuccess.jsp");
rd.forward(request,response);

%>

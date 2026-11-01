<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.sql.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%!String months[]={"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
int wdays[]={0,27,24,27,26,27,26,27,27,26,27,26,27};
%>
<html>
<body>
<%
String roll=request.getParameter("rol");
//out.println(roll);
int date1=Integer.parseInt(request.getParameter("day1"));
//out.println(date1);
int month1=Integer.parseInt(request.getParameter("month1"));
//out.println(month1);
int year1=Integer.parseInt(request.getParameter("year1"));
//out.println("y1="+year1);
int date2=Integer.parseInt(request.getParameter("day"));
//out.println(date2);
date2++;
int month2=Integer.parseInt(request.getParameter("month"));
//out.println(month2);
int year2=Integer.parseInt(request.getParameter("year"));
//out.println("y2="+year2);
String mnth1=months[month1];
String mnth2=months[month2];
//out.println("STUDENT DETAILS");
//String d1=date1+"/"+mnth1+"/"+year1;
//String d2=date2+"/"+mnth2+"/"+year2;
String d1=year1+"-"+month1+"-"+date1;
String d2=year2+"-"+month2+"-"+date2;
//out.println(d1+"----"+d2);
%>
<%!String a[]=new String[5];
int i=0;
Connection con = null;
PreparedStatement pst=null;
ResultSet rs=null;
 %>
<%
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
PreparedStatement pst=con.prepareStatement("select count(*) from studentattendance123 where id=? and log between ? and ?");
	pst.setString(1,roll);
	pst.setString(2,d1);
	pst.setString(3,d2);
   rs=pst.executeQuery();
   if(rs.next())
   {
	   int present=Integer.parseInt(rs.getString(1));
	    request.setAttribute("present",present);
	}
  
   
}
catch(Exception e)
{
	System.out.println(e);
}
RequestDispatcher rd=request.getRequestDispatcher("./attdetails.jsp");
rd.forward(request,response);
%>
</body>
</html>
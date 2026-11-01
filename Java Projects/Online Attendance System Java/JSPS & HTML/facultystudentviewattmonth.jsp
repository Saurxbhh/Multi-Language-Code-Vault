<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.sql.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!String months[]={"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
//int wdays[]={0,27,24,27,26,27,26,27,27,26,27,26,27};
int tdays[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
%>
<%String flag="";

String roll=request.getParameter("rol");
//out.println(roll);
int month1=Integer.parseInt(request.getParameter("month1"));
//out.println(month1);
int year1=Integer.parseInt(request.getParameter("year1"));
int month2=Integer.parseInt(request.getParameter("month"));
//out.println(month2);
int year2=Integer.parseInt(request.getParameter("year"));
//out.println("y2="+year2);
String mnth1=months[month1];
String mnth2=months[month2];

int temp=tdays[month2];
String d1="1"+"/"+mnth1+"/"+year1;
String d2=temp+"/"+mnth2+"/"+year2;

%>
<%!String a[]=new String[5];
int i=0;
Connection con = null;
PreparedStatement pst=null;
ResultSet rs=null;
 %>
<%
try{
	session.setAttribute("flag",flag);
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
PreparedStatement pst2=con.prepareStatement("select * from workingdays where year=?");
	pst2.setInt(1,year1);
	ResultSet rs12=pst2.executeQuery();
	int m[]={0,0,0,0,0,0,0,0,0,0,0,0,0};
	int abs;
	if(rs12.next())
	{
		//int y=rs12.getInt(1);
		for(int k=1;k<13;k++)
		{
		m[k]=rs12.getInt(k+1);
		System.out.println(m[k]);
		}
	}
	int total=0,presentm=0;
	for(int x=month1;x<=month2;x++)
	{
		total=total+m[x];
		System.out.println("total="+total);
	}
	if(total!=0)
	{
	request.setAttribute("totaldays",total);
	}
	else
	{
		request.setAttribute("totaldays",total);
		//if total days=0
		flag="1";
		session.setAttribute("flag",flag);
	}
   	PreparedStatement pst1=con.prepareStatement("select count(*) from studentattendance123 where id=? and log between ? and ?");
	pst1.setString(1,roll);
	pst1.setString(2,d1);
	pst1.setString(3,d2);
    ResultSet rs1=pst1.executeQuery();
    if(rs1.next())
    {
    	presentm=Integer.parseInt(rs1.getString(1));
	    request.setAttribute("presentm",presentm);
	    out.println("present="+presentm);
    }
    else
    {
    	System.out.println("oops");
    }
    abs=total-presentm;
    request.setAttribute("absent",abs);
}
catch(Exception e)
{
	System.out.println(e);
}
RequestDispatcher rd=request.getRequestDispatcher("./facultystudentmonthattdetail.jsp");
rd.forward(request,response);
%>

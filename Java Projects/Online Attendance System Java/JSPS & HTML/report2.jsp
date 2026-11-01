

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.sql.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!String months[]={"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
int tdays[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
%>
<%
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
String d1=year1+"-"+month1+"-1";
String d2=year2+"-"+month2+"-"+temp;
//String d1="1"+"/"+mnth1+"/"+year1;
//String d2=temp+"/"+mnth2+"/"+year2;
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
PreparedStatement pst2=con.prepareStatement("select * from workingdays where year=?");
	PreparedStatement pins=con.prepareStatement("insert into report values(?,?,?,?,?,?,?,?,?,?)");
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
	float per=0;
	for(int x=month1;x<=month2;x++)
	{
		total=total+m[x];
		System.out.println("total="+total);
	}
	String roll="";
	PreparedStatement pstat=con.prepareStatement("select id from details12");
	PreparedStatement pst1=con.prepareStatement("select count(*) from studentattendance123 where id=? and log between ? and ?");
	ResultSet rset=pstat.executeQuery();//get id's
	System.out.println(rset);
	while(rset.next())
	{
		roll=rset.getString(1);
		pst1.setString(1,roll);
		pst1.setString(2,d1);
		pst1.setString(3,d2);
		ResultSet rs1=pst1.executeQuery();//get count of attendance
		if(rs1.next())
		{
		   	presentm=Integer.parseInt(rs1.getString(1));
				    //request.setAttribute("presentm",presentm);
				    //out.println("present="+presentm);
		}
		abs=total-presentm;
		per=(((float)presentm)/total)*100;
		//request.setAttribute("absent",abs);
		pins.setString(1,roll);
		pins.setInt(2,month1);
		pins.setInt(3,year1);
		pins.setInt(4,month2);
		pins.setInt(5,year2);
		pins.setInt(6,total);
		pins.setInt(7,presentm);
		pins.setInt(8,abs);
		pins.setFloat(9,per);
		pins.setString(10,"");
		System.out.println("above pins");
		System.out.println(pins.executeUpdate());
	}
}
catch(Exception e)
{
	System.out.println(e);
}

%>
<jsp:forward page="./reportsuccess.jsp" />

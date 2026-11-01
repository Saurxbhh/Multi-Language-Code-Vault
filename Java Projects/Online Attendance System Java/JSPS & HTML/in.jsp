<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<%!String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"}; %>

<%
String id=request.getParameter("id");
String dept="";
//System.out.println(id);
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
//out.println(con);
	PreparedStatement pst1=con.prepareStatement("select dept_id from details12 where id=?");
	pst1.setString(1,id);
	//out.println(pst1);
	ResultSet rs=pst1.executeQuery();
	//out.println(rs);
	int l=0;
	if(rs.next())
	{
	dept=rs.getString(1);
	}
	//out.println(dept+"aaaaaaaaa");
	pst1.close();
	String d=String.valueOf(new java.util.Date());
	int day=Integer.parseInt(d.substring(8,10));
	System.out.println(day);
	String mon=d.substring(4,7);
	System.out.println(mon);
	int count=0,mont=0;
	while(l<12)
	{
			if(mon.equals(months[l]))
			{
				mont=l+1;	
				break;
			}
			l++;
	}
	System.out.println(mont);	
	String date1=d.substring(0,10);
	//System.out.println(date1);
	String year=d.substring(24,28);
	//System.out.println(year);
	String date=date1+year;
	String time=d.substring(11,20);
	//System.out.println(time);
	int y=Integer.parseInt(d.substring(24,28));
	System.out.println(y);
	PreparedStatement ps1=con.prepareStatement("select count(*) from studentattendance123 where id=?");
	ps1.setString(1,id);
	ResultSet rs1=ps1.executeQuery();
	if(rs1.next())
	{
		count=rs1.getInt(1);
		System.out.println("no. of working Days: "+count);
	}
	else
	{
		count=1;
	}
	PreparedStatement ps=con.prepareStatement("insert into studentattendance123 values(?,?,?,?,?,?,?,?,curdate(),?)");
	System.out.println(ps);
	ps.setString(1,id);
	ps.setString(2,dept);
	ps.setString(3,date);
	ps.setString(4,time);
	ps.setInt(5,day);
	ps.setInt(6,mont);
	ps.setInt(7,y);
	ps.setString(8,"");
	ps.setInt(9,count+1);
	System.out.println(ps.executeUpdate());
	
}
catch(Exception e){
	System.out.println(e);
	%>
	<jsp:forward page="fail.jsp"></jsp:forward>
	<%
}
RequestDispatcher red=request.getRequestDispatcher("./login.jsp");
red.forward(request,response);
%>


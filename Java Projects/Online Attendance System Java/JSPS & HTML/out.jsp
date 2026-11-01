<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%!String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"}; %>
        <%
String id=request.getParameter("roll");
        
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
int l=0;
	String d=String.valueOf(new java.util.Date());
	int day=Integer.parseInt(d.substring(8,10));
	System.out.println(day);
	String mon=d.substring(4,7);
	System.out.println(mon);
	int mont=0;
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
	//String date1=d.substring(0,10);
	//System.out.println(date1);
	//String year=d.substring(24,28);
	//System.out.println(year);
	//String date=date1+year;
	String logout=d.substring(11,20);
	System.out.println(logout);
	int y=Integer.parseInt(d.substring(24,28));
	System.out.println(y);
	PreparedStatement pst1=con.prepareStatement("select id from studentattendance123 where day=? and month=? and year=? and id=?");
	pst1.setInt(1,day);
	pst1.setInt(2,mont);
	pst1.setInt(3,y);
	pst1.setString(4,id);
	ResultSet rs=pst1.executeQuery();
	if(rs.next())
	{
		//out.println("logged out successfully");
		PreparedStatement pst=con.prepareStatement("update studentattendance123 set logout=? where day=? and month=? and year=? and id=?");
		//System.out.println(pst);
		pst.setString(1,logout);
		pst.setInt(2,day);
		pst.setInt(3,mont);
		pst.setInt(4,y);
		pst.setString(5,id);
		pst.executeUpdate();
	}
	else
	{
		out.println("sorry!!");
	%>
		<jsp:forward page="fail.jsp"></jsp:forward>
		<%
	}
	
	}
catch(Exception e){
	System.out.println(e);
	%>
	<jsp:forward page="fail.jsp"></jsp:forward>
	<%
}
RequestDispatcher red=request.getRequestDispatcher("./logout.jsp");
red.forward(request,response);
%>
    
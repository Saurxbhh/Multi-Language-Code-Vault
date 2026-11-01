<%@ page language="java" import="java.sql.*"   contentType="text/html; charset=ISO-8859-1"
   import="java.sql.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<form>
<table align="center" BORDER=1>
<tr>
<th>FROM MONTH</th>
<th>FROM YEAR</th>
<th>TO MONTH</th>
<th>TO YEAR</th>
<th>TOTAL DAYS</th>
<th>PRESENT DAYS</th>
<th>ABSENT DAYS</th>
<th>ATTENDANCE PERCENTAGE</th>
<th>REMARKS</th>
</tr>

<%
String roll=session.getAttribute("roll").toString();

%>
<%!
int i=0;
Connection con = null;
PreparedStatement pst=null;
ResultSet rs=null;
String rep=null;
%>
<%
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
PreparedStatement pst=con.prepareStatement("select * from report where id=?");
	pst.setString(1,roll);
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
		int frommonth=rs.getInt(2);
		int fromyear=rs.getInt(3);
		int tomonth=rs.getInt(4);
		int toyear=rs.getInt(5);
		int total=rs.getInt(6);
		int present=rs.getInt(7);
		int absent=rs.getInt(8);
		float percentage=rs.getFloat(9);
		if(percentage<60.00){
                rep="Be regular to classes";
		}else if(percentage<75.00 && percentage>=60.00){
		         rep="Continue the same ";
		}else{
		         rep="Well";
		}
        
%>
<tr>
<td><%=frommonth %></td>
<td><%=fromyear %></td>
<td><%=tomonth %></td>
<td><%=toyear %></td>
<td><%=total %></td>
<td><%=present %></td>
<td><%=absent %></td>
<td><%=percentage %></td>
<td><%=rep %></td>
</tr>
<%

	}
}
catch(Exception e)
{
	System.out.println(e);
}
%>

</table><br>

</form>
</body>
</html>
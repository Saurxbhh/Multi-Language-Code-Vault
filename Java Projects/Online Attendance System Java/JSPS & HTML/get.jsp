<%@page import="java.sql.*,java.io.*"%>
<%!String a[]=new String[5];
int i=0;
Connection con = null;
PreparedStatement pst=null;
ResultSet rs=null;
String roll=null;
%>
<%

 roll=request.getParameter("roll");
System.out.println(roll);
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
PreparedStatement pst=con.prepareStatement("select * from details12 where id=?");
	pst.setString(1,roll);
	System.out.println("hi");
  rs=pst.executeQuery();
  
   if(rs.next()){ 
    String name=rs.getString("name");
    System.out.println("after getting name");
    System.out.println(name);
    String dob=rs.getString("dob");
   System.out.println("after getting dob");
    System.out.println(dob);
    String pno=rs.getString("phonenumber");
   	System.out.println(pno);
   	String email=rs.getString("emailid");
    System.out.println(email);
    String address=rs.getString("address");
   System.out.println(address);
   int deptid=rs.getInt("dept_id");
   System.out.println(deptid);
    //pst=con.prepareStatement("select image from image12 where id=?");
		//pst.setString(1,roll);
		//System.out.println("2");
		//ResultSet rs=pst.executeQuery();
	//String s="D:\\"+roll+".jpg";
	//if(rs.next()){
	//System.out.println("3");
	//InputStream is = null;
	//is=rs.getBinaryStream(1);	
	//System.out.println("4");
	//FileOutputStream fos=new FileOutputStream(s);
	//int k=0;
	//while((k=is.read())!=-1)
//{
	//	fos.write(k);
//}
	
session.setAttribute("abc",name+"$");
session.setAttribute("abc1",dob+"$");
session.setAttribute("abc2",pno+"$");
session.setAttribute("abc3",email+"$");
session.setAttribute("abc4",address+"$");
session.setAttribute("abc5",deptid+"$");
//session.setAttribute("abc6",s+"$");

System.out.println("oooooooo");%>
<jsp:forward page="success.jsp"/>
  <%  }
   else{%>
   <jsp:forward page="fail.jsp"></jsp:forward>
   <% }}
	catch(Exception e)
	{
	}
 %>



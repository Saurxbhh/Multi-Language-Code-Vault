<%@ page import="java.sql.*,java.io.*"%>
<%
try {	
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch11","root","batch11");
    Statement st = con.createStatement();
    String id=request.getParameter("id");
    String newpath="E:/Eclipse 3.3/work 3.3/online attendance/WebContent/img/"+id+".jpg";
    String path=request.getParameter("path");
    File imgfile = new File(path);
    FileInputStream fin = new FileInputStream(imgfile);
    PreparedStatement pre = con.prepareStatement("insert into im values(?,?,?)");
    pre.setString(1,id);
    pre.setString(2,newpath);
    pre.setBinaryStream(3,fin,(int)imgfile.length());
    pre.executeUpdate();
    System.out.println("Inserting Successfully!");
    
    
    PreparedStatement psmnt = con.prepareStatement("SELECT imag FROM im WHERE id = ?");
	psmnt.setString(1,id); 
	ResultSet rs = psmnt.executeQuery();
	System.out.println(path);
	if(rs.next()) {
		byte[] bytearray = new byte[1048576];
		int size=0;
		InputStream sImage =rs.getBinaryStream(1);
		response.reset();
		FileOutputStream fs=new FileOutputStream(newpath);
		response.setContentType("image/jpeg");
		while((size=sImage.read(bytearray))!= -1 ){
			//response.getOutputStream().write(bytearray,0,size);
			fs.write(bytearray);
			System.out.println("Retrieved Successfully!");
		}
	}
	
	
    pre.close();
    response.sendRedirect("./upload.jsp");
  }
  catch (Exception e){
    e.printStackTrace();
  }
%>
<%@ page import="java.sql.*,java.io.*"%>
<%
try {
	String path=request.getParameter("id")+".jpg";
	out.println(path);
	%>
	<img src="<%=path%>" height="300" width="500"/>
	<%
}
catch(Exception ex){
	out.println("error :"+ex);
}
	
%>
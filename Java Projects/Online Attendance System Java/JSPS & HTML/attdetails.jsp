<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body bgcolor="skyblue">
<center><br><br>
<form action="./adminfunctions.jsp">
No. of days present:<input type="text" name="present" id="present" value="<%=request.getAttribute("present") %>"><br>
<br>
<input type="submit" value="Main Menu">
</form>
</center>
</body>
</html>
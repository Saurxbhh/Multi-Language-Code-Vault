<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>working days</title>
</head>
<body background="7.jpg">
<form  action="./workingdays1.jsp" method="get()">
<table align="center">
<h3>WORKING DAYS</h3>
YEAR:<select name="year" id="year">
<option value="2001">2001</option>
<option value="2002">2002</option>
<option value="2003">2003</option>
<option value="2004">2004</option>
<option value="2005">2005</option>
<option value="2006">2006</option>
<option value="2007">2007</option>
<option value="2008">2008</option>
<option value="2009">2009</option>
<option value="2010">2010</option>
<option value="2011">2011</option>
<option value="2012">2012</option>
<option value="2013">2013</option>
</select>
<br><br>
JAN<input type="text" name="jan" id="jan"><br><br>
FEB<input type="text" name="feb" id="feb"><br><br>
MAR<input type="text" name="mar" id="mar"><br><br>
APR<input type="text" name="apr" id="apr"><br><br>
MAY<input type="text" name="may" id="may"><br><br>
JUN<input type="text" name="jun" id="jun"><br><br>
JUL<input type="text" name="jul" id="jul"><br><br>
AUG<input type="text" name="aug" id="aug"><br><br>
SEP<input type="text" name="sep" id="sep"><br><br>
OCT<input type="text" name="oct" id="oct"><br><br>
NOV<input type="text" name="nov" id="nov"><br><br>
DEC<input type="text" name="dec" id="dec"><br><br>
<input type="submit" value="Insert">&nbsp&nbsp&nbsp
<input type="submit" value="Update">&nbsp&nbsp&nbsp
<input type="submit" value="Clear">
</table>
</form>
</body>
</html>
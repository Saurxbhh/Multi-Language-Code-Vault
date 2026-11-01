<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script language="javascript">
function fun()
{
 var y1=document.getElementById("year1").value;
 var y2=document.getElementById("year").value;
 var m1=document.getElementById("month1").value;
 var m2=document.getElementById("month").value;
 if((y1>y2)||((y1==y2)&&(m1>m2)))
 {
  alert("Invalid date");
  return false;
 }
 return true;
}
</script>
</head>
<body bgcolor='skyblue'>
<form action="./facultystudentviewattmonth.jsp" method="get">
<center>
Roll no:
<input type="text" name="rol" id="rol" value="" ><br>
<br><br>

FROM:
<select ><option>01</option></select>&nbsp;
<select name="month1" id="month1">
<option value="1">jan</option>
<option value="2">feb</option>
<option value="3">mar</option>
<option value="4">apr</option>
<option value="5">may</option>
<option value="6">jun</option>
<option value="7">jul</option>
<option value="8">aug</option>
<option value="9">sep</option>
<option value="10">oct</option>
<option value="11">nov</option>
<option value="12">dec</option>
</select>

<select name="year1" id="year1">
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

<br><br><br>
TO:
<select ><option>31</option></select>&nbsp;
<select name="month" id="month">
<option value="1">jan</option>
<option value="2">feb</option>
<option value="3">mar</option>
<option value="4">apr</option>
<option value="5">may</option>
<option value="6">jun</option>
<option value="7">jul</option>
<option value="8">aug</option>
<option value="9">sep</option>
<option value="10">oct</option>
<option value="11">nov</option>
<option value="12">dec</option>
</select>

<select name="year" id="year">
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
<br><br><br>

<br><br>
<input type="submit" value="submit" onclick="return fun()"><br>

</center>
</form>
</body>
</html>
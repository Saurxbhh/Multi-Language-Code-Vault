
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
 var d1=document.getElementById("day1").value;
 var d2=document.getElementById("day").value;
 if((y1>y2)||((y1==y2)&&(m1>m2))||((y1==y2)&&(m1==m2)&&(d1>d2)))
 {
  alert("Invalid date");
  return false;
 }
 return true;
}
</script>
</head>
<body bgcolor='skyblue'>
<form action="./viewatt.jsp" method="get">
<center>

Roll No::<input type="text" name="rol" id="rol" value="<%=session.getAttribute("roll").toString() %>" style="visibility:hidden"><br>
<br><br>

FROM:<select name="day1" id="day1">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>

</select>

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
TO:<select name="day" id="day">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">7</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select>

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
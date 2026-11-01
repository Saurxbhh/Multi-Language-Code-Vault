<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript">

function getRequestObject1()
{
	if(window.XMLHttpRequest)
	{
	return(new XMLHttpRequest());
	}
	else if(window.ActiveXObject)
	{
	return(new ActiveXObject("Microsoft.XMLHTTP"));
	}
	else
	{
	return(null);
	}
}

function get1()
{
	var roll=document.getElementById("roll").value;
	var request=getRequestObject1();
	request.onreadystatechange= function(){handleResponse(request);};
	request.open("GET","get.jsp?roll="+roll,true);
	request.send(null);
}
function handleResponse(request)
{
	
	if(request.readyState==4){
	var det=request.responseText;
	//alert(det);
	if(det=="norecord")
	{
	p1.innerText="Id not Available";
	}
	else{
	document.getElementById("all_det").style.visibility="visible";
	var x=det.split("$");
	
document.getElementById("name").value=x[0];
	//	alert(x);
	document.getElementById("dob").value=x[1];
	document.getElementById("phno").value=x[2];
	document.getElementById("email").value=x[3];
	document.getElementById("adrs").value=x[4];
	document.getElementById("depart").value=x[5];
	//document.getElementById("xx1").style.visibilty="visible";
	//document.getElementbyId("img").src=x[6];
	}
}
}

</script>
</head>
<body onload="get1()">
<form name="f1" action="#">
<table align="center">
	<tr style="visibility:hidden">
		<th>Rollno:</th>
		<td><input type="hidden" name="roll" id="roll" value="<%=session.getAttribute("roll").toString() %>"></td>
		<td>
		<p id="p1"></p>
		</td>
	</tr>
</table>
<div id="all_det" style="visibility: hidden">
<center>
<h3>DETAILS</h3>

</center>
<fieldset style=""><legend>Details of a student</legend>
<table align="center">
	<tr>
		<th>Name:</th>
		<td><input type="text" id="name" name="name" value="<%=session.getAttribute("roll").toString() %>" disabled></td>
	</tr>
	<tr>
		<th>DOB:</th>
		<td><input type="text" id="dob" name="dob" readonly="readonly"></td>
	</tr>
	<tr>
		<th>phone no:</th>
		<td><input type="text" id="phno" name="phno" readonly="readonly"></td>
	</tr>
	<tr>
		<th>Email Id:</th>
		<td><input type="text" id="email" name="email"
			readonly="readonly"></td>
	</tr>
	<tr>
		<th>Address:</th>
		<td><textarea id="adrs" rows=7 cols=15 name="adrs"
			readonly="readonly"></textarea></td>
	</tr>
	<tr>
		<th>Department</th>
		<td><input type="text" id="depart" name="depart"
			readonly="readonly"></td>
	</tr>
</tabLe>
<div id="xx1" style="visibiliy: hidden"><img src="" id="img" width="200"
	height="250" /></div>
</fieldset>
</div>
</form>
</body>
</html>
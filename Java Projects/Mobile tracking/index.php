<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Mobile Tracking</title>
<link href="css/stylesheet.css" rel="stylesheet" type="text/css" media="all" />
<style type="text/css">
<!--
.style2 {
	font-size: 12px;
	font-weight: bold;
}
-->
</style>
</head>

<body>
<script type="text/javascript">
function validate()
{
	var va=" ";
if(document.getElementById('txtuid').value=="")
{
alert("please enter the username");
document.getElementById('txtuid').focus();
va=false;
}

else if(document.getElementById('txtpwd').value=="")
{
alert("please enter the password ");
document.getElementById('txtpwd').focus();
va=false;
}
else
{
va=true;
}
return va;
}
</script>
<div align="center" style="vertical-align:middle">
<div style="height:200px"></div>
<form name="first" action="logincheckadmin.php" onsubmit="return validate()" method="POST">
<table width="317" border="0" style="border-style:solid">
  <tr>
    <td colspan="2" align="left"><span class="style2">Login</span></td>
    </tr>
  <tr>
    <td width="118"><strong>Username</strong></td>
    <td width="181"><input type="text" name="txtuid" id="txtuid" /></td>
  </tr>
  <tr>
    <td><strong>Password</strong></td>
    <td><input type="password" name="txtpwd" id="txtpwd" /></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td align="left"><input type="submit" value="Login" /></td></tr>
    <tr>
    <td>&nbsp;</td>
    <td align="left">
    <?php $stat=$_REQUEST['flag'];
	if($stat=="FAILED")
	{
	echo "Username/password doesnot exists";
	}
	
	?></td>
  </tr>
</table>
</form>
</div>

</body>
</html>

<?php
session_start();
include ("connection.php");
$txtuid=$_REQUEST['txtuid'];
$_SESSION['username']=$txtuid;
$txtpwd=$_REQUEST['txtpwd'];
$rs = mysql_query("select * from useradmin where userName='$txtuid' and password='$txtpwd'");
$c=mysql_num_rows($rs);

if($c==0)
{
echo"dd";?>
<script type="text/javascript">
window.location.href='index.php?flag=FAILED';
</script>
<?php }
else
{
	$row=mysql_fetch_array($rs);
	$ucd=$row['userName'];
	$pwd=$row['password'];?>
	<script type="text/javascript">
window.location.href='reviewdetails.php?flag=success';</script>
<?php 
	
	//else{
	}
	
		?>
	
	
	





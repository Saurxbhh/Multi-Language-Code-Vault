<?php
$product=$_REQUEST['product'];
$description=$_REQUEST['description'];
$location=$_REQUEST['location'];
$shop=$_REQUEST['shop'];
$shop1=$_REQUEST['shop1'];
if($shop == 'other')
{
$shopo=$shop1;
}
else
{
$shopo=$shop;
}
//$brand=$_SESSION['brand'];
//$count=$_SESSION['count'];
//$image=$_SESSION['image'];

include("connection.php");
$query=mysql_query("insert into shop values('','".$product."','".$description."','".$location."','".$shopo."')") or die(mysql_error());
if(mysql_query($qry1))
 
	  ?>
	  <script type="text/javascript">
	  window.location.href="reviewdetails.php";</script>







/
<!--<script language="javascript">
alert ("wrong file!!! Please upload correct file again!!!")
</script>-->









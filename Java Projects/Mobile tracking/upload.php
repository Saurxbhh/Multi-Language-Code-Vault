<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>page2</title>
</head>

<body>
<?php
include("connection.php");



$filename=$_FILES["resume"]["name"];
//echo $_FILES["resume"]["name"];
$fl=$_FILES["resume"]["name"];
$fl=str_replace(" ","_",$fl);
 echo "<br>";
echo "the filename is".$filename;
$ext=substr($filename,strrpos($filename,'.')+1);

if(($ext=='txt')||($ext=='jpg'))
{
if($_FILES["resume"]["error"]>0)
{
 echo "file not uploaded successfully!!!";
}
else
{
echo"move";
 move_uploaded_file($fl,"upload1/".$fl);
 //src and destination
 mysql_query("insert into ecommerce(image) values('".$fl."')");
 
}
}
else
{
?>
<script language="javascript">
alert ("wrong file!!! Please upload correct file again!!!");
//window.location.href="ass1.php";

</script>
<?
}?>
 
</body>
</html>


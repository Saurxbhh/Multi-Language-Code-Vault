<?php 
$value=$_POST['tower'];
include("connection.php");
$query="select * from log where tower='$value'";
$result=mysql_query($query);
while($row=mysql_fetch_array($result))
{
$date=$row['time'];}
echo $date;?>


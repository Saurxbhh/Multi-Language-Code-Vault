<?php 
session_start();
include("connection.php");
$id=$_GET['id'];
$query="SELECT * FROM shop where id='".$id."'";
		   $rs=mysql_query($query);
		   while($res1=mysql_fetch_array($rs))
		   {
		   $idd=$res1['id'];
						   $product=$res1['shopname'];
						   $address=$res1['address'];
						   $location=$res1['location'];
						   $shoptype=$res1['shoptype'];
						   //$description=$res1['description'];
						   //$catagory=$res1['catagory'];
						    //$style=$res1['style'];
						   //$brand=$res1['brand'];
						   //$count=$res1['count'];
						   //$image=$res1['image'];
		   
}
		   //$saledate=$row['auto_saledate'];
	?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>Mobile Tracking</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link href="css/stylesheet.css" rel="stylesheet" type="text/css" media="all" />
<style type="text/css">
<!--
.style1 {color: #333333}
.style2 {color: #FF0000}
-->
</style>
<script type="text/javascript">
function validate()
{
	var va=" ";
if(document.getElementById('product').value=="")
{
alert("please enter the shop name");
document.getElementById('product').focus();
va=false;
}
else if(document.getElementById('price').value=="")
{
alert("please enter the location");
document.getElementById('price').focus();
va=false;
}
else
{
va=true;
}
return va;
}
</script>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td align="center" valign="top" class="body_bg"><table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td align="center" valign="top"><table width="758" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="center" valign="top" class="main_table"><table width="756" border="0" align="center" cellpadding="0" cellspacing="0" class="inside_table">
              <tr>
                <td align="left" valign="top"><table width="756" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td align="left" valign="top" class="header-image"></td>
                  </tr>
                  <tr>
                    <td align="left" valign="top"><table width="756" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                          <td width="1" align="left" valign="top"><img src="images/menu_left.gif" alt="" width="1" height="34" /></td>
                          <td align="left" valign="top" class="menu_bg"><table width="350" border="0" cellspacing="0" cellpadding="0">
                              <tr>
                               
                                <td width="32" align="center" valign="middle">&nbsp;</td>
                                <td width="32" align="center" valign="middle">&nbsp;</td>
                                <td width="33" align="center" valign="middle">&nbsp;</td>
                              </tr>
                          </table></td>
                          <td width="120" align="left" valign="top"><a href="signout.php" style="text-decoration:none"><img src="images/menu_right.gif" alt="" width="120" height="34" border="0" /></a></td>
                        </tr>
                    </table></td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td align="center" valign="top"><table width="758" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="center" valign="top" class="main_table"><table width="756" border="0" cellpadding="0" cellspacing="0" class="inside_table">
              <tr>
                <td align="left" valign="top"><table width="756" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td align="left" class="body_padding"><table width="736" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                          <td width="180" align="left" valign="top"><table width="180" border="0" cellspacing="0" cellpadding="0">
                              <tr>
                                <td align="left" valign="top"><table width="180" border="0" cellspacing="0" cellpadding="0">
                                    <tr>
                                      <td align="left" valign="top"><img src="images/menu_top.gif" alt="" width="180" height="5" /></td>
                                    </tr>
                                    <tr>
                                      <td align="left" valign="middle" class="menu_title_bg"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                                          <tr>
                                            <td height="1" align="left" valign="top"><img src="images/spacer.gif" alt="" width="1" height="1" /></td>
                                          </tr>
                                          
                                      </table></td>
                                    </tr>
                                    <tr>
                                    
                                    
                                    
                                    
                                    <td align="left" valign="middle" class="left_menu_bg"><a href="one2.php" class="left_menu_link">Insert Shop details</a></td>
                                    </tr>
                                   <!-- <tr>
                                    
                                    
                                    
                                    
                                    
                                      <td align="left" valign="middle" class="left_menu_bg"><a href="home.php" class="left_menu_link"></a></td>
                                    </tr>-->
                                    <tr>
                                      <td align="left" valign="top" class="left_menu_bg"><a href="reviewdetails.php" class="left_menu_link" >Review Shop Details </a></td>
                                    </tr>
                                    <tr>
                                    
                                    
                                    
                                    
                                    <td align="left" valign="top" class="left_menu_bg"><a href="userdetails.php" class="left_menu_link" >Tracking</a></td>
                                    </tr>
                                    
                                   
                                     
                                     
                          </table></td>
                              <tr>
                                <td align="left" valign="top">&nbsp;</td>
                              </tr>
                              <tr>
                                <td align="center" valign="top"><a href="#download.html"></a></td>
                              </tr>
                          </table></td>
                          <td width="10" align="left" valign="top">&nbsp;</td>
                          <td align="left" valign="top">
                          
                          <div  style=" border:#000000; width:550px;  height:290px; overflow:auto">
                          <form name="form" id="form" action="edit_details_complete.php" method="post" enctype="multipart/form-data" onSubmit="return validate();">
                          <div align="center">
                            <input type="hidden" name="auto_id" value="<?php echo $idd; ?>" />
                            <table width="544"  border="0" height="174" cellpadding="0" cellspacing="0">
                              
                              <tr>
                                <td align="right"><span class="style3">&nbsp;</span></td>
		  					    <td>&nbsp;</td>
		  					    <td>&nbsp;</td>
	  					    </tr>
                              <tr>
                                <td align="right"><span class="style3">Shop Name&nbsp;</span></td>
        					    <td><input type="text" id="product" name="product" class="formField" tabindex="1" value="<?php echo $product; ?>" /></td>
        					    <td>&nbsp;</td>
      					    </tr>
                              <tr>
                                <td align="right"><span class="style3"><span class="alert style3">* </span>Address&nbsp;
                                  </div>
                                  </span></td>
        					    <td><input type="text" id="bandname" name="size" value="<?php echo $address; ?>" class="formField"   tabindex="5" /></td>
        					    <td>&nbsp;</td>
      					    </tr>
                              <tr>
                                <td align="right"><span class="alert style3">* </span><span class="style3">Location&nbsp;</span></td>
        					    <td><input type="text" id="price" name="price" value="<?php echo $location; ?>" class="formField" tabindex="8" /></td>
        					    <td>
        					      
        					      <p>&nbsp;</p>			   					</td>
      					    </tr>
                              <tr>
                                <td align="right"><span class="alert style3">* </span><span class="style3">Shop Type&nbsp;</span></td>
        					    <td><input type="text" id="venue" name="color" class="formField" value="<?php echo $shoptype; ?>" tabindex="10" /></td>
        					    <td></span></td>
						    </tr>	
                              
                              
                              
                              
                              
                              
                              
                              
                              
                              <!--tr><td rowspan="2" align="right"><span class="alert style3">*image</span></td>
        					  <td height="34"><input type="text" id="city" name="image" value="<?php echo $image; ?>" class="formField" tabindex="8" /></td>
        					  <td>
				
			   					<p>upload<input type="file"</p>			   					</td>
      					</tr>    <tr>
      					      <td>&nbsp;</td>
      					      <td>&nbsp;</td>
    					      </tr-->                   
                             
                                    </table>
                          </div>
                          <div style="padding-left:35px;">						
						<p align="center"><img src="images/silverPixel.gif" width="610" height="1" alt="" align="center" vspace="5" /></p>
						<p align="center"><img src="images/silverPixel.gif" width="610" height="1" alt="" align="center" vspace="5" /></p>
												  					
						<div style="padding-right:100px; padding-top:10px; text-align:right;">
							
							    <div align="center">
							      <input type="submit"  class="buttonSubmit" value="Edit Your Details" name="Submit" tabindex="36" />
							      </div>
						</div>
					</div>
				</form>
                          <div align="center">
                            </div>
                          </div></td>
                        </tr>
                    </table></td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td align="left" valign="top"><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="22" align="left" valign="top"><img src="images/footer_left.gif" alt="" width="22" height="29" /></td>
            <td align="left" valign="middle" bgcolor="#505050" style="border-top:1px solid #CC0000; padding-left:12px;">&nbsp;</td>
            <!--
We request you retain the full web design copyright notice below including the link to http://www.sarkis-webdesign.com
This not only gives respect to the large amount of time given freely by the designer but also helps build interest, traffic and use of template. If you cannot (for good reason) retain the full design copyright we request you at least leave in place the image Web designer - Sarkis, with linked to http://www.sarkis-webdesign.com. Good luck!

Web designer Sarkis
// -->
            <td width="156" align="left" valign="top"><a href="http://www.sarkis-webdesign.com" title="Website Design" target="_blank"><img src="images/website-design.gif" alt="Website Design" width="156" height="29" border="0" /></a></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
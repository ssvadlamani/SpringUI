 
 <!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>jQuery UI Datepicker - Default functionality</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
</head>
    <title>Username Availability</title>  
    <style type="text/css">  
    .flable {  
     color: gray;  
    }  
      
    .status {  
     font-family: verdana;  
     font-size: 12px;  
    }  
      
    .uname {  
     color: blue;  
    }  
    </style>  
    <script src="jquery.js" type="text/javascript"></script>  
     <script type="text/javascript">  
              $(document).ready(function(){  
                  $(".uname").change(function(){  
                      var name = $(this).val(); 
                      alert(name);
                      if(name.length >= 3){  
                          $(".status").html("<font color=gray> Checking availability...</font>");  
                           $.ajax({  
                              type: "POST",  
                              url: "http://localhost:8080/SpringUserAvailabilityCheck/hello",  
                              data: "name="+name,  
                              success: function(data){  
      								alert(data.status);
                                   if(data.status == false){
                                	   $(".status").html("<font color='green'><b>"+name+"</b> is avaliable</font>");
                                   }else{
                                	   $(".status").html("<font color='red'><b>"+name+"</b> is not avaliable</font>");   
                                   }
                                   
                              }  
                          });   
                      }  
                      else{  
                             
                          $(".status").html("<font color=red>Username should be <b>3</b> character long.</font>");  
                      }  
                        
                  });  
              });  
            </script>  
      
      
     <div>  
      <label class="flable">User Name :</label> <input class="uname" type="text"> <span class="status"></span>  
     </div>  
</html>
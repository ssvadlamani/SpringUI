<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
<script src="<c:url value="/js/ts_picker.js" />"></script>
<script src="<c:url value="/js/scriptFont.js" />"></script>
<script type="text/javascript"> 
$(document).ready(function(){  
$("#check").click(function(){
	  var name=$("#uname").val();
	  alert(name);
	  if(name.length >= 3){  
          $(".status").html("<font color=gray> Checking availability...</font>");  
           $.ajax({  
              type: "POST",  
              url: "http://localhost:8080/SAASMainApp/usermanagement/availablityCheck",  
              data: "name="+name,  
              success: function(data){  
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
<link href="<c:url value="/css/style.css" />" rel="stylesheet">
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<body onload='document.f.j_username.focus();'>
 
	<c:if test="${not empty error}">
		<div class="errorblock">
			Login error : Please try again.<br />Root Cause:
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
 
 <div class="wrapper">
			<div class="content">
				<div id="form_wrapper" class="form_wrapper">
 
 
	<form name='f' action="" 	method='POST' class="login active">
						<h3>Register</h3>
						<div class="column">
							<div>
								<label>First Name:</label>
								<input type="text" />
								<span class="error">This is an error</span>
							</div>
							<div>
								<label>Last Name:</label>
								<input type="text" />
								<span class="error">This is an error</span>
							</div>
							<div>
								<label>Website:</label>
								<input type="text" value="http://"/>
								<span class="error">This is an error</span>
							</div>
						</div>
						<div class="column">
							<div>
								<label>Username:</label>
								<input type="text" id="uname"/> <span class="status"></span>
								<span class="error">This is an error</span>
								<!-- <p id="check">Check Avail</p> -->
								<input type="button" value="Check Avail" id="check" />
							</div>
							<div>
								<label>Email:</label>
								<input type="text" />
								<span class="error">This is an error</span>
							</div>
							<div>
								<label>Password:</label>
								<input type="password" />
								<span class="error">This is an error</span>
							</div>
						</div>
						<div class="bottom">
							<div class="remember">
								<input type="checkbox" />
								<span>Send me updates</span>
							</div>
							<input type="submit" value="Register" />
							<a href="http://localhost:8080/SAASMainApp/login" rel="login" class="linkform">You have an account already? Log in here</a>
							<div class="clear"></div>
						</div>
		</form>
		</div>
		</div>
		</div>
	
</body>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</html>
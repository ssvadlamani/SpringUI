<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
<script src="<c:url value="/js/ts_picker.js" />"></script>
<script src="<c:url value="/js/scriptFont.js" />"></script>
<script>
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
 
 
	<form name='f' action="<c:url value='j_spring_security_check'  />" 	method='POST' class="login active">
 		<h3>Login</h3>
 
		<div>
							<label>Username:</label>
							<input type='text' name='j_username' value=''>
							<span class="error">This is an error</span>
		</div>
		
		<div>
							<label>Password: <a href="http://localhost:8080/SAASMainApp/forgotPassword" rel="forgot_password" class="forgot linkform">Forgot your password?</a></label>
							<input type='password' name='j_password' />
							<span class="error">This is an error</span>
						</div>
						
		
		<div class="bottom">
							<div class="remember"><input type="checkbox" /><span>Keep me logged in</span></div>
							<input type="submit" value="Login"></input>
							<a href="http://localhost:8080/SAASMainApp/usermanagement/register" rel="register" class="linkform">You don't have an account yet? Register here</a>
							<div class="clear"></div>
						</div>
						</form>
						</div>
				<div class="clear"></div>
			</div>
			
			</div>
	
</body>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</html>
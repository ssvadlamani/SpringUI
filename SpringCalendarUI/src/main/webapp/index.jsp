<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="<c:url value="/resources/js/script.js" />"></script>

<script>
a();
$(document).ready(function(){
	  $("p").click(function(){
	    $(this).hide();
	  });
});


</script>
</head>

<body>
<h2>Hello World!</h2>
<p>hello</p>

Select Another Date :
<input type='text' id='txtDate1' />
</body>
</html>


 --%>
 
 
 
 
 
 <!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>jQuery UI Datepicker - Default functionality</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
$(function() {
$( "#datepicker" ).datepicker();
});
</script>
</head>
<body>
<p>Date: <input type="text" id="datepicker"></p>
</body>
</html>
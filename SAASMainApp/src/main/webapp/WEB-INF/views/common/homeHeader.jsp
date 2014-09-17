<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <link href="<c:url value="/css/style.css" />" rel="stylesheet">
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
  
  <script type="text/javascript">
  ( function( $ ) {
	  $( document ).ready(function() {
	  $('#cssmenu').prepend('<div id="bg-one"></div><div id="bg-two"></div><div id="bg-three"></div><div id="bg-four"></div>');
	  });
	  } )( jQuery );

  </script>
  </head>
  <body>
  <div id='cssmenu'>
<ul>
   <li class='active'><a href='#'><span>Home</span></a></li>
   <li><a href='#'><span>Products</span></a></li>
   <li><a href='#'><span>Company</span></a></li>
   <li class='last'><a href='#'><span>Contact</span></a></li>
</ul>
</div>
                         
  </body>
</html>

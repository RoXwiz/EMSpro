<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@include file="navbar.jsp" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<title>Login</title>
</head>
<body>

	<div class="container">
    <div class="row justify-content-center">
    	<div class="col-md-6">
    	<div class="card">
    	   <div class="card-title text-center"><h1>ADMIN LOGIN</h1><br></div>
    	   <div class="card-body">
    	   <form class="form-group" action="login" method="post">
    			<label class="form-label" for="username">Enter Your Username </label>
    				<input name="uid" type="text" class="form-control mb-3" required>
    			<label class="form-label" for="password">Enter Your Password</label>
    				<input name="upass" type="password" class="form-control mb-3" required>
    			<button class="btn btn-primary mb-4" type="submit">Login</button>
    		</form>
    		<a class="ml-4" href="admininsert.jsp
    		">Go To Register</a>
    		</div>
    	</div>
    	</div>
    </div>
   </div>
   

</body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
</html>
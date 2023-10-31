<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="navbar.jsp" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	<title>Admin Account</title>
	
	
	<!-- Include the Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* Custom CSS to change button color to red */
        .btn-red {
            background-color: red;
            border-color: red;
        }
        
        .btn-green {
            background-color: green;
            border-color: green;
        }
    </style>




</head>
<body>
	<c:forEach var="adi" items="${adiDetails}">
	<div class="container">
	    <div class="row justify-content-center">
	    	<div class="col-md-6">
	    	   <div class="card">
		    	   <div class="card-title text-center"><h1>Delete Admin Profile</h1><br></div>
		    		<div class="card-body">
			    		<form class="form-group" action="" method="post">
			    			<label  class="form-label" for="adid" >Admin ID</label>
			    				<input name="id" type="number" class="form-control mb-3" value="${adi.adid}">
			    			<label  class="form-label" for="name" >Admin Name</label>
			    				<input name="name" type="text" class="form-control mb-3" value="${adi.name}">	
			    			<button class="btn btn-primary btn-red mb-4" type="submit">Delete Admin Account</button>
			    		</form>
		    		</div>
	    		</div>
	    		<br><br><br>
	    		
	    	</div>
	    </div>
   	</div>
   	
   	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>


	</c:forEach>
	
	
	

	
	
	
</body>
</html>
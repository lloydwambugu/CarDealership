<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body>
    <jsp:include page="navbar.jsp"/>
<section>
    <div class="form-box">
<div class="form-value">
    <form action="/signin" method="post">
        <h2 class="h2">SIGN IN</h2>
        <div class="inputbox">
            <input type="email" name="email" required>
            <label for="">Email</label>
        </div>
        <div class="inputbox">
            <input type="password" name="password" required>
            <label for="">Password</label>
        </div>
        <button type="submit" class="button">Log In</button>
        <div class="register">
            <p>Don't Have An Account?<a href="signup">Register</a></p>  
        </div>
    </form>
</div>

    </div>
</section>
</body>
</html>
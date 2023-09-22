<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
    <jsp:include page="navbar.jsp"/>
    <section>
        <div class="form-box">
    <div class="form-value">
        <form action="/signup" method="post">
            <h2 class="h2">SIGN UP</h2>
            <div class="inputbox">
                <input type="text" id="firstName" name="firstName" required>
                <label for="firstName">First Name</label>
            </div>
            <div class="inputbox">
                <input type="text" id="lastName" name="lastName" required>
                <label for="lastName">Last Name</label>
            </div>
            <div class="inputbox">
                <input type="email" id="email" name="email" required>
                <label for="email">Email</label>
            </div>
            <div class="inputbox">
                <input type="password" id="password" name="password" required>
                <label for="password">Password</label>
            </div>
            <div class="inputbox">
                <input type="number" id="phoneNumber" name="phoneNumber" required>
                <label for="phoneNumber">Phone Number</label>
            </div>
            <div class="inputbox">
                <input type="text" id="address" name="address" required>
                <label for="address">Address</label>
            </div>
            <button class="button2">Sign Up</button>
            <div class="register">
                <p>Have An Account?<a href="signin">Login</a></p>  
            </div>
        </form>

    </div>
    
        </div>
    </section>
</body>
</html>
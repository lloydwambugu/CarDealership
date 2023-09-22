<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Add Vehicle</title>
</head>
<body>
    <jsp:include page="navbar.jsp"/>
    <section>
        <div class="form-box">
    <div class="form-value">
        <form action="/addcar" method="post">
            <h2 class="h2">Add Vehicle</h2>
            <div class="inputbox">
                <input type="number" id="carYear" name="carYear" required>
                <label for="carYear">Year</label>
            </div>
            <div class="inputbox">
                <input type="text" id="make" name="make" required>
                <label for="make">Make</label>
            </div>
            <div class="inputbox">
                <input type="text" id="model" name="model" required>
                <label for="model">Model</label>
            </div>
            <div class="inputbox">
                <input type="number" id="miles" name="miles" required>
                <label for="miles">Mileage</label>
            </div>
            <div class="inputbox">
                <input type="number" id="price" name="price" required>
                <label for="price">Price</label>
            </div>
            <div class="inputbox">
                <input type="text" id="photoURL" name="photoURL" required>
                <label for="photoURL">Photo Link</label>
            </div>
            <button class="button2">Submit</button>
        </form>

    </div>
    
        </div>
    </section>
</body>
</html>
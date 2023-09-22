<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <!DOCTYPE html>
            <html>

            <head>
                <link rel="stylesheet" href="cars.css">
                <meta charset="UTF-8">
                <title>Inventory</title>
            </head>

            <body>
                <jsp:include page="navbar.jsp" />

                <div class="search-box">
                    <form action="/search" method="get">
                        <input type="text" name="make" placeholder="Enter A Make">
                        <button type="submit">Search</button>
                        </form>
                        </div>

                <div class="carlist">
                    <c:forEach var="car" items="${cars}">
                        <a href="carview/${car.id}">
                        <div class="carinfo">
                            <img src="${car.photoURL}" />
                            <h4>CarFax Approved &#9989;</h4>
                            <p>${car.carYear}</p>
                            <p>${car.make}</p>
                            <p>${car.model}</p>
                            <p>Transmission: ${car.transmissionType}</p>
                        </div>
                    </a>
                    </c:forEach>
                </div>
            </body>

            </html>
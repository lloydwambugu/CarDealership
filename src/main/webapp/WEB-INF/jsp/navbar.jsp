<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <!DOCTYPE html>
            <html>

            <head>
                <link rel="stylesheet" href="navbar.css">
                <meta charset="UTF-8">
                <title>Home</title>
            </head>

            <body>

                <div class="nav">
                    <a href="/">Home</a>
                    <c:if test="${sessionScope.userType == 'Seller'}">    
                        <a href="/cars">Inventory</a>
                        
                    </c:if>
                    


                    <c:if test="${empty sessionScope.user}">


                        <a href="/signin">Sign In</a>
                        <a href="/signup">Sign Up</a>

                    </c:if>

                    <c:choose>
                        <c:when test="${sessionScope.userType == 'Buyer'}">


                            <a href="/cars">Buy Vehicle</a>
                           


                        </c:when>



                        <c:when test="${sessionScope.userType == 'Seller'}">


                            <a href="/addcar">Add Vehicle</a>
                            <a href="/transaction">View Transactions</a>


                        </c:when>
                    </c:choose>

                    <c:if test="${not empty sessionScope.user}">

                        <a href="/logOut">Logout</a>


                    </c:if>

                </div>
            </body>


            </html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <!DOCTYPE html>
            <html>

            <head>
                <link rel="stylesheet" href="/carview.css">
                <meta charset="UTF-8">
                <title>Inventory</title>
            </head>

            <body>
               
                        <div class="carinfo2">
                            <img src="${car.photoURL}"/>
                            <h4 class="h4">CarFax Approved &#9989;</h4>
                            <p class="p">📅${car.carYear}</p>
                              <p class="p">🚗 ${car.make} ${car.model}  </p>  
                               <p class="p">🛣️  ${car.miles} miles </p>
                                <p class="p">💰$ ${car.price} </p> 
                                <p class="p">💵 Financing Available: Yes</p>
                                <p class="p">🚦Transmission: ${car.transmissionType} </p>
                                <p class="p">📍Location: Claim Academy</p>
                                <p class="p1">Don't miss out on this opportunity to own a reliable and stylish vehicle. Contact us at 314-705-6471 or visit our dealership for a test drive today!</p>
                                <button class="btn" type="submit">PURCHASE</button>
                
                        </div>
            
            </body>

            </html>
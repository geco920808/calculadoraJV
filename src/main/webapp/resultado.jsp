<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
</head>
<body>
    <h1>Resultado de la Operación</h1>
    
    <c:choose>
        <c:when test="${not empty mensaje}">
            <p>Error: ${mensaje}</p>
        </c:when>
        <c:otherwise>
            <p>El resultado es: ${resultado}</p>
        </c:otherwise>
    </c:choose>

    <br><br>
    <a href="calculadora.jsp">Realizar otra operación</a>
</body>
</html>

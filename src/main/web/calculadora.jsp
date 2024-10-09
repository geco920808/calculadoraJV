<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Calculadora</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <div class="calculadora">
        <h2>Calculadora</h2>
        <form action="CalculadoraServlet" method="POST">
            <label for="num1">Número 1:</label>
            <input type="number" id="num1" name="num1" required><br>

            <label for="num2">Número 2:</label>
            <input type="number" id="num2" name="num2" required><br>

            <label for="operacion">Operación:</label>
            <select id="operacion" name="operacion">
                <option value="sumar">Sumar</option>
                <option value="restar">Restar</option>
                <option value="multiplicar">Multiplicar</option>
                <option value="dividir">Dividir</option>
            </select><br>

            <input type="submit" value="Calcular">
        </form>
    </div>
</body>
</html>

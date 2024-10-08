<!DOCTYPE html>
<html>
<head>
    <title>Calculadora Web</title>
</head>
<body>
    <h1>Calculadora</h1>
    <form action="CalculadoraServlet" method="POST">
        Número 1: <input type="text" name="num1" required><br><br>
        Número 2: <input type="text" name="num2" required><br><br>
        Operación:
        <select name="operacion">
            <option value="sumar">Sumar</option>
            <option value="restar">Restar</option>
            <option value="multiplicar">Multiplicar</option>
            <option value="dividir">Dividir</option>
        </select><br><br>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>

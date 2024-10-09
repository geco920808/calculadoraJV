<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro de Datos</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <div class="formulario-registro container">
        <h2>Registro de Datos</h2>
        <form action="DatosServlet" method="POST">
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" required><br>

            <label for="edad">Edad:</label>
            <input type="number" id="edad" name="edad" required><br>

            <label for="correo">Correo:</label>
            <input type="email" id="correo" name="correo" required><br>

            <label for="telefono">Teléfono:</label>
            <input type="tel" id="telefono" name="telefono" required pattern="[0-9]{10}"><br>

            <label for="genero">Género:</label>
            <select id="genero" name="genero">
                <option value="masculino">Masculino</option>
                <option value="femenino">Femenino</option>
                <option value="otro">Otro</option>
            </select><br>

            <input type="submit" value="Registrarse">
        </form>
    </div>
</body>
</html>

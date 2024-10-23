package com.calculadora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CalculadoraDAO {

    // Método para insertar una operación en la base de datos
    public void insertarOperacion(String operacion, double resultado) {
        String sql = "INSERT INTO RegistroOperaciones (operacion, resultado) VALUES (?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Establecer los valores para la operación y el resultado
            statement.setString(1, operacion);
            statement.setDouble(2, resultado);

            // Ejecutar el INSERT
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

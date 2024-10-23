package com.calculadora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String operacion = request.getParameter("operacion");
        double resultado = 0.0;

        // Realiza las operaciones de la calculadora (suma, resta, etc.)
        // Este código dependerá de tu lógica de calculadora
        
        // Por ejemplo, si es una suma:
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        resultado = num1 + num2;

        // Insertar la operación en la base de datos
        CalculadoraDAO dao = new CalculadoraDAO();
        dao.insertarOperacion(operacion, resultado);

        // Redirigir a la página con el resultado
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}

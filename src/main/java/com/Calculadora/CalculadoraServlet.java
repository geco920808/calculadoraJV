import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CalculadoraServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operacion = request.getParameter("operacion");

        // Lógica de la operación
        double resultado = 0;
        switch (operacion) {
            case "sumar":
                resultado = num1 + num2;
                break;
            case "restar":
                resultado = num1 - num2;
                break;
            case "multiplicar":
                resultado = num1 * num2;
                break;
            case "dividir":
                resultado = num2 != 0 ? num1 / num2 : 0;
                break;
        }

        // Redirigir a la página de resultados con los datos
        request.setAttribute("resultado", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("calculadora.jsp");
        dispatcher.forward(request, response);
    }
}

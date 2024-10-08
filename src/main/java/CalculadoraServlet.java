import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CalculadoraServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los valores de los parámetros del formulario
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operacion = request.getParameter("operacion");

        // Variable para almacenar el resultado
        double resultado = 0;
        String mensaje = null;

        // Realizar la operación seleccionada
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
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    mensaje = "No se puede dividir por cero";
                }
                break;
        }

        // Pasar los resultados al JSP para mostrarlos en la respuesta
        request.setAttribute("resultado", resultado);
        request.setAttribute("mensaje", mensaje);

        // Redireccionar a la página JSP para mostrar el resultado
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}

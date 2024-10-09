import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DatosServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los datos del formulario
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String genero = request.getParameter("genero");

        // Preparar la respuesta HTML
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Mostrar los datos ingresados
        out.println("<html><body>");
        out.println("<h2>Datos Recibidos</h2>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Edad: " + edad + "</p>");
        out.println("<p>Correo: " + correo + "</p>");
        out.println("<p>Teléfono: " + telefono + "</p>");
        out.println("<p>Género: " + genero + "</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("registro.jsp");
        dispatcher.forward(request, response);
    }
}

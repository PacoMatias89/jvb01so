package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.ControladoraEquipo;
import logica.Equipo;

/**
 *
 * @author franc
 */
@WebServlet(name = "EquipoSv", urlPatterns = {"/EquipoSv"})
public class EquipoSv extends HttpServlet {

    ControladoraEquipo controladora = new ControladoraEquipo();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EquipoSv</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EquipoSv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Equipo> equipos = controladora.traerEquipo();
            request.setAttribute("resultados", equipos);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (IOException | ServletException e) {
            log("Error en la búsqueda los equipos", e);
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en la búsqueda de equipos");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreEquipo = request.getParameter("nombreEquipo");
        String ciudadEquipo = request.getParameter("ciudadEquipo");

        Equipo equipoNuevo = new Equipo();
        equipoNuevo.setNombre(nombreEquipo);
        equipoNuevo.setCiudad(ciudadEquipo);

        // Creamos el equipo
        controladora.crearEquipo(equipoNuevo);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

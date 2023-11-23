package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import logica.ControladoraVotacion;
import logica.Votacion;

@WebServlet(name = "VotacionSv", urlPatterns = {"/VotacionSv"})
public class VotacionSv extends HttpServlet {

    List<Votacion> votaciones = new ArrayList<>();
    private ControladoraVotacion controladora = new ControladoraVotacion();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VotacionSv</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VotacionSv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Votacion> listaPartidos = controladora.mostrarVotaciones();

            request.setAttribute("resultados", listaPartidos);
            request.getRequestDispatcher("index.jsp").forward(request, response);

        } catch (Exception e) {

            log("Error en la búsqueda de partidos", e);
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en la búsqueda de partidos");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String partidoSeleccionado = request.getParameter("partidoSeleccionado");

        try {
            // Buscar el partido en la base de datos
            Votacion votoActual = controladora.buscarVotacionPorPartido(partidoSeleccionado);

            // Si no existe el partido, creamos uno nuevo
            if (votoActual == null) {
                votoActual = new Votacion(partidoSeleccionado, 1); // Iniciar el contador en 1
                controladora.crearVoto(votoActual); // Agregar a la base de datos
            } else {
                // Si el partido ya existe, incrementamos el contador
                votoActual.incrementaVoto();
                // Modificamos el partido que ya existe para incrementar los votos en la base de datos
                controladora.modificarVoto(votoActual);
            }

            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            log("Error al procesar la votación", e);
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al procesar la votación");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

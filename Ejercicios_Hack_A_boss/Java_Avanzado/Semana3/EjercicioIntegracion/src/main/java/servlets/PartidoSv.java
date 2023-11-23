package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.ControladoraEquipo;
import logica.ControladoraPartido;
import logica.Equipo;
import logica.Partido;

/**
 *
 * @author franc
 */
@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {

    ControladoraPartido controladoraPatido = new ControladoraPartido();
    ControladoraEquipo controladoraEquipo = new ControladoraEquipo();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener la lista de equipos y establecerla como un atributo en el request
        List<Partido> listaDePartidos = controladoraPatido.listaPartidos();
        request.setAttribute("listaDePartidos", listaDePartidos);

        // Despachar la solicitud al archivo JSP
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long idEquipLocal = Long.valueOf(request.getParameter("equipoLocal"));
        Long idEquipVisitante = Long.valueOf(request.getParameter("equipoVisitante"));
        
        // Validar que los IDs de los equipos no sean iguales
        if (idEquipLocal.equals(idEquipVisitante)) {
            request.setAttribute("errorEquipos", "El equipo local y el equipo visitante no pueden ser iguales");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }
        int resulLocal = Integer.parseInt(request.getParameter("resultadoLocal"));
        int resulVisitante = Integer.parseInt(request.getParameter("resultadoVisitante"));

        // Formatear la fecha como "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaPartido = LocalDate.parse(request.getParameter("fechaPartido"), formatter);

        // Validar que la fecha del partido no esté en el futuro
        LocalDate fechaActual = LocalDate.now();
        if (fechaPartido.isAfter(fechaActual)) {
            request.setAttribute("errorFecha", "La fecha del partido no puede estar en el futuro");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }
        
         // Validar que los equipos no tengan un partido programado para la misma fecha
    if (controladoraPatido.existePartidoEnFecha(idEquipLocal, fechaPartido) || controladoraPatido.existePartidoEnFecha(idEquipVisitante, fechaPartido)) {
        request.setAttribute("errorFecha", "Uno de los equipos ya tiene un partido programado para esa fecha");
        request.getRequestDispatcher("index.jsp").forward(request, response);
        return;
    }

        // Utilizar los IDs para buscar los equipos en la base de datos
        Equipo equipoLocal = controladoraEquipo.buscarEquipoPorId(idEquipLocal);
        Equipo equipoVisitante = controladoraEquipo.buscarEquipoPorId(idEquipVisitante);

        // Partido
        Partido partidoNuevo = new Partido();
        partidoNuevo.setEquipoLocal(equipoLocal);
        partidoNuevo.setEquipoVisitante(equipoVisitante);
        partidoNuevo.setFechaPartido(fechaPartido);
        partidoNuevo.setResultL(resulLocal);
        partidoNuevo.setResultV(resulVisitante);

        controladoraPatido.crearPartido(partidoNuevo);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

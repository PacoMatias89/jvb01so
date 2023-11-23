<%@ page import="java.util.List" %>
<%@ page import="logica.Equipo" %>
<%@ page import="logica.Partido" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="./styles.css">
        <title>Registros de partidos</title>
    </head>
    <body>
        <div class="container mt-4">

            <h1>Registro de Equipos</h1>

            <!-- Formulario para registrar equipos -->
            <form action="EquipoSv" method="post">
                <div class="form-row">
                    <div class="col-md-6">
                        <label for="nombreEquipo">Nombre del Equipo:</label>
                        <input type="text" class="form-control" id="nombreEquipo" name="nombreEquipo" required>
                    </div>
                    <div class="col-md-6">
                        <label for="ciudadEquipo">Ciudad del Equipo:</label>
                        <input type="text" class="form-control" id="ciudadEquipo" name="ciudadEquipo" required>
                    </div>
                </div>

                <br>

                <div class="form-row">
                    <div class="col-md-6">
                        <input type="submit" value="Registrar Equipo" class="btn btn-primary">
                    </div>
                </div>
            </form>

            <!-- Botón para mostrar equipos -->
            <form action="EquipoSv" method="get">
                <div class="form-row">
                    <button type="submit" class="btn btn-primary">Mostrar Equipos</button>
                </div>
            </form>

            <br>

            <!-- Mostrar equipos registrados -->
            <% if (request.getAttribute("resultados") != null) { %>
            <h3>Equipos Registrados</h3>
            <table class="table">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Ciudad</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultados")) {%>
                    <tr>
                        <td><%= equipo.getId()%></td>
                        <td><%= equipo.getNombre()%></td>
                        <td><%= equipo.getCiudad()%></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
            <% } %>

            <hr>

            <!-- Sección de advertencia para la fecha -->
            <% if (request.getAttribute("errorFecha") != null) {%>
            <div class="alert alert-danger" role="alert">
                <%= request.getAttribute("errorFecha")%>
            </div>
            <% } %>

            <!-- Sección de advertencia para equipos iguales -->
            <% if (request.getAttribute("errorEquipos") != null) {%>
            <div class="alert alert-danger" role="alert">
                <%= request.getAttribute("errorEquipos")%>
            </div>
            <% } %>

            <!-- Formulario para registrar partidos -->
            <form action="PartidoSv" method="post">
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="date" class="form-control" id="fechaPartido" name="fechaPartido" required>
                </div>     
                <div class="form-group">
                    <label for="equipo1">Id Equipo Local: </label>
                    <input type="number" class="form-control" id="equipoLocal" name="equipoLocal" required>
                </div>                
                <div class="form-group">
                    <label for="equipo2">Id Equipo Visitante: </label>
                    <input type="number" class="form-control" id="equipoVisitante" name="equipoVisitante" required>
                </div>                
                <div class="form-group">
                    <label for="resultadoequipo1">Resultado equipo 1:</label>
                    <input type="number" class="form-control" id="resultadoLocal" name="resultadoLocal" required>
                </div>                 
                <div class="form-group">
                    <label for="resultadoequipo2">Resultado equipo 2:</label>
                    <input type="number" class="form-control" id="resultadoVisitante" name="resultadoVisitante" required>
                </div>                  

                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>

            <!-- Botón para mostrar partidos -->
            <form action="PartidoSv" method="get">
                <div class="form-row">
                    <button type="submit" class="btn btn-primary">Mostrar Partidos</button>
                </div>
            </form>

            <!-- Mostrar partidos registrados -->
            <% if (request.getAttribute("listaDePartidos") != null && !((List<Partido>) request.getAttribute("listaDePartidos")).isEmpty()) { %>
            <h3>Partidos Registrados</h3>
            <table class="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Equipo Local</th>
                        <th>Equipo Visitante</th>
                        <th>Resultado Local</th>
                        <th>Resultado Visitante</th>
                        <th>Fecha del Partido</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Partido partido : (List<Partido>) request.getAttribute("listaDePartidos")) {%>
                    <tr>
                        <td><%= partido.getId()%></td>
                        <td><%= partido.getEquipoLocal().getNombre()%></td>
                        <td><%= partido.getEquipoVisitante().getNombre()%></td>
                        <td><%= partido.getResultL()%></td>
                        <td><%= partido.getResultV()%></td>
                        <td><%= partido.getFechaPartido()%></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
            <% }%>

        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>

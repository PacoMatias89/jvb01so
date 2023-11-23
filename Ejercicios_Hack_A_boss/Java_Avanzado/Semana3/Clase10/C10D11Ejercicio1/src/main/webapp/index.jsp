<%@page import="java.util.List"%>
<%@page import="logica.Votacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="./styles.css">
        <title>Votación Escolar</title>
    </head>
    <body>
        <h1 class="text-center">Votación Escolar del centro</h1>

        <div class="container mt-4 d-flex justify-content-center">
            <form action="VotacionSv" method="POST">
                <h3>Elige tu voto: </h3>
                <input type="radio" value="Partido A" name="partidoSeleccionado">Partido A<br>
                <input type="radio" value="Partido B" name="partidoSeleccionado">Partido B<br>
                <input type="radio" value="Partido C" name="partidoSeleccionado">Partido C<br>
                <input type = "submit" value = "Votar"/>
            </form>
        </div>

        <div class="container mt-4 d-flex justify-content-center">
            <form action="VotacionSv"  method="get">
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Mostrar votaciones</button>
                </div>
            </form>
        </div>
        <br>
        <br>
        <div class="results-table">
            <% if (request.getAttribute("resultados") != null) { %>
            <h3>Votaciones</h3>
            <table class="table">

                <tbody>
                    <% for (Votacion estudiante : (List<Votacion>) request.getAttribute("resultados")) {%>
                    <tr>
                        <td><%= estudiante.getPartido()%></td>
                        <td><%= estudiante.getVoto()%></td>
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

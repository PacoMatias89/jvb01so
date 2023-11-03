import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/universidad";
        Connection connection = DriverManager.getConnection(url, "root", "Kombolo$$1989");


        Estudiante estudiante1 = new Estudiante(1L, "Pepe",19, 5.5);
        Estudiante estudiante2 = new Estudiante(2L, "Lucía",21 ,7.85);
        Estudiante estudiante3 = new Estudiante(3L, "Hugo", 20, 9.0);
        Estudiante estudiante4 = new Estudiante(4L, "Noemi", 22,6.5);
        Estudiante estudiante5 = new Estudiante(5L, "Juan", 25 ,8.5);

        List<Estudiante> estudiantes =new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);

        //Insertamos los estudiantes en la base de datos
        String insertSql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?,?,?)";

        //Declaramos el Statament
        PreparedStatement statement = connection.prepareStatement(insertSql);

        //Vamos insertando datos
        for (Estudiante estudiante : estudiantes) {
            statement.setString(1, estudiante.getNombre());
            statement.setInt(2, estudiante.getEdad());
            statement.setDouble(3, estudiante.getCalificacion());

            //Ejecutamos la sentencia
            statement.executeUpdate();
        }

        //Cerramos la sentencia
        statement.close();
        System.out.println("Los estudiantes han sido insertados satifactoriamente...");
        System.out.println();

        //obtenemos los datos de la base de datos y lo mostramos
        String selectSql = "SELECT * FROM estudiantes";
        Statement statement2 = connection.prepareStatement(selectSql);
        ResultSet resultSet = statement2.executeQuery(selectSql);

        System.out.println("-----------Datos de estudiantes--------------");
        System.out.print("ID\tNombre\tEdad\tCalificación\n");
        while (resultSet.next()) {
            int idEstudiante = resultSet.getInt("id");
            String nombreEstudiante = resultSet.getString("nombre");
            int edadEstudiante = resultSet.getInt("edad");
            double calificacionEstudiante = resultSet.getDouble("calificacion");

            System.out.println(idEstudiante + "\t" + nombreEstudiante + "\t" +edadEstudiante +"\t\t" + calificacionEstudiante);


        }



    }
}
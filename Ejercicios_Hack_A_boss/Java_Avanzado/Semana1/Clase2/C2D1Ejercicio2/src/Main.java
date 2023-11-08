/**
 * • Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar tareas concurrentemente.
 * • Cada trabajador se representa como un hilo independiente.
 * • Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.
 * • Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.
 * • Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación entre las tareas.
 *
 * */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numTrajadores = 5; // Número de trabajadores en la fábrica

        for (int i = 1; i <= numTrajadores; i++) {
            Trabajador trabajador = new Trabajador(i);
            Thread thread = new Thread(trabajador);
            Thread.sleep(1000);
            thread.start();
            thread.join();
            System.out.println("------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Nos creamos el número de agentes que se va a ejecutar y el número de llamadas
        int[] llamadas = {(int) Math.round(Math.random() * 9) + 1, (int) Math.round(Math.random() * 9) + 1, (int) Math.round(Math.random() * 9) + 1,(int) Math.round(Math.random() * 9) + 1};
        int numAgentes = 4;
        // Asignamos el número de llamadas a cada uno de los agentes
        for (int i = 0; i < llamadas.length; i++) {
            Llamada llamada = new Llamada(llamadas[i]);
            Agente agente = new Agente(llamada);
            Thread.sleep(1000);
            agente.start();


        }
        Agente[] agentes = new Agente[numAgentes];
        // Asignar el número de llamadas a cada uno de los agentes
        for (int i = 0; i < numAgentes; i++) {
            agentes[i] = new Agente(new Llamada(llamadas[i]));
            agentes[i].setLlamada(new Llamada(llamadas[i]));
        }

        // Iniciar y esperar a que todos los agentes terminen
        for (int i = 0; i < numAgentes; i++) {
            agentes[i].start();
            agentes[i].join();
        }


    }
}
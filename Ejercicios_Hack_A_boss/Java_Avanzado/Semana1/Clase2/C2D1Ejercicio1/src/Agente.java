public class Agente extends Thread {

    private Llamada llamada;


    public Agente(Llamada llamada) {
        this.llamada = llamada;
    }


    public Llamada getLlamada() {
        return llamada;
    }

    public void setLlamada(Llamada llamada) {
        this.llamada = llamada;
    }

    @Override
    public void run() {
        System.out.println("El agente " + Thread.currentThread().getId() + " está atendiendo la llamada " + llamada.getId());



        resolverConsulta(llamada);

        // Creamos una espera para resolver la llamada
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Registramos la información de la llamada
        registrarInformaciones(llamada);

        System.out.println("El agente " + Thread.currentThread().getId() + " ha terminado la llamada " + llamada.getId());
    }

    // Creamos los métodos para realizar las consultas y registrar información
    private void resolverConsulta(Llamada llamada) {
        System.out.println("El agente " + Thread.currentThread().getId() + " está resolviendo la consulta de la llamada " + llamada.getId());;
    }

    private  void registrarInformaciones(Llamada llamada) {
        System.out.println("El agente " + Thread.currentThread().getId() + " ha registrado la información de la llamada " + llamada.getId());
    }
}

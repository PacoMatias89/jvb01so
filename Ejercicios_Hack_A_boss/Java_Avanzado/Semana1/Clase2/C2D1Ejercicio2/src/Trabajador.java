public class Trabajador extends Thread {
    private int idTrabajado;

    public Trabajador(int idTrabajado) {
        this.idTrabajado = idTrabajado;
    }

    public int getIdTrabajado() {
        return idTrabajado;
    }

    @Override
    public void run() {
        ensamblarProduto();

        // Simulamos el trabajo
        try {
            Thread.sleep(2000); // Por ejemplo, 2 segundos para ensamblar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Trabajador " + idTrabajado + " ha terminado de ensamblar productos.");

        controlCalidad();

        // Simulamos el trabajo
        try {
            Thread.sleep(1000); // Por ejemplo, 1 segundo para el control de calidad
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Trabajador " + idTrabajado + " ha terminado el control de calidad.");

        empaquetarProduto();

        // Simulamos el trabajo
        try {
            Thread.sleep(1500); // Por ejemplo, 1.5 segundos para embalar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Trabajador " + idTrabajado + " ha terminado de embalar productos.");



    }


    public void ensamblarProduto() {
        System.out.println("Trabajador " + this.getIdTrabajado() + " está ensamblando el producto");
    }

    public void controlCalidad(){
        System.out.println("Trabajador " + this.getIdTrabajado() + " está realizando el control de calidad");
    }

    public void empaquetarProduto(){
        System.out.println("Trabajador " + this.getIdTrabajado() + " está empaquetando el producto");
    }
}

public class Empleado {
    private String nombre;
    private double salario;
    private Categoria categoria;


    public Empleado() {}

    public Empleado(String nombre, double salario, Categoria categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + '\n' +
                "Salario: " + salario + '\n' +
                "Categoría: " + categoria+ '\n'  ;
    }
}

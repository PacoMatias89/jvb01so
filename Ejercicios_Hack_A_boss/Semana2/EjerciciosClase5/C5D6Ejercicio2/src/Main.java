public class Main {
    public static void main(String[] args) {

        //Zapatos
        Vestimenta zapato1 = new Zapato(1, "running1", 100, "Nike", "45", "Blanco", "Tela", "Cordones");
        Vestimenta zapato2 = new Zapato(2, "walking2", 140, "Adidas", "40", "Negro-blanco", "cuero", "Velcro");
        Vestimenta zapato3 = new Zapato(3, "trekking3", 90, "Reebok", "38", "Azul", "tela reforzada", "Cremallera");

        //Pantalones
        Vestimenta pantalon1 = new Pantalon(1, "vaqueros", 150, "Pepe jeans", "42", "Azules", "Vaquero", "vaquera");
        Vestimenta pantalon2 = new Pantalon(2, "running sport", 80, "Adidas", "40", "Naranja-mngro", "Sport", "transpirable");
        Vestimenta pantalon3 = new Pantalon(3, "urban sport", 30, "Nike", "42", "Negro", "Chandal", "Algodón");

        //Camiseta
        Vestimenta camiseta1 = new Camiseta(1, "running forever", 50, "Nike", "L", "Blanco", "Caja","Raglán" );
        Vestimenta camiseta2 = new Camiseta(2, "casual polo ", 75.50, "Ralph Laurent", "M", "Blanca-negra", "Jhonny","Francesa" );

        //Sombrero
        Vestimenta sombrero1 = new Sombrero(1, "running1", 50, "Akubra", "M", "Marrón", "Cuero tratado", "57");


        // Creamos un array de vestimentas para recorrer cada una de las prendas
        Vestimenta[] prendas = {zapato1, zapato2, zapato3, pantalon1, pantalon2, pantalon3, sombrero1};

        for (Vestimenta prenda : prendas) {
            System.out.println(prenda.mensaje());
        }


    }
}
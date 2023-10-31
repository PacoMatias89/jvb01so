public class Main {
    public static void main(String[] args) {
        /*******APARTADO C*******/

        Mamifero mamifero = new Mamifero(1, "Mamifero", 3,"Pelo corto", "Omnívora", 4, "sexual", "marrón", "selva");
        System.out.println(mamifero.saludar());
        Ave ave = new Ave(1, "Ave", 3,"plumaje", "Carroña", 2 , "planeo", "Marrón", "Aguilucho");
        System.out.println(ave.saludar());
        Repitel repitel = new Repitel(1, "Repitel", 3,"escamosa", "Omnívora", 6, "sexual", "coagulante", "desierto");
        System.out.println(repitel.saludar());

        /*******APARTADO D*******/

        Animal animal = mamifero;







    }

}
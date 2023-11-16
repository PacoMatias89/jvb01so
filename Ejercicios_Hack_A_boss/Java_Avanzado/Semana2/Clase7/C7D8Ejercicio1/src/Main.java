/**
 * Crea un programa que simule la exploración recursiva de directorios en el sistema de archivos de un sistema operativo utilizando una estructura de datos propia.
 *
 * Emplea una estructura donde cada nodo representa un directorio y contiene referencias a sus subdirectorios.
 *
 * El programa debe realizar una exploración simulada para mostrar la jerarquía de directorios y archivos.
 *
 * Pistas:
 *
 * Puedes utilizar una clase Directorio para cada una de las carpetas/directorios que contenga como datos: id, nombre, listaSubdirectorios, listaArchivos
 *
 *
 * */
public class Main {
    public static void main(String[] args) {
        Directorio raiz = new Directorio(1, "Raiz");
        Directorio docs = new Directorio(2, "Documentos");
        Directorio imagenes = new Directorio(3, "Imagenes");
        Directorio user = new Directorio(4, "Usuario");

        //vamos agregando los subdirectorios a la raiz
        raiz.agregarDirectorio(docs);
        raiz.agregarDirectorio(imagenes);
        raiz.agregarDirectorio(user);

        //vamos agregando los archivos a la raiz
        docs.agregarArchivo("Documento1.pdf");
        docs.agregarArchivo("Documento2.pdf");

        //Agregamos las imágenes
        imagenes.agregarArchivo("Imagen1.jpg");
        imagenes.agregarArchivo("Imagen2.jpg");

        //Agregamos el usuario
        user.agregarArchivo("Usuario1.txt");
        user.agregarArchivo("Usuario2.txt");



        //vamos explorando la raiz
        ExplorarDirectorio.explorarDirectorioRecursivo(raiz, 0);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base, altura, area;
        System.out.println("---------------Calcular el área de un triángulo---------------");
        System.out.println("Por favor, introduzca la base del triángulo:");
        base = scanner.nextDouble();

        System.out.println("Por favor, introduzca la altura del triángulo:");
        altura = scanner.nextDouble();

        area = base * altura / 2;

        System.out.printf("El área del triángulo es: %.2f cm²%n", area);

    }
}
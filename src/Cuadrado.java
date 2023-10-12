import java.util.Scanner;

public class Cuadrado implements figuraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud de un lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;

        System.out.println("El área del cuadrado es: " + area);
        scanner.close();
    }
}
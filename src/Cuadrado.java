import java.util.Scanner;

public class Cuadrado extends interfaz {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el lado del cuadrado
        System.out.print("Ingresa la longitud de un lado del cuadrado: ");
        double lado = scanner.nextDouble();

        // Calcular el área del cuadrado
        double area = lado * lado;

        // Mostrar el resultado
        System.out.println("El área del cuadrado es: " + area);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
import java.util.Scanner;

public class Circulo extends interfaz {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el radio del círculo
        System.out.print("Ingresa el valor del radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo es: " + area);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

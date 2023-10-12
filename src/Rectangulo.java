import java.util.Scanner;

public class Rectangulo extends interfaz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculadora de Área de Rectángulo");
        
        System.out.print("Ingresa la longitud del lado A: ");
        double ladoA = input.nextDouble();
        
        System.out.print("Ingresa la longitud del lado B: ");
        double ladoB = input.nextDouble();
        
        // Calcula el área del rectángulo
        double area = ladoA * ladoB;
        
        System.out.println("El área del rectángulo es: " + area);
    }
}

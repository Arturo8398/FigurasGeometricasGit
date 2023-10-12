import java.util.Scanner;

public class Triangulo extends interfaz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculadora de Área de Triángulo");
        
        System.out.print("Ingresa la longitud de la base del triángulo: ");
        double base = input.nextDouble();
        
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = input.nextDouble();
        
        // Calcula el área del triángulo
        double area = (base * altura) / 2;
        
        System.out.println("El área del triángulo es: " + area);
    }
}


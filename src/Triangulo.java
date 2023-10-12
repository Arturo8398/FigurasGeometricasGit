public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea de la interfaz FiguraGeometrica
    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}

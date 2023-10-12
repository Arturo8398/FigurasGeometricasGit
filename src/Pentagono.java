public class Pentagono implements figuraGeometrica {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double calcularArea() {
        return (5 * lado * apotema) / 2.0;
    }

    public static void main(String[] args) {
        Pentagono miPentagono = new Pentagono(4.0, 3.0);
        double area = miPentagono.calcularArea();
        System.out.println("El área del pentágono es: " + area);

    }
}
public class Trapecio implements figuraGeometrica {
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    public static void main(String[] args) {
        Trapecio trapecio = new Trapecio(5.0, 3.0, 4.0);
        double area = trapecio.calcularArea();
        System.out.println("El área del trapecio es: " + area);
    }
}
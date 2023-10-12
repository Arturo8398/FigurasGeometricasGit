public class Rectangulo implements figuraGeometrica {
    private double longitud;
    private double ancho;

    // Constructor
    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    // Implementación del método calcularArea de la interfaz FiguraGeometrica
    @Override
    public void calcularArea() {
        return longitud * ancho;
    }
}

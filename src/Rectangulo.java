public class Rectangulo implements figuraGeometrica{
    private double longitud;
    private double altura;

    public Rectangulo(double longitud, double altura) {
        this.longitud = longitud;
        this.altura = altura;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return longitud * altura;
    }

    
}

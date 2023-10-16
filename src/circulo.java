public class circulo implements figuraGeometrica{
    private double radio;
    private final double PI = 3.1416;
    

    public circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }


    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}

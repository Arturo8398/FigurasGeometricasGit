public class Circulo implements figuraGeometrica {
    private double radio2;
    private final double PI = 3.1415;
    

    public Circulo(double radio) {
        this.radio2 = radio;
    }

    public double getRadio() {
        return radio2;
    }



    public void setRadio(double radio) {
        this.radio2 = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio2, 2);
    }

}
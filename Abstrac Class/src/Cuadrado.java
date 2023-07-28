public class Cuadrado extends Figure{
    private double lado;


    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override //Sobreescritura de metodos
    public double calArea() {
        double result = lado * lado;
        return  result;
    }
}


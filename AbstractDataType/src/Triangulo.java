public class Triangulo {

    private double base;
    private double altura;

    private double area(){
        return base*altura/2.0d;
    }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
}

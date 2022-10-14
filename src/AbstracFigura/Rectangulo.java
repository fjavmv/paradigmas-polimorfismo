package AbstracFigura;

import FiguraGeometrica.Figura;

public class Rectangulo extends FiguraAbstrac {

    private String nombreFigura;
    private double base;
    private double altura;

    //Polimorfismo parametrico es decir una sobre carga de un metodo produce polimorfismo parametrico
    public Rectangulo(){
        super();
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
    //Polimorfismo parametrico es decir una sobre carga de un metodo produce polimorfismo parametrico

    public Rectangulo(double base, double altura, String nombreFigura){
        this.base = base;
        this.altura = altura;
        this.nombreFigura = nombreFigura;
    }

    //Polimorfismo por sobre escritura o anulación


    //Polimorfismo por sobreescritura
    @Override
    public String toString(){
        return super.toString() + nombreFigura + " es: " + calcularArea();
    }
}

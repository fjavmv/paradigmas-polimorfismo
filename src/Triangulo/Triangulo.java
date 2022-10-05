package Triangulo;

import FiguraGeometrica.Figura;

public class Triangulo extends Figura {

    private String nombreFigura;
    private double base;
    private double altura;

    //Polimorfismo parametrico es decir una sobre carga de un metodo produce polimorfismo parametrico

    public Triangulo(){
        super();
    }

    //Polimorfismo parametrico es decir una sobre carga de un metodo produce polimorfismo parametrico

    public Triangulo(double base, double altura,String nombreFigura) {
        this.base = base;
        this.altura = altura;
        this.nombreFigura = nombreFigura;
    }

    //POLIMORFISMO POR SOBREESCRITURA O ANULACIÓN
    @Override
    public double calcularArea() {
        return (base * altura)/2 ;
    }

    //POLIMORFISMO POR SOBREESCRITURA O ANULACIÓN
    @Override
    public String toString() {
        return super.toString() + nombreFigura +" es: "+ calcularArea();
    }
}

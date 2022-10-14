package interfeces;

import FiguraGeometrica.Figura;

public class Triangulo implements ICalculoAreas {

    private String nombreFigura;
    private double base;
    private double altura;

    //Polimorfismo parametrico es decir una sobre carga de un metodo produce polimorfismo parametrico

    public Triangulo(){
        super();
    }

    @Override
    public double area() {
        return 0;
    }
}

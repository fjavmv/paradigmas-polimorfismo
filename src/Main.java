import FiguraGeometrica.Figura;
import Rectangulo.Rectangulo;
import Triangulo.Triangulo;

/**
 * Ejemplo del de los tres tipo de polimorfismo
 * */
public class Main {
    public static void main(String[] args) {

        //Creo un objeto de la clase figura
        Figura f;
        f = new Rectangulo(2.3,3.4,"Rectangulo");

        Figura f2;
        f2 = new Triangulo(5.0,4.0,"Triangulo");

        System.out.println(f);
        System.out.println(f2);
    }
}
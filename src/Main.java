import FiguraGeometrica.Figura;
import Rectangulo.Rectangulo;
import Sobrecarga.Carro;
import Sobrecarga.Perro;
import Sobrecarga.Persona;
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

        //POLIMORFISMO POR SOBRE CARGA SUCEDE EN CLASES INDEPENDIENTES Y NO TIENEN RELACIÓN DE HERENCIA
        Persona p = new Persona(2,"Maria",3);
        System.out.println(p.Correr());
        Carro c = new Carro(4,"Kia",180);
        System.out.println(c.Correr());
        Perro per = new Perro("Chihuahua",4,10);
        System.out.println(per.Correr());


    }
}
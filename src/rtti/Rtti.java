package rtti;


//identificación de tipo en tiempo de ejecución
/*
*Java lleva a cabo su RTTI utilizando el objeto Class,
* incluso aunque se esté haciendo alguna conversión.
*
 */


public class Rtti {
    public static void main(String[]args){
        //Declaramo un objeto las clase object
        //Creamos una istancia para el obejto creado
        Object objeto = "Hola estudiantes de quinto";

        // creo un objeto de la clase generica Class
        /**
         * El signo de interrogación (?) se conoce como el comodín
         * en la programación genérica.
         * Representa un tipo desconocido.
         * El comodín se puede usar en una variedad de situaciones,
         * como el tipo de parámetro, campo o variable local; a veces
         * como un tipo de devolución.
         * */
        Class<?> clase = objeto.getClass();

        //Imprimimos la clase contenida en objeto
        System.out.println("La clase contenida en object es: " + objeto.getClass().getName());
        System.out.println("La clase contenida en object: " + clase.getName());


        //Declaramos e instanciamos un objeto de tipo INTEGER

     //    Integer numero = 100;
        //Imprimimos el valor de número
       // System.out.println("Valor: "+numero);

        //Imprimiendo la clase que contiene número
        //System.out.println("Nombre clase: " + numero.getClass());

    }




}

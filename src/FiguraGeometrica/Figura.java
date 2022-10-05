package FiguraGeometrica;
/*
* Este ejemplo muestra el polimorfismo por sobre escritura
* o analuación
*
* Java selecciona el método al que se invoca según sus parametros.
* La sobrecarga nos permite seleccionar el método adecuado.
* No confundas la sobrecarga con la sobrescritura (@Override).
* Sobrecargar significa definir nuevos métodos.
* Sobrescribir (@Override) significa ocultar/anular un método con una nueva definición de ese mismo método.
* La sobrecarga no implica herencia, la sobrescritura sí.
*
* Tipos de polimorfismo
* 1. Paramtrico: Se presenta cuando una misma clase tiene
* varios métodos o propiedas con el mismo nombre y diferentes paraetros
* o valores el compilador escoge de manera automatica depende los parametros que se tengan.
*
* NOTA: La sobrecarga de métodos NO provoca polimorfismo
   de sobrecarga, sino polimorfismo paramétrico
*
* 2. Sobrecarga:  Se presenta cuando diversas clase tiene
* varios métodos o propiedas con el mismo nombre donde el se selecciona
* de manera automatica dependiendo del objeto que esté haciendo uso del método o propiedad
*
*3. Sobreescritura:  Cuando se heredan métodos o propiedas que se sobre escriben o anulan por un nuevo comportamiento.
*
* */

public class Figura {

    //Declaramos el constructor

    public Figura(){

    }

    //Declaramos un método para calcular el área
    public double calcularArea(){
        return 0;
    }


    @Override
    public String toString(){
        return "El área del ";
    }
}

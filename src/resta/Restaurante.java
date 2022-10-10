package resta;

import java.util.ArrayList;

public class Restaurante {
    private  ArrayList<Empleado> empleados;

    public Restaurante()
    {
        this.empleados = new ArrayList<>();
    }

   /* public void contrararGerente(Gerente g)
    {
        this.gerentes.add(g);
    }

    public void contratarCocinero(Cocinero c)
    {
        this.cocineros.add(c);
    }

    public void contratarRepartidor(Repartidor r)
    {
        this.repartidores.add(r);
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public ArrayList<Cocinero> getCocineros() {
        return cocineros;
    }

    public ArrayList<Repartidor> getRepartidores() {
        return repartidores;
    }*/

    //upcasting generalización

    public  void contratarEmpleado(Empleado e) {
        if ( e instanceof Cocinero)
        {
           Cocinero c = (Cocinero) e;
           c.cocinar();
        }
            Object o;

         e.pagarimpuestos();
         e.cobrarQuicena();
         System.out.println(e);
        //probar pasando object
        this.empleados.add(e);

    }


    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}

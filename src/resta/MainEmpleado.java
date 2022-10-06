package resta;
/**
* @author fjavmvazquez
 * @version 1.0
 *
* */
public class MainEmpleado
{
    public static void main(String[]args)
    {
        Restaurante res = new Restaurante();

        //SIN UPCASTING
        Cocinero c1 = new Cocinero("Manuel",1234.55,"Jefe de cocina","Cocina");
        Cocinero c2 = new Cocinero("Manuel",1234.55,"Jefe de cocina","Cocina");
        Cocinero c3 = new Cocinero("Manuel",1234.55,"Jefe de cocina","Cocina");
        Repartidor r1 = new Repartidor("Alejandro",340.44,"Repartidor","En la calle");
        Repartidor r2 = new Repartidor("Alejandro",340.44,"Repartidor","En la calle");
        Repartidor r3 = new Repartidor("Alejandro",340.44,"Repartidor","En la calle");
        Gerente g1 = new Gerente("Carlos",1345.66,"Gerente de negocio","Oficina");
        Gerente g2 = new Gerente("Carlos",1345.66,"Gerente de negocio","Oficina");
        Gerente g3 = new Gerente("Carlos",1345.66,"Gerente de negocio","Oficina");

        res.contratarEmpleado(g1);
        res.contratarEmpleado(r1);
        res.contratarEmpleado(c1);


        /*Desventajas de la generalización
        c1.cobrarQuicena();
        c1.pagarimpuestos();
        c1.cocinar();
        c1.toString();
        Empleado e =  c1;
        e.cobrarQuicena();
        e.pagarimpuestos();
        e.toString();*/



        System.out.println(res.getEmpleados());

        /*CON UPCASTING
        res.contratarEmpleado(g1);
        res.contratarEmpleado(g2);
        res.contratarEmpleado(g3);
        res.contratarEmpleado(c1);
        res.contratarEmpleado(c2);
        res.contratarEmpleado(c3);
        res.contratarEmpleado(r1);
        res.contratarEmpleado(r2);
        res.contratarEmpleado(r3);*/



        //DOWNCASTING
         //Empleado e = r1; // aquí hacemos upcasting
        // Repartidor r = e; //aquí es downcasting aquí tenemos que forzar la conversión
        // Cocinero c = (Cocinero) e;
        // c.cocinar();


    }
}

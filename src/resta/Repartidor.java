package resta;

public class Repartidor extends Empleado {
    private String lugarDeTrabajo;

    public Repartidor(String nombre, double salario, String cargo, String lugarDeTrabajo) {
        super(nombre, salario, cargo);
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public String repartirPedidos(){
        return "Repartidor en ruta";
    }
    @Override
    public double cobrarQuicena() {
        return super.cobrarQuicena();
    }

    @Override
    public double pagarimpuestos() {
        return super.pagarimpuestos();
    }

    public String toString(){
        return super.toString() + lugarDeTrabajo;
    }

}

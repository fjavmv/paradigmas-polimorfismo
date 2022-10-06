package resta;

public class Gerente extends Empleado{

    private String lugarDeTrabajo;

    public Gerente(String nombre, double salario, String cargo, String lugarDeTrabajo) {
        super(nombre, salario, cargo);
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public String realizarReunion()
    {
        return "Relizando reunión.......";
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

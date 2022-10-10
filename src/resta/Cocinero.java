package resta;

public class Cocinero extends Empleado{
    private String lugarDeTrabajo;

    public Cocinero(String nombre, double salario, String cargo, String lugarDeTrabajo) {
        super(nombre, salario, cargo);
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public String cocinar()
    {
        return "Concinero preprando alimentos.......";
    }

    @Override
    public double cobrarQuicena() {
        return super.cobrarQuicena();
    }

    @Override
    public double pagarimpuestos()
    {
        return super.pagarimpuestos() - 0.16;
    }

    public String toString(){
        return super.toString() + lugarDeTrabajo;
    }
}

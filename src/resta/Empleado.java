package resta;

public class Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    public Empleado(String nombre, double salario, String cargo)
    {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double cobrarQuicena()
    {
        return salario;
    }

    public double pagarimpuestos()
    {
        return  (salario - 17.92);
    }


    public String toString(){
        return nombre +  salario +  cargo;
    }

}

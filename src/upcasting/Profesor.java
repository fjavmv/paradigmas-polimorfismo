package upcasting;

public class Profesor extends Persona{
    private String materia;
    private String carrera;

    public Profesor(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
    }

    public Profesor(String nombre, int edad, String genero, String materia, String carrera) {
        super(nombre, edad, genero);
        this.materia = materia;
        this.carrera = carrera;
    }

    public String impartirClases(){
        return materia + carrera;
    }
}

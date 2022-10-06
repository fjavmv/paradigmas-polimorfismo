package upcasting;

public class Estudiante extends Persona{

    private String semestre;
    private String carreraDeEstudiante;

    public Estudiante(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
    }

    public Estudiante(String nombre, int edad, String genero, String semestre, String carreraDeEstudiante) {
        super(nombre, edad, genero);
        this.semestre = semestre;
        this.carreraDeEstudiante = carreraDeEstudiante;
    }

    public String impartirClases(){
        return carreraDeEstudiante + semestre;
    }


}

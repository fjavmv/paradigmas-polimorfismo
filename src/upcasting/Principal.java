package upcasting;

public class Principal {
    public static void main(String[] args) {
        Persona p = new Persona("Jose",23,"Hombre");
        Estudiante e = new Estudiante("Maria",21,"Mujer","Quinto","Informática");
        Profesor pro = new Profesor("Carlos",35,"Hombre","Paradigmas","Informática");
    }
}

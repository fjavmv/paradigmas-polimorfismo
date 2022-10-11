package interfaces2;

public class IPrincipal {
    public static void main(String[]args){
        Auditorio auditorio = new Auditorio();

        //Agregando cantante a la lista
        auditorio.agregarCantante(new Cantante());
        auditorio.agregarCantante(new Canario());
        auditorio.agregarCantante(new Cantante());
        auditorio.agregarCantante(new Canario());
        auditorio.agregarCantante(new Cantante());
        auditorio.agregarCantante(new Canario());


        //Mostrando en consola la letra de canción
      auditorio.ofrecerConcierto();
    }
}

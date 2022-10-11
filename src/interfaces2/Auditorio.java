package interfaces2;
import java.util.ArrayList;
public class Auditorio {
    private ArrayList<HacerMusica> cantantes;
    String cancion;
    public Auditorio(){
        cantantes = new ArrayList<>();
    }
    public void agregarCantante(HacerMusica cantantes){
        this.cantantes.add(cantantes);
    }
    public void ofrecerConcierto(){
       for (HacerMusica cantante: cantantes) {
           cancion = cantante.cantar("MUSICA");
           System.out.println(cancion);
        }
    }



}
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
           cancion = cantante.cantar("Brilla, Brilla, patricio estrella\n" +
                    "yo me hice un sandwich\n" +
                    "mi mami lo llamo berto\n" +
                    "sabe a frijoles fritos");
           System.out.println(cancion);
        }

    }



}
package interfaces2;

public class Cantante extends Persona implements HacerMusica{


    public String generoDeMusica;
    public String tonoDeVoz;
    public String nombreArtistico;

    public Cantante(){
        super();
    }
    public String calentarVoz(){
        return "Calentando la voz";
    }
    @Override
    public String cantar(String letraDeCancion) {
        return calentarVoz() + " Y AHORA EL CANTANTE VA A CANTAR: " + letraDeCancion;
    }
}

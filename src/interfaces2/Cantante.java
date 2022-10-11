package interfaces2;

public class Cantante extends Persona implements HacerMusica{


    private String generoDeMusica;
    protected String tonoDeVoz;
    public String nombreArtistico;






    public Cantante(){
        super();
    }
    public String calentarVoz(){
        return "Calentando la voz" + cancion();
    }

    @Override
    public String cantar(String letraDeCancion) {
        return calentarVoz() + " Y AHORA EL CANTANTE VA A CANTAR: " + letraDeCancion;
    }

    @Override
    public String cancion() {
        return HacerMusica.super.cancion() + "bbbbbbbbbbbbbbbbbbbb";
    }
}

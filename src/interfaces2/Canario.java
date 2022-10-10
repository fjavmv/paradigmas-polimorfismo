package interfaces2;

public class Canario extends Aves implements HacerMusica{

    public Canario(){
        super();
    }

    public String tomarAire(){
        return "Tomando aire";
    }

    @Override
    public String cantar(String letraDeCancion) {
        return  tomarAire() + " EL CANARIO CANTA: " + letraDeCancion;
    }
}

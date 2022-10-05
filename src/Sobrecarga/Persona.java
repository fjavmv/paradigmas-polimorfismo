package Sobrecarga;

public class Persona {
    private String nombre;
    private int velocidad;
    private int nPiernas;


    public Persona(int nPiernas,String nombre, int velocidad){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.nPiernas = nPiernas;
    }

    public String Correr(){
        return nombre + " " +  nPiernas+ " " +velocidad;
    }


}

package Sobrecarga;

public class Carro {
    private String nombre;
    private int velocidad;
    private int nLlantas;

    public Carro( int nLlantas, String nombre,int velocidad){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.nLlantas = nLlantas;
    }

    public String Correr(){
        return nombre +" "+ nLlantas +" "+ velocidad;
    }

}

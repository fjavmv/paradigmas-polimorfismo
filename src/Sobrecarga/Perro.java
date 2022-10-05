package Sobrecarga;

public class Perro {
    private String nombre;
    private int velocidad;
    private  int npatas;

    public Perro(String nombre,int npatas,int velocidad){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.npatas = npatas;
    }

    public String Correr(){
        return nombre +" "+ npatas +" "+ velocidad;
    }
}

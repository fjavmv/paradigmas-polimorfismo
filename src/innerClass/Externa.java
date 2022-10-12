package innerClass;

public class Externa {
    int[] numeros;

    public Externa(int[] numeros) {
        this.numeros = numeros;
    }

    public void analizar() {
        ClaseInterna interna = new ClaseInterna();
        System.out.println("Minimo: " + interna.min());
        System.out.println("Maximo: " + interna.max());
        System.out.println("Promedio: " + interna.prom());
    }

    //esto es la clase interna
    private class ClaseInterna {
        public int min() {
            int m = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] < m) {
                    m = numeros[i];
                }
            }
            return m;
        }

        public int max() {
            int m = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > m) {
                    m = numeros[i];
                }
            }
            return m;
        }

        public int prom() {
            int a = 0;
            for (int i = 0; i < numeros.length; i++)
                a += numeros[i];
            return a / numeros.length;
        }
    } // fin clase interna

    class Sumar {

    }

    class Deducciones {


    }
}
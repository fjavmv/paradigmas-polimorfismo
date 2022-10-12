package innerClass;

public class MainInner {
    public static void main(String[] args) {
        int [] x = {4,5,6,7,7,7,7,8,9,7,6,4};
        Externa externa = new Externa(x);
        externa.analizar();
    }
}
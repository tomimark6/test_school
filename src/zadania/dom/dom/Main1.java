package zadania.dom.dom;

public class Main1 {
    public static void main(String[] args) {

        int LIMIT = 1000_000;
        int potegi = 1;

        while (potegi < LIMIT) {
            System.out.println(potegi);
            potegi *= 2;

        }
        System.out.println("ostatnia: " + potegi);
        System.out.println();

        for (int i = 1; i < LIMIT; i *= 2){
            System.out.println(i);
        }

    }
}
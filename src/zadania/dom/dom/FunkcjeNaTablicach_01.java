package zadania.dom.dom;

public class FunkcjeNaTablicach_01 {

    public static void main(String[] args) {
        int[] tablica = {3, 6, 9, 12, 15, 18};
        int x = 3;

        wypiszPodzielne(tablica, x);
    }

    public static void wypiszPodzielne(int[] tab, int x) {
        System.out.println("Liczby podzielne przez " + x + ":");

        for (int liczba : tab) {
            if (liczba % x == 0) {
                System.out.println(liczba);

            }
        }
    }
}

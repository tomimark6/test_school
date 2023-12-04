package zadania.dom.dom;

public class FunkcjeNaTAblicach_04 {

    public static void main(String[] args) {
        int[] tablica = {3, 6, 9, 12, 15};
        int x = 3;

        int ilosc = ilePodzielnych(tablica, x);

        System.out.println("Ilość liczb podzielnych przez " + x + ": " + ilosc);
    }

    public static int ilePodzielnych(int[] tab, int x) {
        int ilosc = 0;

        for (int liczba : tab) {
            if (liczba % x == 0) {
                ilosc++;
            }
        }

        return ilosc;
    }
}

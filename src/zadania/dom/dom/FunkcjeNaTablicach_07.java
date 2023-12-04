package zadania.dom.dom;

import static java.util.Collections.min;

public class FunkcjeNaTablicach_07 {

    public static void main(String[] args) {
        int[] tablica = {5, 2, 8, 1, 10};

        Integer minWartosc = min(tablica);

        if (minWartosc != null) {
            System.out.println("Najmniejsza  wartość w tablicy: " + minWartosc);

        }
    }

    public static Integer min(int[] tab) {


        int minWartosc = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < minWartosc) {
                minWartosc = tab[i];
            }
        }

        return minWartosc;
    }
}

package zadania.dom.dom;

public class FunkcjeNaTablicach_06 {

    public static void main(String[] args) {
        int[] tablica = {5, 2, 8, 1, 10};

        Integer maxWartosc = max(tablica);

        if (maxWartosc != null) {
            System.out.println("Największa wartość w tablicy: " + maxWartosc);
        } else {
            System.out.println("Tablica jest pusta");
        }
    }

    public static Integer max(int[] tab) {
        if (tab.length == 0) {
            return null;
        }

        int maxWartosc = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > maxWartosc) {
                maxWartosc = tab[i];
            }
        }

        return maxWartosc;
    }
}

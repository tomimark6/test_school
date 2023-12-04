package zadania.dom.dom;

public class FunkcjeNaTablicach_08 {

    public static void main(String[] args) {
        int[] tablica = {5, 3, 9, 1, 7};

        int roznica = roznicaMinMax(tablica);

        System.out.println("Różnica pomiędzy największą a najmniejszą liczbą: " + roznica);
    }

    public static int roznicaMinMax(int[] tab) {
        if (tab.length == 0) {
            return 0;
        }

        int min = tab[0];
        int max = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            } else if (tab[i] > max) {
                max = tab[i];
            }
        }

        return max - min;
    }
}

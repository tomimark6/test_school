package zadania.dom.dom;

public class FunkcjeNaTablicach_02 {

    public static void main(String[] args) {
        int[] tablica = {2, 4, 6, 8, 10};
        int x = 3;

        Integer pierwszaPodzielna = pierwszaPodzielna(tablica, x);

        if (pierwszaPodzielna != null) {
            System.out.println("Pierwsza liczba podzielna przez " + x + ": " + pierwszaPodzielna);
        } else {
            System.out.println("Brak liczby podzielnej przez " + x);
        }
    }

    public static Integer pierwszaPodzielna(int[] tab, int x) {
        for (int liczba : tab) {
            if (liczba % x == 0) {
                return liczba;
            }
        }
        return null;
    }
}

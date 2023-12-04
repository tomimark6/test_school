package zadania.dom.dom;

public class FunkcjeNaTablicach_05 {
    public static void main(String[] args) {
        int[] tablica = {3, 6, 9, 12, 15};
        int x = 3;

        double srednia = sredniaPodzielnych(tablica, x);

        System.out.println("Średnia liczb podzielnych przez " + x + ": " + srednia);
    }

    public static double sredniaPodzielnych(int[] tab, int x) {
        int ilosc = 0;
        int suma = 0;

        for (int liczba : tab) {
            if (liczba % x == 0) {
                ilosc++;
                suma += liczba;
            }
        }

        if (ilosc == 0) {
            return 0;
        }

        return (double) suma / ilosc;
    }
}



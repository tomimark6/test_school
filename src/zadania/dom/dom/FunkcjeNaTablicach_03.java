package zadania.dom.dom;

public class FunkcjeNaTablicach_03 {

    public static void main(String[] args) {
        int[] tablica = {3, 6, 9, 12, 15};
        int x = 3;

        int suma = sumaPodzielnych(tablica, x);

        System.out.println("Suma liczb podzielnych przez " + x + ": " + suma);
    }

    public static int sumaPodzielnych(int[] tab, int x) {
        int suma = 0;

        for (int liczba : tab) {
            if (liczba % x == 0) {
                suma += liczba;
            }
        }

        return suma;
    }
}

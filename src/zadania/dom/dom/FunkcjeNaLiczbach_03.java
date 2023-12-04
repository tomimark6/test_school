package zadania.dom.dom;

public class FunkcjeNaLiczbach_03 {
    public static void main(String[] args) {
        int n = 5;
        long wynik = silnia(n);
        System.out.println("Silnia z " + n + " wynosi: " + wynik);
    }

    public static long silnia(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Silnia jest zdefiniowana tylko dla liczb nieujemnych.");
        }

        long wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
}

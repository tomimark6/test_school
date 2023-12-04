package zadania.dom.dom;

public class FunkcjeNaLiczbach_04 {
    public static void main(String[] args) {
        int n = 80; // Indeks liczby Fibonacciego
        long wynik = fib(n);
        System.out.println("Osiemdziesiąta liczba Fibonacciego wynosi: " + wynik);
    }

    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }

        long[] fibArray = new long[n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return fibArray[n];
    }
}

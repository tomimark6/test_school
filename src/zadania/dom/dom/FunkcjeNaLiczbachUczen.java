package zadania.dom.dom;

public class FunkcjeNaLiczbachUczen {
    public static void main(String[] args) {
        // Testowanie funkcji
        long liczba = 12345;
        int suma = sumaCyfr(liczba);
        System.out.println("Suma cyfr liczby " + liczba + " wynosi: " + suma);

        long podstawa = 2;
        int wykladnik = 5;
        long wynikPotegi = potega(podstawa, wykladnik);
        System.out.println(podstawa + " do potęgi " + wykladnik + " wynosi: " + wynikPotegi);

        int n = 5;
        long wynikSilnia = silnia(n);
        System.out.println("Silnia z " + n + " wynosi: " + wynikSilnia);

        int fibNumber = 80;
        long fibResult = fib(fibNumber);
        System.out.println("Osiemdziesiata  wynosi: " + fibResult);

        long numberToCheck = 17;
        boolean isPrime = czPierwsza(numberToCheck);
        if (isPrime) {
            System.out.println(numberToCheck + " jest liczbą pierwszą.");
        } else {
            System.out.println(numberToCheck + " nie jest liczbą pierwszą.");
        }
    }

    // Funkcja sumaCyfr - zwraca sumę cyfr liczby całkowitej
    public static int sumaCyfr(long n) {
        int suma = 0;
        while (n != 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    // Funkcja potega - potęgowanie liczb całkowitych
    public static long potega(long podstawa, int wykladnik) {
        if (wykladnik < 0) {
            throw new IllegalArgumentException("Wykładnik musi być liczbą nieujemną.");
        }

        long wynik = 1;
        for (int i = 0; i < wykladnik; i++) {
            wynik *= podstawa;
        }
        return wynik;
    }

    // Funkcja silnia - oblicza silnię
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

    // Funkcja fib - zwraca n-tą liczbę Fibonacciego
    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }

        long fib1 = 0;
        long fib2 = 1;
        long fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        return fib;
    }

    // Funkcja czPierwsza - sprawdza czy liczba jest liczbą pierwszą
    public static boolean czPierwsza(long liczba) {
        if (liczba <= 1) {
            return false;
        }

        if (liczba <= 3) {
            return true;
        }

        if (liczba % 2 == 0 || liczba % 3 == 0) {
            return false;
        }

        for (long i = 5; i * i <= liczba; i += 6) {
            if (liczba % i == 0 || liczba % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}

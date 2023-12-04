package zadania.dom.dom;

import java.util.Scanner;

public class FunkcjeNaLiczbach_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long liczba = scanner.nextInt();
        boolean wynik = czPierwsza(liczba);
        if (wynik) {
            System.out.println(liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println(liczba + " nie jest liczbą pierwszą.");
        }
    }

    public static boolean czPierwsza(long liczba) {
        if (liczba <= 1) {
            return false;
        }

        for (long i = 2; i * i <= liczba; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }

        return true;
    }
}

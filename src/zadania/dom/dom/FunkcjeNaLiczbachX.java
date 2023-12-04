package zadania.dom.dom;

import java.util.Scanner;

public class FunkcjeNaLiczbachX {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        long liczba = scanner.nextLong();
        boolean  wynik = czPierwsza(liczba);

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

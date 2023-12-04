package zadania.trzecieSpotkanie;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.LongStream;

public class SilniaRozneWersje {
    // Funkcja oblicza silnię z liczby n.
    // silnia to jest iloczyn kolejnych liczb od 1 do n
    // np. silnia(5) = 1*2*3*4*5 = 120
    // W matematyce silnię zapisuje się znakiem ! , np. 5! = 120
    // silnia ma ważne zastosowania w kombinatoryce
    static int silnia(int n) {
   	 int wynik = 1;
   	 for(int i = 1; i <= n; i++) {
   		 wynik = wynik * i;
   	 }
   	 return wynik;
    }
    
    // alternatywne wersje silni
    // wersja dla typu long, z drobnymi optymalizacjami zapisu
    static long silniaLong(int n) {
   	 long wynik = 1;
   	 for(int i = 2; i <= n; i++) {
   		 wynik *= i;
   	 }
   	 return wynik;
    }
    
    // wersja ze zmniejszaniem licznika
    static long silniaWhile(int n) {
   	 long wynik = 1;
   	 while(n > 1) {
   		 wynik *= n;
   		 n--;
   	 }
   	 return wynik;
    }
    
    // wersja rekurencyjna
    // rekurencja (recursion) to jest sytuacja, gdy funkcja wywołuje samą siebie
    static long silniaRek(int n) {
   	 if(n <= 1) return 1;
   	 return n * silniaRek(n-1);
    }
    
    static BigInteger silniaBig(int n) {
   	 BigInteger wynik = BigInteger.ONE;
   	 for(int i = 1; i <= n; i++) {
		 wynik = wynik.multiply(BigInteger.valueOf(i));
	 }
		return wynik;
	}

	// Od Javy 8 dostępne są rozwiązania "funkcyjne", m.in. strumienie (Stream) i wyrażenia lambda.
	// Za ich pomocą obliczenia można zapisywać w zupełnie inny sposób.

	static long silniaFun(int n) {
		return LongStream.rangeClosed(2, n).reduce(1, (x, y) -> x*y);
	}

	static BigInteger silniaBigFun(int n) {
		return LongStream.rangeClosed(1, n)
				.mapToObj(BigInteger::valueOf)
				.reduce(BigInteger.ONE, BigInteger::multiply);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podawaj liczby dodatnie, a zakończ podając liczbę ujemną.");

		while(true) {
			System.out.print("\nPodaj liczbę: ");
			int n = scanner.nextInt();
			if(n < 0) break;
			System.out.println("  int: " + n + "! = " + silnia(n));
			System.out.println(" long: " + n + "! = " + silniaLong(n));
			System.out.println("while: " + n + "! = " + silniaWhile(n));
			System.out.println("  rek: " + n + "! = " + silniaRek(n));
			System.out.println("  big: " + n + "! = " + silniaBig(n));
			System.out.println("  fun: " + n + "! = " + silniaFun(n));
			System.out.println(" bfun: " + n + "! = " + silniaBigFun(n));
		}
	}

}


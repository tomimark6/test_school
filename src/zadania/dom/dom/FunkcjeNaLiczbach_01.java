package zadania.dom.dom;

public class FunkcjeNaLiczbach_01 {
    public static void main(String[] args) {
        long liczba = 1023;
        int suma = sumaCyfr(liczba);
        System.out.println("Suma cyfr liczby " + liczba + " wynosi: " + suma);
    }

          static int sumaCyfr(long n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }
}

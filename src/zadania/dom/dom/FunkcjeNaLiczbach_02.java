package zadania.dom.dom;

public class FunkcjeNaLiczbach_02 {
    public static void main(String[] args) {
        long podstawa = 2;
        int wykladnik = 5;
        long wynik = potega(podstawa, wykladnik);
        System.out.println(podstawa + " do potęgi " + wykladnik + " wynosi: " + wynik);
    }

    public static long potega(long podstawa, int wykladnik) {
        long wynik = 1;
        for (int i = 0; i < wykladnik; i++) {
            wynik *= podstawa;
        }
        return wynik;
    }
}

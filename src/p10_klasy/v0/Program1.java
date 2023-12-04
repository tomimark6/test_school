package p10_klasy.v0;


public class Program1 {

    public static void main(String[] args) {
        Osoba a = new Osoba();
        Osoba b = new Osoba();

        // Początkowe wartości pól: null, 0, false w zależności od typu.
        System.out.println("Początkowe wartości pól: " + a.imie + " " + a.nazwisko + " " + a.wiek);

        a.imie = "Ala";
        a.nazwisko = "Kowalska";
        a.wiek = 30;
        b.imie = "Basia";
        b.nazwisko = "Malinowska";
        b.wiek = 40;
        // Każdy obiekt ma swoje własne wartości pól
        System.out.println("pola obiektu a: " + a.imie + " " + a.nazwisko + " " + a.wiek);
        System.out.println("pola obiektu b: " + b.imie + " " + b.nazwisko + " " + b.wiek);

        System.out.println("Osoby przedstawiaja sie...");

        a.przedstawSie();
        b.przedstawSie();

    }
}

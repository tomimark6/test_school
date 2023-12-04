package p10_klasy.v0;

public class PrzykladDziedziczenie {

    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        // Obiekt klasy Osoba posida tylko te pola i metody, które zostały zdefiniowane w klasie Osoba
        osoba.imie = "Ala";
        osoba.nazwisko = "Kowalska";
        osoba.wiek = 30;
        osoba.przedstawSie();

        // Obiekt klasy Student posiada pola i metody pochodzące z klasy Osoba,
        // a dodatkowo te pola i metody, które zostały dodefiniownae w klasie Student.
        Student student = new Student();
        student.imie = "Adam";
        student.nazwisko = "Abacki";
        student.wiek = 21;
        student.rok = 2;
        student.kierunek = "medycyna";
        
        student.przedstawSie();
        student.dodajOcene(4);
        student.dodajOcene(4);
        student.dodajOcene(5);
        System.out.println("Średnia ocen: " + student.sredniaOcen());
        
        // Obiekt klasy Student "jest" jednocześnie obiektem klasy Osoba
        // i może być użyty wszędzie tam, gdzie oczekiwana jest jakaś Osoba.
        Sklep zabka = new Sklep("Żabka", 6);
        zabka.sprzedajPiwo(student);
        
        Konto kontoStudenckie = new Konto(1, 1000, student);
        System.out.println(kontoStudenckie);
        System.out.println();
        
        // Konstruktory NIE SĄ automatycznie dziedziczone z nadklasy do podklasy.
        // Student student2 = new Student("Marek", "Markowski", 23);
        
        // Ale w podklasie można zdefiniować konstruktor, który inicjalizuje wszystko, co trzeba, częściowo za pomocą super(...)
        Student student3 = new Student("Marek", "Markowski", 23, 3, "informatyka");
        System.out.println(student3);
        System.out.println(student3.jestPelnoletnia());
        
        osoba.przedstawSie();
        student3.przedstawSie();
        
        // Nawet, gdy obiekt Student zostanie zapisany w zmiennej typu Osoba,
        // to i tak wykona się wersja metody zdefiniowana w klasie Student.
        Pracownik pracownik = new Pracownik();


        Osoba[] osoby = {osoba, student, student3,pracownik};
        System.out.println("\nWitajcie osoby, przedstawcie się...");
        for(Osoba ktos : osoby) {
            ktos.przedstawSie();
        }
        System.out.println();
        System.out.println("Osoby idą do Żabki...");
        for(Osoba klient : osoby) {
            zabka.sprzedajPiwo(klient);
        }
    }

}

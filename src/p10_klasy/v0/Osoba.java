package p10_klasy.v0;

public class Osoba {
    String imie, nazwisko;
    int wiek;
    
    Osoba() {
    }
    
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    
    void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat.");
    }
    
   final boolean jestPelnoletnia() {
        return wiek >= 18;
    }
    
    public String toString() {
        return imie + " " + nazwisko + " (" + wiek + " lat)";
    }

}


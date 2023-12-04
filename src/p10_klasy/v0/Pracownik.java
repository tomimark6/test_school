package p10_klasy.v0;

import java.math.BigDecimal;

// W Javie nie ma "wielodziedziczenia", klasa ma dokładnie jedną nadklasę.
public class Pracownik extends Osoba {
    private final static int PENSJA_MINIMALNA = 4000;
    
    String zawod;
    BigDecimal pensja;
    
    Pracownik() {
   	 
    }

    Pracownik(String imie, String nazwisko, int wiek, String zawod, BigDecimal pensja) {
   	 // wywołanie konstruktora z nadklasy
   	 super(imie, nazwisko, wiek);
   	 this.zawod = zawod;
   	 this.pensja = pensja;
    }

    Pracownik(String imie, String nazwisko, int wiek, String zawod, double pensja) {
   	 // wywołanie innego konstruktora z tej samej klasy
   	 this(imie, nazwisko, wiek, zawod, BigDecimal.valueOf(pensja).setScale(2));
    }
    
    Pracownik(String imie, String nazwisko, int wiek, String zawod, int pensja) {
   	 this(imie, nazwisko, wiek, zawod, BigDecimal.valueOf(pensja).setScale(2));
    }

    Pracownik(String imie, String nazwisko, int wiek, String zawod, String pensja) {
   	 this(imie, nazwisko, wiek, zawod, new BigDecimal(pensja));
    }

    Pracownik(String imie, String nazwisko, int wiek, String zawod) {
   	 this(imie, nazwisko, wiek, zawod, PENSJA_MINIMALNA);
    }
    // tworzenie wielu konstruktorów w tej samej klasie to jest "przeciążanie konstruktorów" / "overloading"
    
    @Override
    public void przedstawSie() {
   	 System.out.println("Dzień dobry, tu "+ imie + ", pracuję jako " + zawod + " i zarabiam " + pensja +" zł.");
    }

    @Override
    public String toString() {
        return "Pracownik [zawod=" + zawod + ", pensja=" + pensja + ", imie=" + imie + ", nazwisko=" + nazwisko
                + ", wiek=" + wiek + "]";
    }

}

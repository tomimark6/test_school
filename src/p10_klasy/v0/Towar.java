package p10_klasy.v0;

public class Towar {
     String nazwa;
     double cena;

    public Towar(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }



    public String toString() {
        return "Towar: " + nazwa + ", cena: " + cena;
    }

    double jakiKoszt(int sztuk) {
        return cena * sztuk;
    }
    }
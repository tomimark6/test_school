package p10_klasy.v0;

public class Konto {
    int numer;
    int saldo;
    Osoba wlasciciel;

     Konto(int numer, int saldo, Osoba wlasciciel) {
        this.numer = numer;
        this.saldo = saldo;
        this.wlasciciel = wlasciciel;

     }

    // można tworzyć więcej konstruktorów, które różnią się liczbą lub typem parametrów
    // np. konstruktor tworzący konto z saldem zero:
    public Konto(int numer, Osoba wlasciciel) {
        this.numer = numer;
        this.saldo = 0;
        this.wlasciciel = wlasciciel;
    }

    @Override
    public String toString() {
        return "Konto nr " + numer + ", " + saldo + " PLN, wł. " + wlasciciel;
    }
    public void wplata(int kwota) {
        if (kwota > 0) {
            saldo += kwota;

        }
    }

    public void wyplata(int kwota) {
        if (kwota > 0 && kwota <= saldo) {
            saldo -= kwota;


        }
    }

}

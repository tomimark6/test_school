package p10_klasy.zadania;

public class Konto {
	int numer;
	int saldo;
	Osoba wlasciciel;
	
	public Konto(int numer, int saldo, Osoba wlasciciel) {
		this.numer = numer;
		this.saldo = saldo;
		this.wlasciciel = wlasciciel;
	}
	
    Konto(int numer, Osoba wlasciciel) {
        this(numer, 0, wlasciciel);
    }

	@Override
	public String toString() {
		return "Konto nr " + numer + ": " + saldo + " PLN , wł.: " + wlasciciel;
	}
	
	void wplata(int kwota) {
		saldo += kwota;
	}

	void wyplata(int kwota) {
		saldo -= kwota;
	}
	
}

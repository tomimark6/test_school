package p10_klasy.v0;

public class Sklep {
	String nazwa;
	int cenaPiwa;
	int utarg = 0;
	
	public Sklep(String nazwa, int cenaPiwa) {
		this.nazwa = nazwa;
		this.cenaPiwa = cenaPiwa;
	}

	void sprzedajPiwo(Osoba klient) {
		System.out.println("________________");
		System.out.println("Klient wchodzi do sklepu " + nazwa + ". Kliencie, przedstaw się...");
		klient.przedstawSie();
		if(klient.wiek >= 18) {
			System.out.println("Osoba " + klient.imie + " kupuje piwo za " + cenaPiwa + " zł");
			utarg += cenaPiwa;
		} else {
			System.out.println("Osoba " + klient.imie + " nie może kupić piwa, bo ma tylko " + klient.wiek + " lat.");
		}
		System.out.println("^^^^^^^^^^^^^^^");
	}

}

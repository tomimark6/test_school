package zadania;

import p10_klasy.v0.Konto;
import p10_klasy.v0.Osoba;

public class PrzykladKonto1 {

	public static void main(String[] args) {
    	Osoba ala = new Osoba("Ala", "Kowalska", 30);
    	Konto kontoAli = new Konto(1, ala);
    	System.out.println(kontoAli);
   	 
    	kontoAli.wplata(1500);
    	kontoAli.wplata(300);
    	System.out.println(kontoAli); // 1800
	}

}

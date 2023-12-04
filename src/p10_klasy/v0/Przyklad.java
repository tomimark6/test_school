package p10_klasy.v0;

public class Przyklad {

	public static void main(String[] args) {
    	Osoba osoba = new Osoba("Ala", "Kowalska", 30);
    	osoba.przedstawSie();
    	System.out.println("Imię i nazwisko: " + osoba.imie + " " + osoba.nazwisko);

    	Student student = new Student("Adam", "Abacki", 21, 2, "medycyna");
    	student.przedstawSie();
    	student.dodajOcene(4);
    	student.dodajOcene(4);
    	student.dodajOcene(5);
    	student.oceny.add(100);
    	System.out.println("Średnia ocen: " + student.sredniaOcen());
   	 
    	Sklep zabka = new Sklep("Żabka", 6);
    	zabka.sprzedajPiwo(student);
   	 
    	Konto konto1 = new Konto(1, 1000, osoba);
    	Konto konto2 = new Konto(2, student);

    	System.out.println(konto1);
    	System.out.println(konto2);
   	 
    	konto1.wplata(3500);
    	System.out.println(konto1);
 	 
	}

}

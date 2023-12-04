package p10_klasy.zadania;

public class Osoba {
	// W klasie umieszczamy definicje zmiennych (pól) i metod.
	// Definicje bez słowa static określają co będzie posiadać obiekt tej klasy.
	
	// Zmienna w klasie to inaczej: pole (field), atrybut (attribute), zmienna instancyjna (instance variable).
	// Każda osoba posiada imie, nazwisko i wiek.
	String imie, nazwisko;
	int wiek;
	
	// konstruktor - fragment kodu, który wykona się, gdy w programie tworzony jest nowy obiekt (new)
	// konstruktorów może być wiele, pod warunkiem, że różnią się liczbą lub typem parametrów
	Osoba() {
//		System.out.println("konstruktor bezargumentowy");
	}
	
	Osoba(String imie, String nazwisko, int wiek) {
//		System.out.println("konstruktor 3-argumentowy");
//		System.out.println("parametr imie = " + imie);
		// do pola imie w obiekcie (this) wpisz wartość, która została przekazana w parametrze imie
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
	// Metoda to jest czynność, którą "potrafi wykonać obiekt" danej klasy.
	void przedstawSie() {
		System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat.");
	}
	
	boolean jestPelnoletnia() {
		return wiek >= 18;
	}
	
	// Definiując metodę toString określamy w jaki sposób Java ma wypisywać obiekty tej klasy,
	// np. gdy ktoś obiekt printuje za pomocą println.
	public String toString() {
		return imie + " " + nazwisko + " (" + wiek + " lat)";
	}
	
}

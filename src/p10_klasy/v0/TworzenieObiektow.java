package p10_klasy.v0;




public class TworzenieObiektow {

	public static void main(String[] args) {
        Osoba a = new Osoba();
        Osoba b = new Osoba();

        // Gdy tworzymy obiekt za pomocą domyślnego konstruktora, to początkowo jest on niezainicjowany,
    	// tzn. w polach ma wpisane wartości null / 0 i może nam to przeszkadzać.
    	// Późniejsze wpisanie danych ma dwie wady:
    	// 1) zajmuje trochę miejsca w kodzie
    	a.imie = "Ala";
    	a.wiek = 30;
   	 
    	// 2) programista może łatwo przeoczyć jakieś pole i pozostawić obiekt nie w pełni zainicjowany
    	// W przypadku obiektów o znaczeniu technicznym (jak np. Scanner) taki brak inicjalizacji może do błędów
    	a.przedstawSie();
    	a.nazwisko = "Kowalska";
    	a.przedstawSie();
    	System.out.println();
   	 
    	// Aby mieć większą kontrolę nad procesem tworzenia obiektów, i by był on wygodniejszy,
    	// można w swojej klasie zdefiniować konstruktory.

    	a.przedstawSie();
    	b.przedstawSie();
	}

}

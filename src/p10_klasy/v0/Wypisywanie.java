package p10_klasy.v0;

public class Wypisywanie {

	public static void main(String[] args) {
    	Osoba a = new Osoba("Ala", "Kowalska", 30);
    	System.out.println(a);

    	// skąd ten napis, który wypisał print?
    	// Każdy obiekt w Javie posiada metodę toString() , która zwraca tekstową
    	// reprezentację obiektu.
    	// Domyślnie: pakiet.NazwaKlasy@PSEUDOADRES
    	// ale można to zmienić definiując metodę toString w klasie
    	String s = a.toString();
    	System.out.println(s);

    	// inne sposoby uzyskania Stringa na podstawie obiektu:

    	s = "" + a;
    	System.out.println(s);

    	// String.valueOf zadziała dla każdego argumentu: obiektu, nulla, liczby, ...
    	s = String.valueOf(a);
    	System.out.println(s);

	}

}

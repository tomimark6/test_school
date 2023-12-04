package p10_klasy.zadania;

public class Referencje2 {
	
	static void metoda(Konto a, Konto b, int x) {
		System.out.println("Początek metody:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("x: " + x);
		System.out.println();
		
		// zmiana wartości parametru typu prostego zawsze jest lokalna, nie wpływa na wartości zmiennych w miejscu wywołania (w main)
		x += 55;

		// zmiana wewnątrz obiektu jest trwała, może być widoczna z zewnątz (z main, z innej funkcji, z innego wątku, ...)
		b.wplata(48);
		
		// przypisanie innego obiektu do parametru typu obiektowego
		// (technicznie rzecz biorąc: wpisanie innego adresu)
		// nie jest widoczne z zewnątrz
		a = b;
		
		System.out.println("Koniec metody:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("x: " + x);
		System.out.println();
	}

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", 30);
		Osoba ola = new Osoba("Ola", "Malinowska", 30);
		
		Konto a = new Konto(1, 1000, ala);
		Konto b = new Konto(2, 2000, ola);
		int x = 5000;
		
		System.out.println("Początek main:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("x: " + x);
		System.out.println();
		
		metoda(a, b, x);
		
		System.out.println("Koniec main:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("x: " + x);
	}

}

package Pliki;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class Zapis4 {
	/* Tradycyjny sposób zamykania plików (i innych zasobów) oparty o klauzulę finally.
 	* Jest to poprawne rozwiązanie, stosowane standardowo do Javy 6,
 	* a obecnie potrzebne czasami, gdy jakaś klasa nie obsługuje "AutoCloseable".
 	*
 	* Sekcja finally wykona się w sytuacjach gdy:
 	* - program normalnie dojdzie do końca try
 	* - wewnątrz try dojdzie do wyjątku, który zostanie obsłużony w jednym z catch
 	* - dojdzie do wyjątku, który nie zostanie obsłużony
 	* - program wyjdzie z sekcji try z powodu instrukcji takiej jak return, break, continue
 	* Sekcja finally nie wykona się, gdy:
 	* - zostanie wywołane System.exit()
 	* - "ktoś wyłączy prąd" :-)
 	*/
	public static void main(String[] args) {
    	LocalTime now = LocalTime.now();
    	int cyfra = now.getSecond() % 10;
    	System.out.println("Początek programu, czas: " + now);
    	PrintWriter out = null;
    	try {
        	out = new PrintWriter("pliki/zapis4.txt");
        	System.out.println("Plik otwarty");
        	out.println("Ala ma kota");
        	out.println("Ola ma psa");
        	out.println("Bieżący czas: " + now);
        	out.println("Ostatnia cyfra: " + cyfra);
        	out.println("Wynik dzielenia: " + (100 / cyfra));
        	out.println("Za operacją dzielenia");
        	out.println("Koniec pliku");
    	} catch (IOException e) {
        	e.printStackTrace();
    	} finally {
        	if(out != null) {
            	out.close();
            	System.out.println("Plik zamknięty");
        	}
    	}
    	System.out.println("Koniec programu");
	}

}

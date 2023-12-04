package Pliki;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class Zapis5 {
	/* W tej wersji używamy konstrukcji "try-with-resources" wprowadzonej w Java 7.
	 * Plik (lub inny "zasób" - obiekt implementujący interfejs AutoCloseable) otwieramy w nawiasach okrągłych za try()
	 * Java automatycznie zamknie ten plik z takimi samymi gwarancjami, jak finally.
	 * My jawnie nie piszemy już close
	 */

	public static void main(String[] args) {
    	LocalTime now = LocalTime.now();
    	int cyfra = now.getSecond() % 10;
    	System.out.println("Początek programu, czas: " + now);
    	try(PrintWriter out = new PrintWriter("pliki/zapis5.txt")) {

        	System.out.println("Plik otwarty");
        	out.println("Ala ma kota");
        	out.println("Ola ma psa");
        	out.println("Bieżący czas: " + now);
        	out.println("Ostatnia cyfra: " + cyfra);
        	out.println("Wynik dzielenia: " + (100 / cyfra));
        	out.println("Za operacją dzielenia");
        	out.println("Koniec pliku");
        	out.close();
        	System.out.println("Plik zamknięty");
    	} catch (IOException e) {
        	e.printStackTrace();
    	}
    	System.out.println("Koniec programu");
	}

}

package Pliki;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Odczyt3_BufferedReader {
	// Scanner ma różne fajne możliwości, m.in. obsługa wyrażeń regularnych, dzielenie tekstu na słowa, odczyt liczb...
	// Ale klasa BufferedReader, która też potrafi dzielić plik na linie, czyta pliki ok 1.5 razy szybciej niż Scanner.
	// W tej wersji tworzę BufReader z pomocą klasy Files, a w pętli warunek wpisuję do while.
	public static void main(String[] args) {
    	try(BufferedReader input = Files.newBufferedReader(Paths.get("pliki/pan_tadeusz.txt"))) {
        	String linia;
        	while((linia = input.readLine()) != null) {
            	System.out.println(linia);
        	}
    	} catch(IOException e) {
        	e.printStackTrace();
    	}
	}
}

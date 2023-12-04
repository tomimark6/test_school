package Pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Odczyt2_BufferedReader {
	// Scanner ma różne fajne możliwości, m.in. obsługa wyrażeń regularnych, dzielenie tekstu na słowa, odczyt liczb...
	// Ale klasa BufferedReader, która też potrafi dzielić plik na linie, czyta pliki ok 1.5 razy szybciej niż Scanner.
	// W tej wersji używam starego stylu tworzenia obiektu (konstruktory) i piszę pętle z break.
	public static void main(String[] args) {
    	try(BufferedReader input = new BufferedReader(new FileReader("pliki/pan_tadeusz.txt"))) {
        	while(true) {
            	String linia = input.readLine();
            	if(linia == null)
                	break;
            	System.out.println(linia);
        	}
    	} catch(IOException e) {
        	e.printStackTrace();
    	}
	}

}

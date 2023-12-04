package Pliki;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class Zapis1b {

	public static void main(String[] args) {
    	LocalTime now = LocalTime.now();
    	System.out.println("Początek programu, czas: " + now);
    	try {
        	PrintWriter out = new PrintWriter("pliki/liczby.txt");
        	out.println("Pierwsza linia");
       	 
        	// w tym programie nie ma flush ani close
        	for(int i = 1; i <= 10000; i++) {
            	out.print(i + " ");
            	if(i % 100 == 0) {
                	out.println();
            	}
        	}
       	 
        	out.println("Ostatnia linia");
    	} catch (IOException e) {
        	e.printStackTrace();
    	}
    	System.out.println("Koniec programu");
	}

}

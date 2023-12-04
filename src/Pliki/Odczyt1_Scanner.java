package Pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt1_Scanner {

	public static void main(String[] args) {
    	try(Scanner scanner = new Scanner(new File("pliki/pan_tadeusz.txt"))) {
        	while(scanner.hasNextLine()) {
            	String linia = scanner.nextLine();
            	System.out.println(linia);
        	}
    	} catch(FileNotFoundException e) {
        	e.printStackTrace();
    	}
	}

}

package zadania.dom.dom;

import java.util.Scanner;

public class Choinka1 {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Podaj wysokość choinki: ");
    	int wys = scanner.nextInt();
   	 
    	for(int i = 1; i <= wys; i++) {
        	for(int j = 1; j <= wys-i; j++) {
            	System.out.print(" ");
        	}
        	for(int j = 1; j <= 2*i-1; j++) {
            	System.out.print("*");
        	}
        	System.out.println();
    	}
	}

}

package zadania.dom.dom;

import java.util.Scanner;

public class Choinka3 {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Podaj wysokość choinki: ");
    	int wys = scanner.nextInt();
   	 
    	for(int i = 0; i < wys; i++) {
        	System.out.println(" ".repeat(wys-i) + "*".repeat(2*i+1));
    	}
	}

}

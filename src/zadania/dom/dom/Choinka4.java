package zadania.dom.dom;

import java.util.Scanner;

public class Choinka4 {

	public static void main(String[] args) {
    	final String TLO = ".";
    	final String ZNAK = "^";
   	 
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Podaj wysokość choinki: ");
    	int wys = scanner.nextInt();
   	 
    	for(int i = 0; i < wys; i++) {
        	System.out.println(TLO.repeat(wys-i) + ZNAK.repeat(2*i+1) + TLO.repeat(wys-i));
    	}
	}

}

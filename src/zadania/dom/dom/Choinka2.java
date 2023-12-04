package zadania.dom.dom;

import java.util.Scanner;

public class Choinka2 {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Podaj wysokość choinki: ");
    	int wys = scanner.nextInt();
   	 
    	int ile_sp = wys;
    	int ile_gw = 1;
    	for(int i = 0; i < wys; i++) {
        	for(int j = 0; j < ile_sp; j++) {
            	System.out.print(" ");
        	}
        	for(int j = 0; j < ile_gw ; j++) {
            	System.out.print("*");
        	}
        	System.out.println();
        	ile_sp -= 1;
        	ile_gw += 2;
    	}
	}

}

package zadania.dom.dom;

import java.util.Scanner;

public class Silnia1 {
    
	static int silnia(int n) {
    	int iloczyn = 1;
    	for(int i = 1; i <= n; i++) {
        	iloczyn *= i; // ew.  iloczyn = iloczyn * i;
    	}
   	 
    	return iloczyn;
	}

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	while(true) {
        	System.out.print("Podaj argument: ");
        	int n = scanner.nextInt();
        	if(n < 0)
            	break;
        	var wynik = silnia(n);
        	System.out.printf("%d! = %s\n", n, wynik);
    	}
	}

}

package zadania.trzecieSpotkanie;

import java.util.Scanner;

public class Fib1t {
    
	static long fib(int n) {
   	 
    	return 0;
	}

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	while(true) {
        	System.out.print("Podaj argument: ");
        	int n = scanner.nextInt();
        	if(n < 0)
            	break;
        	long p = System.nanoTime();
        	var wynik = fib(n);
        	long k = System.nanoTime();
        	System.out.printf("F(%d) = %d\n", n, wynik);
        	System.out.printf("	czas: %.6f s\n", (k-p)*1e-9);
    	}
	}

}

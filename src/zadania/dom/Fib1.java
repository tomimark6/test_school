package zadania.dom;

import java.util.Scanner;

public class Fib1 {
    
	static long fib(int n) {
    	if(n < 0)
        	throw new IllegalArgumentException("fib nie działa dla ujemnych!");
    	if(n == 0) return 0;
    	if(n == 1) return 1;
    	return fib(n-2) + fib(n-1);
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

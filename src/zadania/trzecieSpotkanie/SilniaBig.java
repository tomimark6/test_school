package zadania.trzecieSpotkanie;

import java.math.BigInteger;
import java.util.Scanner;

public class SilniaBig {
    
	static BigInteger silnia(int n) {
    	BigInteger iloczyn = BigInteger.ONE;
    	for(int i = 1; i <= n; i++) {
        	iloczyn = iloczyn.multiply(BigInteger.valueOf(i));
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

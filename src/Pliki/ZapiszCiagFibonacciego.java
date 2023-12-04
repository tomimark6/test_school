package Pliki;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ZapiszCiagFibonacciego {

	public static void main(String[] args) {
    	// Napisz program, który do pliku fibonacci.txt zapisuje ciąg liczb Fibonacciego
    	// z określonego zakresu.
    	// - poziom podstawowy: operacje na typie long i 100 pierwszy liczb F.
    	// - poziom średnio zaawas - operacje na BigInteger i zakres podany przez użytkownika
    	// - poziom zaawans - wykorzystaj klasę JFileChooser do wskazania pliku na dysku, który ma być zapisany
    	//   (operacje showSaveDialog)
    	int ilosc = Integer.parseInt(JOptionPane.showInputDialog("Ile liczb?"));
    	JFileChooser chooser = new JFileChooser(".");
    	int wybor = chooser.showSaveDialog(null);
    	if(wybor != JFileChooser.APPROVE_OPTION) {
        	return;
    	}
    	File plik = chooser.getSelectedFile();
    	// File plik = new File("pliki/fibonacci.txt");
   	 
    	try(PrintWriter out = new PrintWriter(plik)) {
        	BigInteger a = BigInteger.ZERO;
        	BigInteger b = BigInteger.ONE;
       	 
        	out.printf("fib(%s) = %s\n", 0, a);
        	for(int i = 1; i <= ilosc; i++) {
            	BigInteger c = a.add(b);
            	b = a;
            	a = c;
            	out.printf("fib(%s) = %s\n", i, a);
        	}
    	} catch(IOException e) {
        	e.printStackTrace();
    	}
    	JOptionPane.showMessageDialog(null, "Gotowe");
	}

}

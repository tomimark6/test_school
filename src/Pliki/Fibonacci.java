package Pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fibonacci {
    public static void main(String[] args) {
        long start = 0;
        long end = 10;

        try (PrintWriter out = new PrintWriter("pliki/fibonacci.txt")) {
            long a = 0, b = 1;


            while (a < start) {
                long temp = a + b;
                a = b;
                b = temp;
            }

            while (a <= end) {
                out.println(a);
                long temp = a + b;
                a = b;
                b = temp;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
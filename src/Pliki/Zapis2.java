package Pliki;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class Zapis2 {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Początek programu, czas: " + now);
        try {
            PrintWriter out = new PrintWriter("pliki/zapis2.txt");
            System.out.println("Plik otwarty");
            out.println("Ala ma kota");
            out.println("Ola ma psa");
            out.println("Bieżący czas: " + now);
            out.println("Koniec pliku");
            out.close();
            System.out.println("Plik zamknięty");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Koniec programu");
    }

}

package Pliki;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class Zapis1 {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Początek programu, czas: " + now);
        try {
            PrintWriter out = new PrintWriter("Pliki/Zapis1.txt");
            System.out.println("Plik otwarty");
            out.println("Ala ma kota");
            out.println("Ola ma psa");
            out.println("Bieżący czas: " + now);
            out.println("Koniec pliku");
            // Plik nie jest zamykany (brakuje close lbo innego sposobu zamkniecia)
            // dlatego brakuje pliku
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Koniec programu");
    }

}


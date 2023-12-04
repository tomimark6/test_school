package Pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class PlikDateTime {

    public static void main(String[] args) {
        String katalog = "pliki";
        LocalDateTime dt = LocalDateTime.now();
        try(PrintWriter out = new PrintWriter(
                String.format("%s/plik_%2$tY%2$tm%2$td_%2$tH%2$tM%2$tS.txt",
                        katalog, dt))) {

            out.println("Teraz jest " + dt);

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}


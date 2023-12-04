package Pliki;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ZapisPonumerowany {
    public static void main(String[] args) {
        try (BufferedReader input = Files.newBufferedReader(Paths.get("pliki/pan_tadeusz.txt"));
             BufferedWriter output = Files.newBufferedWriter(Paths.get("pliki/pan_tadeusz_ponumerowany.txt"))) {
            String linia;
            int numerLinii = 1;
            while ((linia = input.readLine()) != null) {
                linia = linia.trim();
                if (!linia.isBlank()) {
                    output.write(numerLinii + ": " + linia);
                    output.newLine();
                    numerLinii++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

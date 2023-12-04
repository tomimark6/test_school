package Pliki;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OdczytPonumerowany {
    public static void main(String[] args) {
        try (BufferedReader input = Files.newBufferedReader(Paths.get("pliki/pan_tadeusz.txt"))) {
            String linia;
            int numerLinii = 1;
            while ((linia = input.readLine()) != null) {
                System.out.println(numerLinii + ": " + linia);
                numerLinii++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package zadania.dom.dom;

import java.util.Scanner;

public class PetlaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokosc: ");

        int wyoskosc = scanner.nextInt();

        System.out.println("Podaj szerokosc: ");

        int szerokosc = scanner.nextInt();

        for (int j = 1; j <= wyoskosc; j++) {

        for (int i = 1; i <= szerokosc; i++) {

            System.out.print(i * j + "\t");


            }
            System.out.println();

            }

        }

    }


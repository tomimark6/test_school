package zadania.dom.dom;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       boolean shuldtContinue = true;
        while (shuldtContinue){
            System.out.println("Chose option");
            System.out.println("1. Whats your name: ");
            System.out.println("2. Phone number: ");
            System.out.println("3. Are you vegan: ");
            System.out.println("4. Meals: ");
            System.out.println("5. Exit: ");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> System.out.println("Wybrano 1");
                case 2-> System.out.println("Wybrano 2");
                case 3 -> System.out.println("Wybrano 3");
                case 4 -> System.out.println("Wybrano 4");
                case 5 -> shuldtContinue = false;
            }





        }
    }
}

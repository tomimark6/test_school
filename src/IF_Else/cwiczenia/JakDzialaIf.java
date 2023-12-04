package IF_Else.cwiczenia;

import java.util.Scanner;

public class JakDzialaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie: ");

        String name = scanner.nextLine();
        if (name.length() < 3){
            System.out.println("zmien imie");
        }

        else if (!name.isEmpty() && (!name.endsWith("a") || name.equals("kuba"))) {
            System.out.println("jestes mezczyzna");

        }if (name.endsWith("a")){
            System.out.println("Jestes kobieta");

        } else {

            System.out.println("Pole nie moze byc puste podaj name");
        }




        }
    }




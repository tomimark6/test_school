package zadania.dom.dom;

import java.util.Random;
import java.util.Scanner;


public class Losowanie_01 {
    public static void main(String[] args) {

        Random r = new Random();
        int losowana =  r.nextInt(1000);
        int  attemps = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("podaj  liczbe z zakresu od 0 do 999");

        while(true){
            System.out.println("pdasj liczbe");
           int zgadywana= s.nextInt();
            attemps++;


        if(zgadywana == losowana){
            System.out.println("Zgadles to jest ta liczba: " +  losowana +  "w " + attemps + "probie");
            break;
        } else if (zgadywana < losowana) {
            System.out.println("za mala liczba");
        }else {
            System.out.println("za duza  liczba");

        }

        }


    }

}

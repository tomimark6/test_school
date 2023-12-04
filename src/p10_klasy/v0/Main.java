package p10_klasy.v0;

import p10_klasy.v0.Towar;

public class Main {
    public static void main(String[] args) {
        Towar chleb = new Towar("Mleko", 2.5);
        Towar cukier = new Towar("Chleb", 3.0);

        System.out.println("Informacje : " + chleb);
        System.out.println("Informacje : " + cukier);

        int iloscSztukChleb = 3;
        int iloscSztukCukier = 5;

        System.out.println("Koszt " + iloscSztukChleb + " sztuk Chleba: " + chleb.jakiKoszt(iloscSztukChleb));
        System.out.println("Koszt " + iloscSztukCukier + " sztuk   Cukru : " + cukier.jakiKoszt(iloscSztukCukier));
    }
}


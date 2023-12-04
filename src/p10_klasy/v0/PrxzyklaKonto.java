package p10_klasy.v0;

public class PrxzyklaKonto {
    public static void main(String[] args) {

        Osoba ala = new Osoba("ala", "kowalska", 30);
        Konto kontoAli = new Konto(1, ala);

        System.out.println(kontoAli);

        kontoAli.wplata(1500);
        kontoAli.wplata(300);
        System.out.println(kontoAli); // 1800

        kontoAli.wplata(500);
        System.out.println(kontoAli);

    }
}

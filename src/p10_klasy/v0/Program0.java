package p10_klasy.v0;


public class Program0 {
    public static void main(String[] args) {
        System.out.println("poczatek programu");
 //       Osoba osoba = new Osoba();
        // Dzięki temu, że mamy zdefiniowaną klasę Osoba,
        // możemy deklarować zmienne tego typu i tworzyć obiekty tej klasy.

        Osoba a = new Osoba();
        Osoba b = new Osoba();
        System.out.println(a);
        System.out.println(b);
        System.out.println();

        System.out.println(a.getClass());
        System.out.println(a.toString());
        System.out.println(a.hashCode() + " , " + b.hashCode());
        System.out.println(a.equals(a));
        System.out.println(a.equals(b));



    }
}

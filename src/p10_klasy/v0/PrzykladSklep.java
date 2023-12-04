package p10_klasy.v0;

public class PrzykladSklep {

    public static void main(String[] args) {
   	 Osoba ala = new Osoba("Ala", "Kowalska", 30);
   	 System.out.println(ala);
   	 System.out.println("imię osoby a: " + ala.imie);
   	 
   	 Osoba basia = new Osoba("Basia", "Malinowska", 13);
   	 System.out.println(basia);
   	 System.out.println("imię osoby b: " + basia.imie);
   	 System.out.println();
   	 
   	 ala.przedstawSie();
   	 
   	 if(ala.wiek >= 18) {
   		 System.out.println(ala.imie + " jest pełnoletnia");
   	 } else {
   		 System.out.println(ala.imie + " jest niepełnoletnia");
   	 }
   	 System.out.println();
   	 
   	 basia.przedstawSie();
   	 if(basia.wiek >= 18) {
   		 System.out.println(basia.imie + " jest pełnoletnia");
   	 } else {
   		 System.out.println(basia.imie + " jest niepełnoletnia");
   	 }
   	 System.out.println();
   	 
   	 Sklep zabka = new Sklep("Żabka", 6);
   	 zabka.sprzedajPiwo(ala);
   	 zabka.sprzedajPiwo(basia);
   	 
   	 Sklep biedronka = new Sklep("Biedronka", 5);
   	 biedronka.sprzedajPiwo(ala);
   	 biedronka.sprzedajPiwo(ala);
   	 biedronka.sprzedajPiwo(ala);
   	 
   	 System.out.println("Utarg w Żabce: " + zabka.utarg);
   	 System.out.println("Utarg w Biedronce: " + biedronka.utarg);
   	 
   	 // W Javie programista nie usuwa obiektów, które utworzył.
   	 // Usuwanie obiektów / zwalnianie pamięci jest wykonywane automatycznie przez "garbage collector", który jest częścią JVM.
    }

}

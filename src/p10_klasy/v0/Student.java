package p10_klasy.v0;

import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba {
    int rok;
    String kierunek;
    List<Integer> oceny = new ArrayList<>();
    
    Student() {
    }
    
    Student(String imie, String nazwisko, int wiek, int rok, String kierunek) {
        super(imie, nazwisko, wiek);
        this.rok = rok;
        this.kierunek = kierunek;
    }

    // Jeśli chodzi o metody, podklasa może
    // 1) Nie zmieniać metod odziedziczonych z nadklasy
    // przykład: jestPelnoletnia()
    // Taka metoda w nadklasie może być zadeklarowana jako "final" - to znaczy,
    // że jest to ostateczna definicja i podklasa nie może jeje zmienić


    // 2) Dodać nowe metody, których nie było w nadklasie
    void dodajOcene(int ocena) {
        oceny.add(ocena);
    }
    
    double sredniaOcen() {
        double suma = 0;
        for(int ocena : oceny) {
            suma += ocena;
        }
        return suma / oceny.size();
    }
    
    // 3) Nadpisać (override) metody, które były zdefiniowane w nadklasie
    //    czyli dla istniejących metoda podać inną treść.
    @Override
    void przedstawSie() {
        System.out.println("Hej tu "+ imie + " " + nazwisko
                + ", studiuję kierunek " + kierunek + ", jestem na " + rok + " roku.");
    }
    // Od Javy 5 przed definicją metody, która nadpisuje definicję z nadklasy, można umieścić adnotację @Override
    // Ważne: nawet bez tej adnotacji nadpisanie jest skuteczne. Adnotacja tylko:
    // - zwiększa czytelność kodu ("rzuca się w oczy")
    // - powoduje błąd kompilacji, gdyby okazało się, że jednak tutaj nie nadpisujemy metody, tylko definiujemy nową (np. literówka w nazwie, parametry innego typu)

    
    @Override
    public String toString() {
        // do tego, co zwraca toString zdefiniowany w klasie Osoba, dodaję info o roku i kierunku studiów:
        return super.toString() + ", studiuje na " + rok + " roku kierunku " + kierunek;
    }
    
}

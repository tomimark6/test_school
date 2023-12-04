package zadania.dom.dom;

import java.util.HashSet;

public class FunkcjeNaTablicach_09 {

    public static void main(String[] args) {
        int[] tablica1 = {2, 5, 7, 9, 12};
        int[] tablica2 = {3, 6, 8, 9, 11};

        Integer wspolnyElement = znajdzWspolny(tablica1, tablica2);

        if (wspolnyElement != null) {
            System.out.println("Wspólny element: " + wspolnyElement);
        } else {
            System.out.println("Brak wspólnego elementu.");
        }
    }

    public static Integer znajdzWspolny(int[] t1, int[] t2) {
        HashSet<Integer> set = new HashSet<>();

        // Dodanie elementów z t1 do HashSet
        for (int num : t1) {
            set.add(num);
        }

        // Sprawdzenie, czy element z t2 znajduje się już w HashSet
        for (int num : t2) {
            if (set.contains(num)) {
                return num;
            }
        }

        return null;
    }
}

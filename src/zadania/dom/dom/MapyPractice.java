package zadania.dom.dom;

import java.util.*;

public class MapyPractice {
    public static void main(String[] args) {
        Map<String, String> namesToMeal = new HashMap<>();

        namesToMeal.put("Tomek", "Pizza");
        namesToMeal.put("Monika", "Burger");
        namesToMeal.put("Szymon", "Pizza");
        namesToMeal.put("Szymon", "Zupa");

        Set<String> keys = namesToMeal.keySet();
        for (String key : keys) {
            System.out.println(key);
        }



            Collection<String> values = namesToMeal.values();
            for (String value : values) {
                System.out.println(value );

                System.out.println(namesToMeal.containsKey("Marek") );
                System.out.println(namesToMeal.containsValue("Pizza"));


            }
        }
    }






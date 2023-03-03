package class30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practice {
    public static void main(String[] args) {
        Map<String, String> capitals = new LinkedHashMap<>();
        capitals.put("Argentina", "Buenos Aires");
        capitals.put("Russia", "Moscow");
        capitals.put("USA", "Washington D.C.");
        capitals.put("Columbia", "Bogota");
        capitals.put("Switzerland", "Zurich");
        capitals.put("Germany", "Berlin");

        System.out.println(capitals);



        capitals.values().forEach(s -> System.out.println(s));
        System.out.println("____________________________");
        capitals.keySet().forEach(s -> System.out.println(s));
        System.out.println("______________________________");
        var entrySet= capitals.entrySet();
        for (var entry: entrySet) {
            System.out.println(entry);

        }
        System.out.println("___________________________");
        var iterator=capitals.entrySet().iterator();
        while (iterator.hasNext()) {
            var x=iterator.next();
            System.out.println(x);
        }

    }
}
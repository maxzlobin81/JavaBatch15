package class29;

import java.util.LinkedHashSet;

//Create a Set of cities in which you want to make sure that insertion order is maintained.
//        Then remove any city that starts with “A”;
public class task1 {
    public static void main(String[] args) {
        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("Moscow");
        cities.add("Kiev");
        cities.add("Annandale");
        cities.add("Anapa");
        cities.add("Zurich");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}

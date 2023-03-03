package class27;
//Create an arrayList of words. Remove every word that ends with “e”.
import java.util.ArrayList;
import java.util.Iterator;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Bone");
        words.add("Stone");
        words.add("Bag");
        words.add("Cag");
        words.add("Phone");

            if (words.removeIf(s -> s.endsWith("e"))) {
                System.out.println(words);


    }
  }
}
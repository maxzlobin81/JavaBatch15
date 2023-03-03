package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);

        /*numbers.removeIf(number -> number > 11);
        System.out.println(numbers);*/

        Iterator<Double> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            double number = iterator.next();
            if (number > 11) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}


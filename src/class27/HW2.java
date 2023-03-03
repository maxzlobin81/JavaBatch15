package class27;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
public class HW2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Peageaut");

        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("_______________________");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("_______________________");
        Iterator iter= cars.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
        }

    }

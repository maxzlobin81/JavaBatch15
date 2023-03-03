package class27;

import java.util.ArrayList;
import java.util.function.Predicate;

//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class HW5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 500; i+=2) {
            numbers.add(i);
            }
        numbers.removeIf(num->num %5==0);
        System.out.println(numbers);
        }
    }

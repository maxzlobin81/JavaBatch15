package class30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*Create a Person class with following private fields: name, lastName, age, salary.
        Variables should be initialized through constructor.
        Inside the class also create a method to print user details.
        In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.*/
public class HW2 {
    public static void main(String[] args) {
        Person p1=new Person("John", "Smith",35,125000.00);
        Person p2=new Person("Vlad", "the Destroyer",70,1000.00);
        Person p3=new Person("Max", "Zlobin",41,225000.00);
        Person p4=new Person("Jimmy", "Jones",50,115000.00);

        Map<Integer,Person>peeps=new TreeMap<>();
        peeps.put(12551151,p1);
        peeps.put(88784484,p2);
        peeps.put(74154511,p3);
        peeps.put(21511511,p4);

        var entries=peeps.entrySet();
        for (var x:entries) {
            System.out.print(x.getKey());
            x.getValue().userDetails();

        }


    }

}


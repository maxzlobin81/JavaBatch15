package class27;
/*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
 Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
  Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
 */

import java.util.ArrayList;

public class HW6 {
    public static void main(String[] args) {

        ArrayList<Insurance>obj=new ArrayList<>();
        Car carInsurance=new Car("Tesla","Geico");
        Pet petInsurance=new Pet("La-Chon","AKC");
        Health heathInsurance=new Health("Blue Cross");

        obj.add(carInsurance);
        obj.add(petInsurance);
        obj.add(heathInsurance);

        for (Insurance x:obj) {
            System.out.println(x.getQuote());
            System.out.println(x.cancelInsurance());


        }


        }

    }

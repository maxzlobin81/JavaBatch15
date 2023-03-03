package class30;

import java.util.HashMap;

//Create a map of Best Buy store. Place
//        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//        Retrieve all keys and values from a Best Buy map using EntrySet.
public class HW1 {
    public static void main(String[] args) {
        var BestBuy=new HashMap<Integer,String>();
        BestBuy.put(1545413,"Printer");
        BestBuy.put(7789789,"Monitor");
        BestBuy.put(8521515,"TV");
        BestBuy.put(8784848,"Digital Camera");
        BestBuy.put(8744511,"Stereo System");

        var entrySet=BestBuy.entrySet();
        entrySet.forEach(s-> System.out.println(s));
    }
}

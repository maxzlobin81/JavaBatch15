package class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW4 {
    /*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */

        public static void main(String[] args) {
            Set<String> strs=new LinkedHashSet<>();
            strs.add("Today");
            strs.add("is");
            strs.add("a");
            strs.add("great");
            strs.add("day");

            String fullStr="";
            for(String s:strs){
                fullStr+=s+" ";
            }
            System.out.println(fullStr);
        }
    }


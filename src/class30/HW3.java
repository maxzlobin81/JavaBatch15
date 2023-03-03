package class30;

import java.util.HashMap;
import java.util.Map;

/*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
        John Smith=$100000*/
public class HW3 {
    public static void main(String[] args) {
        Map<String,Integer> emps=new HashMap<>();
        emps.put("Max",225000);
        emps.put("Bob",200000);
        emps.put("Gus",125000);
        emps.put("Tom",25000);

        var highest=emps.entrySet();
        Map.Entry<String,Integer> max=null;
        for (var e:highest){
            if(max==null||e.getValue()>max.getValue()){
                max=e;
            }
        }
        System.out.println(max.getKey()+"=$"+max.getValue());

        }
    }


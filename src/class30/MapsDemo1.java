package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Aisha");
        studentsMap.put(4,"Max");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Aisha"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);
        studentsMap.replace(2,"Greg");
        System.out.println(studentsMap);


    }
}

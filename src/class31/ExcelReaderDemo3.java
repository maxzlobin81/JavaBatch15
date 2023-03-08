package class31;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String,String>row1=new LinkedHashMap<>();
        row1.put("name","max");
        row1.put("age","41");
        row1.put("city","destin");
        row1.put("salary","250000");

        LinkedHashMap<String, String>row2=new LinkedHashMap<>();
        row2.put("name","jack");
        row2.put("age","30");
        row2.put("city","zurich");
        row2.put("salary","200000");

        LinkedHashMap<String, String>row3=new LinkedHashMap<>();
        row3.put("name","gleb");
        row3.put("age","40");
        row3.put("city","kiev");
        row3.put("salary","225000");

        List<Map<String,String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);

    }
}

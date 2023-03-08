package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigFileWritePractice {
    public static void main(String[] args) throws IOException {
        String path="Files/practice.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("Switzerland","Matterhorn");
        properties.store(fileOutputStream,"A new swiss file is added");

    }
}

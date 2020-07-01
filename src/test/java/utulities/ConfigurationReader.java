package utulities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties=new Properties();  //1-We created properties object
 // Why we used  STATIC: we can directly writing this code
    static{
    String path="configuration.properties";//2-get the path and store in String, or directly pass into fileInputStream obj
        try {
            FileInputStream file=new FileInputStream(path); //3-we need open the file
            properties.load(file); //4-we need open the file
            file.close();  //5-close.file

        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }

}
//Our own custom method to read get values from configuration. Properties file.
public static String getProperty(String keyWord) {
    return properties.getProperty(keyWord);
}
}
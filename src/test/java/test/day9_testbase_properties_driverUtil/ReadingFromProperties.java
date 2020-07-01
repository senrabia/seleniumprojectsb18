package test.day9_testbase_properties_driverUtil;

import org.testng.annotations.Test;
import utulities.ConfigurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromProperties { //IOException ilk defa kullandik
    @Test
    public void reading_properties_file() throws IOException {
        //Properties class object allows us toread from configuration.properties.
        Properties properties=new Properties();
        //We need to show where the file stored....   //We need to the path of the file
        String path="configuration.properties";
        //C:\Users\sener\IdeaProjects\seleniumprojectsb18\configuration.properties


        FileInputStream file=new FileInputStream(path); //We need to open this configuration,properties file in java memory

        properties.load(file); //We need to load the opened file into the properties object

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));//We can read the configuration. properties file using properties object.
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));
    }
    @Test
    public void using_configuration_reader_utility(){
        String browser= ConfigurationReader.getProperty("browser");
        System.out.println("browser = " + browser);

        String username= ConfigurationReader.getProperty("username");
        System.out.println("usrename = "+username);
    }

}

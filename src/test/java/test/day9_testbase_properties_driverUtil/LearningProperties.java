package test.day9_testbase_properties_driverUtil;

import org.testng.annotations.Test;

public class LearningProperties {
   @Test
    public void java_properties_test(){
       //String osName=System.getProperty("os.name");
      // System.out.println("os.name = "+osName);
       System.out.println("System.getProperties(\"os.name\") = " + System.getProperty("os.name"));
       System.out.println("System.getProperties(\"user.name\") = " + System.getProperty("user.name"));

   }
}

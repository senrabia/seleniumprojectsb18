package test.day5_tetsng_intro;
//16:30

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {
    @BeforeMethod
    public void setUp(){

    }

    @Test
    public void test1(){
        System.out.println("test1 is running...");

    }
    public void test2(){
        System.out.println("test2 is running...");
    }
}
